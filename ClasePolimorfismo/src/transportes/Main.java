/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author joaxx
 */
public class Main {
    public static void main(String[] args) {
        // Crear objetos usando polimorfismo
        Transporte avion = new Avion();  // Referencia de tipo Transporte, objeto de tipo Avion
        Transporte barco = new Barco();  // Referencia de tipo Transporte, objeto de tipo Barco

        // Hacer que los transportes viajen usando polimorfismo
        avion.viajar();  // Llamará al método viajar() de Avion
        barco.viajar();  // Llamará al método viajar() de Barco
    }
}
