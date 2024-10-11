/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensajes;


public class Desarrollador extends Empleado {
    private String lenguajeDeProgramacion;

    // Constructor de Desarrollador
    public Desarrollador(String nombre, double salario, String lenguajeDeProgramacion) {
        super(nombre, salario);  // Llama al constructor de Empleado
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println("Lenguaje de programación: " + lenguajeDeProgramacion);
    }
}
