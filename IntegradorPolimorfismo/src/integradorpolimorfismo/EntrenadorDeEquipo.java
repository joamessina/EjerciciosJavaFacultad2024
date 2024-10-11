/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integradorpolimorfismo;

/**
 *
 * @author joaxx
 * Clase que representa a un Entrenador de Equipo en el gimnasio.
 * Incluye el sueldo fijo, que depende de los años de experiencia.
 */
public class EntrenadorDeEquipo extends Entrenador {
    private double salarioBase;

    // Constructor que inicializa un entrenador de equipo
    public EntrenadorDeEquipo(int numeroLegajo, String nombre, String apellido, int anioIngreso, double salarioBase) {
        super(numeroLegajo, nombre, apellido, anioIngreso);  // Invocamos al constructor de Entrenador
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSueldo() {
        // Obtenemos los años de experiencia
        int experiencia = 2024 - anioIngreso;
        double bono = 0;

        // Asignamos un bono según los años de experiencia
        if (experiencia >= 3 && experiencia < 6) {
            bono = 0.04;  // 4% de aumento
        } else if (experiencia >= 6) {
            bono = 0.12;  // 12% de aumento
        }

        // Retornamos el salario con el bono añadido
        return salarioBase * (1 + bono);
    }
}
