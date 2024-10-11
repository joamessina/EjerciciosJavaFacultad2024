/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validarrangos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author joaxx
 */
public class ValidarRangos {

    // Método estático para validar si el valor está en el rango dado
    public static boolean validar(int valor, int min, int max) {
        return valor >= min && valor <= max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minRango = -100;
        int maxRango = 100;
        int[] numeros = new int[10];
        int suma = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Solicitar al usuario que ingrese 10 números
        for (int i = 0; i < 10; i++) {
            int numero = 0;
            boolean entradaValida = false;

            // Bucle para asegurarse de que el usuario ingrese un número válido dentro del rango
            while (!entradaValida) {
                try {
                    System.out.print("Ingresa el número " + (i + 1) + ": ");
                    numero = scanner.nextInt();  // Intentar leer el número

                    // Validar si el número está en el rango
                    if (validar(numero, minRango, maxRango)) {
                        entradaValida = true;  // Si está en el rango, la entrada es válida
                    } else {
                        System.out.println("El número debe estar entre " + minRango + " y " + maxRango);
                    }

                } catch (InputMismatchException e) {
                    // Si ocurre una excepción por entrada inválida (texto en lugar de número)
                    System.out.println("Error: Ingresa un número entero válido.");
                    scanner.next();  // Limpiar el buffer del scanner para evitar un bucle infinito
                }
            }

            // Almacenar el número, calcular el mínimo, máximo y la suma para el promedio
            numeros[i] = numero;
            suma += numero;
            if (numero < min) {
                min = numero;
            }
            if (numero > max) {
                max = numero;
            }
        }

        // Calcular el promedio
        double promedio = (double) suma / numeros.length;

        // Mostrar el valor mínimo, máximo y el promedio
        System.out.println("\nValor mínimo ingresado: " + min);
        System.out.println("Valor máximo ingresado: " + max);
        System.out.println("Promedio: " + promedio);
    }
    
}
