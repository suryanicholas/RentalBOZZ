/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libraries;

import static Libraries.Database.DBNAME;
import static Libraries.Database.DBPASS;
import static Libraries.Database.DBUSER;
import static Libraries.Variabel.selectedDetails;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author surya
 */
public class Methods {
//    public static void UpdateTable(String Query, JLabel[] Rows, JLabel[] Columns, JButton[] Actions, int[] Identifier){
//        Rows[0].setVisible(false);
//        Rows[1].setVisible(false);
//        Rows[2].setVisible(false);
//        Rows[3].setVisible(false);
//        Rows[4].setVisible(false);
//        Rows[5].setVisible(false);
//        Rows[6].setVisible(false);
//        Rows[7].setVisible(false);
//        Rows[8].setVisible(false);
//        Rows[9].setVisible(false);
//        try(Connection DB = DriverManager.getConnection(DBNAME, DBUSER, DBPASS)){
//            try(PreparedStatement Statements = DB.prepareStatement("SELECT P.ID, C.Nama AS A, M.Merek AS B, P.Mulai AS C, P.Status AS D FROM peminjaman P JOIN mobil M ON M.ID = P.Mobil JOIN penyewa C ON C.ID = P.Penyewa WHERE P.Selesai > CURRENT_DATE() AND P.Status = 'Lunas' AND P.Penyewa = ? LIMIT 10")){
//                Statements.setInt(1,selectedDetails);
//                ResultSet Results = Statements.executeQuery();
//                int index = 0;
//                while(Results.next()){
//                    switch (index){
//                        case 0 ->{
//                            Rows[index].setVisible(true);
//                            Columns[1].setText(Results.getString("A"));
//                            Columns[2].setText(Results.getString("B"));
//                            Columns[3].setText(Results.getString("C"));
//                            Columns[4].setText(Results.getString("D"));
//                            Identifier[0] = Results.getInt("ID");
//                        }
//                        case 1 ->{
//                            tableRow1.setVisible(true);
//                            tableR1C1.setText(Results.getString("A"));
//                            tableR1C2.setText(Results.getString("B"));
//                            tableR1C3.setText(Results.getString("C"));
//                            tableR1C4.setText(Results.getString("D"));
//                            tableR1C5 = Results.getInt("ID");
//                        }
//                        case 2 ->{
//                            tableRow2.setVisible(true);
//                            tableR2C1.setText(Results.getString("A"));
//                            tableR2C2.setText(Results.getString("B"));
//                            tableR2C3.setText(Results.getString("C"));
//                            tableR2C4.setText(Results.getString("D"));
//                            tableR2C5 = Results.getInt("ID");
//                        }
//                        case 3 ->{
//                            tableRow3.setVisible(true);
//                            tableR3C1.setText(Results.getString("A"));
//                            tableR3C2.setText(Results.getString("B"));
//                            tableR3C3.setText(Results.getString("C"));
//                            tableR3C4.setText(Results.getString("D"));
//                            tableR3C5 = Results.getInt("ID");
//                        }
//                        case 4 ->{
//                            tableRow4.setVisible(true);
//                            tableR4C1.setText(Results.getString("A"));
//                            tableR4C2.setText(Results.getString("B"));
//                            tableR4C3.setText(Results.getString("C"));
//                            tableR4C4.setText(Results.getString("D"));
//                            tableR4C5 = Results.getInt("ID");
//                        }
//                        case 5 ->{
//                            tableRow5.setVisible(true);
//                            tableR5C1.setText(Results.getString("A"));
//                            tableR5C2.setText(Results.getString("B"));
//                            tableR5C3.setText(Results.getString("C"));
//                            tableR5C4.setText(Results.getString("D"));
//                            tableR5C5 = Results.getInt("ID");
//                        }
//                        case 6 ->{
//                            tableRow6.setVisible(true);
//                            tableR6C1.setText(Results.getString("A"));
//                            tableR6C2.setText(Results.getString("B"));
//                            tableR6C3.setText(Results.getString("C"));
//                            tableR6C4.setText(Results.getString("D"));
//                            tableR6C5 = Results.getInt("ID");
//                        }
//                        case 7 ->{
//                            tableRow7.setVisible(true);
//                            tableR7C1.setText(Results.getString("A"));
//                            tableR7C2.setText(Results.getString("B"));
//                            tableR7C3.setText(Results.getString("C"));
//                            tableR7C4.setText(Results.getString("D"));
//                            tableR7C5 = Results.getInt("ID");
//                        }
//                        case 8 ->{
//                            tableRow8.setVisible(true);
//                            tableR8C1.setText(Results.getString("A"));
//                            tableR8C2.setText(Results.getString("B"));
//                            tableR8C3.setText(Results.getString("C"));
//                            tableR8C4.setText(Results.getString("D"));
//                            tableR8C5 = Results.getInt("ID");
//                        }
//                        case 9 ->{
//                            tableRow9.setVisible(true);
//                            tableR9C1.setText(Results.getString("A"));
//                            tableR9C2.setText(Results.getString("B"));
//                            tableR9C3.setText(Results.getString("C"));
//                            tableR9C4.setText(Results.getString("D"));
//                            tableR9C5 = Results.getInt("ID");
//                        }
//                        default ->{
//                            // Nothing
//                        }
//                    }
//                    index++;
//                }
//            }
//        } catch(SQLException e){
//            
//        }
//    }
}
