/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author joaxx
 */
public class ejercicioA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadNumeros = 5;
        int numero;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int suma = 0;

        // Repetir 5 veces para ingresar los números
        for (int i = 1; i <= cantidadNumeros; i++) {
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
        }

        // Calcular el promedio
        double promedio = (double) suma / cantidadNumeros;

        // Mostrar resultados
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Promedio: " + promedio);
    }
    
}
