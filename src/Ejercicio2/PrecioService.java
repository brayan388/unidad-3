/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author bra
 */
public class PrecioService {
     public double calcularPrecioFinal(Producto producto) {

        double impuesto = producto.getPrecioBase() * 0.19;

        return producto.getPrecioBase() + impuesto;
    }
}
