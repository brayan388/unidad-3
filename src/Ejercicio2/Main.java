/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author bra
 */
public class Main {
    public static void main(String[] args) {

        Almacenamiento almacenamiento = new AlmacenamientoNube();
        // también se puede usar: new AlmacenamientoLocal();

        GestorArchivos gestor = new GestorArchivos(almacenamiento);

        gestor.guardar("documento.txt");
        gestor.recuperar("documento.txt");
    }
}
