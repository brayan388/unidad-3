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

        Rectangulo rectangulo = new Rectangulo(10, 5);
        Triangulo triangulo = new Triangulo(8, 4);

        rectangulo.mostrarTipo();
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

        System.out.println();

        triangulo.mostrarTipo();
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}
