/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2parte2;

/**
 *
 * @author bra
 */
public class Main {
    public static void main(String[] args) {

        Transferencia t = new Cajero();
        Retiro r = new Cajero();
        PagoFactura p = new PagoServicios();

        t.transferir();
        r.retirar();
        p.pagarFactura();
    }
}
