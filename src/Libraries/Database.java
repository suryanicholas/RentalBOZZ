/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libraries;

import static Libraries.Session.Token;
import static Libraries.Session.UserInformation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/**
 *
 * @author surya
 */

public class Database {
    public static final String DBNAME = "jdbc:mysql://localhost:3306/java_rental";
    public static final String DBUSER = "root";
    public static final String DBPASS = "";
    
    public static String SELECT(String Query) throws Exception{
        String Username = Crypt.Decrypt(Token, (SecretKey) UserInformation[1], (Cipher) UserInformation[2]);
        try (Connection DB = DriverManager.getConnection(DBNAME, DBUSER, DBPASS)){
            try(PreparedStatement Statements = DB.prepareStatement(Query)){
                Statements.setString(1, Username);
                ResultSet uType = Statements.executeQuery();
                
                if(uType.next()){
                    return uType.getString(1);
                } else{
                    return null;
                }
            }
        } catch (SQLException ex){
            System.out.println(ex);
            return null;
        }
    }
    
    public static boolean Update(String Table, String[] Column, String[] WhereClause){
        try(Connection DB = DriverManager.getConnection(DBNAME,DBUSER,DBPASS)){
            try(PreparedStatement Query = DB.prepareStatement("UPDATE " + Table + " SET " + Column[0] + "=? WHERE " + WhereClause[0] + "=?")){
                Query.setString(1, Column[1]);
                Query.setString(2, WhereClause[1]);
                if(Query.executeUpdate() > 0){
                    return true;
                }
            }
        } catch (SQLException e){
            return false;
        }
        return false;
    }
    
    public static boolean Update(String Table, String[] Column, Object[] WhereClause){
        try(Connection DB = DriverManager.getConnection(DBNAME,DBUSER,DBPASS)){
            try(PreparedStatement Query = DB.prepareStatement("UPDATE " + Table + " SET " + Column[0] + "=? WHERE " + (String) WhereClause[0] + "=?")){
                Query.setString(1, Column[1]);
                String WClause = String.valueOf(WhereClause[1]);
                Query.setInt(2, Integer.parseInt(WClause));
                if(Query.executeUpdate() > 0){
                    return true;
                }
            }
        } catch (SQLException e){
            return false;
        }
        return false;
    }
    
}
