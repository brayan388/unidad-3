/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author bra
 */
public class AutenticacionOAuth implements ServicioAutenticacion{
     @Override
    public void autenticar(String usuario) {
        System.out.println("Autenticando con OAuth: " + usuario);
    }
}
