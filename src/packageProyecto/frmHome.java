package packageProyecto;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class frmHome extends javax.swing.JFrame {

    private Usuario usuarioActual;

    public frmHome(Usuario usuario) {
        initComponents();
        this.usuarioActual = usuario;
        infoSesión();
    }

    public frmHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnGestionarUsuarios = new javax.swing.JButton();
        btnGestionarStock = new javax.swing.JButton();
        btnZonaVentas = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jLabelBienvenido = new javax.swing.JLabel();
        jLabelRol = new javax.swing.JLabel();
        dp_fondo = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("HOME");

        btnGestionarUsuarios.setText("GESTIONAR USUARIOS");
        btnGestionarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarUsuariosActionPerformed(evt);
            }
        });

        btnGestionarStock.setText("GESTIONAR STOCK");
        btnGestionarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarStockActionPerformed(evt);
            }
        });

        btnZonaVentas.setText("ZONA DE VENTAS");
        btnZonaVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZonaVentasActionPerformed(evt);
            }
        });

        btnCerrarSesion.setText("CERRAR SESIÓN");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        jLabelBienvenido.setText("Bienvenido X,");

        jLabelRol.setText("Rol: nada xq lo abriste de pepa");

        dp_fondo.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout dp_fondoLayout = new javax.swing.GroupLayout(dp_fondo);
        dp_fondo.setLayout(dp_fondoLayout);
        dp_fondoLayout.setHorizontalGroup(
            dp_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dp_fondoLayout.setVerticalGroup(
            dp_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnGestionarStock)
                        .addGap(18, 18, 18)
                        .addComponent(btnZonaVentas)
                        .addGap(18, 18, 18)
                        .addComponent(btnGestionarUsuarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
                        .addComponent(btnCerrarSesion))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(365, 365, 365)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelBienvenido)
                                .addGap(109, 109, 109)
                                .addComponent(jLabelRol)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dp_fondo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGestionarStock, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZonaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGestionarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dp_fondo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRol)
                    .addComponent(jLabelBienvenido)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void infoSesión() {
        jLabelBienvenido.setText("Bienvenido: " + usuarioActual.getNombre() + " " + usuarioActual.getApellido());

        if (usuarioActual instanceof Cajero) {
            jLabelRol.setText("Rol: Cajero");
            btnGestionarStock.setVisible(false);
            btnGestionarUsuarios.setVisible(false);
        } else if (usuarioActual instanceof GestoresStock) {
            jLabelRol.setText("Rol: Gestor de Stock");
            btnZonaVentas.setVisible(false);
            btnGestionarUsuarios.setVisible(false);
        } else {
            jLabelRol.setText("Rol: Administrador");
        }
    }

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        int rpta = JOptionPane.showOptionDialog(this, "¿Estas seguro que quieres cerrar sesión?", "Mensaje de confirmación",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                null, null);
        if (rpta == 0) {
            this.dispose();
            new frmLogin().setVisible(true);
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private boolean estaVentanaAbierta(Class<?> clase) {
        for (JInternalFrame frame : dp_fondo.getAllFrames()) {
            if (frame.getClass().equals(clase)) {
                frame.toFront();
                return true;
            }
        }
        return false;
    }

    private void btnGestionarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarUsuariosActionPerformed
        if (!estaVentanaAbierta(interGestionarUsuarios.class)) {
            interGestionarUsuarios interUser = new interGestionarUsuarios();
            dp_fondo.add(interUser);
            interUser.setVisible(true);
        }
    }//GEN-LAST:event_btnGestionarUsuariosActionPerformed

    private void btnZonaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZonaVentasActionPerformed
        if (!estaVentanaAbierta(interGestionarStock.class)) {
            interVentas interVenta = new interVentas();
            dp_fondo.add(interVenta);
            interVenta.setVisible(true);
        }
    }//GEN-LAST:event_btnZonaVentasActionPerformed

    private void btnGestionarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarStockActionPerformed
        if (!estaVentanaAbierta(interGestionarStock.class)) {
            interGestionarStock interStock = new interGestionarStock();
            dp_fondo.add(interStock);
            interStock.setVisible(true);
        }
    }//GEN-LAST:event_btnGestionarStockActionPerformed

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
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnGestionarStock;
    private javax.swing.JButton btnGestionarUsuarios;
    private javax.swing.JButton btnZonaVentas;
    private javax.swing.JDesktopPane dp_fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelRol;
    // End of variables declaration//GEN-END:variables
}
