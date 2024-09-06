/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio A1: Máximos, mínimos y promedios
 * 
 * Objetivo: Ingresar 5 números por consola y calcular el valor máximo, el valor mínimo, 
 * y el promedio de los números ingresados.
 * 
 * Estructuras aplicadas: for, if-else, manejo de excepciones con try-catch.
 * 
 * @author joaxx
 */
public class ejercicioA1 {

    /**
     * Método principal donde se ejecuta el programa.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadNumeros = 5;
        int numero = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int suma = 0;
        boolean entradaValida;

        // Estructura repetitiva para ingresar los números
        for (int i = 1; i <= cantidadNumeros; i++) {
            do {
                entradaValida = true;
                try {
                    System.out.print("Ingresa el número " + i + ": ");
                    numero = scanner.nextInt();

                    // Calcular máximo
                    if (numero > maximo) {
                        maximo = numero;
                    }

                    // Calcular mínimo
                    if (numero < minimo) {
                        minimo = numero;
                    }

                    // Acumular para el promedio
                    suma += numero;

                } catch (InputMismatchException e) {
                    // Capturar error de formato en la entrada
                    System.out.println("Error: Ingrese un número válido.");
                    scanner.next(); // Limpiar el buffer
                    entradaValida = false;
                }
            } while (!entradaValida);
        }

        // Calcular el promedio
        double promedio = (double) suma / cantidadNumeros;

        // Mostrar resultados
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Promedio: " + promedio);
    }
}
