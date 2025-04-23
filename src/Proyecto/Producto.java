
package Proyecto;

public class Producto {
    private String id,nombre;
    private int stock;
    private double precio;

    public Producto(String id, String nombre, int stock, double precio) {
        if (id == null || id.isEmpty()) throw new IllegalArgumentException("El ID no puede estar vacío.");
        if (nombre == null || nombre.isEmpty()) throw new IllegalArgumentException("El nombre no puede estar vacío.");
        if (stock < 0) throw new IllegalArgumentException("El stock no puede ser negativo.");
        if (precio < 0) throw new IllegalArgumentException("El precio no debe ser negativo");

        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) this.stock = stock;
        else throw new IllegalArgumentException("El stock no puede ser negativo.");
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) this.precio = precio;
        else throw new IllegalArgumentException("El precio no debe ser negativo.");
    }
}
