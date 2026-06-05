/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author bra
 */
public class AlmacenamientoNube implements Almacenamiento{
    @Override
    public void guardarArchivo(String nombre) {
        System.out.println("Guardando archivo en la nube: " + nombre);
    }

    @Override
    public void recuperarArchivo(String nombre) {
        System.out.println("Recuperando archivo de la nube: " + nombre);
    }
}
