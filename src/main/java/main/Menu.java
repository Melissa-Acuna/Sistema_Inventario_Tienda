/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;
import modulo.Inventario;

/**
 *
 * @author Melissa Acuña C10057
 */

/*Menu: Mostrar las opciones, solicitar datos y llamar los métodos de Inventario.
Menú con do while y switch.*/
public class Menu {

    private int opciones;
    private Inventario inventario = new Inventario();

    public void menuPrincipal() {
        do {
            opciones = Integer.parseInt(JOptionPane.showInputDialog("*****TIENDA ECONOMICA*****"
                    + "\nCONTROL DE INVENTARIO:"
                    + "\n1. Registrar Producto."
                    + "\n2. Mostrar Inventario."
                    + "\n3. Buscar Producto."
                    + "\n4. Venta Unitaria."
                    + "\n5. Reabastecer Producto."
                    + "\n6. Calcular Valor Total del Inventario."
                    + "\n0. Salir"));

            switch (opciones) {
                case 1:
                    inventario.registrarProducto();
                    break;
                case 2:
                    inventario.mostrarProductos();
                    break;
                case 3:
                    inventario.buscarProducto();
                    break;
                case 4:
                    inventario.venderUnidades();
                    break;
                case 5:
                    inventario.reabastecerProducto();
                    break;
                case 6:
                    inventario.valorTotalInventario();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema. Tenga lindo día.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no disponible.");
            }//Fin switch
        } while (opciones != 0);
    }//Fin metodo menuPrincipal
}//Fin clase Menu
