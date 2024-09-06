/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa4;

/**
 * Ejercicio A4: Números Perfectos
 * 
 * Objetivo: Encontrar los 4 primeros números perfectos. Un número perfecto es aquel
 * cuya suma de divisores propios es igual al número mismo.
 * 
 * Estructuras aplicadas: while, for, manejo de excepciones con try-catch.
 * 
 * @author joaxx
 */
public class EjercicioA4 {

    /**
     * Método principal donde se ejecuta el programa.
     * Encuentra y muestra los 4 primeros números perfectos.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contadorNumerosPerfectos = 0;
        int numero = 1;

        try {
            // Bucle while para encontrar los primeros 4 números perfectos
            while (contadorNumerosPerfectos < 4) {
                if (esNumeroPerfecto(numero)) {
                    System.out.println(numero + " es un número perfecto.");
                    contadorNumerosPerfectos++;
                }
                numero++;
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error durante el proceso: " + e.getMessage());
        }
    }

    /**
     * Método para verificar si un número es perfecto.
     * Un número perfecto es igual a la suma de sus divisores propios (excluyendo el mismo).
     * 
     * @param n El número a verificar
     * @return true si el número es perfecto, false si no lo es
     */
    public static boolean esNumeroPerfecto(int n) {
        int sumaDivisores = 0;

        // Encontrar divisores y sumar
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumaDivisores += i;
            }
        }

        // Verificar si la suma de los divisores es igual al número
        return sumaDivisores == n;
    }
}
