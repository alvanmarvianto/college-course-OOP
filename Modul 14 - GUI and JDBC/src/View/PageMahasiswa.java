/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Alvan
 */
public class PageMahasiswa extends javax.swing.JFrame {
    String selectedNama;

    public PageMahasiswa() throws SQLException {
        initComponents();
        loadMahasiswa();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        showNim = new javax.swing.JLabel();
        showNama = new javax.swing.JLabel();
        showProdi = new javax.swing.JLabel();
        updateList = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nim = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        ifBtn = new javax.swing.JRadioButton();
        itBtn = new javax.swing.JRadioButton();
        seBtn = new javax.swing.JRadioButton();
        dsBtn = new javax.swing.JRadioButton();
        success = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("Detail Mahasiswa");

        jLabel2.setText("NIM");

        jLabel3.setText("Nama");

        jLabel4.setText("Prodi");

        updateList.setText("Perbarui Daftar");
        updateList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateListActionPerformed(evt);
            }
        });

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(61, 61, 61)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(showProdi)
                                            .addComponent(showNama))))
                                .addContainerGap(81, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(showNim))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(hapus)
                                            .addComponent(edit))))
                                .addGap(61, 61, 61))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateList)
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(showNim))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(showNama))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(showProdi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(updateList))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Daftar Mahasiswa", jPanel1);

        jLabel6.setText("Prodi");

        jLabel7.setText("Nama");

        jLabel8.setText("NIM");

        buttonGroup1.add(ifBtn);
        ifBtn.setText("IF");

        buttonGroup1.add(itBtn);
        itBtn.setText("IT");

        buttonGroup1.add(seBtn);
        seBtn.setText("SE");

        buttonGroup1.add(dsBtn);
        dsBtn.setText("DS");

        saveBtn.setText("Simpan");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(itBtn)
                                                    .addComponent(ifBtn))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(dsBtn)
                                                    .addComponent(seBtn)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(success))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(saveBtn)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ifBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(seBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dsBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(success)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(saveBtn)
                .addContainerGap())
        );

        jTabbedPane1.addTab("List Mahasiswa", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String inputNim = nim.getText();
        String inputNama = nama.getText();
        String inputProdi = "";
        
        for (Enumeration buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) {
            JRadioButton button = (JRadioButton) buttons.nextElement();

            if (button.isSelected()) {
                inputProdi = button.getText();
            }
        }
        
        String inputData = "INSERT INTO mahasiswa VALUES ('"+inputNim+"','"+inputNama+"','"+inputProdi+"')";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alvan","root","");
            Statement st = con.createStatement();
            st.executeUpdate(inputData);
            success.setText("Mahasiswa berhasil disimpan");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PageMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
            success.setText(ex.getMessage());
        } catch (SQLException e){
            success.setText(e.getMessage());
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void loadMahasiswa() throws SQLException {
    // Memuat data mahasiswa dari database ke dalam JList
        try {
            showNim.setText("");
            showNama.setText("");
            showProdi.setText("");
            edit.setVisible(false);
            hapus.setVisible(false);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alvan","root","");
            Statement st = con.createStatement();
            String query = "SELECT nama FROM mahasiswa";
            ResultSet resultSet = st.executeQuery(query);
            
            DefaultListModel model = new DefaultListModel();
           
            while (resultSet.next()) {
                String item = resultSet.getString("nama");
                model.addElement(item);
            }
            jList1.setModel(model); 
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(PageMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException e){
        
    }
    }

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        selectedNama = jList1.getSelectedValue();
        if (!selectedNama.isEmpty()){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alvan","root","");
                Statement st = con.createStatement();
                String query = "SELECT * FROM mahasiswa WHERE nama='"+selectedNama+"'";
                ResultSet resultSet = st.executeQuery(query);
                if (resultSet.next()){
                    showNim.setText(resultSet.getString("nim"));
                    showNama.setText(resultSet.getString("nama"));
                    showProdi.setText(resultSet.getString("prodi"));
                    edit.setVisible(true);
                    hapus.setVisible(true);
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(PageMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void updateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateListActionPerformed
        jList1.removeAll();
        try {
            loadMahasiswa();
        } catch (SQLException ex) {
            Logger.getLogger(PageMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateListActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        if (selectedNama!=null){
            new EditMahasiswa(PageMahasiswa.this,true,selectedNama).setVisible(true);
            try {
                loadMahasiswa();
            } catch (SQLException ex) {
                Logger.getLogger(PageMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
            }
            showNim.setText("");
            showNama.setText("");
            showProdi.setText("");
        }
    }//GEN-LAST:event_editActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        String selectedNama = jList1.getSelectedValue();
        if (!selectedNama.isEmpty()){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alvan","root","");
                Statement st = con.createStatement();
                String query = "DELETE FROM mahasiswa WHERE nama='"+selectedNama+"'";
                int resultSet = st.executeUpdate(query);
                loadMahasiswa();
                JOptionPane.showMessageDialog(null, "Data Berhasil dihapus!", "Pemberitahuan", JOptionPane.WARNING_MESSAGE);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(PageMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
            }
            showNim.setText("");
            showNama.setText("");
            showProdi.setText("");
        }
    }//GEN-LAST:event_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(PageMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PageMahasiswa().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PageMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton dsBtn;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JRadioButton ifBtn;
    private javax.swing.JRadioButton itBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nim;
    private javax.swing.JButton saveBtn;
    private javax.swing.JRadioButton seBtn;
    private javax.swing.JLabel showNama;
    private javax.swing.JLabel showNim;
    private javax.swing.JLabel showProdi;
    private javax.swing.JLabel success;
    private javax.swing.JButton updateList;
    // End of variables declaration//GEN-END:variables
}
