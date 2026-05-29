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

        GestorDocumento gestor = new GestorDocumento();

        Documento pdf = new ExportarPDF();
        gestor.exportarDocumento(pdf, "Documento en formato PDF");

        System.out.println();

        Documento word = new ExportarWord();
        gestor.exportarDocumento(word, "Documento en formato Word");

        System.out.println();

        Documento excel = new ExportarExcel();
        gestor.exportarDocumento(excel, "Documento en formato Excel");
    }
}
