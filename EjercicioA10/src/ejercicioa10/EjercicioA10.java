/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio A10: Dibujar una pirámide
 * 
 * Objetivo: Solicitar al usuario la altura de la pirámide y dibujarla con asteriscos, 
 * donde cada fila tiene un número creciente de asteriscos centrados.
 * 
 * Estructuras aplicadas: for, manejo de excepciones con try-catch.
 * 
 * @author joaxx
 */
public class EjercicioA10 {

    /**
     * Método principal donde se ejecuta el programa.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura = 0;
        boolean entradaValida = false;

        // Estructura try-catch para validar la entrada de la altura de la pirámide
        do {
            try {
                System.out.print("Ingresa la altura de la pirámide: ");
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

        // Dibujar la pirámide con la altura ingresada
        for (int i = 1; i <= altura; i++) {
            // Imprimir espacios en blanco para centrar la pirámide
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // Imprimir los asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}
