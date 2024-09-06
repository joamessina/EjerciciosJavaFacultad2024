/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio A6: Años Bisiestos
 * 
 * Objetivo: Determinar y mostrar todos los años bisiestos entre un rango de años
 * ingresado por el usuario.
 * 
 * Estructuras aplicadas: for, manejo de excepciones con try-catch.
 * 
 * @author joaxx
 */
public class EjercicioA6 {

    /**
     * Método principal donde se ejecuta el programa.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int añoInicio = 0;
        int añoFin = 0;
        boolean entradaValida = false;

        // Estructura try-catch para validar la entrada del rango de años
        do {
            try {
                // Solicitar al usuario que ingrese el año de inicio
                System.out.print("Ingresa el año de inicio: ");
                añoInicio = scanner.nextInt();

                // Solicitar al usuario que ingrese el año de fin
                System.out.print("Ingresa el año de fin: ");
                añoFin = scanner.nextInt();

                // Validar que el año de inicio sea menor que el año de fin
                if (añoInicio > añoFin) {
                    throw new IllegalArgumentException("El año de inicio debe ser menor o igual al año de fin.");
                }

                entradaValida = true; // La entrada es válida si no se lanza ninguna excepción

            } catch (InputMismatchException e) {
                // Manejar error de formato en la entrada
                System.out.println("Error: Ingresa un año válido.");
                scanner.next(); // Limpiar el buffer de entrada en caso de error
            } catch (IllegalArgumentException e) {
                // Manejar error de validación
                System.out.println(e.getMessage());
            }
        } while (!entradaValida);

        System.out.println("Años bisiestos entre " + añoInicio + " y " + añoFin + ":");

        // Buscar y mostrar todos los años bisiestos en el rango
        for (int año = añoInicio; año <= añoFin; año++) {
            if (esBisiesto(año)) {
                System.out.println(año);
            }
        }
    }

    /**
     * Método para determinar si un año es bisiesto.
     * Un año es bisiesto si es divisible entre 4 pero no entre 100, a menos que también sea divisible entre 400.
     * 
     * @param año El año a evaluar
     * @return true si es bisiesto, false si no lo es
     */
    public static boolean esBisiesto(int año) {
        // Un año es bisiesto si es múltiplo de 4, pero no de 100, salvo si es múltiplo de 400
        if (año % 4 == 0) {
            if (año % 100 == 0) {
                return año % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}
