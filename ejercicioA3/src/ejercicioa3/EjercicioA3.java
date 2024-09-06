/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio A3: Números primos
 * 
 * Objetivo: Mostrar por pantalla todos los números primos hasta el número que ingrese el usuario.
 * 
 * Estructuras aplicadas: for, manejo de excepciones con try-catch.
 * 
 * @author joaxx
 */
public class EjercicioA3 {

    /**
     * Método principal donde se ejecuta el programa.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;

        // Estructura repetitiva para validar la entrada del número
        do {
            try {
                // Solicitar al usuario que ingrese un número
                System.out.print("Ingresa un número: ");
                numero = scanner.nextInt();
                if (numero < 2) {
                    throw new IllegalArgumentException("ERROR. El número debe ser mayor o igual a 2.");
                }
                entradaValida = true;
            } catch (InputMismatchException e) {
                // Capturar error de formato en la entrada
                System.out.println("Error: Ingrese un número válido.");
                scanner.next(); // Limpiar el buffer
            } catch (IllegalArgumentException e) {
                // Manejar el caso de números menores a 2
                System.out.println(e.getMessage());
            }
        } while (!entradaValida);

        // Mostrar números primos hasta el número ingresado
        System.out.println("Números primos hasta " + numero + ":");
        for (int i = 2; i <= numero; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    /**
     * Método para determinar si un número es primo.
     * Un número es primo si solo es divisible entre 1 y él mismo.
     * 
     * @param n Número a evaluar
     * @return true si es primo, false si no lo es.
     */
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
