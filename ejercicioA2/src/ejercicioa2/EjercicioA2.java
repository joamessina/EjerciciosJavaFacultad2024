/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa2;
import java.util.Scanner;

/**
 *
 * @author joaxx
 */
public class EjercicioA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        // Validar que el número sea mayor que cero
        do {
            System.out.print("Ingresa un número mayor que cero: ");
            numero = scanner.nextDouble();

            if (numero <= 0) {
                System.out.println("ERROR. ¡Reingresar número!");
            }
        } while (numero <= 0);

        // Calcular el cuadrado y el cubo usando Math.pow
        double cuadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);

        // Mostrar resultados
        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        System.out.println("El cubo de " + numero + " es: " + cubo);
    }
    
}
