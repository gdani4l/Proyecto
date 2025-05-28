package packageProyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class interGestionarStock extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;
    private Usuario usuarioActual;

    public interGestionarStock(Usuario usuarioActual) {
        initComponents();
        this.usuarioActual = usuarioActual;
        String[] columnas = {"Categoría", "Nombre", "Precio", "Cantidad", "Código"};
        modelo = new DefaultTableModel(columnas, 0);
        tblProductos.setModel(modelo);
        categoriasCB(cbCategoriaDis);
        checkBoxBusCod.setSelected(true) ;
        cargarProductosATabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombrePro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cbCategoriaDis = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtPrecioPro = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtCantidadAct = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBuscarPro = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnEliminarPro = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnImportarPro = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnExportarPro = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        txtAgregarCat = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        btnBuscarPro = new javax.swing.JPanel();
        jl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAgregarCate = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        checkBoxBusNom = new javax.swing.JCheckBox();
        checkBoxBusCod = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("GESTOR DE STOCK");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProductos.setBackground(new java.awt.Color(153, 255, 204));
        tblProductos.setFont(new java.awt.Font("Roboto SemiBold", 0, 12)); // NOI18N
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 750, 610));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setText("Gestión de stock");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Ingresa la nueva categoría");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 248, -1));

        txtNombrePro.setBackground(new java.awt.Color(255, 204, 204));
        txtNombrePro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombrePro.setBorder(null);
        jPanel1.add(txtNombrePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 248, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 248, 10));

        cbCategoriaDis.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbCategoriaDis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONAR---" }));
        jPanel1.add(cbCategoriaDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 250, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Ingresa el precio del producto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 248, -1));

        txtPrecioPro.setBackground(new java.awt.Color(255, 204, 204));
        txtPrecioPro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtPrecioPro.setBorder(null);
        jPanel1.add(txtPrecioPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 248, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 248, 10));

        txtCantidadAct.setBackground(new java.awt.Color(255, 204, 204));
        txtCantidadAct.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCantidadAct.setBorder(null);
        jPanel1.add(txtCantidadAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 248, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Ingresa la categoría del producto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 248, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 248, 10));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Ingresa la cantidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 248, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Buscar producto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, -1, -1));

        txtBuscarPro.setBackground(new java.awt.Color(255, 204, 204));
        txtBuscarPro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtBuscarPro.setBorder(null);
        jPanel1.add(txtBuscarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, 248, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 248, 10));

        btnEliminarPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarPro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/frmHome_btn_eliminar.png"))); // NOI18N
        btnEliminarPro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 30, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setText("Eliminar producto");
        btnEliminarPro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jPanel1.add(btnEliminarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 750, 115, 60));

        btnImportarPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImportarPro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/interStock_import.png"))); // NOI18N
        btnImportarPro.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel12.setText("Importar");
        btnImportarPro.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel1.add(btnImportarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 750, 90, 60));

        btnExportarPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExportarPro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/interStock_export.png"))); // NOI18N
        btnExportarPro.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel13.setText("Exportar");
        btnExportarPro.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel1.add(btnExportarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 750, 90, 60));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setToolTipText("");
        jSeparator5.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 10, 450));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setText("Ingresa el nombre del nuevo producto");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 248, -1));

        txtAgregarCat.setBackground(new java.awt.Color(255, 204, 204));
        txtAgregarCat.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtAgregarCat.setBorder(null);
        jPanel1.add(txtAgregarCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 248, -1));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 248, 10));

        btnBuscarPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarPro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/interStock_buscar.png"))); // NOI18N
        btnBuscarPro.add(jl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setText("Buscar");
        btnBuscarPro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jPanel1.add(btnBuscarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 30, 60, 60));

        btnAgregarCate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarCate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarCateMouseClicked(evt);
            }
        });
        btnAgregarCate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/interStock_agPro.png"))); // NOI18N
        btnAgregarCate.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel16.setText("Añadir categoría");
        btnAgregarCate.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jPanel1.add(btnAgregarCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 230, 70));

        btnAgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarProductoMouseClicked(evt);
            }
        });
        btnAgregarProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/interStock_agPro.png"))); // NOI18N
        btnAgregarProducto.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel18.setText("Agregar producto");
        btnAgregarProducto.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jPanel1.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 230, 70));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/interStock_imagen.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 610, 160));

        checkBoxBusNom.setText("Buscar por nombre");
        checkBoxBusNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxBusNomActionPerformed(evt);
            }
        });
        jPanel1.add(checkBoxBusNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, -1, -1));

        checkBoxBusCod.setText("Buscar por código");
        checkBoxBusCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxBusCodActionPerformed(evt);
            }
        });
        jPanel1.add(checkBoxBusCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1428, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void categoriasCB(JComboBox<String> comboBox) {
        File archivo = new File(System.getProperty("user.dir") + "\\src\\resources\\data\\Productos.txt");
        Set<String> categoriasUnicas = new HashSet<>();

        if (!archivo.exists()) {
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty() || linea.startsWith("#")) {
                    continue;
                }

                String[] partes = linea.split(",");
                if (partes.length >= 1) {
                    categoriasUnicas.add(partes[0].trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String categoria : categoriasUnicas) {
            comboBox.addItem(categoria);
        }
    }

    private void cargarProductosATabla() {
        ManejoArchivosProductos pato = new ManejoArchivosProductos();
        List<String[]> listaProductos = pato.leerProductos();

        DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
        modelo.setRowCount(0);

        for (String[] producto : listaProductos) {
            modelo.addRow(producto);
        }
    }
    private void btnAgregarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseClicked
        String nombre = txtNombrePro.getText().trim();
        String precioStr = txtPrecioPro.getText().trim();
        String cantidadStr = txtCantidadAct.getText().trim();
        String categoria = cbCategoriaDis.getSelectedItem().toString().trim();

        if (nombre.isEmpty() || precioStr.isEmpty() || cantidadStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos");
            return;
        }

        double precio;
        int stock;
        try {
            precio = Double.parseDouble(precioStr);
            stock = Integer.parseInt(cantidadStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El precio o la cantidad deben ser números válidos");
            return;
        }

        if ("---SELECCIONAR---".equals(categoria)) {
            JOptionPane.showMessageDialog(this, "Seleccione una categoría válida");
            return;
        }

        // Obtener el usuario actual del frmHome (asegúrate de pasar esta referencia)
        if (usuarioActual instanceof GestoresStock gestor) {
            gestor.registrarProducto(nombre, categoria, precio, stock);
            JOptionPane.showMessageDialog(this, "Se ha registrado un nuevo producto");
            cargarProductosATabla();
            limpiar();
        } else {
            JOptionPane.showMessageDialog(this, "No tienes permiso para realizar esta acción");
        }
    }//GEN-LAST:event_btnAgregarProductoMouseClicked
    private void limpiar() {
        txtNombrePro.setText("");
        txtPrecioPro.setText("");
        txtCantidadAct.setText("");
        cbCategoriaDis.setSelectedIndex(0);
        txtAgregarCat.setText("");
    }
    private void btnAgregarCateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCateMouseClicked
        String newCategoria = txtAgregarCat.getText().trim();
        if (newCategoria.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre válido para la nueva categoría");
            return;
        }
        cbCategoriaDis.addItem(newCategoria);
        JOptionPane.showMessageDialog(this, "Se ha agregado la categoría " + newCategoria);
        limpiar();

        if (usuarioActual instanceof GestoresStock) {
            ((GestoresStock) usuarioActual).agregarCategoria(newCategoria);
        }
    }//GEN-LAST:event_btnAgregarCateMouseClicked

    private void checkBoxBusNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxBusNomActionPerformed
        checkBoxBusCod.setSelected(false);
    }//GEN-LAST:event_checkBoxBusNomActionPerformed

    private void checkBoxBusCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxBusCodActionPerformed
        checkBoxBusNom.setSelected(false);
    }//GEN-LAST:event_checkBoxBusCodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregarCate;
    private javax.swing.JPanel btnAgregarProducto;
    private javax.swing.JPanel btnBuscarPro;
    private javax.swing.JPanel btnEliminarPro;
    private javax.swing.JPanel btnExportarPro;
    private javax.swing.JPanel btnImportarPro;
    private javax.swing.JComboBox<String> cbCategoriaDis;
    private javax.swing.JCheckBox checkBoxBusCod;
    private javax.swing.JCheckBox checkBoxBusNom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel jl;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtAgregarCat;
    private javax.swing.JTextField txtBuscarPro;
    private javax.swing.JTextField txtCantidadAct;
    private javax.swing.JTextField txtNombrePro;
    private javax.swing.JTextField txtPrecioPro;
    // End of variables declaration//GEN-END:variables
}
