/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author bra
 */
public class PushMensajero extends Mensajero{
     @Override
    public void enviarMensaje(String mensaje) {

        System.out.println("Enviando notificación Push:");
        System.out.println(mensaje);
    }
}
