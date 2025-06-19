package packageProyecto;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ManejoArchivosProductos {

    private final String direccionData = System.getProperty("user.dir") + "\\src\\resources\\data\\";
    private final String txtProductos = direccionData + "Productos.txt";

    public boolean buscarNombreDuplicado(String nombre) {
        File archivo = new File(txtProductos);

        if (!archivo.exists()) {
            return false;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty() || linea.startsWith("#")) {
                    continue;
                }

                String[] partes = linea.split(",");
                if (partes.length >= 2) {
                    String nombreExistente = partes[1].trim();
                    if (nombreExistente.equalsIgnoreCase(nombre.trim())) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al buscar nombre de producto: " + e.getMessage());
        }

        return false;
    }

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

    public Set<String> obtenerCategoriasUnicas() {
        Set<String> categorias = new HashSet<>();
        File archivo = new File(txtProductos);

        if (!archivo.exists()) {
            return categorias;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    continue;
                }
                String[] partes = linea.split(",");
                if (partes.length >= 1) {
                    String categoria = partes[0].trim().toLowerCase();
                    categorias.add(categoria);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer las categorías: " + e.getMessage());
        }

        return categorias;
    }

    public void editarRegistroProductos(List<String[]> productos) {
        File archivo = new File(txtProductos);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false))) {
            for (String[] p : productos) {
                String linea = String.join(",", p);
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al editar productos: " + e.getMessage());
        }
    }
}
