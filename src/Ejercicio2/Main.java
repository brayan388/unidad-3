/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author bra
 */
public class Main {
    public static void main(String[] args) {

        Producto producto = new Producto(
                "Laptop",
                2500000
        );

        EtiquetaProducto etiqueta = new EtiquetaProducto();
        etiqueta.generarEtiqueta(producto);

        PrecioService precioService = new PrecioService();

        double precioFinal = precioService.calcularPrecioFinal(producto);

        System.out.println("Precio final con impuesto: $" + precioFinal);
    }
}
