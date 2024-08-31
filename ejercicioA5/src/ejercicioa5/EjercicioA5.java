/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa5;
import java.util.Scanner;

/**
 *
 * @author joaxx
 */
public class EjercicioA5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        int limite = scanner.nextInt();

        // Buscar centros numéricos entre 1 y el número ingresado
        for (int i = 1; i <= limite; i++) {
            if (esCentroNumerico(i)) {
                System.out.println(i + " es un centro numérico.");
            }
        }
    }

    // Método para determinar si un número es un centro numérico
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

        // Un número es centro numérico si las sumas son iguales
        return sumaIzquierda == sumaDerecha;
    }

    
}
