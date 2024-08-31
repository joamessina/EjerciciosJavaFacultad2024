/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa10;
import java.util.Scanner;

/**
 *
 * @author joaxx
 */
public class EjercicioA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la altura de la pirámide
        System.out.print("Ingresa la altura de la pirámide: ");
        int altura = scanner.nextInt();

        // Dibujar la pirámide
        for (int i = 1; i <= altura; i++) {
            // Imprimir espacios en blanco (opcional si quieres centrar)
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            
            // Imprimir las estrellas
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}
