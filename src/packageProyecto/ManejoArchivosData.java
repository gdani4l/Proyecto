package packageProyecto;

import java.io.*;
import javax.swing.JOptionPane;

public class ManejoArchivosData {

    private final String direccionData = System.getProperty("user.dir") + "\\src\\resources\\data\\";
    private final String txtAdministradores = direccionData + "Administradores.txt";
    private final String txtCajeros = direccionData + "Cajeros.txt";
    private final String txtGestoresStock = direccionData + "GestoresStock.txt";

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
                    continue;
                }

                String[] partes = linea.split("\\|");
                if (partes.length < 7) {
                    continue;
                }

                if (partes[5].trim().equals(String.valueOf(dni))
                        || partes[2].trim().equalsIgnoreCase(email)
                        || partes[3].trim().equalsIgnoreCase(usuario)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void guardarUsuario(Usuario usuario) {
        String rutaDestino = switch (usuario) {
            case Cajero c ->
                txtCajeros;
            case GestoresStock g ->
                txtGestoresStock;
            default -> {
                yield null;
            }
        };

        if (rutaDestino == null) {
            return;
        }

        File archivo = new File(rutaDestino);
        archivo.getParentFile().mkdirs();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            String linea = String.join("|",
                    usuario.getNombre(), usuario.getApellido(), usuario.getEmail(),
                    usuario.getUsuario(), usuario.getContrasena(),
                    String.valueOf(usuario.getDni()), String.valueOf(usuario.getCodigo()));
            bw.write(linea);
            bw.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el usuario: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public int generarCodigo() {
        return Math.max(obtenerUltimoCodigo(txtCajeros), obtenerUltimoCodigo(txtGestoresStock)) + 1;
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
                if (partes.length >= 7) {
                    try {
                        int codigo = Integer.parseInt(partes[6]);
                        if (codigo > ultimoCodigo) {
                            ultimoCodigo = codigo;
                        }
                    } catch (NumberFormatException ignored) {
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ultimoCodigo;
    }

    private String usarArchivoPorRol(String rol) {
        return switch (rol) {
            case "CAJERO" ->
                txtCajeros;
            case "GESTOR DE STOCK" ->
                txtGestoresStock;
            case "ADMINISTRADOR" ->
                txtAdministradores;
            default ->
                null;
        };
    }

    public boolean validarCredenciales(String usuario, String contrasena, String rol) {
        String archivo = usarArchivoPorRol(rol);
        if (archivo == null) {
            return false;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("#") || linea.trim().isEmpty()) {
                    continue;
                }

                String[] datos = linea.split("\\|");
                if (datos.length >= 5
                        && usuario.equals(datos[3].trim())
                        && contrasena.equals(datos[4].trim())) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Usuario obtenerUsuario(String usuario, String contrasena, String rol) {
        String archivo = usarArchivoPorRol(rol);
        if (archivo == null) {
            return null;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("#") || linea.trim().isEmpty()) {
                    continue;
                }

                String[] datos = linea.split("\\|");
                if (datos.length < 7) {
                    continue;
                }

                if (usuario.equals(datos[3].trim()) && contrasena.equals(datos[4].trim())) {
                    String nombre = datos[0].trim();
                    String apellido = datos[1].trim();
                    String email = datos[2].trim();
                    int dni = Integer.parseInt(datos[5].trim());
                    int codigo = Integer.parseInt(datos[6].trim());

                    return switch (rol) {
                        case "CAJERO" ->
                            new Cajero(nombre, apellido, email, usuario, contrasena, dni, codigo);
                        case "GESTOR DE STOCK" ->
                            new GestoresStock(nombre, apellido, email, usuario, contrasena, dni, codigo);
                        case "ADMINISTRADOR" ->
                            new Administrador(nombre, apellido, email, usuario, contrasena, dni, codigo);
                        default ->
                            null;
                    };
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
