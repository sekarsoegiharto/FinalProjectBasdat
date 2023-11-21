package GuiRelasi1;

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
        txtNamaToko = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAlamatToko = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNoTelpToko = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("NSimSun", 0, 12)); // NOI18N
        jLabel1.setText("Nama Toko");

        txtNamaToko.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtNamaToko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaTokoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 12)); // NOI18N
        jLabel2.setText("Alamat Toko");

        txtAlamatToko.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtAlamatToko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamatTokoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("NSimSun", 0, 12)); // NOI18N
        jLabel3.setText("No. Telp Toko");

        txtNoTelpToko.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtNoTelpToko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoTelpTokoActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnSearch.setText("search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamaToko, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(txtAlamatToko)
                            .addComponent(txtNoTelpToko)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSearch)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNamaToko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAlamatToko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNoTelpToko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addContainerGap())
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

    private void txtNamaTokoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaTokoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaTokoActionPerformed

    private void txtAlamatTokoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatTokoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatTokoActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String query = "";
        if (!txtNamaToko.getText().equals("") && !txtAlamatToko.getText().equals("") && !txtNoTelpToko.getText().equals("")){
            query = "SELECT * FROM relasi1 WHERE Nama_Toko LIKE '%" + txtNamaToko.getText() + "%' AND Alamat_Toko LIKE '%" + txtAlamatToko.getText() + "%' AND No_Telp_Toko LIKE '%" + txtNoTelpToko.getText() + "%';";
        } else if(!txtNamaToko.getText().equals("") && !txtAlamatToko.getText().equals("") && txtNoTelpToko.getText().equals("")){
            query = "SELECT * FROM relasi1 WHERE Nama_Toko LIKE '%" + txtNamaToko.getText() + "%' AND Alamat_Toko LIKE '%" + txtAlamatToko.getText() + "%';";                   
        } else if(!txtNamaToko.getText().equals("") && txtAlamatToko.getText().equals("") && !txtNoTelpToko.getText().equals("")){
            query = "SELECT * FROM relasi1 WHERE Nama_Toko LIKE '%" + txtNamaToko.getText() + "%' AND No_Telp_Toko LIKE '%" + txtNoTelpToko.getText() + "%';";  
        } else if(txtNamaToko.getText().equals("") && !txtAlamatToko.getText().equals("") && !txtNoTelpToko.getText().equals("")){
            query = "SELECT * FROM relasi1 WHERE Alamat_Toko LIKE '%" + txtAlamatToko.getText() + "%' AND No_Telp_Toko LIKE '%" + txtNoTelpToko.getText() + "%';";
        } else if(!txtNamaToko.getText().equals("") && txtAlamatToko.getText().equals("") && txtNoTelpToko.getText().equals("")){
            query = "SELECT * FROM relasi1 WHERE Nama_Toko LIKE '%" + txtNamaToko.getText() + "%';";
        } else if(txtNamaToko.getText().equals("") && !txtAlamatToko.getText().equals("") && txtNoTelpToko.getText().equals("")){
            query = "SELECT * FROM relasi1 WHERE Alamat_Toko LIKE '%" + txtAlamatToko.getText() + "%';";
        } else if(txtNamaToko.getText().equals("") && txtAlamatToko.getText().equals("") && !txtNoTelpToko.getText().equals("")){
            query = "SELECT * FROM relasi1 WHERE No_Telp_Toko LIKE '%" + txtNoTelpToko.getText() + "%';";
        } else {
            JOptionPane.showMessageDialog(this, "Silakan input data terlebih dahulu");
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dburl = "jdbc:sqlserver://localhost:1433;databaseName=Basdat;encrypt=true;trustServerCertificate=true;user=sa;password=123456";
            java.sql.Connection con = DriverManager.getConnection(dburl);          
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet result = stm.executeQuery(query);
            String arrData[][] = new String[100][3];
            int baris = -1;
            while (result.next()) {
                baris++;
                arrData[baris][0] = result.getString(1);
                arrData[baris][1] = result.getString(2);
                arrData[baris][2] = result.getString(3);
                System.out.println(baris);
                System.out.println(result.getString(1));
            }

           if (baris == -1){
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan, silakan gunakan keyword lain");
            } else if (baris < 1) {
                new FrameFirstDataWhenTheresNoData(baris,baris, arrData).setVisible(true);
                this.setVisible(false);
            } else {
                new FrameFirstDataWhenTheresAnotherData(0, baris, arrData).setVisible(true);
                this.setVisible(false);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtNoTelpTokoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoTelpTokoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoTelpTokoActionPerformed

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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAlamatToko;
    private javax.swing.JTextField txtNamaToko;
    private javax.swing.JTextField txtNoTelpToko;
    // End of variables declaration//GEN-END:variables
}
