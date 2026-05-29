/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author bra
 */
public class Tienda {
    public void mostrarPrecioFinal(Descuento descuento, double precio) {

        double precioFinal = descuento.aplicarDescuento(precio);

        System.out.println("Precio original: $" + precio);
        System.out.println("Precio con descuento: $" + precioFinal);
    }
}
