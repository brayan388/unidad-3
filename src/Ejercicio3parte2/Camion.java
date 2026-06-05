/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3parte2;

/**
 *
 * @author bra
 */
public class Camion implements Conducible, Cargable{
      @Override
    public void conducir() {
        System.out.println("El camión se está conduciendo");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("El camión está cargando mercancía");
    }
}
