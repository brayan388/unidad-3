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

        CuentaBancaria cuenta1 = new CuentaBancaria(100);
        CuentaBancaria cuenta2 = new CuentaAhorros(100);

        cuenta1.retirar(20);
        cuenta2.retirar(20);

        System.out.println("Saldo cuenta normal: " + cuenta1.getSaldo());
        System.out.println("Saldo cuenta ahorros: " + cuenta2.getSaldo());
    }
}
