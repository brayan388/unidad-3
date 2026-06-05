/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2parte2;

/**
 *
 * @author bra
 */
public class Cajero implements Transferencia, Retiro{
     @Override
    public void transferir() {
        System.out.println("Transfiriendo dinero...");
    }

    @Override
    public void retirar() {
        System.out.println("Retirando dinero...");
    }
}
