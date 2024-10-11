/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensajes;


public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Gerente
        Gerente gerente = new Gerente("Carlos", 50000, 10);
        System.out.println("Información del Gerente:");
        gerente.mostrarInformacion();

        // Crear un objeto de la clase Desarrollador
        Desarrollador desarrollador = new Desarrollador("Ana", 40000, "Java");
        System.out.println("\nInformación del Desarrollador:");
        desarrollador.mostrarInformacion();
    }
}
