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

        ServicioAutenticacion local = new AutenticacionLocal();
        GestorAutenticacion gestor = new GestorAutenticacion(local);
        gestor.autenticar("Brayan");

        ServicioAutenticacion oauth = new AutenticacionOAuth();
        gestor = new GestorAutenticacion(oauth);
        gestor.autenticar("Brayan");
    }
}
