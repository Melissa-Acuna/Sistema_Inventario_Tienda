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

/*Inventario: Administrar el arreglo Producto[] y realizar las operaciones.
Arreglo de 10 posiciones y variable cantidad.*/
public class Inventario {

    //Arreglo tipo objeto para crear referencias del objeto Producto.
    private Producto[] producto = new Producto[3];
    private int cantidad = 0;

    public void registrarProducto() {
        cantidad = 0;

        for (int i = 0; i < producto.length; i++) {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto: "));
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto: "));
            int cantidadDisponible = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad disponible de este producto: "));

            //guardar en el arreglo la informacion ingresada
            producto[i] = new Producto(codigo, nombre, precio, cantidadDisponible);

            //incrementa el contador de estudiantes y notas
            cantidad++;
        }//cierre ciclo for

    }//Fin metodo de registro

    public void mostrarProductos() {
        for (int i = 0; i < producto.length; i++) {
            if (producto[i] != null) {
                producto[i].infoProducto();
            }//fin if
        }//fin ciclo for
    }//Fin metodo de muestra

    public void buscarProducto() {
        int codigoBusqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto que desea buscar: "));
        //variable
        int indice = -1; //asume que el producto no existe en el arreglo

        for (int i = 0; i < producto.length; i++) {
            if (producto[i] != null && producto[i].getCodigo() == codigoBusqueda) {
                indice = i;
                break;
            }//fin if

        }//fin del ciclo for
        JOptionPane.showMessageDialog(null, "El producto " + codigoBusqueda + " esta en el indice: " + indice);

    }//Fin metodo de busqueda

    public void venderUnidades() {
        int codigoBusqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto que desea vender: "));

        for (int i = 0; i < producto.length; i++) {
            if (producto[i] != null && producto[i].getCodigo() == codigoBusqueda) {
                int venta = 0;
                venta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de unidades que desea vender del producto " + producto[i].getNombre() + " : "));
                if (venta <= producto[i].getCantidadDisponible()) {
                    producto[i].ventaProducto(venta);
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad de unidades solicitadas superan la cantidad en existencia disponible.");
                }//fin if venta
                break;
            }//fin if

        }//fin del ciclo for
    }//Fin metodo de venta

    public void reabastecerProducto() {
        int codigoBusqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto que desea reabastecer: "));
        for (int i = 0; i < producto.length; i++) {
            if (producto[i] != null && producto[i].getCodigo() == codigoBusqueda) {
                int nuevaCantidadDisponible = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de unidades que desea agregar al producto " + producto[i].getNombre() + " : "));
                producto[i].reabastecimiento(nuevaCantidadDisponible);
                break;
            }//fin if

        }//fin del ciclo for

    }//Fin metodo de reabastecimiento

    public void valorTotalInventario() {
        double totalInventario = 0.0;
        for (int i = 0; i < producto.length; i++) {
            if (producto[i] != null) {
                double totalXProducto = producto[i].valorTotal();
                totalInventario += totalXProducto;
            }//fin if
        }//fin ciclo for
        JOptionPane.showMessageDialog(null, "El valor total de todo el inventario disponible es de: " + totalInventario);
    }//Fin metodo de calculo totalitario
}//Fin de la clase Inventario.
