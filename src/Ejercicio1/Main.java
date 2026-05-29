/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author bra
 */
public class Main {
     public static void main(String[] args) {

        Tienda tienda = new Tienda();

        Descuento descuento1 = new DescuentoPorcentaje();

        tienda.mostrarPrecioFinal(descuento1, 100000);

        System.out.println();

        Descuento descuento2 = new DescuentoFijo();

        tienda.mostrarPrecioFinal(descuento2, 100000);
    }
}
