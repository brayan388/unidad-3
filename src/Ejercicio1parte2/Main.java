/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1parte2;

/**
 *
 * @author bra
 */
public class Main {
    public static void main(String[] args) {

        Reparacion tecnico = new Tecnico();
        Limpieza limpieza = new PersonalLimpieza();

        tecnico.reparar();
        limpieza.limpiar();
    }
}
