/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3parte2;

/**
 *
 * @author bra
 */
public class Main {
     public static void main(String[] args) {

        Conducible moto = new Moto();
        Conducible camion = new Camion();
        Cargable carga = new Camion();

        moto.conducir();
        camion.conducir();
        carga.cargarMercancia();
    }
}
