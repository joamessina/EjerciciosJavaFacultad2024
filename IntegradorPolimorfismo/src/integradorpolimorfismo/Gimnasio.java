/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integradorpolimorfismo;

/**
 *
 * @author joaxx
 */


import java.util.ArrayList;
import java.util.List;

/**
 * Clase para gestionar un gimnasio y sus entrenadores.
 */
public class Gimnasio {
    private String nombreGimnasio;  // Nombre del gimnasio
    private List<Entrenador> listaEntrenadores;  // Lista que contiene los entrenadores

    // Constructor para inicializar el gimnasio con un nombre
    public Gimnasio(String nombre) {
        this.nombreGimnasio = nombre;
        this.listaEntrenadores = new ArrayList<>();  // Inicializamos la lista vacía
    }

    // Método para agregar entrenadores al gimnasio
    public void agregarEntrenador(Entrenador nuevoEntrenador) {
        listaEntrenadores.add(nuevoEntrenador);
        System.out.println("Entrenador agregado: " + nuevoEntrenador.nombre + " " + nuevoEntrenador.apellido);
    }

    // Mostrar los sueldos de todos los entrenadores
    public void mostrarSueldos() {
        System.out.println("Sueldo de los entrenadores del gimnasio '" + nombreGimnasio + "':");
        for (Entrenador entrenador : listaEntrenadores) {
            entrenador.mostrarInformacion();
            System.out.println("Sueldo calculado: $" + entrenador.calcularSueldo());
            System.out.println("---------------------------------");
        }
    }

    // Encontrar al personal trainer con más clientes
    public PersonalTrainer entrenadorConMasClientes() {
        PersonalTrainer entrenadorTop = null;

        for (Entrenador entrenador : listaEntrenadores) {
            if (entrenador instanceof PersonalTrainer) {
                PersonalTrainer pt = (PersonalTrainer) entrenador;
                if (entrenadorTop == null || pt.obtenerClientes() > entrenadorTop.obtenerClientes()) {
                    entrenadorTop = pt;
                }
            }
        }

        return entrenadorTop;
    }
}
