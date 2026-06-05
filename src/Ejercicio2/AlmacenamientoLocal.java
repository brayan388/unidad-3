/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author bra
 */
public class AlmacenamientoLocal implements Almacenamiento{
     @Override
    public void guardarArchivo(String nombre) {
        System.out.println("Guardando archivo en almacenamiento local: " + nombre);
    }

    @Override
    public void recuperarArchivo(String nombre) {
        System.out.println("Recuperando archivo del almacenamiento local: " + nombre);
    }
}
