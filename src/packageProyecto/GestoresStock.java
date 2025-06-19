package packageProyecto;

public class GestoresStock extends Usuario {

    public GestoresStock(String nombre, String apellido, String email, String user, String contrasena, int dni, int codigoTrabajador) {
        super(nombre, apellido, email, user, contrasena, dni, codigoTrabajador);
    }

    public void agregarCategoria(String nombreCategoria) {
         System.out.println("El usuario " + getUsuario() + " agregó la categoría: " + nombreCategoria);
    }

    public void registrarProducto(String nombre, String categoria, double precio, int stock) {
        String codigoProducto = crearCodigoProducto();
        Producto producto = new Producto(codigoProducto, categoria, nombre, precio, stock);
        ManejoArchivosProductos saver = new ManejoArchivosProductos();
        saver.guardarProducto(producto);

        System.out.println("Se registrado: " + producto.getNombre() + ", de la categoría: " + producto.getCategoria()
                + ", con el precio: " + producto.getPrecio() + ". Y estableció: " + producto.getStockActual() + " unidades.Por: " + this.getUsuario());
    }

    private String crearCodigoProducto() {
        return "P" + System.currentTimeMillis();
    }
}