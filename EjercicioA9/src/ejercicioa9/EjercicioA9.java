/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa9;
import java.util.Scanner;

/**
 *
 * @author joaxx
 */
public class EjercicioA9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la altura del triángulo
        System.out.print("Ingresa la altura del triángulo: ");
        int altura = scanner.nextInt();

        // Dibujar el triángulo
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
