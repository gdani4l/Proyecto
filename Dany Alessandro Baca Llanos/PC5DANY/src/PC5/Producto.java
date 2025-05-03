/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PC5;

/**
 *
 * @author DANY
 */

public class Producto {
    private String nombre;
    private double precio;

    // Constructor solo con nombre
    public Producto(String nombre) {
        this.nombre = nombre;
        this.precio = 0.0;
    }

    // Constructor con nombre y precio
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getInfo() {
        return "Producto: " + nombre + " | Precio: S/ " + String.format("%.2f", precio);
    }
}

