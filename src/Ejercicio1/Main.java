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

        Libro libro = new Libro(
                "Programación Orientada a Objetos",
                "Juan Pérez",
                250
        );

        ReporteLibro reporte = new ReporteLibro();
        reporte.generarReporte(libro);

        LibroRepositorio repositorio = new LibroRepositorio();
        repositorio.guardarLibro(libro);
    }
}
