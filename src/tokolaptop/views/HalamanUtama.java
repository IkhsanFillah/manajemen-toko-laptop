package tokolaptop.views;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import tokolaptop.controllers.LaptopController;
import javax.swing.*;
import java.util.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
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
        
        jPanel1.setBorder(new javax.swing.border.AbstractBorder() {
        @Override
        public void paintBorder(java.awt.Component c, java.awt.Graphics g, int x, int y, int width, int height) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(java.awt.Color.BLACK);
            g2.drawRoundRect(x, y, width - 1, height - 1, 30, 30); 
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c) {
            return new java.awt.Insets(10, 15, 10, 15); 
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c, java.awt.Insets insets) {
            insets.set(8, 8, 8, 8);
            return insets;
            }
        });
        
        jTextFieldCari.setBorder(new javax.swing.border.AbstractBorder() {
        @Override
        public void paintBorder(java.awt.Component c, java.awt.Graphics g, int x, int y, int width, int height) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(java.awt.Color.BLACK); 
            g2.drawRoundRect(x, y, width - 1, height - 1, 30, 30); 
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c) {
            return new java.awt.Insets(10, 15, 10, 15); 
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c, java.awt.Insets insets) {
            insets.set(8, 8, 8, 8);
            return insets;
            }
        });
        
        jScrollPane1.setOpaque(false);
        JTableHeader header = jTable1.getTableHeader();
        header.setBackground(Color.red);
        
        
        jPanel2.setBorder(new javax.swing.border.AbstractBorder() {
        @Override
        public void paintBorder(java.awt.Component c, java.awt.Graphics g, int x, int y, int width, int height) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(java.awt.Color.BLACK); 
            g2.drawRoundRect(x, y, width - 1, height - 1, 30, 30); 
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c) {
            return new java.awt.Insets(10, 15, 10, 15); 
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c, java.awt.Insets insets) {
            insets.set(8, 8, 8, 8);
            return insets;
            }
        });
        
        jTextFieldId.setBorder(new javax.swing.border.AbstractBorder() {
        @Override
        public void paintBorder(java.awt.Component c, java.awt.Graphics g, int x, int y, int width, int height) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(java.awt.Color.BLACK); 
            g2.drawRoundRect(x, y, width - 1, height - 1, 30, 30); 
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c) {
            return new java.awt.Insets(10, 15, 10, 15); 
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c, java.awt.Insets insets) {
            insets.set(8, 8, 8, 8);
            return insets;
            }
        });
        
        jTextFieldMerek.setBorder(new javax.swing.border.AbstractBorder() {
        @Override
        public void paintBorder(java.awt.Component c, java.awt.Graphics g, int x, int y, int width, int height) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(java.awt.Color.BLACK); 
            g2.drawRoundRect(x, y, width - 1, height - 1, 30, 30); 
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c) {
            return new java.awt.Insets(10, 15, 10, 15); 
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c, java.awt.Insets insets) {
            insets.set(8, 8, 8, 8);
            return insets;
            }
        });
        
        jTextFieldModel.setBorder(new javax.swing.border.AbstractBorder() {
        @Override
        public void paintBorder(java.awt.Component c, java.awt.Graphics g, int x, int y, int width, int height) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(java.awt.Color.BLACK); 
            g2.drawRoundRect(x, y, width - 1, height - 1, 30, 30); 
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c) {
            return new java.awt.Insets(10, 15, 10, 15); 
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c, java.awt.Insets insets) {
            insets.set(8, 8, 8, 8);
            return insets;
            }
        });
        
        jTextFieldSpesifikasi.setBorder(new javax.swing.border.AbstractBorder() {
        @Override
        public void paintBorder(java.awt.Component c, java.awt.Graphics g, int x, int y, int width, int height) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(java.awt.Color.BLACK); 
            g2.drawRoundRect(x, y, width - 1, height - 1, 30, 30); 
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c) {
            return new java.awt.Insets(10, 15, 10, 15); 
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c, java.awt.Insets insets) {
            insets.set(8, 8, 8, 8);
            return insets;
            }
        });
        
        jTextFieldHarga.setBorder(new javax.swing.border.AbstractBorder() {
        @Override
        public void paintBorder(java.awt.Component c, java.awt.Graphics g, int x, int y, int width, int height) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(java.awt.Color.BLACK); // Warna border
            g2.drawRoundRect(x, y, width - 1, height - 1, 30, 30); 
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c) {
            return new java.awt.Insets(10, 15, 10, 15); 
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c, java.awt.Insets insets) {
            insets.set(8, 8, 8, 8);
            return insets;
            }
        });
        
        jTextFieldStok.setBorder(new javax.swing.border.AbstractBorder() {
        @Override
        public void paintBorder(java.awt.Component c, java.awt.Graphics g, int x, int y, int width, int height) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(java.awt.Color.BLACK); 
            g2.drawRoundRect(x, y, width - 1, height - 1, 30, 30); 
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c) {
            return new java.awt.Insets(10, 15, 10, 15); 
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c, java.awt.Insets insets) {
            insets.set(8, 8, 8, 8);
            return insets;
            }
        });
        
        jButtonDelete.setBorderPainted(false);
        jButtonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButtonDelete.setBackground(new Color(255,102,102)); 
            }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jButtonDelete.setBackground(new Color(153,0,0)); 
            }
        });
        
        jButtonEdit.setBorderPainted(false);
        jButtonEdit.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButtonEdit.setBackground(new Color(51,204,0));
            }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jButtonEdit.setBackground(new Color(0,102,0)); 
            }
        });
        
        jButtonTambah.setBorderPainted(false);
        jButtonTambah.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButtonTambah.setBackground(new Color(51,204,255)); 
            }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jButtonTambah.setBackground(new Color(0,51,153)); 
            }
        });
        
        jButtonClear.setBorderPainted(false);
        jButtonClear.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButtonClear.setBackground(new Color(204,0,204)); 
            }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jButtonClear.setBackground(new Color(102,0,102)); 
            }
        });
        
        jButtonConvertTxt.setBorderPainted(false);
        jButtonConvertTxt.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButtonConvertTxt.setBackground(new Color(153,153,153)); 
            }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jButtonConvertTxt.setBackground(new Color(102,102,102)); 
            }
        });
        
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAdjust = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldCari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabelIdentitas = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabelMerek = new javax.swing.JLabel();
        jTextFieldMerek = new javax.swing.JTextField();
        jLabelModel = new javax.swing.JLabel();
        jTextFieldModel = new javax.swing.JTextField();
        jLabelSpesifikasi = new javax.swing.JLabel();
        jTextFieldSpesifikasi = new javax.swing.JTextField();
        jLabelHarga = new javax.swing.JLabel();
        jTextFieldHarga = new javax.swing.JTextField();
        jLabelStok = new javax.swing.JLabel();
        jTextFieldStok = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonTambah = new javax.swing.JButton();
        jButtonConvertTxt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelAdjust.setBackground(new java.awt.Color(0, 102, 204));
        jPanelAdjust.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\tokolaptop\\icon\\icons8_Account_50px (2).png"));
        jPanelAdjust.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 160, 160));

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome Admin");
        jPanelAdjust.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanelAdjust.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 260, 30));

        getContentPane().add(jPanelAdjust, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 1080));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setMinimumSize(new java.awt.Dimension(1440, 512));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCari.setText("Cari laptop");
        jTextFieldCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCariActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 246, 40));

        jScrollPane1.setColumnHeaderView(null);
        jScrollPane1.setRowHeaderView(null);

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
        jTable1.setCellSelectionEnabled(true);
        jTable1.setShowGrid(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 960, 380));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 1040, 520));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIdentitas.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\tokolaptop\\icon\\20250530_135429.png"));
        jPanel2.add(jLabelIdentitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 300, 175, 98));

        jLabelId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelId.setText("ID :");
        jPanel2.add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 37, -1));
        jPanel2.add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 246, 40));

        jLabelMerek.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelMerek.setText("Merek :");
        jPanel2.add(jLabelMerek, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 70, -1));

        jTextFieldMerek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMerekActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldMerek, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 246, 40));

        jLabelModel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelModel.setText("Model :");
        jPanel2.add(jLabelModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        jPanel2.add(jTextFieldModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 246, 40));

        jLabelSpesifikasi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelSpesifikasi.setText("Spesifikasi :");
        jPanel2.add(jLabelSpesifikasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 100, -1));
        jPanel2.add(jTextFieldSpesifikasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 246, 40));

        jLabelHarga.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelHarga.setText("Harga :");
        jPanel2.add(jLabelHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));
        jPanel2.add(jTextFieldHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 246, 40));

        jLabelStok.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelStok.setText("Stok :");
        jPanel2.add(jLabelStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 60, -1));
        jPanel2.add(jTextFieldStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 246, 40));

        jButtonDelete.setBackground(new java.awt.Color(153, 0, 0));
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 200, 40));

        jButtonEdit.setBackground(new java.awt.Color(0, 102, 0));
        jButtonEdit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 200, 40));

        jButtonClear.setBackground(new java.awt.Color(102, 0, 102));
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 200, 40));

        jButtonTambah.setBackground(new java.awt.Color(0, 51, 153));
        jButtonTambah.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTambah.setText("Tambah Laptop");
        jButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 200, 40));

        jButtonConvertTxt.setBackground(new java.awt.Color(153, 153, 153));
        jButtonConvertTxt.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConvertTxt.setText("Convert .txt");
        jButtonConvertTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertTxtActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonConvertTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 200, 40));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 1040, 420));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 1120, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            if (LaptopController.insert(l)) {
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
            String id = jTextFieldId.getText().trim();
            String merek = jTextFieldMerek.getText().trim();
            String model = jTextFieldModel.getText().trim();
            String spek = jTextFieldSpesifikasi.getText().trim();
            String hargaText = jTextFieldHarga.getText().trim();
            String stokText = jTextFieldStok.getText().trim();

            if (id.isEmpty() || merek.isEmpty() || model.isEmpty() || hargaText.isEmpty() || stokText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Semua field harus diisi.");
                return;
            }

            String cleanHarga = hargaText.replace(",", "").replace(".", "");
            double harga = Double.parseDouble(cleanHarga);
            int stok = Integer.parseInt(stokText);

            Laptop l = new Laptop(id, merek, model, spek, harga, stok);
            if (LaptopController.update(l)) {
                JOptionPane.showMessageDialog(this, "Data berhasil diperbarui.");
                loadTable();
                clearForm();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal memperbarui data.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Format harga atau stok tidak valid.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        try {
            String id = jTextFieldId.getText().trim();

            if (id.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus.");
                return;
            }

            int confirm = JOptionPane.showConfirmDialog(this, "Hapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                if (LaptopController.delete(id)) {
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
                    loadTable();
                    clearForm();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal menghapus data.");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        clearForm();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jTextFieldMerekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMerekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMerekActionPerformed

    private void jButtonConvertTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertTxtActionPerformed
        try {
            java.util.List<Laptop> laptops = LaptopController.getAll();

            if (laptops.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tidak ada data untuk dikonversi.", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Simpan File TXT");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
            String defaultFileName = "data_laptop_" + sdf.format(new Date()) + ".txt";
            fileChooser.setSelectedFile(new java.io.File(defaultFileName));

            FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files (*.txt)", "txt");
            fileChooser.setFileFilter(filter);

            int userSelection = fileChooser.showSaveDialog(this);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                java.io.File fileToSave = fileChooser.getSelectedFile();

                if (!fileToSave.getAbsolutePath().endsWith(".txt")) {
                    fileToSave = new java.io.File(fileToSave.getAbsolutePath() + ".txt");
                }

                writeDataToTxtFile(laptops, fileToSave);

                int option = JOptionPane.showOptionDialog(
                    this,
                    "Data berhasil dikonversi ke file TXT!\n" +
                    "File disimpan di: " + fileToSave.getAbsolutePath() + "\n\n" +
                    "Apakah Anda ingin membuka folder file tersebut?",
                    "Konversi Berhasil",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    new String[]{"Buka Folder", "Tutup"},
                    "Buka Folder"
                );

                if (option == JOptionPane.YES_OPTION) {
                    try {
                        java.awt.Desktop.getDesktop().open(fileToSave.getParentFile());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Tidak dapat membuka folder: " + e.getMessage());
                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error saat konversi: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonConvertTxtActionPerformed

    private void jTextFieldCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCariActionPerformed
        String keyword = jTextFieldCari.getText().trim().toLowerCase();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); 

        if (keyword.isEmpty()) {
            loadTable(); 
            return;
        }

        for (Laptop l : LaptopController.getAll()) {
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

    private void writeDataToTxtFile(java.util.List<Laptop> laptops, java.io.File file) throws IOException {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("=".repeat(100) + "\n");
            writer.write("                      DATA LAPTOP TOKO LAPTOP\n");
            writer.write("=".repeat(100) + "\n");
            writer.write("Tanggal Export: " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()) + "\n");
            writer.write("Total Data: " + laptops.size() + " laptop(s)\n");
            writer.write("=".repeat(100) + "\n\n");

            writer.write(String.format("%-10s %-15s %-20s %-30s %-15s %-8s\n", 
                         "ID", "MEREK", "MODEL", "SPESIFIKASI", "HARGA", "STOK"));
            writer.write("-".repeat(100) + "\n");

            DecimalFormat df = new DecimalFormat("#,###");
            int counter = 1;

            for (Laptop laptop : laptops) {
                writer.write(String.format("%-10s %-15s %-20s %-30s %-15s %-8d\n",
                    laptop.getId(),
                    truncateString(laptop.getMerek(), 15),
                    truncateString(laptop.getModel(), 20),
                    truncateString(laptop.getSpesifikasi(), 30),
                    "Rp " + df.format(laptop.getHarga()),
                    laptop.getStok()
                ));

                if (counter % 10 == 0 && counter < laptops.size()) {
                    writer.write("-".repeat(100) + "\n");
                }
                counter++;
            }

            writer.write("\n" + "=".repeat(100) + "\n");
            writer.write("                        GStore\n");
            writer.write("=".repeat(100) + "\n");

            double totalHarga = laptops.stream().mapToDouble(Laptop::getHarga).sum();
            int totalStok = laptops.stream().mapToInt(Laptop::getStok).sum();

            writer.write("\nSTATISTIK:\n");
            writer.write("- Total Laptop: " + laptops.size() + " jenis\n");
            writer.write("- Total Stok: " + totalStok + " unit\n");
            writer.write("- Total Nilai Inventori: Rp " + df.format(totalHarga) + "\n");
            writer.write("- Rata-rata Harga: Rp " + df.format(totalHarga / laptops.size()) + "\n");
        }
    }

    private String truncateString(String str, int maxLength) {
        if (str == null) return "";
        if (str.length() <= maxLength) return str;
        return str.substring(0, maxLength - 3) + "...";
    }
    
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
            if (!e.getValueIsAdjusting()) { 
                int row = jTable1.getSelectedRow();
                if (row >= 0) {
                    Object idObj = jTable1.getValueAt(row, 0);
                    Object merekObj = jTable1.getValueAt(row, 1);
                    Object modelObj = jTable1.getValueAt(row, 2);
                    Object spekObj = jTable1.getValueAt(row, 3);
                    Object hargaObj = jTable1.getValueAt(row, 4);
                    Object stokObj = jTable1.getValueAt(row, 5);

                    jTextFieldId.setText(idObj != null ? idObj.toString() : "");
                    jTextFieldMerek.setText(merekObj != null ? merekObj.toString() : "");
                    jTextFieldModel.setText(modelObj != null ? modelObj.toString() : "");
                    jTextFieldSpesifikasi.setText(spekObj != null ? spekObj.toString() : "");

                    if (hargaObj != null) {
                        String hargaStr = hargaObj.toString().replace(",", "");
                        jTextFieldHarga.setText(hargaStr);
                    } else {
                        jTextFieldHarga.setText("");
                    }

                    jTextFieldStok.setText(stokObj != null ? stokObj.toString() : "");
                }
            }
        });
    }
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
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonConvertTxt;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelHarga;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelIdentitas;
    private javax.swing.JLabel jLabelMerek;
    private javax.swing.JLabel jLabelModel;
    private javax.swing.JLabel jLabelSpesifikasi;
    private javax.swing.JLabel jLabelStok;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelAdjust;
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
        tableModel.setRowCount(0); 

        DecimalFormat df = new DecimalFormat("#,###"); 

        for (Laptop l : LaptopController.getAll()) {
            tableModel.addRow(new Object[]{
                l.getId(),
                l.getMerek(),
                l.getModel(),
                l.getSpesifikasi(),
                df.format(l.getHarga()), 
                l.getStok()
            });
        }
    }
}
