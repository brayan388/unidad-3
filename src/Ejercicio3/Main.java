/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author bra
 */
public class Main {

    public static void main(String[] args) {

        GestorMensajes gestor = new GestorMensajes();

        Mensajero email = new EmailMensajero();
        gestor.enviar(email, "Hola desde Email");

        System.out.println();

        Mensajero sms = new SMSMensajero();
        gestor.enviar(sms, "Hola desde SMS");

        System.out.println();

        Mensajero push = new PushMensajero();
        gestor.enviar(push, "Hola desde Push");
    }
}
