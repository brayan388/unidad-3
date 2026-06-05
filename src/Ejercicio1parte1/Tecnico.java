/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1parte1;

/**
 *
 * @author bra
 */
public class Tecnico implements Mantenimiento{
        @Override
    public void reparar() {
        System.out.println("Reparando...");
    }

    @Override
    public void limpiar() {
        // método que no usa ❌
    }

}
