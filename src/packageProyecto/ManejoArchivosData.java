package packageProyecto;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ManejoArchivosData {

    String rutaApp = System.getProperty("user.dir");
    String direccionData = rutaApp + "\\src\\resources\\data\\";
    String txtAdministradores = direccionData + "Administradores.txt";
    String txtCajeros = direccionData + "Cajeros.txt";
    String txtGestoresStock = direccionData + "GestoresStock.txt";

    public boolean existeUsuario(String usuario, String email, int dni) {
        return buscarDuplicado(txtCajeros, usuario, email, dni)
                || buscarDuplicado(txtGestoresStock, usuario, email, dni)
                || buscarDuplicado(txtAdministradores, usuario, email, dni);
    }

    private boolean buscarDuplicado(String rutaArchivo, String usuario, String email, int dni) {
        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            return false;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("#") || linea.trim().isEmpty()) {
                    continue; // Saltar encabezados o líneas vacías
                }
                String[] partes = linea.split("\\|"); // <---- CORREGIDO

                if (partes.length < 7) {
                    continue;
                }

                String nombre = partes[0].trim();
                String apellido = partes[1].trim();
                String emailTxt = partes[2].trim();   // Email
                String userTxt = partes[3].trim();    // Usuario
                String contrasena = partes[4].trim(); // Contraseña
                String dniTxt = partes[5].trim();     // DNI
                String codigo = partes[6].trim();

                if (dniTxt.equals(String.valueOf(dni)) || emailTxt.equalsIgnoreCase(email) || userTxt.equalsIgnoreCase(usuario)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public void guardarUsuario(Usuario usuario) {
        String rutaDestino = "";

        if (usuario instanceof Cajero) {
            rutaDestino = txtCajeros;
        } else if (usuario instanceof GestoresStock) {
            rutaDestino = txtGestoresStock;
        } else {
            System.out.println("No se puede registrar un administrador desde el formulario.");
            return;
        }

        try {
            File file = new File(rutaDestino);
            file.getParentFile().mkdirs(); // crea la carpeta si no existe
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            String linea = usuario.getNombre() + "|" + usuario.getApellido() + "|" + usuario.getEmail() + "|"
                    + usuario.getUsuario() + "|" + usuario.getContrasena() + "|"
                    + usuario.getDni() + "|" + usuario.getCodigo();
            bw.write(linea);
            bw.newLine();

            bw.close();
            fw.close();

            System.out.println("Usuario guardado exitosamente en: " + rutaDestino);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el usuario: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public int generarCodigo() {
        int maxCodigo = 0;
        maxCodigo = Math.max(maxCodigo, obtenerUltimoCodigo(txtCajeros));
        maxCodigo = Math.max(maxCodigo, obtenerUltimoCodigo(txtGestoresStock));
        return maxCodigo + 1;
    }

    private int obtenerUltimoCodigo(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            return 0;
        }

        int ultimoCodigo = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("\\|");
                if (partes.length > 0) {
                    try {
                        int codigo = Integer.parseInt(partes[6]);
                        if (codigo > ultimoCodigo) {
                            ultimoCodigo = codigo;
                        }
                    } catch (NumberFormatException e) {
                        // ignorar líneas mal formateadas
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ultimoCodigo;
    }
}
