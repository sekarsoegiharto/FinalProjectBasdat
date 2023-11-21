/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GuiRelasi1;

//import GuiRelasi2.FrameFirstDataWhenTheresAnotherData;
//import GuiRelasi2.FrameFirstDataWhenTheresNoData;
//import GuiRelasi3.FrameFirstDataWhenTheresAnotherData;
//import GuiRelasi3.FrameFirstDataWhenTheresNoData;
//import GuiRelasi4.FrameFirstDataWhenTheresAnotherData;
//import GuiRelasi4.FrameFirstDataWhenTheresNoData;
//import GuiRelasi5.FrameFirstDataWhenTheresAnotherData;
//import GuiRelasi5.FrameFirstDataWhenTheresNoData;
//import GuiRelasi6.FrameFirstDataWhenTheresAnotherData;
//import GuiRelasi6.FrameFirstDataWhenTheresNoData;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.DriverManager;

/**
 *
 * @author Sekar Parameswara
 */
public class FrameHome extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public FrameHome() {
        initComponents();
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

        jLabel1 = new javax.swing.JLabel();
        btnGuiRelasi1 = new javax.swing.JButton();
        btnGuiRelasi2 = new javax.swing.JButton();
        btnGuiRelasi3 = new javax.swing.JButton();
        btnGuiRelasi4 = new javax.swing.JButton();
        btnGuiRelasi5 = new javax.swing.JButton();
        btnGuiRelasi6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Selamat Datang!");

