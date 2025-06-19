package packageProyecto;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class frmLogin extends javax.swing.JFrame {

    int xMouse, yMouse;

    public frmLogin() {
        initComponents();
        panelBackgroundRegistro.setVisible(false);
        registroImagen.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginImagen = new javax.swing.JLabel();
        registroImagen = new javax.swing.JLabel();
        panelMoverVentana = new javax.swing.JPanel();
        lbCerrar = new javax.swing.JLabel();
        lbMinimizar = new javax.swing.JLabel();
        panelBackgroundLogin = new javax.swing.JPanel();
        checkShowPass = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        passContrasena = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        cbCargo = new javax.swing.JComboBox<>();
        panelLogin = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        panelRegistro = new javax.swing.JPanel();
        pRegLbReg = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        panelBackgroundRegistro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRegApellidos = new javax.swing.JTextField();
        txtRegNombres = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtRegEmail = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtRegDNI = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        passRegContrasena1 = new javax.swing.JPasswordField();
        jSeparator8 = new javax.swing.JSeparator();
        passRegContrasena2 = new javax.swing.JPasswordField();
        jSeparator9 = new javax.swing.JSeparator();
        cbRegCargo = new javax.swing.JComboBox<>();
        checkRegShowPass = new javax.swing.JCheckBox();
        panelBtnRegCrearCuenta = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        panelBtnRegRegresar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtRegUsuario = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/login_imagen.png"))); // NOI18N
        getContentPane().add(loginImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 300, -1));

        registroImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/registro_imagen.png"))); // NOI18N
        getContentPane().add(registroImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 300, 500));

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
        panelMoverVentana.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/login_cerrar.png"))); // NOI18N
        lbCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCerrarMouseClicked(evt);
            }
        });
        panelMoverVentana.add(lbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        lbMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/login_minimizar.png"))); // NOI18N
        lbMinimizar.setToolTipText("");
        lbMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMinimizarMouseClicked(evt);
            }
        });
        panelMoverVentana.add(lbMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        getContentPane().add(panelMoverVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        panelBackgroundLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelBackgroundLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkShowPass.setBackground(new java.awt.Color(255, 255, 255));
        checkShowPass.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        checkShowPass.setText("Mostrar contraseña");
        checkShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkShowPassActionPerformed(evt);
            }
        });
        panelBackgroundLogin.add(checkShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 160, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setText("INICIAR SESIÓN");
        panelBackgroundLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setText("CONTRASEÑA");
        panelBackgroundLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setText("CARGO");
        panelBackgroundLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 60, -1));

        txtUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtUsuario.setBorder(null);
        panelBackgroundLogin.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 390, 30));

        passContrasena.setBorder(null);
        panelBackgroundLogin.add(passContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 390, 30));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setText("USUARIO");
        panelBackgroundLogin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, -1));

        cbCargo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbCargo.setMaximumRowCount(5);
        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECIONAR---", "CAJERO", "GESTOR DE STOCK", "ADMINISTRADOR" }));
        cbCargo.setBorder(null);
        panelBackgroundLogin.add(cbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 390, 30));

        panelLogin.setBackground(new java.awt.Color(0, 204, 204));
        panelLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        panelBackgroundLogin.add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 120, 40));

        panelRegistro.setBackground(new java.awt.Color(0, 204, 204));
        panelRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        pRegLbReg.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        pRegLbReg.setText("REGISTRARSE");
        panelRegistro.add(pRegLbReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        panelBackgroundLogin.add(panelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 120, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        panelBackgroundLogin.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 390, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        panelBackgroundLogin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 390, 10));

        getContentPane().add(panelBackgroundLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        panelBackgroundRegistro.setBackground(new java.awt.Color(255, 255, 255));
        panelBackgroundRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setText("REGISTRO");
        panelBackgroundRegistro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel7.setText("Apellidos");
        panelBackgroundRegistro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        txtRegApellidos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtRegApellidos.setBorder(null);
        panelBackgroundRegistro.add(txtRegApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 180, -1));

        txtRegNombres.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtRegNombres.setBorder(null);
        panelBackgroundRegistro.add(txtRegNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel11.setText("DNI");
        panelBackgroundRegistro.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel12.setText("Nombres");
        panelBackgroundRegistro.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel13.setText("Confirmar contraseña");
        panelBackgroundRegistro.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel14.setText("Email");
        panelBackgroundRegistro.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel15.setText("Cargo");
        panelBackgroundRegistro.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 50, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel16.setText("Contraseña");
        panelBackgroundRegistro.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        panelBackgroundRegistro.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 180, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        panelBackgroundRegistro.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 180, 10));

        txtRegEmail.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtRegEmail.setBorder(null);
        panelBackgroundRegistro.add(txtRegEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 180, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        panelBackgroundRegistro.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 180, 10));

        txtRegDNI.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtRegDNI.setBorder(null);
        panelBackgroundRegistro.add(txtRegDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 180, -1));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        panelBackgroundRegistro.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 180, 10));

        passRegContrasena1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        passRegContrasena1.setBorder(null);
        panelBackgroundRegistro.add(passRegContrasena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 180, -1));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        panelBackgroundRegistro.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 180, 10));

        passRegContrasena2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        passRegContrasena2.setBorder(null);
        panelBackgroundRegistro.add(passRegContrasena2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 180, -1));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        panelBackgroundRegistro.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, 10));

        cbRegCargo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbRegCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONAR---", "CAJERO", "GESTOR DE STOCK" }));
        cbRegCargo.setBorder(null);
        panelBackgroundRegistro.add(cbRegCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 180, -1));

        checkRegShowPass.setBackground(new java.awt.Color(255, 255, 255));
        checkRegShowPass.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        checkRegShowPass.setText("Mostrar contraseña");
        checkRegShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRegShowPassActionPerformed(evt);
            }
        });
        panelBackgroundRegistro.add(checkRegShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 160, -1));

        panelBtnRegCrearCuenta.setBackground(new java.awt.Color(0, 204, 204));
        panelBtnRegCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelBtnRegCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnRegCrearCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelBtnRegCrearCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnRegCrearCuentaMouseExited(evt);
            }
        });
        panelBtnRegCrearCuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel17.setText("CREAR CUENTA");
        panelBtnRegCrearCuenta.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        panelBackgroundRegistro.add(panelBtnRegCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 110, 40));

        panelBtnRegRegresar.setBackground(new java.awt.Color(0, 204, 204));
        panelBtnRegRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelBtnRegRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnRegRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelBtnRegRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnRegRegresarMouseExited(evt);
            }
        });
        panelBtnRegRegresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel6.setText("REGRESAR");
        panelBtnRegRegresar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        panelBackgroundRegistro.add(panelBtnRegRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 120, 40));

        jLabel18.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel18.setText("Usuario");
        panelBackgroundRegistro.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        txtRegUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtRegUsuario.setBorder(null);
        panelBackgroundRegistro.add(txtRegUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 180, -1));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        panelBackgroundRegistro.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 180, 10));

        getContentPane().add(panelBackgroundRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

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

        ManejoArchivosUsuarios registroUsuarios = new ManejoArchivosUsuarios();
        Usuario usuarioLogin = registroUsuarios.obtenerUsuario(usuario, contrasena, rol);

        if (usuarioLogin != null) {
            System.out.println("SESIÓN INICIADA COMO: " + usuarioLogin.getUsuario() + " - ROL: " + rol);
            new frmHome(usuarioLogin).setVisible(true);
            this.dispose();
            panelBackgroundLogin.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "La información de sesión es incorrecta");
        }
    }//GEN-LAST:event_panelLoginMouseClicked

    private void panelRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistroMouseClicked
