/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author bra
 */
public class Main {
     public static void main(String[] args) {

        Figura figura1 = new Circulo(5);
        Figura figura2 = new Rectangulo(4, 6);

        figura1.calcularArea();
        figura2.calcularArea();
    }
}
