package packageProyecto;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ManejoPDF {

    private final String direccionData = System.getProperty("user.dir") + "\\src\\resources\\data\\";
    private final String txtProductos = direccionData + "Productos.txt";

    public void exportarPDFproductos(String nombreArchivo) {
        ManejoArchivosProductos manejoArchivos = new ManejoArchivosProductos();
        List<String[]> productos = manejoArchivos.leerProductos();

        if (productos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay productos registrados para exportar.");
            return;
        }

        String directorioInicial = System.getProperty("user.dir") + "\\src\\resources\\pdfProductos";
        File carpetaPDF = new File(directorioInicial);
        if (!carpetaPDF.exists()) {
            carpetaPDF.mkdirs();
        }

        String rutaArchivo = directorioInicial + "\\" + nombreArchivo;
        if (!rutaArchivo.endsWith(".pdf")) {
            rutaArchivo += ".pdf";
        }

        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(rutaArchivo));
            document.open();

            Font fuente = FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.BLACK);

            for (String[] producto : productos) {
                String linea = String.join(",", producto);
                Paragraph parrafo = new Paragraph(linea, fuente);
                document.add(parrafo);
            }

            document.close();
            JOptionPane.showMessageDialog(null, "PDF generado correctamente en: " + rutaArchivo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar el PDF: " + e.getMessage());
        }
    }

    public void importarPDFproductos() {
        try {
            String rutaFCInicio = System.getProperty("user.dir") + "\\src\\resources\\pdfProductos";
            JFileChooser fileChooser = new JFileChooser(rutaFCInicio);

            fileChooser.setDialogTitle("Selecciona un archivo PDF");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos PDF", "pdf"));

            int seleccion = fileChooser.showOpenDialog(null);
            if (seleccion != JFileChooser.APPROVE_OPTION) {
                return;
            }

            File archivoSeleccionado = fileChooser.getSelectedFile();
            String rutaPDF = archivoSeleccionado.getAbsolutePath();

            PdfReader reader = new PdfReader(rutaPDF);
            List<String> lineasValidas = new ArrayList<>();
            int totalPaginas = reader.getNumberOfPages();

            for (int i = 1; i <= totalPaginas; i++) {
                String textoPagina = PdfTextExtractor.getTextFromPage(reader, i);
                String[] lineas = textoPagina.split("\r\n|\r|\n");

                for (String linea : lineas) {
                    linea = linea.trim();
                    if (!linea.isEmpty()) {
                        lineasValidas.add(linea);
                    }
                }
            }
            reader.close();

            if (lineasValidas.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El PDF no tiene el formato correcto");
                return;
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(txtProductos));
            for (String linea : lineasValidas) {
                bw.write(linea);
                bw.newLine();
            }
            bw.close();

            JOptionPane.showMessageDialog(null, "Los productos han sido importados. Refresca la tabla");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al importar el PDF: " + e.getMessage());
        }
    }

    public void generarBoleta(String nombreCliente, List<String[]> productos, String subtotal,
            String totalImpuestos, String descuento, String totalPagar) {
        if (productos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay productos en el carrito de compras");
            return;
        }

        if (nombreCliente.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del cliente");
            return;
        }

        String codigoBoleta = "B" + System.currentTimeMillis();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("EEEE dd 'de' MMMM 'del' "
                + "yyyy 'a las' HH:mm:ss", new Locale("es", "ES"));
        String fechaHora = formatoFecha.format(new Date());
        String nombreArchivo = "Boleta_" + codigoBoleta + ".pdf";

        String rutaFCInicio = System.getProperty("user.dir") + "\\src\\resources\\boletas";
        JFileChooser fileChooser = new JFileChooser(rutaFCInicio);
        fileChooser.setDialogTitle("Guardar Boleta");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos PDF", "pdf"));
        fileChooser.setSelectedFile(new File(rutaFCInicio + "\\" + nombreArchivo));

        int seleccion = fileChooser.showSaveDialog(null);
        if (seleccion != JFileChooser.APPROVE_OPTION) {
            return;
        }

        String rutaArchivo = fileChooser.getSelectedFile().getAbsolutePath();
        if (!rutaArchivo.endsWith(".pdf")) {
            rutaArchivo += ".pdf";
        }

        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(rutaArchivo));
            document.open();

            Font fuenteTitulo = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16);
            Font fuenteNombreNegocio = FontFactory.getFont(FontFactory.TIMES_BOLD, 16);
            Font fuenteTexto = FontFactory.getFont(FontFactory.HELVETICA, 12);
            Font fuenteTabla = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12);

            document.add(new Paragraph("BOLETA DE VENTA", fuenteTitulo));
            document.add(new Paragraph("FERRETERÍA TELLO", fuenteNombreNegocio));
            document.add(new Paragraph("RUC: 20552950691", fuenteTexto));
            document.add(new Paragraph("Código Boleta: " + codigoBoleta, fuenteTexto));
            document.add(new Paragraph("Cliente: " + nombreCliente, fuenteTexto));
            document.add(new Paragraph("Fecha: " + fechaHora, fuenteTexto)); // FECHA CORREGIDA
            document.add(new Paragraph("\n\n\n"));
            document.add(new Paragraph("INFORMACIÓN DE COMPRA", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));
            document.add(new Paragraph("\n"));

            PdfPTable tablaPDF = new PdfPTable(6);
            tablaPDF.setWidthPercentage(100);
            String[] columnas = {"N°", "Nombre", "P. Unitario", "Cantidad", "IGV", "Total"};

            for (String columna : columnas) {
                tablaPDF.addCell(new PdfPCell(new Phrase(columna, fuenteNombreNegocio)));
            }

            for (String[] producto : productos) {
                for (int j = 0; j < columnas.length; j++) {
                    tablaPDF.addCell(new PdfPCell(new Phrase(producto[j], fuenteTabla)));
                }
            }

            document.add(tablaPDF);
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("Subtotal: S/. " + subtotal, fuenteTexto));
            document.add(new Paragraph("Total Impuestos: S/. " + totalImpuestos, fuenteTexto));
            document.add(new Paragraph("Descuento aplicado: S/. " + descuento, fuenteTexto));
            document.add(new Paragraph("Total a Pagar: S/. " + totalPagar, fuenteTexto));
            document.add(new Paragraph("\n\n\n"));

            String rutaImagen = System.getProperty("user.dir") + "\\src\\resources\\images\\QR_YAPE.png";
            Image imagen = Image.getInstance(rutaImagen);
            imagen.scaleToFit(150, 250);
            imagen.setAlignment(Element.ALIGN_CENTER);
            document.add(imagen);

            document.close();
            JOptionPane.showMessageDialog(null, "Boleta creada en: " + rutaArchivo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar la boleta: " + e.getMessage());
        }
    }
}
