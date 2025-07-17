/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author aliso
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pedi toda la informacion necesaria
        String nombreSuper = JOptionPane.showInputDialog("por favor digame el nombre del supermercado");
        String codigoSuper = JOptionPane.showInputDialog("por favor digame el codigo del supermercado");
        String nombreEmpleado = JOptionPane.showInputDialog("por favor digame el nombre del empleado");
        String cedulaEmpleado = JOptionPane.showInputDialog("por favor digame la cedula del empleado");
        int cantidadProductos = JOptionPane.showInputDialog("por favor digame la cantidad de productos");
    }

}
