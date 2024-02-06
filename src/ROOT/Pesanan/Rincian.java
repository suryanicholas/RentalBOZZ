/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ROOT.Pesanan;

import ROOT.Karyawan.*;
import AUTH.Authenticate;
import Libraries.Auth;
import Libraries.Database;
import static Libraries.Database.DBNAME;
import static Libraries.Database.DBPASS;
import static Libraries.Database.DBUSER;
import static Libraries.Images.ResizeImages;
import Libraries.Variabel.Position;
import static Libraries.Variabel.selectedDetails;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author surya
 */
public class Rincian extends javax.swing.JFrame {

    /**
     * Creates new form Beranda
     */
    public Rincian() {
        initComponents();
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
        navItems1 = new javax.swing.JButton();
        navExit = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cDetails0 = new javax.swing.JPanel();
        cLabel0 = new javax.swing.JLabel();
        cValues0 = new javax.swing.JLabel();
        cDetails1 = new javax.swing.JPanel();
        cLabel1 = new javax.swing.JLabel();
        cValues1 = new javax.swing.JLabel();
        cDetails2 = new javax.swing.JPanel();
        cLabel2 = new javax.swing.JLabel();
        cValues2 = new javax.swing.JLabel();
        cDetails3 = new javax.swing.JPanel();
        cLabel3 = new javax.swing.JLabel();
        cValues3 = new javax.swing.JLabel();
        cDetails4 = new javax.swing.JPanel();
        cLabel4 = new javax.swing.JLabel();
        cValues4 = new javax.swing.JLabel();
        cDetails5 = new javax.swing.JPanel();
        cLabel5 = new javax.swing.JLabel();
        cValues5 = new javax.swing.JLabel();
        cDetails6 = new javax.swing.JPanel();
        cLabel6 = new javax.swing.JLabel();
        cValues6 = new javax.swing.JLabel();
        Status = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RENTAL | Rincian Pesanan");
        setLocation(Position.Center("screenX"),Position.Center("screenY"));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sidebar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navItems1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        navItems1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/order_approve_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        navItems1.setText("Konfirmasi");
        navItems1.setAlignmentY(0.0F);
        navItems1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        navItems1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navItems1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        navItems1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navItems1ActionPerformed(evt);
            }
        });
        Sidebar.add(navItems1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 184, 28));

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
        Sidebar.add(navExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 364, 184, 28));

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
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
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

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cDetails0.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cDetails0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cLabel0.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cLabel0.setText("Mobil");
        cDetails0.add(cLabel0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 25));

        cValues0.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cValues0.setText("Value");
        cDetails0.add(cValues0, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 200, 25));

        jPanel1.add(cDetails0, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 10, 330, 25));

        cDetails1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cDetails1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cLabel1.setText("No. Polisi");
        cDetails1.add(cLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 25));

        cValues1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cValues1.setText("Value");
        cDetails1.add(cValues1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 200, 25));

        jPanel1.add(cDetails1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 50, 330, 25));

        cDetails2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cDetails2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cLabel2.setText("Penyewa");
        cDetails2.add(cLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 25));

        cValues2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cValues2.setText("Value");
        cDetails2.add(cValues2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 200, 25));

        jPanel1.add(cDetails2, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 90, 330, 25));

        cDetails3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cDetails3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cLabel3.setText("Mulai Rental");
        cDetails3.add(cLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 25));

        cValues3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cValues3.setText("Value");
        cDetails3.add(cValues3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 200, 25));

        jPanel1.add(cDetails3, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 130, 330, 25));

        cDetails4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cDetails4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cLabel4.setText("Selesai Rental");
        cDetails4.add(cLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 25));

        cValues4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cValues4.setText("Value");
        cDetails4.add(cValues4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 200, 25));

        jPanel1.add(cDetails4, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 170, 330, 25));

        cDetails5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cDetails5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cLabel5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cLabel5.setText("Pembayaran");
        cDetails5.add(cLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 25));

        cValues5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cValues5.setText("Value");
        cDetails5.add(cValues5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 200, 25));

        jPanel1.add(cDetails5, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 210, 330, 25));

        cDetails6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cDetails6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cLabel6.setText("Harga Rental");
        cDetails6.add(cLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 25));

        cValues6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cValues6.setText("Value");
        cDetails6.add(cValues6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 200, 25));

        jPanel1.add(cDetails6, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 250, 330, 25));

        Status.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belum Lunas", "Lunas", "Dibatalkan" }));
        jPanel1.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 290, 330, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 600, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(Auth.isLoggedIn() == false){
            dispose();
            
            SwingUtilities.invokeLater(() -> new Authenticate().setVisible(true));
        }
        try {
            jLabel4.setText(Database.SELECT("SELECT Nama FROM karyawan WHERE Username = ?"));
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Rincian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try(Connection DB = DriverManager.getConnection(DBNAME, DBUSER, DBPASS)){
            String Query = "SELECT M.Merek, M.Polisi, C.Nama AS Penyewa, P.Mulai, P.Selesai, P.Pembayaran, P.HT FROM peminjaman P JOIN mobil M ON M.ID = P.Mobil JOIN penyewa C ON C.ID = P.Penyewa WHERE P.ID=" + selectedDetails;
            try(PreparedStatement Statements = DB.prepareStatement(Query)){
                ResultSet Results = Statements.executeQuery();
                if(Results.next()){
                    cValues0.setText(Results.getString("Merek"));
                    cValues1.setText(Results.getString("Polisi"));
                    cValues2.setText(Results.getString("Penyewa"));
                    cValues3.setText(Results.getString("Mulai"));
                    cValues4.setText(Results.getString("Selesai"));
                    cValues5.setText(Results.getString("Pembayaran"));
                    cValues6.setText(Results.getString("HT"));
                }
            }
        } catch (SQLException ex){

        }
    }//GEN-LAST:event_formWindowOpened

    private void navExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navExitActionPerformed
        dispose();
        SwingUtilities.invokeLater(() -> new ROOT.Pesanan.Main().setVisible(true));
    }//GEN-LAST:event_navExitActionPerformed

    private void navItems1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navItems1ActionPerformed
        try(Connection DB = DriverManager.getConnection(DBNAME, DBUSER, DBPASS)){
            String Query = "UPDATE peminjaman SET Status=? WHERE ID=?";
            try(PreparedStatement Statements = DB.prepareStatement(Query)){
                Statements.setString(1, String.valueOf(Status.getSelectedItem()));
                Statements.setInt(2, selectedDetails);
                if(Statements.executeUpdate() > 0){
                    dispose();
                    SwingUtilities.invokeLater(() -> new ROOT.Pesanan.Main().setVisible(true));
                }
            }
        } catch (SQLException ex){

        }
    }//GEN-LAST:event_navItems1ActionPerformed

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
            java.util.logging.Logger.getLogger(Rincian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rincian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rincian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rincian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Rincian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JPanel cDetails0;
    private javax.swing.JPanel cDetails1;
    private javax.swing.JPanel cDetails2;
    private javax.swing.JPanel cDetails3;
    private javax.swing.JPanel cDetails4;
    private javax.swing.JPanel cDetails5;
    private javax.swing.JPanel cDetails6;
    private javax.swing.JLabel cLabel0;
    private javax.swing.JLabel cLabel1;
    private javax.swing.JLabel cLabel2;
    private javax.swing.JLabel cLabel3;
    private javax.swing.JLabel cLabel4;
    private javax.swing.JLabel cLabel5;
    private javax.swing.JLabel cLabel6;
    private javax.swing.JLabel cValues0;
    private javax.swing.JLabel cValues1;
    private javax.swing.JLabel cValues2;
    private javax.swing.JLabel cValues3;
    private javax.swing.JLabel cValues4;
    private javax.swing.JLabel cValues5;
    private javax.swing.JLabel cValues6;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton navExit;
    private javax.swing.JButton navItems1;
    // End of variables declaration//GEN-END:variables
}
