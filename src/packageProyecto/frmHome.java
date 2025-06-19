package packageProyecto;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class frmHome extends javax.swing.JFrame {

    private Usuario usuarioActual;
    int xMouse, yMouse;

    public frmHome(Usuario usuario) {
        initComponents();
        this.usuarioActual = usuario;
        infoSesion();
    }

    public frmHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dp_fondo = new javax.swing.JDesktopPane();
        homeMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logOutImagen = new javax.swing.JLabel();
        lbLogOut = new javax.swing.JLabel();
        lbCerrar = new javax.swing.JLabel();
        lbMinimizar = new javax.swing.JLabel();
        lbBtnAdmin = new javax.swing.JLabel();
        txtGesStock = new javax.swing.JLabel();
        lbBtnStock = new javax.swing.JLabel();
        txtVentas = new javax.swing.JLabel();
        lbBtnVenta = new javax.swing.JLabel();
        txtAdmin = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        homeBarraTitulo = new javax.swing.JPanel();
        jLabelBienvenido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dp_fondo.setPreferredSize(new java.awt.Dimension(1120, 690));

        javax.swing.GroupLayout dp_fondoLayout = new javax.swing.GroupLayout(dp_fondo);
        dp_fondo.setLayout(dp_fondoLayout);
        dp_fondoLayout.setHorizontalGroup(
            dp_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        dp_fondoLayout.setVerticalGroup(
            dp_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        jPanel1.add(dp_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        homeMenu.setBackground(new java.awt.Color(0, 153, 204));
        homeMenu.setPreferredSize(new java.awt.Dimension(160, 720));
        homeMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel1.setText("INICIO");
        homeMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 120, 40));

        logOutImagen.setBackground(new java.awt.Color(255, 255, 255));
        logOutImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/frmHone_logout.png"))); // NOI18N
        logOutImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutImagenMouseClicked(evt);
            }
        });
        homeMenu.add(logOutImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));

        lbLogOut.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lbLogOut.setText("Cerrar sesión");
        lbLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogOutMouseClicked(evt);
            }
        });
        homeMenu.add(lbLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, -1, -1));

        lbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/login_cerrar.png"))); // NOI18N
        lbCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCerrarMouseClicked(evt);
            }
        });
        homeMenu.add(lbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        lbMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/login_minimizar.png"))); // NOI18N
        lbMinimizar.setToolTipText("");
        lbMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMinimizarMouseClicked(evt);
            }
        });
        homeMenu.add(lbMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        lbBtnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/frmHome_btn_admin.png"))); // NOI18N
        lbBtnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbBtnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBtnAdminMouseClicked(evt);
            }
        });
        homeMenu.add(lbBtnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 100, 100));

        txtGesStock.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtGesStock.setText("Gestión de stock");
        txtGesStock.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        homeMenu.add(txtGesStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        lbBtnStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/frmHome_btn_stocker.png"))); // NOI18N
        lbBtnStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbBtnStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBtnStockMouseClicked(evt);
            }
        });
        homeMenu.add(lbBtnStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, 100));

        txtVentas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtVentas.setText("Ventas");
        txtVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        homeMenu.add(txtVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        lbBtnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/frmHome_btn_ventas.png"))); // NOI18N
        lbBtnVenta.setText("jLabel2");
        lbBtnVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbBtnVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBtnVentaMouseClicked(evt);
            }
        });
        homeMenu.add(lbBtnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 100, 100));

        txtAdmin.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtAdmin.setText("Administración");
        txtAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        homeMenu.add(txtAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        homeMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 160, -1));

        jPanel1.add(homeMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 720));

        homeBarraTitulo.setBackground(new java.awt.Color(255, 255, 255));
        homeBarraTitulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                homeBarraTituloMouseDragged(evt);
            }
        });
        homeBarraTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeBarraTituloMousePressed(evt);
            }
        });
        homeBarraTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBienvenido.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabelBienvenido.setText("Bienvenido X");
        homeBarraTitulo.add(jLabelBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        jPanel1.add(homeBarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1280, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void infoSesion() {
        jLabelBienvenido.setText("Bienvenido: " + usuarioActual.getUsuario());

        if (usuarioActual instanceof Cajero) {
            txtGesStock.setVisible(false);
            lbBtnStock.setVisible(false);
            txtAdmin.setVisible(false);
            lbBtnAdmin.setVisible(false);
        } else if (usuarioActual instanceof GestoresStock) {
            lbBtnVenta.setVisible(false);
            lbBtnAdmin.setVisible(false);
            txtAdmin.setVisible(false);
            txtVentas.setVisible(false);
        }
    }

    private boolean estaVentanaAbierta(Class<?> nomVentana) {
        for (JInternalFrame frame : dp_fondo.getAllFrames()) {
            if (frame.getClass().equals(nomVentana)) {
                frame.toFront();
                return true;
            }
        }
        return false;
    }

    private void homeBarraTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBarraTituloMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_homeBarraTituloMouseDragged

    private void homeBarraTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBarraTituloMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_homeBarraTituloMousePressed

    private void logOutImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutImagenMouseClicked
        int rpta = JOptionPane.showOptionDialog(this, "¿Estas seguro que quieres cerrar sesión?", "Mensaje de confirmación",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                null, null);
        if (rpta == 0) {
            this.dispose();
            new frmLogin().setVisible(true);
        }
    }//GEN-LAST:event_logOutImagenMouseClicked

    private void lbCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbCerrarMouseClicked

    private void lbMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizarMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lbMinimizarMouseClicked

    private void lbLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogOutMouseClicked
        int rpta = JOptionPane.showOptionDialog(this, "¿Estas seguro que quieres cerrar sesión?", "Mensaje de confirmación",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                null, null);
        if (rpta == 0) {
            this.dispose();
            new frmLogin().setVisible(true);
        }
    }//GEN-LAST:event_lbLogOutMouseClicked

    private void lbBtnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBtnAdminMouseClicked
        if (!estaVentanaAbierta(interGestionarUsuarios.class)) {
            interGestionarUsuarios interGesUser = new interGestionarUsuarios();
            dp_fondo.add(interGesUser);
            interGesUser.setVisible(true);
            interGesUser.setSize(dp_fondo.getSize());
        }
    }//GEN-LAST:event_lbBtnAdminMouseClicked

    private void lbBtnStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBtnStockMouseClicked
        if (!estaVentanaAbierta(interGestionarStock.class)) {
            interGestionarStock interStock = new interGestionarStock(usuarioActual);
            dp_fondo.add(interStock);
            interStock.setVisible(true);
            interStock.setSize(dp_fondo.getSize());
        }
    }//GEN-LAST:event_lbBtnStockMouseClicked

    private void lbBtnVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBtnVentaMouseClicked
        if (!estaVentanaAbierta(interVentas.class)) {
            interVentas interVenta = new interVentas();
            dp_fondo.add(interVenta);
            interVenta.setVisible(true);
            interVenta.setSize(dp_fondo.getSize());
        }
    }//GEN-LAST:event_lbBtnVentaMouseClicked

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
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dp_fondo;
    private javax.swing.JPanel homeBarraTitulo;
    private javax.swing.JPanel homeMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbBtnAdmin;
    private javax.swing.JLabel lbBtnStock;
    private javax.swing.JLabel lbBtnVenta;
    private javax.swing.JLabel lbCerrar;
    private javax.swing.JLabel lbLogOut;
    private javax.swing.JLabel lbMinimizar;
    private javax.swing.JLabel logOutImagen;
    private javax.swing.JLabel txtAdmin;
    private javax.swing.JLabel txtGesStock;
    private javax.swing.JLabel txtVentas;
    // End of variables declaration//GEN-END:variables
}
