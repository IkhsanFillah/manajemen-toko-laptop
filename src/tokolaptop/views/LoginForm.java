/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tokolaptop.views;


import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JOptionPane;
import tokolaptop.helper.DBHelper;
import javax.swing.UIManager;

/**
 *
 * @author ichsa
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        setLocationRelativeTo(null);
        
        //textFiledusername
        jTextFieldUsername.setBorder(new javax.swing.border.AbstractBorder() {
        @Override
        public void paintBorder(java.awt.Component c, java.awt.Graphics g, int x, int y, int width, int height) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(java.awt.Color.BLACK); // Warna border
            g2.drawRoundRect(x, y, width - 1, height - 1, 30, 30); // Sudut lengkung radius 15
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c) {
            return new java.awt.Insets(15, 15, 10, 15); // Padding
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c, java.awt.Insets insets) {
            insets.set(8, 8, 8, 8);
            return insets;
            }
        });
        
        jTextFieldUsername.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (jTextFieldUsername.getText().equals("Username")) {
                jTextFieldUsername.setText("");
                jTextFieldUsername.setForeground(Color.BLACK);
                }
            }
        });

        // Untuk jaga-jaga jika user klik lalu keluar tanpa isi apa-apa
        jTextFieldUsername.addFocusListener(new java.awt.event.FocusAdapter() {
        @Override
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (jTextFieldUsername.getText().isEmpty()) {
                jTextFieldUsername.setText("Username");
                jTextFieldUsername.setForeground(Color.GRAY);
                }
            }
        });
        
        //jtextfieldpassword
        jPasswordFieldPassword.setText("Password");
        jPasswordFieldPassword.setFont(new Font("Candara Light", Font.PLAIN, 18));
        jPasswordFieldPassword.setEchoChar((char) 0); // Tampilkan teks asli
        
        jPasswordFieldPassword.setBorder(new javax.swing.border.AbstractBorder() {
        @Override
        public void paintBorder(java.awt.Component c, java.awt.Graphics g, int x, int y, int width, int height) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(java.awt.Color.BLACK);
            g2.drawRoundRect(x, y, width - 1, height - 1, 30, 30);
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c) {
            return new java.awt.Insets(10, 15, 5, 10);
        }

        @Override
        public java.awt.Insets getBorderInsets(java.awt.Component c, java.awt.Insets insets) {
            insets.set(8,8,8,8);
            return insets;
            }
        });
        
        jPasswordFieldPassword.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (String.valueOf(jPasswordFieldPassword.getPassword()).equals("Password")) {
                jPasswordFieldPassword.setText("");
                // Ambil echo char default dari UIManager
                jPasswordFieldPassword.setEchoChar(
                    ((Character) UIManager.get("PasswordField.echoChar")).charValue()
                    );
                    jPasswordFieldPassword.setForeground(Color.BLACK);
                }
            }
        });

        // Fokus keluar: kembalikan placeholder jika kosong
        jPasswordFieldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (String.valueOf(jPasswordFieldPassword.getPassword()).isEmpty()) {
                    jPasswordFieldPassword.setText("Password");
                    jPasswordFieldPassword.setEchoChar((char) 0); // Tampilkan teks
                    jPasswordFieldPassword.setForeground(Color.GRAY);
                }
            }
        });
        
        
        
        //button login dan signup
        jButtonLogin.setBorderPainted(false);
        jButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButtonLogin.setBackground(new Color(153,204,255)); 
            }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jButtonLogin.setBackground(new Color(51,102,255)); 
            }
        });    
        
        
        jButtonLogin.setContentAreaFilled(true); // hindari background default
        jButtonLogin.setBorderPainted(false);     // kita menggambar border sendiri
        jButtonLogin.setForeground(Color.WHITE);  // warna teks
        jButtonSignup.setContentAreaFilled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jButtonSignup = new javax.swing.JButton();
        jLabelIdentitas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelIdentitas1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setPreferredSize(new java.awt.Dimension(990, 830));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldUsername.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jTextFieldUsername.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldUsername.setText("Username");
        jTextFieldUsername.setToolTipText("");
        jTextFieldUsername.setActionCommand("<Not Set>");
        jTextFieldUsername.setAlignmentY(0.0F);
        jTextFieldUsername.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextFieldUsername.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 330, 50));

        jPasswordFieldPassword.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        jPasswordFieldPassword.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordFieldPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPasswordFieldPassword.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPasswordFieldPassword.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPasswordFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 330, 50));

        jButtonLogin.setBackground(new java.awt.Color(51, 102, 255));
        jButtonLogin.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("Login");
        jButtonLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 170, 50));

        jButtonSignup.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jButtonSignup.setForeground(new java.awt.Color(51, 153, 255));
        jButtonSignup.setText("Sign up");
        jButtonSignup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButtonSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignupActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, 130, 40));

        jLabelIdentitas.setBackground(new java.awt.Color(51, 102, 255));
        jLabelIdentitas.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        jLabelIdentitas.setText("Admin please login into your account!");
        jLabelIdentitas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelIdentitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 430, 40));
        jLabelIdentitas.getAccessibleContext().setAccessibleName("jLabelIdentitas");

        jLabel3.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\tokolaptop\\icon\\20250530_135429.png"));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 100));

        jLabelIdentitas1.setBackground(new java.awt.Color(51, 102, 255));
        jLabelIdentitas1.setFont(new java.awt.Font("Gadugi", 0, 36)); // NOI18N
        jLabelIdentitas1.setText("Welcome to Gstore");
        jLabelIdentitas1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelIdentitas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 450, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\tokolaptop\\icon\\LoginFotoEdited.png"));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 920, 1080));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 1080));

        setSize(new java.awt.Dimension(1454, 1088));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        String username = jTextFieldUsername.getText();
        String password = new String(jPasswordFieldPassword.getPassword());
        
        if (DBHelper.cekLogin(username, password)){
            new HalamanUtama().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Login gagal! usernmae atau password salah.");
        }    
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jPasswordFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordActionPerformed
        jButtonLogin.doClick();
    }//GEN-LAST:event_jPasswordFieldPasswordActionPerformed

    private void jButtonSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignupActionPerformed
        JOptionPane.showMessageDialog(this, "fitur belum tersedia.");
    }//GEN-LAST:event_jButtonSignupActionPerformed

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonSignup;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelIdentitas;
    private javax.swing.JLabel jLabelIdentitas1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
