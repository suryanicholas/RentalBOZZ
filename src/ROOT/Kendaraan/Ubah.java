/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ROOT.Kendaraan;

import java.util.logging.Level;
import java.util.logging.Logger;
import AUTH.Authenticate;
import Libraries.Auth;
import Libraries.Database;
import static Libraries.Database.DBNAME;
import static Libraries.Database.DBPASS;
import static Libraries.Database.DBUSER;
import javax.swing.SwingUtilities;
import Libraries.Variabel.Position;
import static Libraries.Variabel.UploadImages;
import static Libraries.Variabel.selectedDetails;
import static ROOT.Kendaraan.Buat.ImagesFile;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
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
public class Ubah extends javax.swing.JFrame {

    /**
     * Creates new form Beranda
     */
    public Ubah() {
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
        navExit = new javax.swing.JButton();
        navItems1 = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Polisi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Transmisi = new javax.swing.JComboBox<>();
        Tahun = new javax.swing.JTextField();
        Merek = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Harian = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Mingguan = new javax.swing.JTextField();
        Bulanan = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Kapasitas = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        Warna = new javax.swing.JTextField();
        selectedImages = new javax.swing.JLabel();
        FileChooser = new javax.swing.JButton();
        Model = new javax.swing.JTextField();
        Status = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RENTAL | Ubah Informasi");
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
        Sidebar.add(navExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 364, 184, 28));

