/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author bra
 */
public class DescuentoPorcentaje extends Descuento{
     @Override
    public double aplicarDescuento(double precio) {

        return precio - (precio * 0.10);
    }
}
