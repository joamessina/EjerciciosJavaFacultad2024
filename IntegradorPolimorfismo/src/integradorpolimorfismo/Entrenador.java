/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integradorpolimorfismo;

/**
 *
 * @author joaxx
 * Clase base para representar un entrenador en el gimnasio.
 * Contiene los atributos comunes y algunos métodos.
 */
public abstract class Entrenador {
    protected int numeroLegajo;  // Número único de legajo para el entrenador
    protected String nombre;
    protected String apellido;
    protected int anioIngreso;

    public Entrenador(int numeroLegajo, String nombre, String apellido, int anioIngreso) {
        this.numeroLegajo = numeroLegajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    // Método abstracto que las subclases deben implementar para calcular su sueldo
    public abstract double calcularSueldo();

    // Mostrar la información básica del entrenador
    public void mostrarInformacion() {
        System.out.println(nombre + " " + apellido + " - Legajo: " + numeroLegajo);
    }
}