/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo;

import javax.swing.JOptionPane;

/**
 *
 * @author Melissa Acuña C10057
 */

/*Producto: Representar un producto del inventario. Atributos, constructores, get y set.*/
public class Producto {

    //Atributos del objeto
    private int codigo;
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    //Constructores
    public Producto() {
    }

    public Producto(int codigo, String nombre, double precio, int cantidadDisponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    //Getters y Setters de cada atributo
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    public void ventaProducto (int venta) {
        cantidadDisponible = cantidadDisponible - venta;
        double compra = venta * precio;
        JOptionPane.showMessageDialog(null, "Usted ha vendido exitosamente "+venta+" unidades del producto "+nombre+"."
                + "\nEl total de su compra es de: "+compra);
    }
    public void reabastecimiento (int masCant) {
        cantidadDisponible = cantidadDisponible + masCant;
        JOptionPane.showMessageDialog(null,"Usted ha reabastecido este producto exitosamente.");
    }
    public double valorTotal () {
        double total = 0.0;
        return total = cantidadDisponible * precio;
    }

    public void infoProducto() {
        JOptionPane.showMessageDialog(null, "Producto: " + nombre
                + "\nCodigo: "+codigo
                + "\nPrecio: "+precio
                + "\nCantidad disponible: "+cantidadDisponible);
    }

}
