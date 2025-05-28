package packageProyecto;

public class Producto {

    private String codigoProducto, categoria, nombre;
    private double precio;
    private int stockActual;

    public Producto(String codigoProducto, String categoria, String nombre, double precio, int stockActual) {
        this.codigoProducto = codigoProducto;
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
        this.stockActual = stockActual;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }
}
