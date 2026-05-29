/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author bra
 */
public class EtiquetaProducto {
    public void generarEtiqueta(Producto producto) {

        System.out.println("===== ETIQUETA DEL PRODUCTO =====");
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio base: $" + producto.getPrecioBase());
    }
}
