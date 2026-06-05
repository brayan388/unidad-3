/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author bra
 */
public class CuentaAhorros extends CuentaBancaria{
     public CuentaAhorros(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void retirar(double monto) {
        // Ejemplo: comisión pequeña pero sin romper comportamiento
        double comision = 1.0;
        if (monto + comision <= saldo) {
            saldo -= (monto + comision);
        } else {
            System.out.println("Fondos insuficientes en cuenta de ahorros");
        }
    }
}
