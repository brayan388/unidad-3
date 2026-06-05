/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author bra
 */
public class ProcesadorPago {
   private MetodoPago metodoPago;

    public ProcesadorPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void procesar(double monto) {
        metodoPago.pagar(monto);
    } 
}
