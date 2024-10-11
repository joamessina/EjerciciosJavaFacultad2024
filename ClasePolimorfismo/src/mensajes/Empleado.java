/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensajes;


public abstract class Empleado {
    protected String nombre;
    protected double salario;

    // Constructor de Empleado
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método abstracto para mostrar la información del empleado
    public abstract void mostrarInformacion();
}
