/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Transaksi;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Sekar Parameswara
 */
public class FrameBeli2 extends javax.swing.JFrame {

    /**
     * Creates new form FrameBeli2
     */
    String NoTransaksi;
    String NamaToko;
    String NoPelanggan;
    String arrNamaBarang[] = new String[100];
    int arrJumlahBarang[] = new int[100];
    int arrHargaBarang[] = new int[100];
    int indexBeli = 0;
    int hargaTotal = 0;
    int kembalian = 0;

    public FrameBeli2(String NoTransaksi, String NamaToko, String NoPelanggan, String arrNamaBarang[], int arrJumlahBarang[], int indexBeli) {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height / 2;
        int width = screenSize.width / 2;
        int fHeight = getSize().height / 2;
        int fWidth = getSize().width / 2;
        setLocation(width - fWidth, height - fHeight);
        this.indexBeli = indexBeli;
        this.NoTransaksi = NoTransaksi;
        this.NoPelanggan = NoPelanggan;
        this.NamaToko = NamaToko;
        this.arrNamaBarang = arrNamaBarang;
        this.arrJumlahBarang = arrJumlahBarang;
        txtNoTransaksi.setText(NoTransaksi);
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dburl = "jdbc:sqlserver://localhost:1433;databaseName=Basdat;encrypt=true;trustServerCertificate=true;user=sa;password=123456";
            java.sql.Connection con = DriverManager.getConnection(dburl);
            for (int i = 0; i < indexBeli; i++) {
                java.sql.Statement stm = con.createStatement();
//                System.out.println("baranag : " + arrNamaBarang[i]);
                java.sql.ResultSet result = stm.executeQuery("SELECT Harga_Satuan FROM relasi3 WHERE Nama_Barang ='" + arrNamaBarang[i] + "';");
//                System.out.println(result.getInt("Harga_Satuan"));
                while (result.next()) {
//                    System.out.println("");
                    arrHargaBarang[i] = Integer.parseInt(result.getString(1));
//                    System.out.println(result.getInt("Harga_Satuan"));

//                    arrHargaBarang[i] = result.getInt("Harga_Satuan");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        hitung harga total
        for (int i = 0; i < indexBeli; i++) {
            hargaTotal += (arrJumlahBarang[i] * arrHargaBarang[i]);
        }

        txtHargaTotal.setText(String.valueOf(hargaTotal));
        txtHargaTotal.setEnabled(false);
        txtNoTransaksi.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHargaTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtKembalian = new javax.swing.JTextField();
        btnEnd = new javax.swing.JButton();
        btnBayar = new javax.swing.JButton();
        txtNoTransaksi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboEDC = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("NSimSun", 0, 12)); // NOI18N
        jLabel1.setText("Harga Total");

        txtHargaTotal.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtHargaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaTotalActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 12)); // NOI18N
        jLabel2.setText("EDC");

        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 12)); // NOI18N
        jLabel3.setText("Bayar");

        txtBayar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 12)); // NOI18N
        jLabel4.setText("Kembalian");

        txtKembalian.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        btnEnd.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnEnd.setText("Selesaikan Transaksi");
        btnEnd.setToolTipText("");
        btnEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndActionPerformed(evt);
            }
        });

        btnBayar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnBayar.setText("Bayar");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        txtNoTransaksi.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtNoTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoTransaksiActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("NSimSun", 0, 12)); // NOI18N
        jLabel5.setText("No Transaksi");

        comboEDC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Debit", "Cash" }));
        comboEDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEDCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBayar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoTransaksi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBayar)
                            .addComponent(txtHargaTotal)
                            .addComponent(txtKembalian)
                            .addComponent(comboEDC, 0, 361, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(btnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNoTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHargaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboEDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBayar)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btnEnd)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHargaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaTotalActionPerformed

    private void btnEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dburl = "jdbc:sqlserver://localhost:1433;databaseName=Basdat;encrypt=true;trustServerCertificate=true;user=sa;password=123456";
            java.sql.Connection con = DriverManager.getConnection(dburl);
            LocalDate tanggal = LocalDate.now();
            java.sql.PreparedStatement state = con.prepareStatement("INSERT INTO relasi6 VALUES ('" + NoTransaksi + "','" + NamaToko + "','" + NoPelanggan + "','" + hargaTotal + "','" + java.sql.Date.valueOf(tanggal) + "');");
            state.execute();

            java.sql.PreparedStatement state5 = con.prepareStatement("INSERT INTO relasi5 VALUES ('" + NoTransaksi + "','" + hargaTotal + "','" + comboEDC.getSelectedIndex() + "','" + txtBayar.getText() + "','" + kembalian + "');");
            state5.execute();

            for (int i = 0; i < indexBeli; i++) {
                java.sql.PreparedStatement state4 = con.prepareStatement("INSERT INTO relasi4 VALUES ('" + NoTransaksi + "','" + arrNamaBarang[i] + "','" + arrJumlahBarang[i] + "','" + arrHargaBarang[i] + "');");
                state4.execute();

            }
            JOptionPane.showMessageDialog(this, "Terima kasih sudah membeli di toko kami!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Silakan input data dengan benar");
        }
        new GuiRelasi1.FrameHome().setVisible(true);
        this.setVisible(false);
//        }
    }//GEN-LAST:event_btnEndActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        // TODO add your handling code here:
        int bayar = Integer.parseInt(txtBayar.getText());
        if (bayar > hargaTotal) {
            kembalian = bayar - hargaTotal;
            txtKembalian.setText(String.valueOf(kembalian));
        } else if(bayar < hargaTotal) {
            JOptionPane.showMessageDialog(this, "Input nominal pembayaran Anda kurang");
        } else {
            txtKembalian.setText(String.valueOf(kembalian));
        }
    }//GEN-LAST:event_btnBayarActionPerformed

    private void txtNoTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoTransaksiActionPerformed

    private void comboEDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEDCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEDCActionPerformed

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
            java.util.logging.Logger.getLogger(FrameBeli2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameBeli2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameBeli2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameBeli2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameBeli2("", "", "", new String[10], new int[10], 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnEnd;
    private javax.swing.JComboBox<String> comboEDC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtHargaTotal;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtNoTransaksi;
    // End of variables declaration//GEN-END:variables
}
