/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libraries;

import static Libraries.Database.DBNAME;
import static Libraries.Database.DBPASS;
import static Libraries.Database.DBUSER;
import static Libraries.Session.GenerateSession;
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
public class Auth {
    public static boolean isLoggedIn(){
        return Token != null;
    }
    
    public static boolean Verify(String username, String password) throws SQLException{
        try (Connection DB = DriverManager.getConnection(DBNAME, DBUSER, DBPASS)) {
            String DBQuery = "SELECT Password FROM(SELECT Password FROM penyewa WHERE Username = ? UNION SELECT Password FROM karyawan WHERE Username = ?) AS current_username";
            try(PreparedStatement getRAW = DB.prepareStatement(DBQuery)){
                getRAW.setString(1, username);
                getRAW.setString(2, username);
                
                ResultSet getResult = getRAW.executeQuery();
                
                if(getResult.next()){
                    String getPassword = getResult.getString("Password");
                    
                    if(password.equals(getPassword)){
                        GenerateSession(username);
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return false;
    }
    
    public static int AccessType() throws SQLException, Exception{
        
        String Username = Crypt.Decrypt(Token, (SecretKey) UserInformation[1], (Cipher) UserInformation[2]);
        try (Connection DB = DriverManager.getConnection(DBNAME, DBUSER, DBPASS)){
            try(PreparedStatement Statements = DB.prepareStatement("SELECT Level FROM"
                    + "("
                    + "SELECT U.Level FROM utype U JOIN karyawan K ON U.ID = K.Posisi WHERE Username= ? "
                    + "UNION SELECT U.Level FROM utype U JOIN penyewa P ON U.ID = P.Posisi WHERE Username= ?) "
                    + "AS current_level;")){
                Statements.setString(1, Username);
                Statements.setString(2, Username);
                ResultSet uType = Statements.executeQuery();
                
                if(uType.next()){
                    return uType.getInt("Level");
                } else{
                    return 0;
                }
            }
        } catch (SQLException ex){
            System.out.println(ex);
            return 0;
        }
    }
}
