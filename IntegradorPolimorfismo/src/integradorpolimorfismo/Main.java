/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integradorpolimorfismo;

/**
 *
 * @author joaxx
 * Clase principal para probar el gimnasio y sus entrenadores.
 */
public class Main {
    public static void main(String[] args) {
        // Creamos un gimnasio
        Gimnasio miGimnasio = new Gimnasio("Club Fitness");

        // Agregamos algunos entrenadores
        miGimnasio.agregarEntrenador(new PersonalTrainer(101, "Juan", "Perez", 2015, 10, 300, 3500));
        miGimnasio.agregarEntrenador(new PersonalTrainer(102, "Maria", "Lopez", 2018, 15, 400, 4000));
        miGimnasio.agregarEntrenador(new EntrenadorDeEquipo(201, "Carlos", "Rodriguez", 2010, 5000));
        miGimnasio.agregarEntrenador(new EntrenadorDeEquipo(202, "Ana", "Garcia", 2017, 4500));

        // Mostramos los sueldos de todos los entrenadores
        miGimnasio.mostrarSueldos();

        // Buscamos al personal trainer con más clientes
        PersonalTrainer mejorTrainer = miGimnasio.entrenadorConMasClientes();
        if (mejorTrainer != null) {
            System.out.println("El personal trainer con más clientes es: " + mejorTrainer.nombre + " " + mejorTrainer.apellido);
        } else {
            System.out.println("No hay personal trainers en el gimnasio.");
        }
    }
}
