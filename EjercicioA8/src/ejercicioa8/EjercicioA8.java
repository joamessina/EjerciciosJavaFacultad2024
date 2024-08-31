/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa8;
import java.util.Scanner;

/**
 *
 * @author joaxx
 */
public class EjercicioA8 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de empleados: ");
        int cantidadEmpleados = scanner.nextInt();

        for (int i = 1; i <= cantidadEmpleados; i++) {
            System.out.println("\nEmpleado " + i);

            System.out.print("Nombre: ");
            String nombre = scanner.next();

            System.out.print("Antigüedad (en años): ");
            int antiguedad = scanner.nextInt();

            System.out.print("Valor hora: ");
            double valorHora = scanner.nextDouble();

            System.out.print("Cantidad de horas trabajadas en el mes: ");
            int horasTrabajadas = scanner.nextInt();

            // Calcular el sueldo bruto
            double sueldoBruto = (valorHora * horasTrabajadas) + (antiguedad * 51000);

            // Calcular el descuento del 13%
            double descuento = sueldoBruto * 0.13;

            // Calcular el sueldo neto
            double sueldoNeto = sueldoBruto - descuento;

            // Mostrar el recibo de sueldo
            System.out.println("\nRecibo de Sueldo:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Antigüedad: " + antiguedad + " años");
            System.out.println("Valor hora: $" + valorHora);
            System.out.println("Total a cobrar en bruto: $" + sueldoBruto);
            System.out.println("Total de descuentos: $" + descuento);
            System.out.println("Valor neto a cobrar: $" + sueldoNeto);
        }
    }
    
}