//        new frmRegistroUsuario().setVisible(true);
//        this.dispose();
        panelBackgroundLogin.setVisible(false);
        loginImagen.setVisible(false);
        panelBackgroundRegistro.setVisible(true);
        registroImagen.setVisible(true);
        txtUsuario.setText("");
        passContrasena.setText("");
        checkShowPass.setSelected(false);
    }//GEN-LAST:event_panelRegistroMouseClicked

    private void panelMoverVentanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMoverVentanaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelMoverVentanaMousePressed

    private void panelMoverVentanaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMoverVentanaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelMoverVentanaMouseDragged

    private void panelLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLoginMouseEntered
        panelLogin.setBackground(new Color(0, 124, 124));
    }//GEN-LAST:event_panelLoginMouseEntered

    private void panelLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLoginMouseExited
        panelLogin.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_panelLoginMouseExited

    private void panelRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistroMouseEntered
        panelRegistro.setBackground(new Color(0, 124, 124));
    }//GEN-LAST:event_panelRegistroMouseEntered

    private void panelRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistroMouseExited
        panelRegistro.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_panelRegistroMouseExited

    private void checkRegShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRegShowPassActionPerformed
        if (checkRegShowPass.isSelected()) {
            passRegContrasena1.setEchoChar((char) 0);
            passRegContrasena2.setEchoChar((char) 0);
        } else {
            passRegContrasena1.setEchoChar('*');
            passRegContrasena2.setEchoChar('*');
        }
    }//GEN-LAST:event_checkRegShowPassActionPerformed

    private void panelBtnRegRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnRegRegresarMouseClicked
        panelBackgroundRegistro.setVisible(false);
        panelBackgroundLogin.setVisible(true);
        loginImagen.setVisible(true);
        txtRegApellidos.setText("");
        txtRegDNI.setText("");
        txtRegEmail.setText("");
        txtRegNombres.setText("");
        txtRegUsuario.setText("");
        passRegContrasena1.setText("");
        passRegContrasena2.setText("");
        cbRegCargo.setSelectedIndex(0);
        checkRegShowPass.setSelected(false);
    }//GEN-LAST:event_panelBtnRegRegresarMouseClicked

    private void panelBtnRegCrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnRegCrearCuentaMouseClicked
        String nombre = txtRegNombres.getText().trim();
        String apellido = txtRegApellidos.getText().trim();
        String dniStr = txtRegDNI.getText().trim();
        String email = txtRegEmail.getText().trim();
        String user = txtRegUsuario.getText().trim();
        String contrasena1 = new String(passRegContrasena1.getPassword()).trim();
        String contrasena2 = new String(passRegContrasena2.getPassword()).trim();
        String cargo = cbRegCargo.getSelectedItem().toString();

        if (nombre.isEmpty() || apellido.isEmpty() || dniStr.isEmpty() || email.isEmpty()
                || user.isEmpty() || contrasena1.isEmpty() || contrasena2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int dni;
        try {
            dni = Integer.parseInt(dniStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El DNI debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un email válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ManejoArchivosUsuarios manejador = new ManejoArchivosUsuarios();
        if (manejador.existeUsuario(user, email, dni)) {
            JOptionPane.showMessageDialog(this, "Ya existe un usuario con el mismo DNI, Email o Nombre de Usuario.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Condicion que valida que la contraseña tenga al menos 8 caracteres
        if (contrasena1.length() < 8) {
            JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 8 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Condicion que valida que las contraseñas sean iguales
        if (!contrasena1.equals(contrasena2)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear usuario según el cargo
        Usuario nuevoUsuario = null;
        int codigoTrabajador = manejador.generarCodigo();
        String hashContrasena = Cifrar.cifrarContrasena(contrasena1);

        switch (cargo) {
            case "CAJERO" ->
                nuevoUsuario = new Cajero(nombre, apellido, email, user, hashContrasena, dni, codigoTrabajador);
            case "GESTOR DE STOCK" ->
                nuevoUsuario = new GestoresStock(nombre, apellido, email, user, hashContrasena, dni, codigoTrabajador);
            default ->
                JOptionPane.showMessageDialog(this, "Debes especificar un cargo", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Guardar usuario
        if (nuevoUsuario != null) {
            manejador.guardarUsuario(nuevoUsuario);
            JOptionPane.showMessageDialog(this, "Usuario registrado correctamente.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_panelBtnRegCrearCuentaMouseClicked

    private void panelBtnRegCrearCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnRegCrearCuentaMouseEntered
        panelBtnRegCrearCuenta.setBackground(new Color(0, 124, 124));
    }//GEN-LAST:event_panelBtnRegCrearCuentaMouseEntered

    private void panelBtnRegCrearCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnRegCrearCuentaMouseExited
        panelBtnRegCrearCuenta.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_panelBtnRegCrearCuentaMouseExited

    private void panelBtnRegRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnRegRegresarMouseEntered
        panelBtnRegRegresar.setBackground(new Color(0, 124, 124));
    }//GEN-LAST:event_panelBtnRegRegresarMouseEntered

    private void panelBtnRegRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnRegRegresarMouseExited
        panelBtnRegRegresar.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_panelBtnRegRegresarMouseExited

    private void lbCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbCerrarMouseClicked

    private void lbMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizarMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lbMinimizarMouseClicked

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
    private javax.swing.JComboBox<String> cbRegCargo;
    private javax.swing.JCheckBox checkRegShowPass;
    private javax.swing.JCheckBox checkShowPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbCerrar;
    private javax.swing.JLabel lbMinimizar;
    private javax.swing.JLabel loginImagen;
    private javax.swing.JLabel pRegLbReg;
    private javax.swing.JPanel panelBackgroundLogin;
    private javax.swing.JPanel panelBackgroundRegistro;
    private javax.swing.JPanel panelBtnRegCrearCuenta;
    private javax.swing.JPanel panelBtnRegRegresar;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMoverVentana;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JPasswordField passContrasena;
    private javax.swing.JPasswordField passRegContrasena1;
    private javax.swing.JPasswordField passRegContrasena2;
    private javax.swing.JLabel registroImagen;
    private javax.swing.JTextField txtRegApellidos;
    private javax.swing.JTextField txtRegDNI;
    private javax.swing.JTextField txtRegEmail;
    private javax.swing.JTextField txtRegNombres;
    private javax.swing.JTextField txtRegUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
