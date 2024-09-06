/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio A5: Centros Numéricos
 * 
 * Objetivo: Encontrar y mostrar los centros numéricos entre 1 y el número ingresado por el usuario.
 * Un centro numérico es un número que separa la lista de números enteros en dos grupos cuyas sumas son iguales.
 * 
 * Estructuras aplicadas: for, while, manejo de excepciones con try-catch.
 * 
 * @author joaxx
 */
public class EjercicioA5 {

    /**
     * Método principal donde se ejecuta el programa.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limite = 0;
        boolean entradaValida = false;

        // Estructura try-catch para validar la entrada del número
        do {
            try {
                // Solicitar al usuario que ingrese un número
                System.out.print("Ingresa un número: ");
                limite = scanner.nextInt();
                
                if (limite <= 0) {
                    throw new IllegalArgumentException("El número debe ser mayor que 0.");
                }
                entradaValida = true; // Entrada válida si no hay excepciones

            } catch (InputMismatchException e) {
                // Manejar error de formato en la entrada
                System.out.println("Error: Ingresa un número entero válido.");
                scanner.next(); // Limpiar el buffer
            } catch (IllegalArgumentException e) {
                // Manejar error si el número es menor o igual a 0
                System.out.println(e.getMessage());
            }
        } while (!entradaValida);

        // Buscar centros numéricos entre 1 y el número ingresado
        for (int i = 1; i <= limite; i++) {
            if (esCentroNumerico(i)) {
                System.out.println(i + " es un centro numérico.");
            }
        }
    }

    /**
     * Método para determinar si un número es un centro numérico.
     * Un centro numérico tiene la propiedad de que la suma de los números a la izquierda
     * (desde 1 hasta n-1) es igual a la suma de los números a la derecha (desde n+1 en adelante).
     * 
     * @param n El número a evaluar
     * @return true si es un centro numérico, false si no lo es
     */
    public static boolean esCentroNumerico(int n) {
        int sumaIzquierda = 0;

        // Calcular la suma de los números desde 1 hasta n-1
        for (int i = 1; i < n; i++) {
            sumaIzquierda += i;
        }

        int sumaDerecha = 0;
        int j = n + 1;

        // Calcular la suma de los números desde n+1 en adelante hasta que la suma sea igual o mayor
        while (sumaDerecha < sumaIzquierda) {
            sumaDerecha += j;
            j++;
        }

        // Un número es centro numérico si las sumas izquierda y derecha son iguales
        return sumaIzquierda == sumaDerecha;
    }
}
