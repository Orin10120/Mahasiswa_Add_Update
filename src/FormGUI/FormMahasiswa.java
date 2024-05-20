
package FormGUI;

import config.koneksi;
import javax.swing.*;
import java.sql.*;
import java.util.Collections;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FormMahasiswa extends javax.swing.JFrame {

    private final Connection conn;
    
    public FormMahasiswa() {
        initComponents();
        conn = koneksi.getConnection();
        this.setTitle("TP MODUL 13");
        getData();
    }
    
     private void getData() {
         DefaultTableModel model = (DefaultTableModel)tbl_data.getModel();
         model.setRowCount(0);
         
         try {
             String sql = "Select * From mahasiswa";
             PreparedStatement st = conn.prepareStatement(sql);
             ResultSet rs = st.executeQuery();
               
             while (rs.next()) {                 
                String nim = rs.getString("nim");
                String nama = rs.getString("nama");
                String prodi = rs.getString("prodi");
                
               model.addRow(new Object[]{nim, nama, prodi});
             }
             rs.close();
             st.close();
         } catch (SQLException e) {
             System.out.println(e.getMessage());
         } catch (Exception ex) {
             ex.printStackTrace();
         }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t_prodi = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t_NIM = new javax.swing.JTextField();
        t_Nama = new javax.swing.JTextField();
        rbIF = new javax.swing.JRadioButton();
        rbIT = new javax.swing.JRadioButton();
        rbSE = new javax.swing.JRadioButton();
        rbDS = new javax.swing.JRadioButton();
        btn_simpan = new javax.swing.JButton();
        btn_perbaharui = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIM");

        jLabel2.setText("Nama");

        jLabel3.setText("Prodi");

        t_Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_NamaActionPerformed(evt);
            }
        });

        t_prodi.add(rbIF);
        rbIF.setText("IF");

        t_prodi.add(rbIT);
        rbIT.setText("IT");

        t_prodi.add(rbSE);
        rbSE.setText("SE");

        t_prodi.add(rbDS);
        rbDS.setText("DS");

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_perbaharui.setText("Perbarui daftar");
        btn_perbaharui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perbaharuiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_NIM, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbIF)
                                    .addComponent(rbIT))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbDS)
                                    .addComponent(rbSE))))
                        .addGap(60, 60, 60)
                        .addComponent(btn_perbaharui)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t_NIM, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbIF)
                        .addComponent(rbSE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbIT)
                    .addComponent(rbDS))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_perbaharui, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Input Mahasiswa", jPanel1);

        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NIM", "NAMA", "PRODI"
            }
        ));
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_data);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 119, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Daftar Mahasiswa", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t_NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_NamaActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        String nim = t_NIM.getText();
        String nama = t_Nama.getText();
        String prodi = null;
        List<AbstractButton> buttonsList = Collections.list(t_prodi.getElements());

        for (int i = 0; i < buttonsList.size(); i++) {
        AbstractButton button = buttonsList.get(i);
            if (button.isSelected()) {
              prodi = button.getText();
              break;
            }
        }
       
        if (nim.isEmpty() || nama.isEmpty() || prodi == null) {
            JOptionPane.showMessageDialog(this, "Semua Kolom harus diisi !");
        }
        
        try {
            String sql = "INSERT INTO mahasiswa (nim, nama, prodi) VALUES (?, ?, ?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nim);
            st.setString(2, nama);
            st.setString(3, prodi);
            
           int rowInserted = st.executeUpdate();
            if (rowInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data Mahasiswa berhasil disimpan");
                resetForm();
                getData();
            }
            
            st.close();
             
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
       int selectedRow = tbl_data.getSelectedRow();
        if (selectedRow != -1) {
            String nim = tbl_data.getValueAt(selectedRow, 0).toString();
            String nama = tbl_data.getValueAt(selectedRow, 1).toString();
            String prodi = tbl_data.getValueAt(selectedRow, 2).toString();
            
            t_NIM.setText(nim);
            t_Nama.setText(nama);
            
             
           if (prodi.equals("IF")) {
            rbIF.setSelected(true);
             } else if (prodi.equals("IT")) {
            rbIT.setSelected(true);
             } else if (prodi.equals("SE")) {
           rbSE.setSelected(true);
             } else if (prodi.equals("DS")) {
           rbDS.setSelected(true);
             } 
        }
    }//GEN-LAST:event_tbl_dataMouseClicked

    private void btn_perbaharuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perbaharuiActionPerformed
        int selectedRow = tbl_data.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan diperbaharui");
        }
        
        String nim = t_NIM.getText();
        String nama = t_Nama.getText();
        String prodi = null;
        List<AbstractButton> buttonsList = Collections.list(t_prodi.getElements());

        for (int i = 0; i < buttonsList.size(); i++) {
        AbstractButton button = buttonsList.get(i);
            if (button.isSelected()) {
              prodi = button.getText();
              break;
            }
        }
       
        if (nim.isEmpty() || nama.isEmpty() || prodi == null) {
            JOptionPane.showMessageDialog(this, "Semua Kolom harus diisi !");
        }
        
        try {
            String sql = "UPDATE mahasiswa SET nama=?, prodi=? WHERE nim=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nama);
            st.setString(2, prodi);
            st.setString(3, nim);
           
            
           int rowInserted = st.executeUpdate();
            if (rowInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil diperbaharui");
                resetForm();
                getData();
            }
            
            st.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btn_perbaharuiActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_perbaharui;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbDS;
    private javax.swing.JRadioButton rbIF;
    private javax.swing.JRadioButton rbIT;
    private javax.swing.JRadioButton rbSE;
    private javax.swing.JTextField t_NIM;
    private javax.swing.JTextField t_Nama;
    private javax.swing.ButtonGroup t_prodi;
    private javax.swing.JTable tbl_data;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        t_NIM.setText("");
        t_Nama.setText("");
        t_prodi.clearSelection();
        rbIF.setSelected(false);
        rbIT.setSelected(false);
        rbSE.setSelected(false);
        rbDS.setSelected(false);
    }

   
}
