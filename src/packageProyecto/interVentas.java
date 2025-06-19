package packageProyecto;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class interVentas extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;

    public interVentas() {
        initComponents();
        String[] columnas = {"N°", "Nombre", "Precio unitario", "Cantidad", "IGV", "Total", "Acción"};
        modelo = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tblListaProductos.setModel(modelo);
        tblListaProductos.setCellSelectionEnabled(true);

        tblListaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int fila = tblListaProductos.rowAtPoint(evt.getPoint());
                int columna = tblListaProductos.columnAtPoint(evt.getPoint());

                if (columna == 6) {
                    int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este producto?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

                    if (confirmacion == JOptionPane.YES_OPTION) {
                        DefaultTableModel modelo = (DefaultTableModel) tblListaProductos.getModel();
                        modelo.removeRow(fila);
                    }
                }
            }
        });

        actualizarFechaHora();
        ComboProductos();
        tblListaProductos.getTableHeader().setResizingAllowed(false);
        tblListaProductos.getTableHeader().setReorderingAllowed(false);
        txtSubtotal.setEnabled(false);
        txtTotalImpuestos.setEnabled(false);
        txtTotalPagar.setEnabled(false);
        txtCambio.setEnabled(false);
        txtCambio.setText("0.00");
    }

    private void actualizarFechaHora() {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Timer reloj = new Timer(1000, e -> {
            String fechaHoraAct = formato.format(new Date());
            txtFechaHora.setText(fechaHoraAct);
        });

        reloj.start();
        txtFechaHora.setEditable(false);
    }

    private void ComboProductos() {
        ManejoArchivosProductos leerProductos = new ManejoArchivosProductos();
        List<String[]> productos = leerProductos.leerProductos();

        cbProductos.removeAllItems();

        cbProductos.addItem("---SELECCIONAR---");
        List<String> nombresProductos = productos.stream().map(p -> p[1]).sorted(String::compareToIgnoreCase).toList();

        for (String nombre : nombresProductos) {
            cbProductos.addItem(nombre);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbProductos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaProductos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtFechaHora = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCambio = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        txtTotalImpuestos = new javax.swing.JTextField();
        txtTotalPagar = new javax.swing.JTextField();
        txtEfectivoRecibido = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnCalcularCambio = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        btnAggDescuento = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        btnAgregarProducto = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnGenerarBoleta = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnRegistrarCompra = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("VENTAS");
        setMinimumSize(new java.awt.Dimension(1120, 690));
        setPreferredSize(new java.awt.Dimension(1120, 690));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1120, 690));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        jLabel1.setText("VENTAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Fecha y hora:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, -1, -1));

        cbProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECIONAR---" }));
        cbProductos.setBorder(null);
        jPanel1.add(cbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 250, -1));

        tblListaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblListaProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 1070, 220));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Cantidad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 70, 20));

        txtFechaHora.setBackground(new java.awt.Color(0, 204, 204));
        txtFechaHora.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtFechaHora.setBorder(null);
        jPanel1.add(txtFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, 160, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(590, 220));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto SemiBold", 1, 14)); // NOI18N
        jLabel5.setText("Cambio:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, 20));

        jLabel6.setFont(new java.awt.Font("Roboto SemiBold", 1, 14)); // NOI18N
        jLabel6.setText("Subtotal: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 20));

        jLabel7.setFont(new java.awt.Font("Roboto SemiBold", 1, 14)); // NOI18N
        jLabel7.setText("Total de impuestos (IGV): ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 180, 20));

        jLabel8.setFont(new java.awt.Font("Roboto SemiBold", 1, 14)); // NOI18N
        jLabel8.setText("Total a pagar:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, 20));

        jLabel9.setFont(new java.awt.Font("Roboto SemiBold", 1, 14)); // NOI18N
        jLabel9.setText("Efectivo recibido:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 20));
        jPanel2.add(txtCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 110, -1));
        jPanel2.add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 160, -1));
        jPanel2.add(txtTotalImpuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 160, -1));
        jPanel2.add(txtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 160, -1));
        jPanel2.add(txtEfectivoRecibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 110, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 470, 10));

        btnCalcularCambio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcularCambio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularCambioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCalcularCambioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCalcularCambioMouseExited(evt);
            }
        });
        btnCalcularCambio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Roboto ExtraBold", 1, 18)); // NOI18N
        jLabel12.setText("Calcular cambio");
        btnCalcularCambio.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel2.add(btnCalcularCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 160, 50));

        jLabel19.setFont(new java.awt.Font("Roboto SemiBold", 1, 14)); // NOI18N
        jLabel19.setText("Agregar descuento: ");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 150, 20));
        jPanel2.add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 160, -1));

        btnAggDescuento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAggDescuentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAggDescuentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAggDescuentoMouseExited(evt);
            }
        });
        btnAggDescuento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Roboto SemiCondensed ExtraBold", 0, 12)); // NOI18N
        jLabel20.setText("Agregar descuento");
        btnAggDescuento.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel2.add(btnAggDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 120, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 530, 220));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Ingrese el producto a vender");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 200, -1));
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 90, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setText("Ingrese el nombre del cliente");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 200, -1));
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 250, -1));

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

        jLabel10.setFont(new java.awt.Font("Roboto ExtraBold", 1, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/interVentas_anadirProducto.png"))); // NOI18N
        jLabel10.setText("Agregar producto a la lista");
        btnAgregarProducto.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 280, 40));

        jPanel1.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 290, 40));

        btnGenerarBoleta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarBoleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarBoletaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerarBoletaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerarBoletaMouseExited(evt);
            }
        });
        btnGenerarBoleta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/interVentas_generarBoleta.png"))); // NOI18N
        btnGenerarBoleta.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 110));

        jLabel14.setFont(new java.awt.Font("Roboto SemiCondensed Black", 1, 18)); // NOI18N
        jLabel14.setText("Generar boleta");
        btnGenerarBoleta.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 30));

        jPanel1.add(btnGenerarBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 450, 160, 150));

        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        btnLimpiar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/interVentas_LimpiarTodo.png"))); // NOI18N
        btnLimpiar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 110));

        jLabel16.setFont(new java.awt.Font("Roboto SemiCondensed Black", 1, 18)); // NOI18N
        jLabel16.setText("Limpiar todo");
        btnLimpiar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 30));

        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 160, 150));

        btnRegistrarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarCompraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarCompraMouseExited(evt);
            }
        });
        btnRegistrarCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/interVentas_registrarCompra.png"))); // NOI18N
        btnRegistrarCompra.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 110));

        jLabel18.setFont(new java.awt.Font("Roboto SemiCondensed Black", 1, 18)); // NOI18N
        jLabel18.setText("Registrar compra");
        btnRegistrarCompra.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 30));

        jPanel1.add(btnRegistrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 160, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 1110, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarTxtFields() {
        DefaultTableModel modelo = (DefaultTableModel) tblListaProductos.getModel();
        double subtotal = 0, totalImpuestos = 0, descueto = 0;

        for (int i = 0; i < modelo.getRowCount(); i++) {
            double precioUnitario = Double.parseDouble(modelo.getValueAt(i, 2).toString());
            int cantidad = Integer.parseInt(modelo.getValueAt(i, 3).toString());
            double igv = Double.parseDouble(modelo.getValueAt(i, 4).toString());

            subtotal += precioUnitario * cantidad;
            totalImpuestos += igv;
        }

        txtSubtotal.setText(String.format("%.2f", subtotal));
        txtTotalImpuestos.setText(String.format("%.2f", totalImpuestos));
        txtDescuento.setText(String.format("%.2f", descueto));
        txtTotalPagar.setText(String.format("%.2f", subtotal + totalImpuestos));
    }

    private void btnAgregarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseClicked
        String nombreProducto = (String) cbProductos.getSelectedItem();
        String cantidadProductos = txtCantidad.getText().trim();

        if ("---SELECCIONAR---".equals(nombreProducto) || cantidadProductos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccione un producto o escriba una cantidad válida.");
            return;
        }

        int cantidad;
        try {
            cantidad = Integer.parseInt(cantidadProductos);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida.");
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) tblListaProductos.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            if (modelo.getValueAt(i, 1).equals(nombreProducto)) {
                JOptionPane.showMessageDialog(this, "El producto ya ha sido agregado.");
                return;
            }
        }

        ManejoArchivosProductos manejoArchivos = new ManejoArchivosProductos();
        List<String[]> productos = manejoArchivos.leerProductos();
        String precioUnitarioStr = "";
        int stockDisponible = 0;

        for (String[] producto : productos) {
            if (producto[1].equalsIgnoreCase(nombreProducto)) {
                precioUnitarioStr = producto[2];
                stockDisponible = Integer.parseInt(producto[3].trim());
                break;
            }
        }

        if (cantidad > stockDisponible) {
            JOptionPane.showMessageDialog(this, "No puede agregar más productos de los disponibles en stock.\nStock disponible: " + stockDisponible);
            return;
        }

        double precioUnitario = Double.parseDouble(precioUnitarioStr);
        double igv = Double.parseDouble(String.format("%.2f", precioUnitario * cantidad * 0.18));
        double total = Double.parseDouble(String.format("%.2f", (precioUnitario * cantidad) + igv));

        modelo.addRow(new Object[]{
            modelo.getRowCount() + 1, nombreProducto, precioUnitario, cantidad, igv, total, "Eliminar"
        });

        actualizarTxtFields();
        txtCantidad.setText("");
        cbProductos.setSelectedIndex(0);
    }//GEN-LAST:event_btnAgregarProductoMouseClicked

    private void btnCalcularCambioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularCambioMouseClicked
        try {
            double DoTotal = Double.parseDouble(txtTotalPagar.getText().trim());
            double DoDineroRecibido = Double.parseDouble(txtEfectivoRecibido.getText().trim());

            txtCambio.setText(String.format("%.2f", DoDineroRecibido - DoTotal));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Solo se aceptan números");
        }
    }//GEN-LAST:event_btnCalcularCambioMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        txtNombreCliente.setText("");
        txtCantidad.setText("");
        cbProductos.setSelectedIndex(0);

        txtCambio.setText("0.00");
        txtTotalPagar.setText("");
        txtTotalImpuestos.setText("");
        txtSubtotal.setText("");
        txtEfectivoRecibido.setText("");

        modelo.setRowCount(0);
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnRegistrarCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarCompraMouseClicked
        ManejoArchivosProductos manejoArchivos = new ManejoArchivosProductos();
        List<String[]> productos = manejoArchivos.leerProductos();
        DefaultTableModel modelo = (DefaultTableModel) tblListaProductos.getModel();
        List<String[]> productosActualizados = new ArrayList<>();
        List<String> productosEliminados = new ArrayList<>();
        List<String> productosVendidos = new ArrayList<>();

        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No hay productos en el carro de compras");
            return;
        }
        if (txtNombreCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ingrese el nombre del cliente");
            return;
        }

        for (String[] producto : productos) {
            String nombreProducto = producto[1];
            int stockDisponible = Integer.parseInt(producto[3].trim());

            boolean productoModificado = false;

            for (int i = 0; i < modelo.getRowCount(); i++) {
                String nombreVenta = modelo.getValueAt(i, 1).toString();
                int cantidadVendida = Integer.parseInt(modelo.getValueAt(i, 3).toString());

                if (nombreProducto.equalsIgnoreCase(nombreVenta)) {
                    int nuevoStock = stockDisponible - cantidadVendida;

                    if (nuevoStock <= 0) {
                        productosEliminados.add(nombreProducto);
                    } else {
                        producto[3] = String.valueOf(nuevoStock);
                        productosActualizados.add(producto);
                    }

                    productosVendidos.add(nombreProducto);
                    productoModificado = true;
                    break;
                }
            }

            if (!productoModificado) {
                productosActualizados.add(producto);
            }
        }

        manejoArchivos.editarRegistroProductos(productosActualizados);

        if (!productosVendidos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Productos vendidos: " + String.join(", ", productosVendidos));
        }

        if (!productosEliminados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Se acabó el stock de los siguientes productos: " + String.join(", ", productosEliminados));
        }

        modelo.setRowCount(0);
        txtSubtotal.setText("");
        txtTotalImpuestos.setText("");
        txtTotalPagar.setText("");
        txtDescuento.setText("0.00");
        txtEfectivoRecibido.setText("");
        txtCambio.setText("0.00");
        ComboProductos();
    }//GEN-LAST:event_btnRegistrarCompraMouseClicked

    private void btnGenerarBoletaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarBoletaMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tblListaProductos.getModel();
        List<String[]> productos = new ArrayList<>();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            String[] fila = new String[modelo.getColumnCount()];
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                fila[j] = modelo.getValueAt(i, j).toString();
            }
            productos.add(fila);
        }

        ManejoPDF manejoPDF = new ManejoPDF();
        manejoPDF.generarBoleta(txtNombreCliente.getText(), productos, txtSubtotal.getText(),
                txtTotalImpuestos.getText(), txtDescuento.getText(), txtTotalPagar.getText());
    }//GEN-LAST:event_btnGenerarBoletaMouseClicked

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setBackground(new Color(0, 255, 204));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnRegistrarCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarCompraMouseEntered
        btnRegistrarCompra.setBackground(new Color(0, 255, 204));
    }//GEN-LAST:event_btnRegistrarCompraMouseEntered

    private void btnRegistrarCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarCompraMouseExited
        btnRegistrarCompra.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_btnRegistrarCompraMouseExited

    private void btnGenerarBoletaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarBoletaMouseEntered
        btnGenerarBoleta.setBackground(new Color(0, 255, 204));
    }//GEN-LAST:event_btnGenerarBoletaMouseEntered

    private void btnGenerarBoletaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarBoletaMouseExited
        btnGenerarBoleta.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_btnGenerarBoletaMouseExited

    private void btnAgregarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseEntered
        btnAgregarProducto.setBackground(new Color(0, 255, 204));
    }//GEN-LAST:event_btnAgregarProductoMouseEntered

    private void btnAgregarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseExited
        btnAgregarProducto.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_btnAgregarProductoMouseExited

    private void btnCalcularCambioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularCambioMouseEntered
        btnCalcularCambio.setBackground(new Color(0, 255, 204));
    }//GEN-LAST:event_btnCalcularCambioMouseEntered

    private void btnCalcularCambioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularCambioMouseExited
        btnCalcularCambio.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_btnCalcularCambioMouseExited

    private void btnAggDescuentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggDescuentoMouseClicked
        try {
            double descuento = Double.parseDouble(txtDescuento.getText());
            double total = Double.parseDouble(txtTotalPagar.getText());

            if (descuento < 0) {
                JOptionPane.showMessageDialog(this, "El descuento no puede ser negativo");
                return;
            }

            if (descuento > total) {
                JOptionPane.showMessageDialog(this, "El descuento no puede ser mayor que el total a pagar.");
                return;
            }

            double nuevoTotal = total - descuento;
            txtTotalPagar.setText(String.format("%.2f", nuevoTotal));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un valor válido en el campo de descuento.");
        }
    }//GEN-LAST:event_btnAggDescuentoMouseClicked

    private void btnAggDescuentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggDescuentoMouseEntered
        btnAggDescuento.setBackground(new Color(0, 255, 204));
    }//GEN-LAST:event_btnAggDescuentoMouseEntered

    private void btnAggDescuentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggDescuentoMouseExited
        btnAggDescuento.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_btnAggDescuentoMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAggDescuento;
    private javax.swing.JPanel btnAgregarProducto;
    private javax.swing.JPanel btnCalcularCambio;
    private javax.swing.JPanel btnGenerarBoleta;
    private javax.swing.JPanel btnLimpiar;
    private javax.swing.JPanel btnRegistrarCompra;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbProductos;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblListaProductos;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtEfectivoRecibido;
    private javax.swing.JTextField txtFechaHora;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotalImpuestos;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
