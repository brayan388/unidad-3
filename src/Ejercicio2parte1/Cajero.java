/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2parte1;

/**
 *
 * @author bra
 */
public class Cajero implements OperacionBancaria{
    @Override
    public void transferir() {
        System.out.println("Transfiriendo dinero...");
    }

    @Override
    public void retirar() {
        System.out.println("Retirando dinero...");
    }

    @Override
    public void pagarFactura() {
        // ❌ Este cajero no paga facturas
    }
}
