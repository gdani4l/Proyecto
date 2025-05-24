package packageProyecto;

import java.awt.Color;
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
        homeBtnSalir = new javax.swing.JPanel();
        homeLbExitX = new javax.swing.JLabel();
        homeMenu = new javax.swing.JPanel();
        homeBtnStocker = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        homeBtnCajero = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        homeBtnAdmin = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabelBienvenido = new javax.swing.JLabel();
        jLabelRol = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        homeBtnLogOut = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        homeBarraTitulo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dp_fondo.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));

        javax.swing.GroupLayout dp_fondoLayout = new javax.swing.GroupLayout(dp_fondo);
        dp_fondo.setLayout(dp_fondoLayout);
        dp_fondoLayout.setHorizontalGroup(
            dp_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        dp_fondoLayout.setVerticalGroup(
            dp_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel1.add(dp_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 870, 720));

        homeBtnSalir.setBackground(new java.awt.Color(255, 255, 255));
        homeBtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeBtnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeBtnSalirMouseExited(evt);
            }
        });
        homeBtnSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeLbExitX.setFont(new java.awt.Font("Roboto Light", 0, 48)); // NOI18N
        homeLbExitX.setText("X");
        homeBtnSalir.add(homeLbExitX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 20));

        jPanel1.add(homeBtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 20));

        homeMenu.setBackground(new java.awt.Color(0, 153, 204));
        homeMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeBtnStocker.setBackground(new java.awt.Color(204, 204, 255));
        homeBtnStocker.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtnStocker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnStockerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeBtnStockerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeBtnStockerMouseExited(evt);
            }
        });
        homeBtnStocker.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("Gestionar stock");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeBtnStocker.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        homeMenu.add(homeBtnStocker, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, 40));

        homeBtnCajero.setBackground(new java.awt.Color(204, 204, 255));
        homeBtnCajero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtnCajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnCajeroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeBtnCajeroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeBtnCajeroMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setText("Zona de venta");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout homeBtnCajeroLayout = new javax.swing.GroupLayout(homeBtnCajero);
        homeBtnCajero.setLayout(homeBtnCajeroLayout);
        homeBtnCajeroLayout.setHorizontalGroup(
            homeBtnCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
            .addGroup(homeBtnCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homeBtnCajeroLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homeBtnCajeroLayout.setVerticalGroup(
            homeBtnCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(homeBtnCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homeBtnCajeroLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        homeMenu.add(homeBtnCajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 110, 40));

        homeBtnAdmin.setBackground(new java.awt.Color(204, 204, 255));
        homeBtnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeBtnAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeBtnAdminMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("Zona admin");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout homeBtnAdminLayout = new javax.swing.GroupLayout(homeBtnAdmin);
        homeBtnAdmin.setLayout(homeBtnAdminLayout);
        homeBtnAdminLayout.setHorizontalGroup(
            homeBtnAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
            .addGroup(homeBtnAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homeBtnAdminLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homeBtnAdminLayout.setVerticalGroup(
            homeBtnAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(homeBtnAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homeBtnAdminLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        homeMenu.add(homeBtnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 110, 40));

        jLabelBienvenido.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabelBienvenido.setText("Bienvenido X");
        homeMenu.add(jLabelBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabelRol.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabelRol.setText("Rol: Invitado");
        homeMenu.add(jLabelRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel1.setText("INICIO");
        homeMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 120, -1));

        homeBtnLogOut.setBackground(new java.awt.Color(204, 204, 255));
        homeBtnLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeBtnLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeBtnLogOutMouseExited(evt);
            }
        });
        homeBtnLogOut.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Cerrar sesión");
        homeBtnLogOut.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        homeMenu.add(homeBtnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, 110, 40));

        jPanel1.add(homeMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 770));

        homeBarraTitulo.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
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
        jPanel1.add(homeBarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1030, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void infoSesion() {
        jLabelBienvenido.setText("Bienvenido: " + usuarioActual.getUsuario());

        if (usuarioActual instanceof Cajero) {
            jLabelRol.setText("Rol: Cajero");
            homeBtnStocker.setVisible(false);
            homeBtnAdmin.setVisible(false);
        } else if (usuarioActual instanceof GestoresStock) {
            jLabelRol.setText("Rol: Gestor de Stock");
            homeBtnCajero.setVisible(false);
            homeBtnAdmin.setVisible(false);
        } else {
            jLabelRol.setText("Rol: Administrador");
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

    private void homeBtnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnLogOutMouseClicked
        int rpta = JOptionPane.showOptionDialog(this, "¿Estas seguro que quieres cerrar sesión?", "Mensaje de confirmación",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                null, null);
        if (rpta == 0) {
            this.dispose();
            new frmLogin().setVisible(true);
        }
    }//GEN-LAST:event_homeBtnLogOutMouseClicked

    private void homeBtnStockerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnStockerMouseClicked
        if (!estaVentanaAbierta(interGestionarStock.class)) {
            interGestionarStock interStock = new interGestionarStock();
            dp_fondo.add(interStock);
            interStock.setVisible(true);
        }
    }//GEN-LAST:event_homeBtnStockerMouseClicked

    private void homeBtnCajeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnCajeroMouseClicked
        if (!estaVentanaAbierta(interVentas.class)) {
            interVentas interVenta = new interVentas();
            dp_fondo.add(interVenta);
            interVenta.setVisible(true);
        }
    }//GEN-LAST:event_homeBtnCajeroMouseClicked

    private void homeBtnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnAdminMouseClicked
        if (!estaVentanaAbierta(interGestionarUsuarios.class)) {
            interGestionarUsuarios interUser = new interGestionarUsuarios();
            dp_fondo.add(interUser);
            interUser.setVisible(true);
        }
    }//GEN-LAST:event_homeBtnAdminMouseClicked

    private void homeBarraTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBarraTituloMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_homeBarraTituloMouseDragged

    private void homeBarraTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBarraTituloMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_homeBarraTituloMousePressed

    private void homeBtnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnSalirMouseEntered
        homeBtnSalir.setBackground(Color.red);
        homeLbExitX.setForeground(Color.white);
    }//GEN-LAST:event_homeBtnSalirMouseEntered

    private void homeBtnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnSalirMouseExited
        homeBtnSalir.setBackground(Color.white);
        homeLbExitX.setForeground(Color.black);
    }//GEN-LAST:event_homeBtnSalirMouseExited

    private void homeBtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_homeBtnSalirMouseClicked

    private void homeBtnStockerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnStockerMouseEntered
        homeBtnStocker.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_homeBtnStockerMouseEntered

    private void homeBtnStockerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnStockerMouseExited
        homeBtnStocker.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_homeBtnStockerMouseExited

    private void homeBtnCajeroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnCajeroMouseEntered
        homeBtnCajero.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_homeBtnCajeroMouseEntered

    private void homeBtnCajeroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnCajeroMouseExited
        homeBtnCajero.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_homeBtnCajeroMouseExited

    private void homeBtnAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnAdminMouseEntered
        homeBtnAdmin.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_homeBtnAdminMouseEntered

    private void homeBtnAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnAdminMouseExited
        homeBtnAdmin.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_homeBtnAdminMouseExited

    private void homeBtnLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnLogOutMouseEntered
        homeBtnLogOut.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_homeBtnLogOutMouseEntered

    private void homeBtnLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnLogOutMouseExited
        homeBtnLogOut.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_homeBtnLogOutMouseExited

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
    private javax.swing.JPanel homeBtnAdmin;
    private javax.swing.JPanel homeBtnCajero;
    private javax.swing.JPanel homeBtnLogOut;
    private javax.swing.JPanel homeBtnSalir;
    private javax.swing.JPanel homeBtnStocker;
    private javax.swing.JLabel homeLbExitX;
    private javax.swing.JPanel homeMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelRol;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
