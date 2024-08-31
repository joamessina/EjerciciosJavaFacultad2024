/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa6;
import java.util.Scanner;

/**
 *
 * @author joaxx
 */
public class EjercicioA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el año de inicio y el año de fin
        System.out.print("Ingresa el año de inicio: ");
        int añoInicio = scanner.nextInt();

        System.out.print("Ingresa el año de fin: ");
        int añoFin = scanner.nextInt();

        System.out.println("Años bisiestos entre " + añoInicio + " y " + añoFin + ":");

        // Buscar y mostrar todos los años bisiestos en el rango
        for (int año = añoInicio; año <= añoFin; año++) {
            if (esBisiesto(año)) {
                System.out.println(año);
            }
        }
    }

    // Método para determinar si un año es bisiesto
    public static boolean esBisiesto(int año) {
        // Un año es bisiesto si es múltiplo de 4
        // pero no es múltiplo de 100, salvo que también sea múltiplo de 400
        if (año % 4 == 0) {
            if (año % 100 == 0) {
                return año % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    
}
