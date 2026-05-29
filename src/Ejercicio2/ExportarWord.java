/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author bra
 */
public class ExportarWord extends Documento{
    @Override
    public void exportar(String contenido) {

        System.out.println("Exportando documento a Word...");
        System.out.println(contenido);
    }
}
