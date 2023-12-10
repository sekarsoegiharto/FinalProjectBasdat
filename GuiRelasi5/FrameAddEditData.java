package GuiRelasi5;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Anisa Wandalia
 */
public class FrameAddEditData extends javax.swing.JFrame {

    /**
     * Creates new form FrameAddEditData
     */
    int status;
    String primaryKey;

    public FrameAddEditData(String NoTransaksi, String HargaTotal, String EDC, String Bayar, String Kembalian, int status) {
        initComponents();
        this.status = status;
        this.primaryKey = NoTransaksi;
        txtNoTransaksi.setText(NoTransaksi);
        txtHargaTotal.setText(HargaTotal);
        txtEDC.setText(EDC);
        txtBayar.setText(Bayar);
        txtKembalian.setText(Kembalian);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height / 2;
        int width = screenSize.width / 2;
        int fHeight = getSize().height / 2;
        int fWidth = getSize().width / 2;
        setLocation(width - fWidth, height - fHeight);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHargaTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEDC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtKembalian = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNoTransaksi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

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

        txtEDC.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtEDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEDCActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 12)); // NOI18N
        jLabel3.setText("Bayar");

        txtBayar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 12)); // NOI18N
        jLabel4.setText("Kembalian");

        txtKembalian.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtKembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKembalianActionPerformed(evt);
            }
        });

        btnSave.setForeground(new java.awt.Color(0, 153, 0));
        btnSave.setText("✔");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setForeground(new java.awt.Color(153, 0, 0));
        btnDelete.setText("✘");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("NSimSun", 0, 12)); // NOI18N
        jLabel5.setText("No Transaksi");

        jLabel6.setFont(new java.awt.Font("NSimSun", 0, 12)); // NOI18N
        jLabel6.setText("0 = debit, 1 = cash");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEDC)
                            .addComponent(txtKembalian)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHargaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                            .addComponent(txtNoTransaksi)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(80, 80, 80)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtBayar))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNoTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHargaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHome)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
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

    private void txtEDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEDCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEDCActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String NoTransaksi = txtNoTransaksi.getText();
        String HargaTotal = txtHargaTotal.getText();
        String EDC = txtEDC.getText();
        String Bayar = txtBayar.getText();
        String Kembalian = txtKembalian.getText();

        if (status == 0) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dburl = "jdbc:sqlserver://localhost:1433;databaseName=Basdat;encrypt=true;trustServerCertificate=true;user=sa;password=123456";
                java.sql.Connection con = DriverManager.getConnection(dburl);
                java.sql.PreparedStatement state = con.prepareStatement("INSERT INTO relasi5 VALUES ('" + HargaTotal + "','" + EDC + "','" + Bayar + "','" + Kembalian + "');");
                state.execute();
                JOptionPane.showMessageDialog(this, "Sukses memasukkan data");
                txtNoTransaksi.setText("");
                txtHargaTotal.setText("");
                txtEDC.setText("");
                txtBayar.setText("");
                txtKembalian.setText("");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(this, "Perhatikan kembali format input");
            }
        } else {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dburl = "jdbc:sqlserver://localhost:1433;databaseName=Basdat;encrypt=true;trustServerCertificate=true;user=sa;password=123456";
                java.sql.Connection con = DriverManager.getConnection(dburl);
                java.sql.PreparedStatement state = con.prepareStatement("UPDATE relasi5 SET Harga_Total = '" + HargaTotal + "', EDC = '" + EDC + "', Bayar = '" + Bayar + "', Kembalian = '" + Kembalian + "' WHERE Harga_Total = '" + primaryKey + "';");
                state.execute();
                JOptionPane.showMessageDialog(this, "Sukses merubah data");
                txtNoTransaksi.setText("");
                txtHargaTotal.setText("");
                txtEDC.setText("");
                txtBayar.setText("");
                txtKembalian.setText("");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(this, "Perhatikan kembali format input");
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        txtNoTransaksi.setText("");
        txtHargaTotal.setText("");
        txtEDC.setText("");
        txtBayar.setText("");
        txtKembalian.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtKembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKembalianActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        new GuiRelasi1.FrameHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(FrameAddEditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAddEditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAddEditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAddEditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAddEditData("","","","","", 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtEDC;
    private javax.swing.JTextField txtHargaTotal;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtNoTransaksi;
    // End of variables declaration//GEN-END:variables
}