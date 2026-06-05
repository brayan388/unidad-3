/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3parte1;

/**
 *
 * @author bra
 */
public class Moto implements Vehiculo{
     @Override
    public void conducir() {
        System.out.println("La moto se está conduciendo");
    }

    @Override
    public void cargarMercancia() {
        // ❌ una moto no carga mercancía
    }
}