        btnGuiRelasi1.setText("GuiRelasi1");
        btnGuiRelasi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiRelasi1ActionPerformed(evt);
            }
        });

        btnGuiRelasi2.setText("GuiRelasi2");
        btnGuiRelasi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiRelasi2ActionPerformed(evt);
            }
        });

        btnGuiRelasi3.setText("GuiRelasi3");
        btnGuiRelasi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiRelasi3ActionPerformed(evt);
            }
        });

        btnGuiRelasi4.setText("GuiRelasi4");
        btnGuiRelasi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiRelasi4ActionPerformed(evt);
            }
        });

        btnGuiRelasi5.setText("GuiRelasi5");
        btnGuiRelasi5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiRelasi5ActionPerformed(evt);
            }
        });

        btnGuiRelasi6.setText("GuiRelasi6");
        btnGuiRelasi6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiRelasi6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuiRelasi4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(btnGuiRelasi5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGuiRelasi1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnGuiRelasi2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuiRelasi6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuiRelasi3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuiRelasi2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuiRelasi3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuiRelasi1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuiRelasi4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuiRelasi5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuiRelasi6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuiRelasi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiRelasi1ActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dburl = "jdbc:sqlserver://localhost:1433;databaseName=Basdat;encrypt=true;trustServerCertificate=true;user=sa;password=123456";
            java.sql.Connection con = DriverManager.getConnection(dburl);
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet result = stm.executeQuery("SELECT * FROM relasi1");
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
            
            if (baris < 1) {
                new FrameFirstDataWhenTheresNoData(baris,baris, arrData).setVisible(true);
                this.setVisible(false);
            } else {
                new FrameFirstDataWhenTheresAnotherData(0, baris, arrData).setVisible(true);
                this.setVisible(false);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnGuiRelasi1ActionPerformed

    private void btnGuiRelasi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiRelasi2ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dburl = "jdbc:sqlserver://localhost:1433;databaseName=Basdat;encrypt=true;trustServerCertificate=true;user=sa;password=123456";
            java.sql.Connection con = DriverManager.getConnection(dburl);
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet result = stm.executeQuery("SELECT * FROM relasi2");
            String arrData[][] = new String[100][2];
            int baris = -1;
            while (result.next()) {
                baris++;
                arrData[baris][0] = result.getString(1);
                arrData[baris][1] = result.getString(2);
                
                System.out.println(baris);
                System.out.println(result.getString(1));
            }
            
            if (baris < 1) {
                new GuiRelasi2.FrameFirstDataWhenTheresNoData(baris,baris, arrData).setVisible(true);
                this.setVisible(false);
            } else {
                new GuiRelasi2.FrameFirstDataWhenTheresAnotherData(0, baris, arrData).setVisible(true);
                this.setVisible(false);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnGuiRelasi2ActionPerformed

    private void btnGuiRelasi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiRelasi3ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dburl = "jdbc:sqlserver://localhost:1433;databaseName=Basdat;encrypt=true;trustServerCertificate=true;user=sa;password=123456";
            java.sql.Connection con = DriverManager.getConnection(dburl);
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet result = stm.executeQuery("SELECT * FROM relasi3");
            String arrData[][] = new String[100][2];
            int baris = -1;
            while (result.next()) {
                baris++;
                arrData[baris][0] = result.getString(1);
                arrData[baris][1] = result.getString(2);
                
                System.out.println(baris);
                System.out.println(result.getString(1));
            }
            
            if (baris < 1) {
                new GuiRelasi3.FrameFirstDataWhenTheresNoData(baris,baris, arrData).setVisible(true);
                this.setVisible(false);
            } else {
                new GuiRelasi3.FrameFirstDataWhenTheresAnotherData(0, baris, arrData).setVisible(true);
                this.setVisible(false);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnGuiRelasi3ActionPerformed

    private void btnGuiRelasi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiRelasi4ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dburl = "jdbc:sqlserver://localhost:1433;databaseName=Basdat;encrypt=true;trustServerCertificate=true;user=sa;password=123456";
            java.sql.Connection con = DriverManager.getConnection(dburl);
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet result = stm.executeQuery("SELECT * FROM relasi4");
            String arrData[][] = new String[100][4];
            int baris = -1;
            while (result.next()) {
                baris++;
                arrData[baris][0] = result.getString(1);
                arrData[baris][1] = result.getString(2);
                arrData[baris][2] = result.getString(3);
                arrData[baris][3] = result.getString(4);
                
                System.out.println(baris);
                System.out.println(result.getString(1));
            }
            
            if (baris < 1) {
                new GuiRelasi4.FrameFirstDataWhenTheresNoData(baris,baris, arrData).setVisible(true);
                this.setVisible(false);
            } else {
                new GuiRelasi4.FrameFirstDataWhenTheresAnotherData(0, baris, arrData).setVisible(true);
                this.setVisible(false);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnGuiRelasi4ActionPerformed

    private void btnGuiRelasi5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiRelasi5ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dburl = "jdbc:sqlserver://localhost:1433;databaseName=Basdat;encrypt=true;trustServerCertificate=true;user=sa;password=123456";
            java.sql.Connection con = DriverManager.getConnection(dburl);
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet result = stm.executeQuery("SELECT * FROM relasi5");
            String arrData[][] = new String[100][4];
            int baris = -1;
            while (result.next()) {
                baris++;
                arrData[baris][0] = result.getString(1);
                arrData[baris][1] = result.getString(2);
                arrData[baris][2] = result.getString(3);
                arrData[baris][3] = result.getString(4);
                
                System.out.println(baris);
                System.out.println(result.getString(1));
            }
            
            if (baris < 1) {
                new GuiRelasi5.FrameFirstDataWhenTheresNoData(baris,baris, arrData).setVisible(true);
                this.setVisible(false);
            } else {
                new GuiRelasi5.FrameFirstDataWhenTheresAnotherData(0, baris, arrData).setVisible(true);
                this.setVisible(false);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnGuiRelasi5ActionPerformed

    private void btnGuiRelasi6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiRelasi6ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dburl = "jdbc:sqlserver://localhost:1433;databaseName=Basdat;encrypt=true;trustServerCertificate=true;user=sa;password=123456";
            java.sql.Connection con = DriverManager.getConnection(dburl);
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet result = stm.executeQuery("SELECT * FROM relasi6");
            String arrData[][] = new String[100][5];
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
            
            if (baris < 1) {
                new GuiRelasi6.FrameFirstDataWhenTheresNoData(baris,baris, arrData).setVisible(true);
                this.setVisible(false);
            } else {
                new GuiRelasi6.FrameFirstDataWhenTheresAnotherData(0, baris, arrData).setVisible(true);
                this.setVisible(false);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnGuiRelasi6ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuiRelasi1;
    private javax.swing.JButton btnGuiRelasi2;
    private javax.swing.JButton btnGuiRelasi3;
    private javax.swing.JButton btnGuiRelasi4;
    private javax.swing.JButton btnGuiRelasi5;
    private javax.swing.JButton btnGuiRelasi6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

