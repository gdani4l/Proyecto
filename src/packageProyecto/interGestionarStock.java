package packageProyecto;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        checkBoxBusCod.setSelected(true);
        cargarProductosATabla();
        tblProductos.getTableHeader().setResizingAllowed(false);
        tblProductos.getTableHeader().setReorderingAllowed(false);
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
        btnRefrescar = new javax.swing.JPanel();
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
        checkBoxBusNom = new javax.swing.JCheckBox();
        checkBoxBusCod = new javax.swing.JCheckBox();
        btnImportarPro = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("GESTOR DE STOCK");
        setPreferredSize(new java.awt.Dimension(1160, 690));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 690));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProductos.setBackground(new java.awt.Color(153, 255, 204));
        tblProductos.setFont(new java.awt.Font("Roboto SemiBold", 0, 12)); // NOI18N
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Categoria", "Nombre", "Precio", "Cantidad", "Código"
            }
        ));
        tblProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tblProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 580, 240));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        jLabel1.setText("Gestión de stock");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Ingresa la nueva categoría");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 220, -1));

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
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));

        txtBuscarPro.setBackground(new java.awt.Color(255, 204, 204));
        txtBuscarPro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtBuscarPro.setBorder(null);
        jPanel1.add(txtBuscarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 248, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 248, 10));

        btnEliminarPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarProMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarProMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarProMouseExited(evt);
            }
        });
        btnEliminarPro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/frmHome_btn_eliminar.png"))); // NOI18N
        btnEliminarPro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 30, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setText("Eliminar producto");
        btnEliminarPro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jPanel1.add(btnEliminarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, 115, 60));

        btnRefrescar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefrescar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefrescarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRefrescarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRefrescarMouseExited(evt);
            }
        });
        btnRefrescar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/interStock_refrescar.png"))); // NOI18N
        btnRefrescar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 30));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel12.setText("Actualizar");
        btnRefrescar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel1.add(btnRefrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 90, 60));

        btnExportarPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExportarPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportarProMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExportarProMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExportarProMouseExited(evt);
            }
        });
        btnExportarPro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/interStock_export.png"))); // NOI18N
        btnExportarPro.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel13.setText("Exportar");
        btnExportarPro.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel1.add(btnExportarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, 90, 60));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setToolTipText("");
        jSeparator5.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 10, 370));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setText("Ingresa el nombre del nuevo producto");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 248, -1));

        txtAgregarCat.setBackground(new java.awt.Color(255, 204, 204));
        txtAgregarCat.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtAgregarCat.setBorder(null);
        jPanel1.add(txtAgregarCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 180, -1));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 180, 10));

        btnBuscarPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarProMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarProMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarProMouseExited(evt);
            }
        });
        btnBuscarPro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/interStock_buscar.png"))); // NOI18N
        btnBuscarPro.add(jl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setText("Buscar");
        btnBuscarPro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jPanel1.add(btnBuscarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, 60, 60));

        btnAgregarCate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarCate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarCateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarCateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarCateMouseExited(evt);
            }
        });
        btnAgregarCate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/interStock_agPro.png"))); // NOI18N
        btnAgregarCate.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel16.setText("Añadir categoría");
        btnAgregarCate.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jPanel1.add(btnAgregarCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 220, 70));

        btnAgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarProductoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarProductoMouseExited(evt);
            }
        });
        btnAgregarProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/interStock_agPro.png"))); // NOI18N
        btnAgregarProducto.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel18.setText("Agregar producto");
        btnAgregarProducto.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jPanel1.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 230, 70));

        checkBoxBusNom.setText("Buscar por nombre");
        checkBoxBusNom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkBoxBusNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxBusNomActionPerformed(evt);
            }
        });
        jPanel1.add(checkBoxBusNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, -1));

        checkBoxBusCod.setText("Buscar por código");
        checkBoxBusCod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkBoxBusCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxBusCodActionPerformed(evt);
            }
        });
        jPanel1.add(checkBoxBusCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        btnImportarPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImportarPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImportarProMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnImportarProMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnImportarProMouseExited(evt);
            }
        });
        btnImportarPro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/interStock_import.png"))); // NOI18N
        btnImportarPro.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel21.setText("Importar");
        btnImportarPro.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel1.add(btnImportarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 370, 90, 60));

        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        btnGuardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/interStock_guardar.png"))); // NOI18N
        btnGuardar.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel23.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel23.setText("Guardar");
        btnGuardar.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 90, 60));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/interStock_imagen.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 496, 1070, 140));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1110, 660));

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
        ManejoArchivosProductos saver = new ManejoArchivosProductos();
        if (saver.buscarNombreDuplicado(nombre)) {
            JOptionPane.showMessageDialog(this, "Ya existe un producto con ese nombre");
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

        ManejoArchivosProductos productosArchivo = new ManejoArchivosProductos();
        Set<String> categoriasExistentes = productosArchivo.obtenerCategoriasUnicas();

        for (int i = 0; i < cbCategoriaDis.getItemCount(); i++) {
            String item = cbCategoriaDis.getItemAt(i).trim().toLowerCase();
            categoriasExistentes.add(item);
        }

        if (categoriasExistentes.contains(newCategoria)) {
            JOptionPane.showMessageDialog(this, "La categoría ya existe");
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
        if (checkBoxBusNom.isSelected()) {
            checkBoxBusCod.setSelected(false);
        } else {
            if (!checkBoxBusCod.isSelected()) {
                checkBoxBusCod.setSelected(true);
            }
        }
    }//GEN-LAST:event_checkBoxBusNomActionPerformed

    private void checkBoxBusCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxBusCodActionPerformed
        if (checkBoxBusCod.isSelected()) {
            checkBoxBusNom.setSelected(false);
        } else {
            if (!checkBoxBusNom.isSelected()) {
                checkBoxBusNom.setSelected(true);
            }
        }
    }//GEN-LAST:event_checkBoxBusCodActionPerformed

    private void btnEliminarProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProMouseClicked
        int filaSeleccionada = tblProductos.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un producto para eliminar.");
            return;
        }

        String codigoProducto = tblProductos.getValueAt(filaSeleccionada, 4).toString();

        ManejoArchivosProductos manejo = new ManejoArchivosProductos();
        List<String[]> productos = manejo.leerProductos();
        productos.removeIf(p -> p[4].equals(codigoProducto));
        manejo.editarRegistroProductos(productos);
        cargarProductosATabla();
        JOptionPane.showMessageDialog(this, "El producto ha sido eliminado.");
    }//GEN-LAST:event_btnEliminarProMouseClicked

    private void btnRefrescarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefrescarMouseClicked
        modelo.setRowCount(0);
        cargarProductosATabla();
    }//GEN-LAST:event_btnRefrescarMouseClicked

    private void btnBuscarProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarProMouseClicked
        String proBuscar = txtBuscarPro.getText().trim().toLowerCase();

        if (proBuscar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese algo para buscar");
            return;
        }

        boolean buscarPorCodigo = checkBoxBusCod.isSelected();
        boolean buscarPorNombre = checkBoxBusNom.isSelected();

        ManejoArchivosProductos manejador = new ManejoArchivosProductos();
        List<String[]> productosTabla = manejador.leerProductos();

        List<String[]> resultados = new ArrayList<>();

        for (String[] producto : productosTabla) {
            String codigo = producto[4].toLowerCase();
            String nombre = producto[1].toLowerCase();

            if ((buscarPorCodigo && codigo.contains(proBuscar))
                    || (buscarPorNombre && nombre.contains(proBuscar))) {
                resultados.add(producto);
            }
        }

        DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
        modelo.setRowCount(0);

        for (String[] fila : resultados) {
            modelo.addRow(fila);
        }

        if (resultados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontraron productos");
        }
        txtBuscarPro.setText("");
    }//GEN-LAST:event_btnBuscarProMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblProductos.getModel();
        List<String[]> nuevosProductos = new ArrayList<>();

        for (int i = 0; i < model.getRowCount(); i++) {
            String[] producto = new String[5];
            for (int j = 0; j < 5; j++) {
                producto[j] = model.getValueAt(i, j).toString().trim();
            }
            nuevosProductos.add(producto);
        }

        ManejoArchivosProductos manejador = new ManejoArchivosProductos();
        manejador.editarRegistroProductos(nuevosProductos);

        JOptionPane.showMessageDialog(this, "Los cambios han sido guardados");
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnExportarProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarProMouseClicked
        String fecha = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String nombreArchivo = "productos_exportados_" + fecha + ".pdf";

        ManejoPDF pdf = new ManejoPDF();
        pdf.exportarPDFproductos(nombreArchivo);
    }//GEN-LAST:event_btnExportarProMouseClicked

    private void btnImportarProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImportarProMouseClicked

        ManejoPDF manejoPDF = new ManejoPDF();
        manejoPDF.importarPDFproductos();

    }//GEN-LAST:event_btnImportarProMouseClicked

    private void btnAgregarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseEntered
        btnAgregarProducto.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_btnAgregarProductoMouseEntered

    private void btnAgregarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseExited
        btnAgregarProducto.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_btnAgregarProductoMouseExited

    private void btnAgregarCateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCateMouseEntered
        btnAgregarCate.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_btnAgregarCateMouseEntered

    private void btnAgregarCateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCateMouseExited
        btnAgregarCate.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_btnAgregarCateMouseExited

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnRefrescarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefrescarMouseEntered
        btnRefrescar.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_btnRefrescarMouseEntered

    private void btnRefrescarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefrescarMouseExited
        btnRefrescar.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_btnRefrescarMouseExited

    private void btnEliminarProMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProMouseEntered
        btnEliminarPro.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_btnEliminarProMouseEntered

    private void btnEliminarProMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProMouseExited
        btnEliminarPro.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_btnEliminarProMouseExited

    private void btnImportarProMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImportarProMouseEntered
        btnImportarPro.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_btnImportarProMouseEntered

    private void btnImportarProMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImportarProMouseExited
        btnImportarPro.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_btnImportarProMouseExited

    private void btnExportarProMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarProMouseEntered
        btnExportarPro.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_btnExportarProMouseEntered

    private void btnExportarProMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarProMouseExited
        btnExportarPro.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_btnExportarProMouseExited

    private void btnBuscarProMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarProMouseEntered
        btnBuscarPro.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_btnBuscarProMouseEntered

    private void btnBuscarProMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarProMouseExited
        btnBuscarPro.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_btnBuscarProMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregarCate;
    private javax.swing.JPanel btnAgregarProducto;
    private javax.swing.JPanel btnBuscarPro;
    private javax.swing.JPanel btnEliminarPro;
    private javax.swing.JPanel btnExportarPro;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnImportarPro;
    private javax.swing.JPanel btnRefrescar;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
