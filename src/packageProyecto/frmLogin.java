package packageProyecto;

import java.awt.Color;
import javax.swing.JOptionPane;

public class frmLogin extends javax.swing.JFrame {

    int xMouse, yMouse;

    public frmLogin() {
        initComponents();
        System.out.println("NO SE HA INICIADO SESIÓN.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground = new javax.swing.JPanel();
        checkShowPass = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        passContrasena = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        cbCargo = new javax.swing.JComboBox<>();
        panelLogin = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        panelRegistro = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        panelExit = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        panelMoverVentana = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBackground.setBackground(new java.awt.Color(255, 255, 255));
        panelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkShowPass.setBackground(new java.awt.Color(255, 255, 255));
        checkShowPass.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        checkShowPass.setText("Mostrar contraseña");
        checkShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkShowPassActionPerformed(evt);
            }
        });
        panelBackground.add(checkShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 160, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setText("INICIAR SESIÓN");
        panelBackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/login.fondo.png"))); // NOI18N
        panelBackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 300, 500));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setText("CONTRASEÑA");
        panelBackground.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setText("CARGO");
        panelBackground.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtUsuario.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        txtUsuario.setText("Ingrese su usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        panelBackground.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 390, 30));

        passContrasena.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        passContrasena.setText("********");
        passContrasena.setBorder(null);
        passContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passContrasenaMousePressed(evt);
            }
        });
        panelBackground.add(passContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 390, 30));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setText("USUARIO");
        panelBackground.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        cbCargo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Selecionar---", "CAJERO", "GESTOR DE STOCK", "ADMINISTRADOR" }));
        cbCargo.setBorder(null);
        panelBackground.add(cbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 390, 30));

        panelLogin.setBackground(new java.awt.Color(204, 204, 255));
        panelLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelLoginMouseExited(evt);
            }
        });
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setText("INICIAR SESIÓN");
        panelLogin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        panelBackground.add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 130, 40));

        panelRegistro.setBackground(new java.awt.Color(204, 204, 255));
        panelRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRegistroMouseExited(evt);
            }
        });
        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setText("REGISTRARSE");
        panelRegistro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        panelBackground.add(panelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 120, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        panelBackground.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 390, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        panelBackground.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 390, 10));

        panelExit.setBackground(new java.awt.Color(255, 255, 255));
        panelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelExitMouseExited(evt);
            }
        });
        panelExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 48)); // NOI18N
        jLabel10.setText("X");
        jLabel10.setPreferredSize(new java.awt.Dimension(40, 40));
        panelExit.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, -1));

        panelBackground.add(panelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, -1));

        panelMoverVentana.setBackground(new java.awt.Color(255, 255, 255));
        panelMoverVentana.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelMoverVentanaMouseDragged(evt);
            }
        });
        panelMoverVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMoverVentanaMousePressed(evt);
            }
        });
        panelBackground.add(panelMoverVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        getContentPane().add(panelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        setSize(new java.awt.Dimension(800, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkShowPassActionPerformed
        if (checkShowPass.isSelected()) {
            passContrasena.setEchoChar((char) 0);
        } else {
            passContrasena.setEchoChar('*');
        }
    }//GEN-LAST:event_checkShowPassActionPerformed

    private void panelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLoginMouseClicked
        String usuario = txtUsuario.getText().trim();
        String contrasena = new String(passContrasena.getPassword()).trim();
        String rol = cbCargo.getSelectedItem().toString();

        if (usuario.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos");
            return;
        }

        ManejoArchivosData registroUsuarios = new ManejoArchivosData();
        Usuario usuarioLogin = registroUsuarios.obtenerUsuario(usuario, contrasena, rol);

        if (usuarioLogin != null) {
            System.out.println("SESIÓN INICIADA COMO: " + usuarioLogin.getUsuario() + " - ROL: " + rol);
            new frmHome(usuarioLogin).setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "La información de sesión es incorrecta");
        }
    }//GEN-LAST:event_panelLoginMouseClicked

    private void panelRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistroMouseClicked
        new frmRegistroUsuario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panelRegistroMouseClicked

    private void panelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExitMouseEntered
        panelExit.setBackground(Color.red);
    }//GEN-LAST:event_panelExitMouseEntered

    private void panelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExitMouseExited
        panelExit.setBackground(Color.white);
    }//GEN-LAST:event_panelExitMouseExited

    private void panelMoverVentanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMoverVentanaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelMoverVentanaMousePressed

    private void panelMoverVentanaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMoverVentanaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelMoverVentanaMouseDragged

    private void panelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_panelExitMouseClicked

    private void panelLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLoginMouseEntered
        panelLogin.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_panelLoginMouseEntered

    private void panelLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLoginMouseExited
        panelLogin.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_panelLoginMouseExited

    private void panelRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistroMouseEntered
        panelRegistro.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_panelRegistroMouseEntered

    private void panelRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistroMouseExited
        panelRegistro.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_panelRegistroMouseExited

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if (txtUsuario.getText().equals("Ingrese su usuario")) {
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
        if (String.valueOf(passContrasena.getPassword()).isEmpty()) {
            passContrasena.setText("********");
            passContrasena.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void passContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passContrasenaMousePressed
        if (String.valueOf(passContrasena.getPassword()).equals("********")) {
            passContrasena.setText("");
            passContrasena.setForeground(Color.black);
        }
        if (txtUsuario.getText().isEmpty()) {
            txtUsuario.setText("Ingrese su usuario");
            txtUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passContrasenaMousePressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JCheckBox checkShowPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelExit;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMoverVentana;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JPasswordField passContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
