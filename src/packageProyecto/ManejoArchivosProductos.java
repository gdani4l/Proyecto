package packageProyecto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManejoArchivosProductos {

    private final String direccionData = System.getProperty("user.dir") + "\\src\\resources\\data\\";
    private final String txtProductos = direccionData + "Productos.txt";

    public void guardarProducto(Producto producto) {
        File archivo = new File(txtProductos);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            String linea = String.join(",",
                    producto.getCategoria(),
                    producto.getNombre(),
                    String.valueOf(producto.getPrecio()),
                    String.valueOf(producto.getStockActual()),
                    producto.getCodigoProducto());
            bw.write(linea);
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error al guardar producto: " + e.getMessage());
        }
    }

    public List<String[]> leerProductos() {
        List<String[]> productos = new ArrayList<>();
        File archivo = new File(txtProductos);

        if (!archivo.exists()) {
            return productos;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty() || linea.startsWith("#")) {
                    continue;
                }

                String[] partes = linea.split(",");
                if (partes.length == 5) {
                    productos.add(partes);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer productos: " + e.getMessage());
        }
        return productos;
    }
}
