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

        Usuario usuario = new Usuario(
                "Esteban",
                "12345",
                "esteban@gmail.com"
        );

        AutenticacionService auth = new AutenticacionService();

        boolean acceso = auth.autenticar(usuario, "12345");

        System.out.println("Autenticación correcta: " + acceso);

        ValidacionService validacion = new ValidacionService();

        boolean correoValido = validacion.validarCorreo(usuario);

        System.out.println("Correo válido: " + correoValido);
    }
}
