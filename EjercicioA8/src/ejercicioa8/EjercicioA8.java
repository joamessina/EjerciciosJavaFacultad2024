/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio A8: Recibos de Sueldo
 * 
 * Objetivo: Solicitar datos de varios empleados, calcular su sueldo bruto, 
 * aplicar un descuento del 13% y mostrar el sueldo neto.
 * 
 * Estructuras aplicadas: for, manejo de excepciones con try-catch.
 * 
 * @author joaxx
 */
public class EjercicioA8 {

    /**
     * Método principal donde se ejecuta el programa.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadEmpleados = 0;
        boolean entradaValida = false;

        // Estructura try-catch para validar la entrada de la cantidad de empleados
        do {
            try {
                System.out.print("Ingresa la cantidad de empleados: ");
                cantidadEmpleados = scanner.nextInt();
                
                if (cantidadEmpleados <= 0) {
                    throw new IllegalArgumentException("La cantidad de empleados debe ser mayor a 0.");
                }
                entradaValida = true;

            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido para la cantidad de empleados.");
                scanner.next(); // Limpiar el buffer
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (!entradaValida);

        // Recolectar información de cada empleado y calcular su sueldo
        for (int i = 1; i <= cantidadEmpleados; i++) {
            System.out.println("\nEmpleado " + i);
            String nombre = "";
            int antiguedad = 0, horasTrabajadas = 0;
            double valorHora = 0.0;

            try {
                System.out.print("Nombre: ");
                nombre = scanner.next();

                System.out.print("Antigüedad (en años): ");
                antiguedad = scanner.nextInt();

                System.out.print("Valor hora: ");
                valorHora = scanner.nextDouble();

                System.out.print("Cantidad de horas trabajadas en el mes: ");
                horasTrabajadas = scanner.nextInt();

                // Validación de datos de entrada
                if (antiguedad < 0 || valorHora <= 0 || horasTrabajadas <= 0) {
                    throw new IllegalArgumentException("Datos ingresados no válidos: antigüedad, valor hora y horas trabajadas deben ser positivos.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresaste un valor incorrecto. Por favor, reinicia el programa.");
                return; // Salir del programa si hay un error en la entrada
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return; // Salir del programa si hay una entrada inválida
            }

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
