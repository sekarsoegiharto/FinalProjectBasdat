package GuiRelasi5;

import GuiRelasi4.*;
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
public class FrameSearch extends javax.swing.JFrame {

    /**
     * Creates new form FrameMiddleData
     */
    public FrameSearch() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height / 2;
        int width = screenSize.width / 2;
        int fHeight = getSize().height/2;
        int fWidth = getSize().width/2;
        setLocation(width-fWidth, height-fHeight);
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
        txtEDC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtKembalian = new javax.swing.JTextField();
        txtNoTransaksi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();

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

        txtNoTransaksi.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtNoTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoTransaksiActionPerformed(evt);
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtEDC)
                    .addComponent(txtBayar)
                    .addComponent(txtHargaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(txtKembalian)
                    .addComponent(txtNoTransaksi))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHargaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnSearch.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnSearch.setText("search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHargaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaTotalActionPerformed

    private void txtEDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEDCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEDCActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String query = "";
        if (!txtNoTransaksi.getText().equals("") && !txtEDC.getText().equals("") && !txtBayar.getText().equals("") && !txtHargaTotal.getText().equals("") && !txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE No_Transaksi LIKE '%" + txtNoTransaksi.getText() + "' AND EDC = '" + txtEDC.getText() + "' AND Bayar = '" + txtBayar.getText() + "' AND Harga_Total = '" + txtHargaTotal.getText() + "' AND Kembalian = '" + txtKembalian.getText() + "';";
        } else if (!txtNoTransaksi.getText().equals("") && !txtEDC.getText().equals("") && !txtBayar.getText().equals("") && !txtHargaTotal.getText().equals("") && txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE No_Transaksi LIKE '%" + txtNoTransaksi.getText() + "' AND EDC '" + txtEDC.getText() + "' AND Bayar = '" + txtBayar.getText() + "' AND Harga_Total = '" + txtHargaTotal.getText() + "';";
        } else if (!txtNoTransaksi.getText().equals("") && !txtEDC.getText().equals("") && !txtBayar.getText().equals("") && txtHargaTotal.getText().equals("") && !txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE No_Transaksi LIKE '%" + txtNoTransaksi.getText() + "' AND EDC = '" + txtEDC.getText() + "' AND Bayar = '" + txtBayar.getText() + "' AND Kembalian = '" + txtKembalian.getText() + "';";
        } else if (!txtNoTransaksi.getText().equals("") && !txtEDC.getText().equals("") && txtBayar.getText().equals("") && !txtHargaTotal.getText().equals("") && !txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE No_Transaksi LIKE '%" + txtNoTransaksi.getText() + "' AND EDC '" + txtEDC.getText() + "' AND Harga_Total = '" + txtHargaTotal.getText() + "' AND Kembalian = '" + txtKembalian.getText() + "';";
        } else if (!txtNoTransaksi.getText().equals("") && txtEDC.getText().equals("") && !txtBayar.getText().equals("") && !txtHargaTotal.getText().equals("") && !txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE No_Transaksi LIKE '%" + txtNoTransaksi.getText() + "%' AND Bayar = '" + txtBayar.getText() + "' AND Harga_Total = '" + txtHargaTotal.getText() + "' AND Kembalian = '" + txtKembalian.getText() + "';";
        } else if (txtNoTransaksi.getText().equals("") && !txtEDC.getText().equals("") && !txtBayar.getText().equals("") && !txtHargaTotal.getText().equals("") && !txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE EDC = '" + txtEDC.getText() + "' AND Bayar = '" + txtBayar.getText() + "' AND Harga_Total = '" + txtHargaTotal.getText() + "' AND Kembalian = '" + txtKembalian.getText() + "';";
        } else if (!txtNoTransaksi.getText().equals("") && !txtEDC.getText().equals("") && !txtBayar.getText().equals("") && txtHargaTotal.getText().equals("") && txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE No_Transaksi LIKE '%" + txtNoTransaksi.getText() + "%' AND EDC = '" + txtEDC.getText() + "' AND Bayar = '" + txtBayar.getText() + "';";
        } else if (!txtNoTransaksi.getText().equals("") && !txtEDC.getText().equals("") && txtBayar.getText().equals("") && !txtHargaTotal.getText().equals("") && txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE No_Transaksi LIKE '%" + txtNoTransaksi.getText() + "%' AND EDC = '" + txtEDC.getText() + "' AND Harga_Total = '" + txtHargaTotal.getText() + "';";
        } else if (!txtNoTransaksi.getText().equals("") && !txtEDC.getText().equals("") && txtBayar.getText().equals("") && txtHargaTotal.getText().equals("") && !txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE No_Transaksi LIKE '%" + txtNoTransaksi.getText() + "%' AND EDC = '" + txtEDC.getText() + "' AND Kembalian = '" + txtKembalian.getText() + "';";
        } else if (!txtNoTransaksi.getText().equals("") && txtEDC.getText().equals("") && !txtBayar.getText().equals("") && !txtHargaTotal.getText().equals("") && txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE No_Transaksi LIKE '%" + txtNoTransaksi.getText() + "' AND Bayar = '" + txtBayar.getText() + "' AND Harga_Total = '" + txtHargaTotal.getText() + "';";
        } else if (!txtNoTransaksi.getText().equals("") && txtEDC.getText().equals("") && !txtBayar.getText().equals("") && txtHargaTotal.getText().equals("") && !txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE No_Transaksi LIKE '%" + txtNoTransaksi.getText() + "' AND Bayar = '" + txtBayar.getText() + "' AND Kembalian = '" + txtKembalian.getText() + "';";
        } else if (!txtNoTransaksi.getText().equals("") && txtEDC.getText().equals("") && txtBayar.getText().equals("") && !txtHargaTotal.getText().equals("") && !txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE No_Transaksi LIKE '%" + txtNoTransaksi.getText() + "%' AND Harga_Total = '" + txtHargaTotal.getText() + "' AND Kembalian = '" + txtKembalian.getText() + "';";
        } else if (txtNoTransaksi.getText().equals("") && !txtEDC.getText().equals("") && !txtBayar.getText().equals("") && !txtHargaTotal.getText().equals("") && txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE EDC = '" + txtEDC.getText() + "' AND Bayar = '" + txtBayar.getText() + "' AND Harga_Total = '" + txtHargaTotal.getText() + "';";
        } else if (txtNoTransaksi.getText().equals("") && !txtEDC.getText().equals("") && !txtBayar.getText().equals("") && txtHargaTotal.getText().equals("") && !txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE EDC = '" + txtEDC.getText() + "' AND Bayar = '" + txtBayar.getText() + "' AND Kembalian = '" + txtKembalian.getText() + "';";
        } else if (txtNoTransaksi.getText().equals("") && txtEDC.getText().equals("") && !txtBayar.getText().equals("") && !txtHargaTotal.getText().equals("") && !txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE Bayar = '" + txtBayar.getText() + "' AND Harga_Total = '" + txtHargaTotal.getText() + "' AND Kembalian = '" + txtKembalian.getText() + "';";
        }  else if (txtNoTransaksi.getText().equals("") && !txtEDC.getText().equals("") && txtBayar.getText().equals("") && !txtHargaTotal.getText().equals("") && !txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE EDC = '" + txtEDC.getText() + "' AND Harga_Total = '" + txtHargaTotal.getText() + "' AND Kembalian = '" + txtKembalian.getText() + "';";
        } else if (!txtNoTransaksi.getText().equals("") && !txtEDC.getText().equals("") && txtBayar.getText().equals("") && txtHargaTotal.getText().equals("") && txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE No_Transaksi LIKE '%" + txtNoTransaksi.getText() + "%' AND EDC = '" + txtEDC.getText() + "';";
        } else if (!txtNoTransaksi.getText().equals("") && txtEDC.getText().equals("") && !txtBayar.getText().equals("") && txtHargaTotal.getText().equals("") && txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE No_Transaksi LIKE '%" + txtNoTransaksi.getText() + "%' AND Bayar = '" + txtBayar.getText() + "';";
        } else if (!txtNoTransaksi.getText().equals("") && txtEDC.getText().equals("") && txtBayar.getText().equals("") && !txtHargaTotal.getText().equals("") && txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE No_Transaksi LIKE '%" + txtNoTransaksi.getText() + "%' AND Harga_Total = '" + txtHargaTotal.getText() + "';";
        } else if (!txtNoTransaksi.getText().equals("") && txtEDC.getText().equals("") && txtBayar.getText().equals("") && txtHargaTotal.getText().equals("") && !txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE No_Transaksi LIKE '%" + txtNoTransaksi.getText() + "%' AND Kembalian = '" + txtKembalian.getText() + "';";
        } else if (txtNoTransaksi.getText().equals("") && !txtEDC.getText().equals("") && !txtBayar.getText().equals("") && txtHargaTotal.getText().equals("") && txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE EDC = '" + txtEDC.getText() + "' AND Bayar = '" + txtBayar.getText() + "';";
        } else if (txtNoTransaksi.getText().equals("") && !txtEDC.getText().equals("") && txtBayar.getText().equals("") && !txtHargaTotal.getText().equals("") && txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE EDC = '" + txtEDC.getText() + "' AND Harga_Total = '" + txtHargaTotal.getText() + "';";
        } else if (txtNoTransaksi.getText().equals("") && !txtEDC.getText().equals("") && txtBayar.getText().equals("") && txtHargaTotal.getText().equals("") && !txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE EDC = '" + txtEDC.getText() + "' AND Kembalian = '" + txtKembalian.getText() + "';";
        } else if (txtNoTransaksi.getText().equals("") && txtEDC.getText().equals("") && !txtBayar.getText().equals("") && !txtHargaTotal.getText().equals("") && txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE Bayar = '" + txtBayar.getText() + "' AND Harga_Total = '" + txtHargaTotal.getText() + "';";
        } else if (txtNoTransaksi.getText().equals("") && txtEDC.getText().equals("") && !txtBayar.getText().equals("") && txtHargaTotal.getText().equals("") && !txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE Bayar = '" + txtBayar.getText() + "' AND Kembalian = '" + txtKembalian.getText() + "';";
        } else if (txtNoTransaksi.getText().equals("") && txtEDC.getText().equals("") && txtBayar.getText().equals("") && !txtHargaTotal.getText().equals("") && !txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE Harga_Total = '" + txtHargaTotal.getText() + "' AND Kembalian = '" + txtKembalian.getText() + "';";
        } else if (!txtNoTransaksi.getText().equals("") && txtEDC.getText().equals("") && txtBayar.getText().equals("") && !txtHargaTotal.getText().equals("") && txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE No_Transaksi LIKE '%" + txtNoTransaksi.getText() + "%';";
        } else if (txtNoTransaksi.getText().equals("") && !txtEDC.getText().equals("") && txtBayar.getText().equals("") && !txtHargaTotal.getText().equals("") && txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE EDC = '" + txtEDC.getText() + "';";
        } else if (txtNoTransaksi.getText().equals("") && txtEDC.getText().equals("") && !txtBayar.getText().equals("") && txtHargaTotal.getText().equals("") && txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE Bayar = '" + txtBayar.getText() + "';";
        } else if (txtNoTransaksi.getText().equals("") && txtEDC.getText().equals("") && txtBayar.getText().equals("") && !txtHargaTotal.getText().equals("") && txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE Harga_Total = '" + txtHargaTotal.getText() + "';";
        } else if (txtNoTransaksi.getText().equals("") && txtEDC.getText().equals("") && txtBayar.getText().equals("") && txtHargaTotal.getText().equals("") && !txtKembalian.getText().equals("")) {
            query = "SELECT * FROM relasi5 WHERE Kembalian = '" + txtKembalian.getText() + "';";

        } else {
            JOptionPane.showMessageDialog(this, "Silakan input data terlebih dahulu");
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dburl = "jdbc:sqlserver://localhost:1433;databaseName=Basdat;encrypt=true;trustServerCertificate=true;user=sa;password=123456";
            java.sql.Connection con = DriverManager.getConnection(dburl);
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet result = stm.executeQuery(query);
            String arrData[][] = new String[100][100];
            int baris = -1;
            while (result.next()) {
                baris++;
                arrData[baris][0] = result.getString(1);
                arrData[baris][1] = result.getString(2);
                arrData[baris][2] = result.getString(3);
                arrData[baris][3] = result.getString(4);
                arrData[baris][4] = result.getString(5);
                System.out.println(baris);
                System.out.println(result.getString(1));
            }

            if (baris == -1) {
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan, silakan gunakan keyword lain");
            } else if (baris < 1) {
                new FrameFirstDataWhenTheresNoData(baris, baris, arrData).setVisible(true);
                this.setVisible(false);
            } else {
                new FrameFirstDataWhenTheresAnotherData(0, baris, arrData).setVisible(true);
                this.setVisible(false);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtNoTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoTransaksiActionPerformed

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
            java.util.logging.Logger.getLogger(FrameSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtEDC;
    private javax.swing.JTextField txtHargaTotal;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtNoTransaksi;
    // End of variables declaration//GEN-END:variables
}
