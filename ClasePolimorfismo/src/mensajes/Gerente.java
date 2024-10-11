/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensajes;


public class Gerente extends Empleado {
    private int numeroEmpleadosSupervisados;

    // Constructor de Gerente
    public Gerente(String nombre, double salario, int numeroEmpleadosSupervisados) {
        super(nombre, salario);  // Llama al constructor de Empleado
        this.numeroEmpleadosSupervisados = numeroEmpleadosSupervisados;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println("Número de empleados supervisados: " + numeroEmpleadosSupervisados);
    }
}
