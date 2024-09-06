/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio A2: Potencias
 * 
 * Objetivo: Ingresar un número y mostrar su cuadrado y cubo.
 * Validar que el número sea mayor que cero y manejar posibles excepciones en la entrada.
 * 
 * Estructuras aplicadas: do-while, manejo de excepciones con try-catch.
 * 
 * @author joaxx
 */
public class EjercicioA2 {

    /**
     * Método principal donde se ejecuta el programa.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero = 0;
        boolean entradaValida = false;

        // Estructura do-while para asegurar que se ingrese un número mayor que cero
        do {
            try {
                // Solicitar al usuario que ingrese un número
                System.out.print("Ingresa un numero mayor que cero: ");
                numero = scanner.nextDouble();

                // Validar que el número sea mayor que cero
                if (numero <= 0) {
                    throw new IllegalArgumentException("ERROR. Reingresar numero mayor que cero!");
                }

                entradaValida = true; // Si llegamos aquí, la entrada es válida

            } catch (IllegalArgumentException e) {
                // Capturar el caso de un número inválido (menor o igual a cero)
                System.out.println(e.getMessage()); // Mensaje personalizado
            } catch (InputMismatchException e) {
                // Capturar error de entrada no numérica
                System.out.println("Ocurrio un error con la entrada. Por favor, ingresa un numero valido.");
                scanner.next(); // Limpiar el buffer de entrada en caso de entrada no numérica
            }
        } while (!entradaValida); // Repetir hasta que la entrada sea válida

        // Calcular el cuadrado y el cubo usando Math.pow
        double cuadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);

        // Mostrar resultados
        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        System.out.println("El cubo de " + numero + " es: " + cubo);
        System.out.println("Programa finalizado.");
    }
}
