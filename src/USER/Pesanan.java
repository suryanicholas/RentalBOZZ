/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package USER;

import ROOT.Pesanan.*;
import ROOT.Karyawan.*;
import AUTH.Authenticate;
import Libraries.Auth;
import Libraries.Crypt;
import Libraries.Database;
import static Libraries.Database.DBNAME;
import static Libraries.Database.DBPASS;
import static Libraries.Database.DBUSER;
import static Libraries.Session.Token;
import static Libraries.Session.UserInformation;
import static Libraries.Variabel.selectedDetails;
import Libraries.Variabel.Position;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/**
 *
 * @author surya
 */
public class Pesanan extends javax.swing.JFrame {

    /**
     * Creates new form Beranda
     */
    public Pesanan() {
        initComponents();
    }
    
    private int tableR0C5,tableR1C5,tableR2C5,tableR3C5,tableR4C5,tableR5C5,tableR6C5,tableR7C5,tableR8C5,tableR9C5;
    private int selectorOffset = 0;
    private int intID = 0;
    
    private void UpdateTable(){
        tableRow0.setVisible(false);
        tableRow1.setVisible(false);
        tableRow2.setVisible(false);
        tableRow3.setVisible(false);
        tableRow4.setVisible(false);
        tableRow5.setVisible(false);
        tableRow6.setVisible(false);
        tableRow7.setVisible(false);
        tableRow8.setVisible(false);
        tableRow9.setVisible(false);
        try(Connection DB = DriverManager.getConnection(DBNAME, DBUSER, DBPASS)){
            String Username = Crypt.Decrypt(Token, (SecretKey) UserInformation[1], (Cipher) UserInformation[2]);
            try(PreparedStatement Statements = DB.prepareStatement("SELECT C.ID FROM penyewa C LEFT JOIN peminjaman P ON C.ID = P.Penyewa WHERE Username=?")){
                Statements.setString(1,Username);
                ResultSet Results = Statements.executeQuery();
                if(Results.next()){
                    intID = Results.getInt("ID");
                }
            }
            try(PreparedStatement Statements = DB.prepareStatement("SELECT P.ID, M.Merek AS A, M.Model AS B, M.Kapasitas AS C, P.Status AS D FROM peminjaman P LEFT JOIN mobil M ON M.ID = P.Mobil WHERE P.Penyewa = ? LIMIT 10")){
                Statements.setInt(1, intID);
                ResultSet Results = Statements.executeQuery();
                int index = 0;
                while(Results.next()){
                    switch (index){
                        case 0 ->{
                            tableRow0.setVisible(true);
                            tableR0C1.setText(Results.getString("A"));
                            tableR0C2.setText(Results.getString("B"));
                            tableR0C3.setText(Results.getString("C"));
                            tableR0C4.setText(Results.getString("D"));
                            if("Dibatalkan".equals(Results.getString("D"))){
                                tableButton0.setVisible(false);
                            }
                            tableR0C5 = Results.getInt("ID");
                        }
                        case 1 ->{
                            tableRow1.setVisible(true);
                            tableR1C1.setText(Results.getString("A"));
                            tableR1C2.setText(Results.getString("B"));
                            tableR1C3.setText(Results.getString("C"));
                            tableR1C4.setText(Results.getString("D"));
                            if("Dibatalkan".equals(Results.getString("D"))){
                                tableButton1.setVisible(false);
                            }
                            tableR1C5 = Results.getInt("ID");
                        }
                        case 2 ->{
                            tableRow2.setVisible(true);
                            tableR2C1.setText(Results.getString("A"));
                            tableR2C2.setText(Results.getString("B"));
                            tableR2C3.setText(Results.getString("C"));
                            tableR2C4.setText(Results.getString("D"));
                            if("Dibatalkan".equals(Results.getString("D"))){
                                tableButton2.setVisible(false);
                            }
                            tableR2C5 = Results.getInt("ID");
                        }
                        case 3 ->{
                            tableRow3.setVisible(true);
                            tableR3C1.setText(Results.getString("A"));
                            tableR3C2.setText(Results.getString("B"));
                            tableR3C3.setText(Results.getString("C"));
                            tableR3C4.setText(Results.getString("D"));
                            if("Dibatalkan".equals(Results.getString("D"))){
                                tableButton3.setVisible(false);
                            }
                            tableR3C5 = Results.getInt("ID");
                        }
                        case 4 ->{
                            tableRow4.setVisible(true);
                            tableR4C1.setText(Results.getString("A"));
                            tableR4C2.setText(Results.getString("B"));
                            tableR4C3.setText(Results.getString("C"));
                            tableR4C4.setText(Results.getString("D"));
                            if("Dibatalkan".equals(Results.getString("D"))){
                                tableButton4.setVisible(false);
                            }
                            tableR4C5 = Results.getInt("ID");
                        }
                        case 5 ->{
                            tableRow5.setVisible(true);
                            tableR5C1.setText(Results.getString("A"));
                            tableR5C2.setText(Results.getString("B"));
                            tableR5C3.setText(Results.getString("C"));
                            tableR5C4.setText(Results.getString("D"));
                            if("Dibatalkan".equals(Results.getString("D"))){
                                tableButton5.setVisible(false);
                            }
                            tableR5C5 = Results.getInt("ID");
                        }
                        case 6 ->{
                            tableRow6.setVisible(true);
                            tableR6C1.setText(Results.getString("A"));
                            tableR6C2.setText(Results.getString("B"));
                            tableR6C3.setText(Results.getString("C"));
                            tableR6C4.setText(Results.getString("D"));
                            if("Dibatalkan".equals(Results.getString("D"))){
                                tableButton6.setVisible(false);
                            }
                            tableR6C5 = Results.getInt("ID");
                        }
                        case 7 ->{
                            tableRow7.setVisible(true);
                            tableR7C1.setText(Results.getString("A"));
                            tableR7C2.setText(Results.getString("B"));
                            tableR7C3.setText(Results.getString("C"));
                            tableR7C4.setText(Results.getString("D"));
                            if("Dibatalkan".equals(Results.getString("D"))){
                                tableButton7.setVisible(false);
                            }
                            tableR7C5 = Results.getInt("ID");
                        }
                        case 8 ->{
                            tableRow8.setVisible(true);
                            tableR8C1.setText(Results.getString("A"));
                            tableR8C2.setText(Results.getString("B"));
                            tableR8C3.setText(Results.getString("C"));
                            tableR8C4.setText(Results.getString("D"));
                            if("Dibatalkan".equals(Results.getString("D"))){
                                tableButton8.setVisible(false);
                            }
                            tableR8C5 = Results.getInt("ID");
                        }
                        case 9 ->{
                            tableRow9.setVisible(true);
                            tableR9C1.setText(Results.getString("A"));
                            tableR9C2.setText(Results.getString("B"));
                            tableR9C3.setText(Results.getString("C"));
                            tableR9C4.setText(Results.getString("D"));
                            if("Dibatalkan".equals(Results.getString("D"))){
                                tableButton9.setVisible(false);
                            }
                            tableR9C5 = Results.getInt("ID");
                        }
                        default ->{
                            // Nothing
                        }
                    }
                    index++;
                }
            }
        } catch(SQLException e){
            
        } catch (Exception ex) {
            Logger.getLogger(Pesanan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sidebar = new javax.swing.JPanel();
        navExit = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        thisTable = new javax.swing.JPanel();
        tableRow = new javax.swing.JPanel();
        tableColumn1 = new javax.swing.JLabel();
        tableColumn2 = new javax.swing.JLabel();
        tableColumn3 = new javax.swing.JLabel();
        tableColumn4 = new javax.swing.JLabel();
        tableRow0 = new javax.swing.JPanel();
        tableR0C1 = new javax.swing.JLabel();
        tableR0C2 = new javax.swing.JLabel();
        tableR0C3 = new javax.swing.JLabel();
        tableR0C4 = new javax.swing.JLabel();
        tableButton0 = new javax.swing.JButton();
        tableRow1 = new javax.swing.JPanel();
        tableR1C1 = new javax.swing.JLabel();
        tableR1C2 = new javax.swing.JLabel();
        tableR1C3 = new javax.swing.JLabel();
        tableR1C4 = new javax.swing.JLabel();
        tableButton1 = new javax.swing.JButton();
        tableRow2 = new javax.swing.JPanel();
        tableR2C1 = new javax.swing.JLabel();
        tableR2C2 = new javax.swing.JLabel();
        tableR2C3 = new javax.swing.JLabel();
        tableR2C4 = new javax.swing.JLabel();
        tableButton2 = new javax.swing.JButton();
        tableRow3 = new javax.swing.JPanel();
        tableR3C1 = new javax.swing.JLabel();
        tableR3C2 = new javax.swing.JLabel();
        tableR3C3 = new javax.swing.JLabel();
        tableR3C4 = new javax.swing.JLabel();
        tableButton3 = new javax.swing.JButton();
        tableRow4 = new javax.swing.JPanel();
        tableR4C1 = new javax.swing.JLabel();
        tableR4C2 = new javax.swing.JLabel();
        tableR4C3 = new javax.swing.JLabel();
        tableR4C4 = new javax.swing.JLabel();
        tableButton4 = new javax.swing.JButton();
        tableRow5 = new javax.swing.JPanel();
        tableR5C1 = new javax.swing.JLabel();
        tableR5C2 = new javax.swing.JLabel();
        tableR5C3 = new javax.swing.JLabel();
        tableR5C4 = new javax.swing.JLabel();
        tableButton5 = new javax.swing.JButton();
        tableRow6 = new javax.swing.JPanel();
        tableR6C1 = new javax.swing.JLabel();
        tableR6C2 = new javax.swing.JLabel();
        tableR6C3 = new javax.swing.JLabel();
        tableR6C4 = new javax.swing.JLabel();
        tableButton6 = new javax.swing.JButton();
        tableRow7 = new javax.swing.JPanel();
        tableR7C1 = new javax.swing.JLabel();
        tableR7C2 = new javax.swing.JLabel();
        tableR7C3 = new javax.swing.JLabel();
        tableR7C4 = new javax.swing.JLabel();
        tableButton7 = new javax.swing.JButton();
        tableRow8 = new javax.swing.JPanel();
        tableR8C1 = new javax.swing.JLabel();
        tableR8C2 = new javax.swing.JLabel();
        tableR8C3 = new javax.swing.JLabel();
        tableR8C4 = new javax.swing.JLabel();
        tableButton8 = new javax.swing.JButton();
        tableRow9 = new javax.swing.JPanel();
        tableR9C1 = new javax.swing.JLabel();
        tableR9C2 = new javax.swing.JLabel();
        tableR9C3 = new javax.swing.JLabel();
        tableR9C4 = new javax.swing.JLabel();
        tableButton9 = new javax.swing.JButton();
        navBack = new javax.swing.JButton();
        navNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RENTAL | Pesanan Saya");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(Position.Center("screenX"),Position.Center("screenY"));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sidebar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navExit.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        navExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow_circle_left_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        navExit.setText("Kembali");
        navExit.setAlignmentY(0.0F);
        navExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        navExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navExit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        navExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navExitActionPerformed(evt);
            }
        });
        Sidebar.add(navExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 364, 184, -1));

        getContentPane().add(Sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 400));

        Header.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nama Pengguna");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 600, 40));

        thisTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        thisTable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableRow.setBackground(java.awt.Color.lightGray);
        tableRow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableColumn1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        tableColumn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableColumn1.setText("Merek");
        tableRow.add(tableColumn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 110, -1));

        tableColumn2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        tableColumn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableColumn2.setText("Model");
        tableRow.add(tableColumn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 0, 160, -1));

        tableColumn3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        tableColumn3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableColumn3.setText("Seater");
        tableRow.add(tableColumn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 0, 110, -1));

        tableColumn4.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        tableColumn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableColumn4.setText("Status");
        tableRow.add(tableColumn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 0, 80, -1));

        thisTable.add(tableRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 590, -1));

        tableRow0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableR0C1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR0C1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR0C1.setText("000000000000");
        tableRow0.add(tableR0C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 110, -1));

        tableR0C2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR0C2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR0C2.setText("WWWWWWWWWWWW");
        tableRow0.add(tableR0C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 0, 160, -1));

        tableR0C3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR0C3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR0C3.setText("000000000000");
        tableRow0.add(tableR0C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 0, 110, -1));

        tableR0C4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR0C4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR0C4.setText("CANCELED");
        tableRow0.add(tableR0C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 0, 80, -1));

        tableButton0.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableButton0.setText("Batalkan");
        tableButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableButton0ActionPerformed(evt);
            }
        });
        tableRow0.add(tableButton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 94, 19));

        thisTable.add(tableRow0, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 33, -1, -1));

        tableRow1.setBackground(java.awt.Color.lightGray);
        tableRow1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableR1C1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR1C1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR1C1.setText("000000000000");
        tableRow1.add(tableR1C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 110, -1));

        tableR1C2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR1C2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR1C2.setText("WWWWWWWWWWWW");
        tableRow1.add(tableR1C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 0, 160, -1));

        tableR1C3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR1C3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR1C3.setText("000000000000");
        tableRow1.add(tableR1C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 0, 110, -1));

        tableR1C4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR1C4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR1C4.setText("CANCELED");
        tableRow1.add(tableR1C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 0, 80, -1));

        tableButton1.setBackground(java.awt.Color.lightGray);
        tableButton1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableButton1.setText("Batalkan");
        tableButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableButton1ActionPerformed(evt);
            }
        });
        tableRow1.add(tableButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 94, 19));

        thisTable.add(tableRow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 58, -1, -1));

        tableRow2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableR2C1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR2C1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR2C1.setText("000000000000");
        tableRow2.add(tableR2C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 110, -1));

        tableR2C2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR2C2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR2C2.setText("WWWWWWWWWWWW");
        tableRow2.add(tableR2C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 0, 160, -1));

        tableR2C3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR2C3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR2C3.setText("000000000000");
        tableRow2.add(tableR2C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 0, 110, -1));

        tableR2C4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR2C4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR2C4.setText("CANCELED");
        tableRow2.add(tableR2C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 0, 80, -1));

        tableButton2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableButton2.setText("Batalkan");
        tableButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableButton2ActionPerformed(evt);
            }
        });
        tableRow2.add(tableButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 94, 19));

        thisTable.add(tableRow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 83, -1, -1));

        tableRow3.setBackground(java.awt.Color.lightGray);
        tableRow3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableR3C1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR3C1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR3C1.setText("000000000000");
        tableRow3.add(tableR3C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 110, -1));

        tableR3C2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR3C2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR3C2.setText("WWWWWWWWWWWW");
        tableRow3.add(tableR3C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 0, 160, -1));

        tableR3C3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR3C3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR3C3.setText("000000000000");
        tableRow3.add(tableR3C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 0, 110, -1));

        tableR3C4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR3C4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR3C4.setText("CANCELED");
        tableRow3.add(tableR3C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 0, 80, -1));

        tableButton3.setBackground(java.awt.Color.lightGray);
        tableButton3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableButton3.setText("Batalkan");
        tableButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableButton3ActionPerformed(evt);
            }
        });
        tableRow3.add(tableButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 94, 19));

        thisTable.add(tableRow3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 108, -1, -1));

        tableRow4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableR4C1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR4C1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR4C1.setText("000000000000");
        tableRow4.add(tableR4C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 110, -1));

        tableR4C2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR4C2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR4C2.setText("WWWWWWWWWWWW");
        tableRow4.add(tableR4C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 0, 160, -1));

        tableR4C3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR4C3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR4C3.setText("000000000000");
        tableRow4.add(tableR4C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 0, 110, -1));

        tableR4C4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR4C4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR4C4.setText("CANCELED");
        tableRow4.add(tableR4C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 0, 80, -1));

        tableButton4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableButton4.setText("Batalkan");
        tableButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableButton4ActionPerformed(evt);
            }
        });
        tableRow4.add(tableButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 94, 19));

        thisTable.add(tableRow4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 133, -1, -1));

        tableRow5.setBackground(java.awt.Color.lightGray);
        tableRow5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableR5C1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR5C1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR5C1.setText("000000000000");
        tableRow5.add(tableR5C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 110, -1));

        tableR5C2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR5C2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR5C2.setText("WWWWWWWWWWWW");
        tableRow5.add(tableR5C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 0, 160, -1));

        tableR5C3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR5C3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR5C3.setText("000000000000");
        tableRow5.add(tableR5C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 0, 110, -1));

        tableR5C4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR5C4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR5C4.setText("CANCELED");
        tableRow5.add(tableR5C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 0, 80, -1));

        tableButton5.setBackground(java.awt.Color.lightGray);
        tableButton5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableButton5.setText("Batalkan");
        tableButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableButton5ActionPerformed(evt);
            }
        });
        tableRow5.add(tableButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 94, 19));

        thisTable.add(tableRow5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 158, -1, -1));

        tableRow6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableR6C1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR6C1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR6C1.setText("000000000000");
        tableRow6.add(tableR6C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 110, -1));

        tableR6C2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR6C2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR6C2.setText("WWWWWWWWWWWW");
        tableRow6.add(tableR6C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 0, 160, -1));

        tableR6C3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR6C3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR6C3.setText("000000000000");
        tableRow6.add(tableR6C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 0, 110, -1));

        tableR6C4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR6C4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR6C4.setText("CANCELED");
        tableRow6.add(tableR6C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 0, 80, -1));

        tableButton6.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableButton6.setText("Batalkan");
        tableButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableButton6ActionPerformed(evt);
            }
        });
        tableRow6.add(tableButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 94, 19));

        thisTable.add(tableRow6, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 183, -1, -1));

        tableRow7.setBackground(java.awt.Color.lightGray);
        tableRow7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableR7C1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR7C1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR7C1.setText("000000000000");
        tableRow7.add(tableR7C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 110, -1));

        tableR7C2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR7C2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR7C2.setText("WWWWWWWWWWWW");
        tableRow7.add(tableR7C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 0, 160, -1));

        tableR7C3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR7C3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR7C3.setText("000000000000");
        tableRow7.add(tableR7C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 0, 110, -1));

        tableR7C4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR7C4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR7C4.setText("CANCELED");
        tableRow7.add(tableR7C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 0, 80, -1));

        tableButton7.setBackground(java.awt.Color.lightGray);
        tableButton7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableButton7.setText("Batalkan");
        tableButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableButton7ActionPerformed(evt);
            }
        });
        tableRow7.add(tableButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 94, 19));

        thisTable.add(tableRow7, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 208, -1, -1));

        tableRow8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableR8C1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR8C1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR8C1.setText("000000000000");
        tableRow8.add(tableR8C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 110, -1));

        tableR8C2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR8C2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR8C2.setText("WWWWWWWWWWWW");
        tableRow8.add(tableR8C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 0, 160, -1));

        tableR8C3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR8C3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR8C3.setText("000000000000");
        tableRow8.add(tableR8C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 0, 110, -1));

        tableR8C4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR8C4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR8C4.setText("CANCELED");
        tableRow8.add(tableR8C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 0, 80, -1));

        tableButton8.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableButton8.setText("Batalkan");
        tableButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableButton8ActionPerformed(evt);
            }
        });
        tableRow8.add(tableButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 94, 19));

        thisTable.add(tableRow8, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 233, -1, -1));

        tableRow9.setBackground(java.awt.Color.lightGray);
        tableRow9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableR9C1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR9C1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR9C1.setText("000000000000");
        tableRow9.add(tableR9C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 110, -1));

        tableR9C2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR9C2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR9C2.setText("WWWWWWWWWWWW");
        tableRow9.add(tableR9C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 0, 160, -1));

        tableR9C3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR9C3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR9C3.setText("000000000000");
        tableRow9.add(tableR9C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 0, 110, -1));

        tableR9C4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableR9C4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableR9C4.setText("CANCELED");
        tableRow9.add(tableR9C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 0, 80, -1));

        tableButton9.setBackground(java.awt.Color.lightGray);
        tableButton9.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableButton9.setText("Batalkan");
        tableButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableButton9ActionPerformed(evt);
            }
        });
        tableRow9.add(tableButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 94, 19));

        thisTable.add(tableRow9, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 258, -1, -1));

        getContentPane().add(thisTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 600, 286));

        navBack.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        navBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow_circle_left_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        navBack.setText("Back");
        navBack.setBorder(null);
        navBack.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        navBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navBackActionPerformed(evt);
            }
        });
        getContentPane().add(navBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 335, 70, -1));

        navNext.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        navNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow_circle_right_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        navNext.setText("Next");
        navNext.setBorder(null);
        navNext.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        navNext.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        navNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navNextActionPerformed(evt);
            }
        });
        getContentPane().add(navNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 335, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(Auth.isLoggedIn() == false){
            dispose();
            
            SwingUtilities.invokeLater(() -> new Authenticate().setVisible(true));
        }
        try {
            jLabel4.setText(Database.SELECT("SELECT Nama FROM penyewa WHERE Username = ?"));
        } catch (Exception ex) {
            Logger.getLogger(Pesanan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        UpdateTable();
    }//GEN-LAST:event_formWindowOpened

    private void navBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navBackActionPerformed
        // Mengubah visible ke false
        tableRow0.setVisible(false);
        tableRow1.setVisible(false);
        tableRow2.setVisible(false);
        tableRow3.setVisible(false);
        tableRow4.setVisible(false);
        tableRow5.setVisible(false);
        tableRow6.setVisible(false);
        tableRow7.setVisible(false);
        tableRow8.setVisible(false);
        tableRow9.setVisible(false);
        
        selectorOffset = !(selectorOffset <= 10) ? selectorOffset - 10 : 0;
        try(Connection DB = DriverManager.getConnection(DBNAME, DBUSER, DBPASS)){
            try(PreparedStatement Statements = DB.prepareStatement("SELECT P.ID, M.Merek AS A, M.Model AS B, M.Kapasitas AS C, P.Status AS D FROM peminjaman P LEFT JOIN mobil M ON M.ID = P.Mobil WHERE P.Penyewa = ? LIMIT 10 OFFSET ?")){
                Statements.setInt(1, intID);
                Statements.setInt(2, selectorOffset);
                ResultSet Results = Statements.executeQuery();
                int index = 0;
                while(Results.next()){
                    switch (index){
                        case 0 ->{
                            tableRow0.setVisible(true);
                            tableR0C1.setText(Results.getString("A"));
                            tableR0C2.setText(Results.getString("B"));
                            tableR0C3.setText(Results.getString("C"));
                            tableR0C4.setText(Results.getString("D"));
                            tableR0C5 = Results.getInt("ID");
                        }
                        case 1 ->{
                            tableRow1.setVisible(true);
                            tableR1C1.setText(Results.getString("A"));
                            tableR1C2.setText(Results.getString("B"));
                            tableR1C3.setText(Results.getString("C"));
                            tableR1C4.setText(Results.getString("D"));
                            tableR1C5 = Results.getInt("ID");
                        }
                        case 2 ->{
                            tableRow2.setVisible(true);
                            tableR2C1.setText(Results.getString("A"));
                            tableR2C2.setText(Results.getString("B"));
                            tableR2C3.setText(Results.getString("C"));
                            tableR2C4.setText(Results.getString("D"));
                            tableR2C5 = Results.getInt("ID");
                        }
                        case 3 ->{
                            tableRow3.setVisible(true);
                            tableR3C1.setText(Results.getString("A"));
                            tableR3C2.setText(Results.getString("B"));
                            tableR3C3.setText(Results.getString("C"));
                            tableR3C4.setText(Results.getString("D"));
                            tableR3C5 = Results.getInt("ID");
                        }
                        case 4 ->{
                            tableRow4.setVisible(true);
                            tableR4C1.setText(Results.getString("A"));
                            tableR4C2.setText(Results.getString("B"));
                            tableR4C3.setText(Results.getString("C"));
                            tableR4C4.setText(Results.getString("D"));
                            tableR4C5 = Results.getInt("ID");
                        }
                        case 5 ->{
                            tableRow5.setVisible(true);
                            tableR5C1.setText(Results.getString("A"));
                            tableR5C2.setText(Results.getString("B"));
                            tableR5C3.setText(Results.getString("C"));
                            tableR5C4.setText(Results.getString("D"));
                            tableR5C5 = Results.getInt("ID");
                        }
                        case 6 ->{
                            tableRow6.setVisible(true);
                            tableR6C1.setText(Results.getString("A"));
                            tableR6C2.setText(Results.getString("B"));
                            tableR6C3.setText(Results.getString("C"));
                            tableR6C4.setText(Results.getString("D"));
                            tableR6C5 = Results.getInt("ID");
                        }
                        case 7 ->{
                            tableRow7.setVisible(true);
                            tableR7C1.setText(Results.getString("A"));
                            tableR7C2.setText(Results.getString("B"));
                            tableR7C3.setText(Results.getString("C"));
                            tableR7C4.setText(Results.getString("D"));
                            tableR7C5 = Results.getInt("ID");
                        }
                        case 8 ->{
                            tableRow8.setVisible(true);
                            tableR8C1.setText(Results.getString("A"));
                            tableR8C2.setText(Results.getString("B"));
                            tableR8C3.setText(Results.getString("C"));
                            tableR8C4.setText(Results.getString("D"));
                            tableR8C5 = Results.getInt("ID");
                        }
                        case 9 ->{
                            tableRow9.setVisible(true);
                            tableR9C1.setText(Results.getString("A"));
                            tableR9C2.setText(Results.getString("B"));
                            tableR9C3.setText(Results.getString("C"));
                            tableR9C4.setText(Results.getString("D"));
                            tableR9C5 = Results.getInt("ID");
                        }
                        default ->{
                            // Nothing
                        }
                    }
                    index++;
                }
            }
        } catch(SQLException e){
            
        }
    }//GEN-LAST:event_navBackActionPerformed

    private void navNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navNextActionPerformed
        // Mengubah visible ke false
        tableRow0.setVisible(false);
        tableRow1.setVisible(false);
        tableRow2.setVisible(false);
        tableRow3.setVisible(false);
        tableRow4.setVisible(false);
        tableRow5.setVisible(false);
        tableRow6.setVisible(false);
        tableRow7.setVisible(false);
        tableRow8.setVisible(false);
        tableRow9.setVisible(false);
        
        try(Connection DB = DriverManager.getConnection(DBNAME, DBUSER, DBPASS)){
            try(PreparedStatement Statements = DB.prepareStatement("SELECT COUNT(*) AS listTotal FROM peminjaman WHERE Penyewa=?")){
                Statements.setInt(1, intID);
                ResultSet Results = Statements.executeQuery();
                if(Results.next()){
                    int currentData = Results.getInt("listTotal");
                    selectorOffset = !((currentData - selectorOffset) < 10) ? selectorOffset + 10 : selectorOffset;
                }
            }
            String Query = "SELECT P.ID, M.Merek AS A, M.Model AS B, M.Kapasitas AS C, P.Status AS D FROM peminjaman P LEFT JOIN mobil M ON M.ID = P.Mobil WHERE P.Penyewa = ? LIMIT 10 OFFSET " + selectorOffset;
            try(PreparedStatement Statements = DB.prepareStatement(Query)){
                Statements.setInt(1, intID);
                ResultSet Results = Statements.executeQuery();
                int index = 0;
                while(Results.next()){
                    switch (index){
                        case 0 ->{
                            tableRow0.setVisible(true);
                            tableR0C1.setText(Results.getString("A"));
                            tableR0C2.setText(Results.getString("B"));
                            tableR0C3.setText(Results.getString("C"));
                            tableR0C4.setText(Results.getString("D"));
                            tableR0C5 = Results.getInt("ID");
                        }
                        case 1 ->{
                            tableRow1.setVisible(true);
                            tableR1C1.setText(Results.getString("A"));
                            tableR1C2.setText(Results.getString("B"));
                            tableR1C3.setText(Results.getString("C"));
                            tableR1C4.setText(Results.getString("D"));
                            tableR1C5 = Results.getInt("ID");
                        }
                        case 2 ->{
                            tableRow2.setVisible(true);
                            tableR2C1.setText(Results.getString("A"));
                            tableR2C2.setText(Results.getString("B"));
                            tableR2C3.setText(Results.getString("C"));
                            tableR2C4.setText(Results.getString("D"));
                            tableR2C5 = Results.getInt("ID");
                        }
                        case 3 ->{
                            tableRow3.setVisible(true);
                            tableR3C1.setText(Results.getString("A"));
                            tableR3C2.setText(Results.getString("B"));
                            tableR3C3.setText(Results.getString("C"));
                            tableR3C4.setText(Results.getString("D"));
                            tableR3C5 = Results.getInt("ID");
                        }
                        case 4 ->{
                            tableRow4.setVisible(true);
                            tableR4C1.setText(Results.getString("A"));
                            tableR4C2.setText(Results.getString("B"));
                            tableR4C3.setText(Results.getString("C"));
                            tableR4C4.setText(Results.getString("D"));
                            tableR4C5 = Results.getInt("ID");
                        }
                        case 5 ->{
                            tableRow5.setVisible(true);
                            tableR5C1.setText(Results.getString("A"));
                            tableR5C2.setText(Results.getString("B"));
                            tableR5C3.setText(Results.getString("C"));
                            tableR5C4.setText(Results.getString("D"));
                            tableR5C5 = Results.getInt("ID");
                        }
                        case 6 ->{
                            tableRow6.setVisible(true);
                            tableR6C1.setText(Results.getString("A"));
                            tableR6C2.setText(Results.getString("B"));
                            tableR6C3.setText(Results.getString("C"));
                            tableR6C4.setText(Results.getString("D"));
                            tableR6C5 = Results.getInt("ID");
                        }
                        case 7 ->{
                            tableRow7.setVisible(true);
                            tableR7C1.setText(Results.getString("A"));
                            tableR7C2.setText(Results.getString("B"));
                            tableR7C3.setText(Results.getString("C"));
                            tableR7C4.setText(Results.getString("D"));
                            tableR7C5 = Results.getInt("ID");
                        }
                        case 8 ->{
                            tableRow8.setVisible(true);
                            tableR8C1.setText(Results.getString("A"));
                            tableR8C2.setText(Results.getString("B"));
                            tableR8C3.setText(Results.getString("C"));
                            tableR8C4.setText(Results.getString("D"));
                            tableR8C5 = Results.getInt("ID");
                        }
                        case 9 ->{
                            tableRow9.setVisible(true);
                            tableR9C1.setText(Results.getString("A"));
                            tableR9C2.setText(Results.getString("B"));
                            tableR9C3.setText(Results.getString("C"));
                            tableR9C4.setText(Results.getString("D"));
                            tableR9C5 = Results.getInt("ID");
                        }
                        default ->{
                            // Nothing
                        }
                    }
                    index++;
                }
            }
        } catch(SQLException e){
            
        }
    }//GEN-LAST:event_navNextActionPerformed

    private void tableButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableButton0ActionPerformed
        selectedDetails = tableR0C5;
        String[] Column = {"Status","Dibatalkan"};
        Object[] WhereClause = {"ID",selectedDetails};
        if(Database.Update("peminjaman", Column, WhereClause)){
            UpdateTable();
        }
    }//GEN-LAST:event_tableButton0ActionPerformed

    private void tableButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableButton1ActionPerformed
        selectedDetails = tableR1C5;
        String[] Column = {"Status","Dibatalkan"};
        Object[] WhereClause = {"ID",selectedDetails};
        if(Database.Update("peminjaman", Column, WhereClause)){
            UpdateTable();
        }
    }//GEN-LAST:event_tableButton1ActionPerformed

    private void tableButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableButton2ActionPerformed
        selectedDetails = tableR2C5;
        String[] Column = {"Status","Dibatalkan"};
        Object[] WhereClause = {"ID",selectedDetails};
        if(Database.Update("peminjaman", Column, WhereClause)){
            UpdateTable();
        }
    }//GEN-LAST:event_tableButton2ActionPerformed

    private void tableButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableButton3ActionPerformed
        selectedDetails = tableR3C5;
        String[] Column = {"Status","Dibatalkan"};
        Object[] WhereClause = {"ID",selectedDetails};
        if(Database.Update("peminjaman", Column, WhereClause)){
            UpdateTable();
        }
    }//GEN-LAST:event_tableButton3ActionPerformed

    private void tableButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableButton4ActionPerformed
        selectedDetails = tableR4C5;
        String[] Column = {"Status","Dibatalkan"};
        Object[] WhereClause = {"ID",selectedDetails};
        if(Database.Update("peminjaman", Column, WhereClause)){
            UpdateTable();
        }
    }//GEN-LAST:event_tableButton4ActionPerformed

    private void tableButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableButton5ActionPerformed
        selectedDetails = tableR5C5;
        String[] Column = {"Status","Dibatalkan"};
        Object[] WhereClause = {"ID",selectedDetails};
        if(Database.Update("peminjaman", Column, WhereClause)){
            UpdateTable();
        }
    }//GEN-LAST:event_tableButton5ActionPerformed

    private void tableButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableButton6ActionPerformed
        selectedDetails = tableR6C5;
        String[] Column = {"Status","Dibatalkan"};
        Object[] WhereClause = {"ID",selectedDetails};
        if(Database.Update("peminjaman", Column, WhereClause)){
            UpdateTable();
        }
    }//GEN-LAST:event_tableButton6ActionPerformed

    private void tableButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableButton7ActionPerformed
        selectedDetails = tableR7C5;
        String[] Column = {"Status","Dibatalkan"};
        Object[] WhereClause = {"ID",selectedDetails};
        if(Database.Update("peminjaman", Column, WhereClause)){
            UpdateTable();
        }
    }//GEN-LAST:event_tableButton7ActionPerformed

    private void tableButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableButton8ActionPerformed
        selectedDetails = tableR8C5;
        String[] Column = {"Status","Dibatalkan"};
        Object[] WhereClause = {"ID",selectedDetails};
        if(Database.Update("peminjaman", Column, WhereClause)){
            UpdateTable();
        }
    }//GEN-LAST:event_tableButton8ActionPerformed

    private void tableButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableButton9ActionPerformed
        selectedDetails = tableR9C5;
        String[] Column = {"Status","Dibatalkan"};
        Object[] WhereClause = {"ID",selectedDetails};
        if(Database.Update("peminjaman", Column, WhereClause)){
            UpdateTable();
        }
    }//GEN-LAST:event_tableButton9ActionPerformed

    private void navExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navExitActionPerformed
        dispose();
        SwingUtilities.invokeLater(() -> new ROOT.Beranda().setVisible(true));
    }//GEN-LAST:event_navExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton navBack;
    private javax.swing.JButton navExit;
    private javax.swing.JButton navNext;
    private javax.swing.JButton tableButton0;
    private javax.swing.JButton tableButton1;
    private javax.swing.JButton tableButton2;
    private javax.swing.JButton tableButton3;
    private javax.swing.JButton tableButton4;
    private javax.swing.JButton tableButton5;
    private javax.swing.JButton tableButton6;
    private javax.swing.JButton tableButton7;
    private javax.swing.JButton tableButton8;
    private javax.swing.JButton tableButton9;
    private javax.swing.JLabel tableColumn1;
    private javax.swing.JLabel tableColumn2;
    private javax.swing.JLabel tableColumn3;
    private javax.swing.JLabel tableColumn4;
    private javax.swing.JLabel tableR0C1;
    private javax.swing.JLabel tableR0C2;
    private javax.swing.JLabel tableR0C3;
    private javax.swing.JLabel tableR0C4;
    private javax.swing.JLabel tableR1C1;
    private javax.swing.JLabel tableR1C2;
    private javax.swing.JLabel tableR1C3;
    private javax.swing.JLabel tableR1C4;
    private javax.swing.JLabel tableR2C1;
    private javax.swing.JLabel tableR2C2;
    private javax.swing.JLabel tableR2C3;
    private javax.swing.JLabel tableR2C4;
    private javax.swing.JLabel tableR3C1;
    private javax.swing.JLabel tableR3C2;
    private javax.swing.JLabel tableR3C3;
    private javax.swing.JLabel tableR3C4;
    private javax.swing.JLabel tableR4C1;
    private javax.swing.JLabel tableR4C2;
    private javax.swing.JLabel tableR4C3;
    private javax.swing.JLabel tableR4C4;
    private javax.swing.JLabel tableR5C1;
    private javax.swing.JLabel tableR5C2;
    private javax.swing.JLabel tableR5C3;
    private javax.swing.JLabel tableR5C4;
    private javax.swing.JLabel tableR6C1;
    private javax.swing.JLabel tableR6C2;
    private javax.swing.JLabel tableR6C3;
    private javax.swing.JLabel tableR6C4;
    private javax.swing.JLabel tableR7C1;
    private javax.swing.JLabel tableR7C2;
    private javax.swing.JLabel tableR7C3;
    private javax.swing.JLabel tableR7C4;
    private javax.swing.JLabel tableR8C1;
    private javax.swing.JLabel tableR8C2;
    private javax.swing.JLabel tableR8C3;
    private javax.swing.JLabel tableR8C4;
    private javax.swing.JLabel tableR9C1;
    private javax.swing.JLabel tableR9C2;
    private javax.swing.JLabel tableR9C3;
    private javax.swing.JLabel tableR9C4;
    private javax.swing.JPanel tableRow;
    private javax.swing.JPanel tableRow0;
    private javax.swing.JPanel tableRow1;
    private javax.swing.JPanel tableRow2;
    private javax.swing.JPanel tableRow3;
    private javax.swing.JPanel tableRow4;
    private javax.swing.JPanel tableRow5;
    private javax.swing.JPanel tableRow6;
    private javax.swing.JPanel tableRow7;
    private javax.swing.JPanel tableRow8;
    private javax.swing.JPanel tableRow9;
    private javax.swing.JPanel thisTable;
    // End of variables declaration//GEN-END:variables
}
