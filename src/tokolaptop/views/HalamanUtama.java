package tokolaptop.views;

import java.awt.Component;
import java.awt.FlowLayout;
import java.text.DecimalFormat;
import tokolaptop.controllers.LaptopDAO;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import tokolaptop.models.Laptop;

public class HalamanUtama extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    
    public HalamanUtama() {
        initComponents();
        setLocationRelativeTo(null);
        loadTable();
        setTableSelectionListener();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAdjust = new javax.swing.JPanel();
        jButtonTambah = new javax.swing.JButton();
        jLabelMerek = new javax.swing.JLabel();
        jLabelModel = new javax.swing.JLabel();
        jLabelSpesifikasi = new javax.swing.JLabel();
        jLabelHarga = new javax.swing.JLabel();
        jLabelStok = new javax.swing.JLabel();
        jTextFieldMerek = new javax.swing.JTextField();
        jTextFieldModel = new javax.swing.JTextField();
        jTextFieldSpesifikasi = new javax.swing.JTextField();
        jTextFieldHarga = new javax.swing.JTextField();
        jTextFieldStok = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanelList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldCari = new javax.swing.JTextField();
        jLabelIdentitas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonTambah.setText("Tambah Laptop");
        jButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahActionPerformed(evt);
            }
        });

        jLabelMerek.setText("Merek :");

        jLabelModel.setText("Model :");

        jLabelSpesifikasi.setText("Spesifikasi :");

        jLabelHarga.setText("Harga :");

        jLabelStok.setText("Stok :");

        jTextFieldMerek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMerekActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jLabelId.setText("ID :");

        jButton1.setText("Convert .txt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAdjustLayout = new javax.swing.GroupLayout(jPanelAdjust);
        jPanelAdjust.setLayout(jPanelAdjustLayout);
        jPanelAdjustLayout.setHorizontalGroup(
            jPanelAdjustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdjustLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanelAdjustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAdjustLayout.createSequentialGroup()
                        .addGroup(jPanelAdjustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelAdjustLayout.createSequentialGroup()
                                .addComponent(jButtonDelete)
                                .addGap(9, 9, 9)
                                .addComponent(jButtonEdit)
                                .addGap(9, 9, 9)
                                .addComponent(jButtonClear))
                            .addGroup(jPanelAdjustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldStok, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                .addComponent(jTextFieldHarga, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldSpesifikasi, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldModel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelStok, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldMerek, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jButton1))
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(jPanelAdjustLayout.createSequentialGroup()
                        .addGroup(jPanelAdjustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonTambah)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSpesifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHarga)
                            .addComponent(jLabelModel)
                            .addComponent(jLabelMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelAdjustLayout.setVerticalGroup(
            jPanelAdjustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdjustLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabelMerek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldMerek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelModel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSpesifikasi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSpesifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelHarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelStok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanelAdjustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClear)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonDelete))
                .addGap(18, 18, 18)
                .addGroup(jPanelAdjustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTambah)
                    .addComponent(jButton1))
                .addGap(21, 21, 21))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "merek", "model", "spesifikasi", "harga", "stok"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        jTextFieldCari.setText("Cari laptop");
        jTextFieldCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCariActionPerformed(evt);
            }
        });

        jLabelIdentitas.setText("GOOD GAMING SHOP");

        javax.swing.GroupLayout jPanelListLayout = new javax.swing.GroupLayout(jPanelList);
        jPanelList.setLayout(jPanelListLayout);
        jPanelListLayout.setHorizontalGroup(
            jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdentitas)
                    .addComponent(jTextFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelListLayout.setVerticalGroup(
            jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelIdentitas)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanelList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelAdjust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(960, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAdjust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(489, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCariActionPerformed
        String keyword = jTextFieldCari.getText().trim().toLowerCase();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // bersihkan tabel sebelum isi ulang

        if (keyword.isEmpty()) {
            loadTable(); // tampilkan semua data jika tidak ada kata kunci
            return;
        }

        for (Laptop l : LaptopDAO.getAll()) {
            // cek apakah keyword cocok di salah satu field
            if (
                l.getMerek().toLowerCase().contains(keyword) ||
                l.getModel().toLowerCase().contains(keyword) ||
                l.getSpesifikasi().toLowerCase().contains(keyword)
            ) {
                model.addRow(new Object[]{
                    l.getId(),
                    l.getMerek(),
                    l.getModel(),
                    l.getSpesifikasi(),
                    l.getHarga(),
                    l.getStok()
                });
            }
        }
    }//GEN-LAST:event_jTextFieldCariActionPerformed

    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahActionPerformed
        try {
            String id = jTextFieldId.getText();
            String merek = jTextFieldMerek.getText();
            String model = jTextFieldModel.getText();
            String spek = jTextFieldSpesifikasi.getText();
            String hargaInput = jTextFieldHarga.getText().replace(".", "").replace(",", ".");
            double harga = Double.parseDouble(hargaInput);
            int stok = Integer.parseInt(jTextFieldStok.getText());

            if (id.isEmpty() || merek.isEmpty() || model.isEmpty()) {
                JOptionPane.showMessageDialog(this, "ID, Merek, dan Model tidak boleh kosong.");
                return;
            }

            Laptop l = new Laptop(id, merek, model, spek, harga, stok);
            if (LaptopDAO.insert(l)) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan.");
                loadTable();
                clearForm();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menambah data (ID mungkin sudah digunakan).");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Input tidak valid: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonTambahActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        try {
            String id = jTextFieldId.getText();
            String merek = jTextFieldMerek.getText();
            String model = jTextFieldModel.getText();
            String spek = jTextFieldSpesifikasi.getText();
            double harga = Double.parseDouble(jTextFieldHarga.getText());
            int stok = Integer.parseInt(jTextFieldStok.getText());

            Laptop l = new Laptop(id, merek, model, spek, harga, stok);
            if (LaptopDAO.update(l)) {
                JOptionPane.showMessageDialog(this, "Data berhasil diperbarui.");
                loadTable();
                clearForm();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Input tidak valid.");
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        try {
            int id = Integer.parseInt(jTextFieldId.getText());
            int confirm = JOptionPane.showConfirmDialog(this, "Hapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                if (LaptopDAO.delete(id)) {
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
                    loadTable();
                    clearForm();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus.");
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        clearForm();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jTextFieldMerekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMerekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMerekActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clearForm() {
        jTextFieldId.setText("");
        jTextFieldMerek.setText("");
        jTextFieldModel.setText("");
        jTextFieldSpesifikasi.setText("");
        jTextFieldHarga.setText("");
        jTextFieldStok.setText("");
        jTable1.clearSelection();
    }
    
    private void setTableSelectionListener() {
        jTable1.getSelectionModel().addListSelectionListener(e -> {
            int row = jTable1.getSelectedRow();
            if (row >= 0) {
                jTextFieldId.setText(jTable1.getValueAt(row, 0).toString());
                jTextFieldMerek.setText(jTable1.getValueAt(row, 1).toString());
                jTextFieldModel.setText(jTable1.getValueAt(row, 2).toString());
                jTextFieldSpesifikasi.setText(jTable1.getValueAt(row, 3).toString());
                jTextFieldHarga.setText(jTable1.getValueAt(row, 4).toString());
                jTextFieldStok.setText(jTable1.getValueAt(row, 5).toString());
            }
        });
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HalamanUtama().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JLabel jLabelHarga;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelIdentitas;
    private javax.swing.JLabel jLabelMerek;
    private javax.swing.JLabel jLabelModel;
    private javax.swing.JLabel jLabelSpesifikasi;
    private javax.swing.JLabel jLabelStok;
    private javax.swing.JPanel jPanelAdjust;
    private javax.swing.JPanel jPanelList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCari;
    private javax.swing.JTextField jTextFieldHarga;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldMerek;
    private javax.swing.JTextField jTextFieldModel;
    private javax.swing.JTextField jTextFieldSpesifikasi;
    private javax.swing.JTextField jTextFieldStok;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0); // bersihkan tabel sebelum isi ulang

        DecimalFormat df = new DecimalFormat("#,###"); // format angka ribuan

        for (Laptop l : LaptopDAO.getAll()) {
            tableModel.addRow(new Object[]{
                l.getId(),
                l.getMerek(),
                l.getModel(),
                l.getSpesifikasi(),
                df.format(l.getHarga()), // ✅ harga terformat
                l.getStok()
            });
        }
    }
}