        navItems1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        navItems1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        navItems1.setText("Simpan");
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
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setText("Merek");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 40, 220, 20));

        Polisi.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel1.add(Polisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 220, 25));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setText("Model");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, 20));

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel5.setText("Tahun");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 50, 20));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel6.setText("Warna");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 90, 20));

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel7.setText("Seater");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 55, 20));

        Transmisi.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Transmisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Otomatis" }));
        jPanel1.add(Transmisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 110, 100, 25));

        Tahun.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Tahun.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Tahun.setText("2021");
        Tahun.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TahunFocusLost(evt);
            }
        });
        jPanel1.add(Tahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 50, 25));

        Merek.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel1.add(Merek, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 60, 220, 25));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel9.setText("No. Polisi");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 220, 20));

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel10.setText(": : Informasi Kendaraan");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 445, 20));

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel11.setText("Transmisi");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 90, 100, 20));

        jLabel12.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel12.setText("Harian");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 225, 105, 20));

        Harian.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Harian.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Harian.setText("0");
        jPanel1.add(Harian, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 245, 105, 25));

        jLabel13.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel13.setText("Mingguan");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 225, 105, 20));

        Mingguan.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Mingguan.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Mingguan.setText("0");
        jPanel1.add(Mingguan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 245, 105, 25));

        Bulanan.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Bulanan.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Bulanan.setText("0");
        jPanel1.add(Bulanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 245, 105, 25));

        jLabel14.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel14.setText("Bulanan");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 225, 105, 20));

        Kapasitas.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Kapasitas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "5", "7", "8", "9", "12", "15" }));
        jPanel1.add(Kapasitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 55, 25));

        jLabel15.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel15.setText(": : Harga Rental");
        jLabel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 445, 20));

        Warna.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Warna.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(Warna, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 90, 25));

        selectedImages.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        selectedImages.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(selectedImages, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 280, 280, 30));

        FileChooser.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        FileChooser.setText("Upload Gambar");
        FileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileChooserActionPerformed(evt);
            }
        });
        jPanel1.add(FileChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 160, 30));

        Model.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Model.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 25));

        Status.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tersedia", "Dipakai", "Perbaikan" }));
        jPanel1.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 130, 25));

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel8.setText("Status Ketersediaan");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 20));

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
            Logger.getLogger(Ubah.class.getName()).log(Level.SEVERE, null, ex);
        }
        try(Connection DB = DriverManager.getConnection(DBNAME, DBUSER, DBPASS)){
            String Query = "SELECT * FROM mobil WHERE ID=" + selectedDetails;
            try(PreparedStatement Statements = DB.prepareStatement(Query)){
                ResultSet Results = Statements.executeQuery();
                if(Results.next()){
                    Polisi.setText(Results.getString("Polisi"));
                    Merek.setText(Results.getString("Merek"));
                    Model.setText(Results.getString("Model"));
                    Date currentTahun = Results.getDate("Tahun");
                    SimpleDateFormat getTahun = new SimpleDateFormat("yyyy");
                    String intTahun = getTahun.format(currentTahun);
                    Tahun.setText(intTahun);
                    Warna.setText(Results.getString("Warna"));
                    Kapasitas.setSelectedItem(Results.getObject("Kapasitas"));
                    Transmisi.setSelectedItem(Results.getObject("Transmisi"));
                    Status.setSelectedItem(Results.getObject("Status"));
                    Harian.setText(Results.getString("HSH"));
                    Mingguan.setText(Results.getString("HSM"));
                    Bulanan.setText(Results.getString("HSB"));
                }
            }
        } catch (SQLException ex){

        }
    }//GEN-LAST:event_formWindowOpened

    private void navExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navExitActionPerformed
        dispose();
            
        SwingUtilities.invokeLater(() -> new ROOT.Kendaraan.Rincian().setVisible(true));
    }//GEN-LAST:event_navExitActionPerformed

    private void TahunFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TahunFocusLost
        int intTahun = Integer.parseInt(Tahun.getText());
        int Minimum = 2000, Maximum = 2100;
        if(intTahun < Minimum){
            Tahun.setText(String.valueOf(Minimum));
        } else if(intTahun > Maximum){
            Tahun.setText(String.valueOf(Maximum));
        }
    }//GEN-LAST:event_TahunFocusLost

    private void FileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileChooserActionPerformed
        JFileChooser JFC = new JFileChooser();
        FileNameExtensionFilter FNEF = new FileNameExtensionFilter("Image files","jpg","jpeg","png");
        JFC.setFileFilter(FNEF);

        int result = JFC.showOpenDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
            ImagesFile = JFC.getSelectedFile();
            selectedImages.setText(ImagesFile.getName());
        }
    }//GEN-LAST:event_FileChooserActionPerformed

    private void navItems1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navItems1ActionPerformed
        String strPolisi = Polisi.getText() != null ? Polisi.getText() : null;
        String strMerek = Merek.getText() != null ? Merek.getText() : null;
        String strModel = Model.getText() != null ? Model.getText() : null;
        int intTahun = Tahun.getText() != null ? Integer.parseInt(Tahun.getText()) : 0;
        String strWarna = Warna.getText() != null ? Warna.getText() : null;
        String strKapasitas = String.valueOf(Kapasitas.getSelectedItem());
        String strTransmisi = String.valueOf(Transmisi.getSelectedItem());
        double intHarian = Harian.getText() != null ? Double.parseDouble(Harian.getText()) : 0;
        double intMingguan = Mingguan.getText() != null ? Double.parseDouble(Mingguan.getText()) : 0;
        double intBulanan = Bulanan.getText() != null ? Double.parseDouble(Bulanan.getText()) : 0;
        String strStatus = String.valueOf(Status.getSelectedItem());
        String strPath = !"".equals(selectedImages.getText()) ? "/IMAGE/" + selectedImages.getText() : null;

        try (Connection DB = DriverManager.getConnection(DBNAME, DBUSER, DBPASS)) {
            String DBQuery = strPath != null ? "UPDATE mobil SET Polisi=?,Merek=?,Model=?,Tahun=?,Warna=?,Kapasitas=?,Transmisi=?,HSH=?,HSM=?,HSB=?,Status=?,Gambar=? WHERE ID=" + selectedDetails : "UPDATE mobil SET Polisi=?,Merek=?,Model=?,Tahun=?,Warna=?,Kapasitas=?,Transmisi=?,HSH=?,HSM=?,HSB=?,Status=? WHERE ID=" + selectedDetails;
            try(PreparedStatement Statements = DB.prepareStatement(DBQuery)){
                Statements.setString(1, strPolisi);
                Statements.setString(2, strMerek);
                Statements.setString(3, strModel);
                Statements.setInt(4, intTahun);
                Statements.setString(5, strWarna);
                Statements.setString(6, strKapasitas);
                Statements.setString(7, strTransmisi);
                Statements.setDouble(8, intHarian);
                Statements.setDouble(9, intMingguan);
                Statements.setDouble(10, intBulanan);
                Statements.setString(11, strStatus);
                if(strPath != null){
                    Statements.setString(12, strPath);
                }

                if(Statements.executeUpdate() > 0){
                    String[] ImagesName = {strModel,strMerek,strWarna};
                    if (ImagesFile != null){
                        UploadImages(ImagesFile, ImagesName);
                    }
                    dispose();
                    SwingUtilities.invokeLater(() -> new ROOT.Kendaraan.Rincian().setVisible(true));
                } else{
                    JOptionPane.showMessageDialog(null, "Gagal menyimpan Data!","Peringatan",JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan sistem!\n" + ex.getMessage(),"Peringatan",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan sistem!\n" + ex.getMessage(),"Peringatan",JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(Ubah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ubah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ubah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ubah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Ubah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bulanan;
    private javax.swing.JButton FileChooser;
    private javax.swing.JTextField Harian;
    private javax.swing.JPanel Header;
    private javax.swing.JComboBox<String> Kapasitas;
    private javax.swing.JTextField Merek;
    private javax.swing.JTextField Mingguan;
    private javax.swing.JTextField Model;
    private javax.swing.JTextField Polisi;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JTextField Tahun;
    private javax.swing.JComboBox<String> Transmisi;
    private javax.swing.JTextField Warna;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton navExit;
    private javax.swing.JButton navItems1;
    private javax.swing.JLabel selectedImages;
    // End of variables declaration//GEN-END:variables
}
