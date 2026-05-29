/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author bra
 */
public abstract class Figura {
    // Método abstracto
    public abstract double calcularArea();

    // Método concreto
    public void mostrarTipo() {
        System.out.println("Esta es una figura geométrica.");
    }
}
