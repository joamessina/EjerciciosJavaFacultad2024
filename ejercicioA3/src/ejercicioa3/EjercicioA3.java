/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa3;
import java.util.Scanner;

/**
 *
 * @author joaxx
 */
public class EjercicioA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        numero = scanner.nextInt();

        // Mostrar números primos hasta el número ingresado
        System.out.println("Números primos hasta " + numero + ":");
        for (int i = 2; i <= numero; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    // Método para determinar si un número es primo
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
