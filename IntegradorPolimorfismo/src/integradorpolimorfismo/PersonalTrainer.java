/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integradorpolimorfismo;

/**
 *
 * @author joaxx
 * Clase para representar a los Personal Trainers del gimnasio.
 * Hereda de la clase Entrenador.
 */
public class PersonalTrainer extends Entrenador {
    private int cantidadClientes;  // Número de clientes que entrena
    private double precioPorCliente;
    private double sueldoMinimo;

    // Constructor para inicializar un personal trainer
    public PersonalTrainer(int numeroLegajo, String nombre, String apellido, int anioIngreso,
                           int cantidadClientes, double precioPorCliente, double sueldoMinimo) {
        super(numeroLegajo, nombre, apellido, anioIngreso);  // Llamamos al constructor de la superclase
        this.cantidadClientes = cantidadClientes;
        this.precioPorCliente = precioPorCliente;
        this.sueldoMinimo = sueldoMinimo;
    }

    @Override
    public double calcularSueldo() {
        // Calculamos el sueldo basado en la cantidad de clientes y el precio por cada uno
        double sueldoCalculado = cantidadClientes * precioPorCliente;
        // Si el sueldo es menor al mínimo, devolvemos el mínimo
        return Math.max(sueldoCalculado, sueldoMinimo);
    }

    // Método para obtener el número de clientes
    public int obtenerClientes() {
        return cantidadClientes;
    }
}
