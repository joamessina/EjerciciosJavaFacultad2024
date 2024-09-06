/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa9;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio A9: Dibujar un triángulo
 * 
 * Objetivo: Solicitar al usuario la altura del triángulo y dibujarlo con asteriscos,
 * donde el número de filas corresponde a la altura y cada fila tiene un número creciente de asteriscos.
 * 
 * Estructuras aplicadas: for, manejo de excepciones con try-catch.
 * 
 * @author joaxx
 */
public class EjercicioA9 {

    /**
     * Método principal donde se ejecuta el programa.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura = 0;
        boolean entradaValida = false;

        // Estructura try-catch para validar la entrada de la altura del triángulo
        do {
            try {
                System.out.print("Ingresa la altura del triángulo: ");
                altura = scanner.nextInt();

                if (altura <= 0) {
                    throw new IllegalArgumentException("La altura debe ser un número positivo mayor que 0.");
                }
                entradaValida = true; // Entrada válida si no hay excepciones

            } catch (InputMismatchException e) {
                // Manejar error de formato en la entrada
                System.out.println("Error: Ingrese un número entero válido.");
                scanner.next(); // Limpiar el buffer en caso de error
            } catch (IllegalArgumentException e) {
                // Manejar error si la altura ingresada es inválida
                System.out.println(e.getMessage());
            }
        } while (!entradaValida);

        // Dibujar el triángulo con la altura ingresada
        for (int i = 1; i <= altura; i++) {
            // Imprimir las estrellas en cada fila
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}
