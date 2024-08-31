/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa7;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
/**
 *
 * @author joaxx
 */
public class EjercicioA7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la fecha de nacimiento del usuario
        System.out.print("Ingresa el día de nacimiento: ");
        int dia = scanner.nextInt();

        System.out.print("Ingresa el mes de nacimiento: ");
        int mes = scanner.nextInt();

        System.out.print("Ingresa el año de nacimiento: ");
        int año = scanner.nextInt();

        // Crear una instancia de LocalDate con la fecha de nacimiento
        LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);

        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Calcular los días vividos
        long diasVividos = ChronoUnit.DAYS.between(fechaNacimiento, fechaActual);

        // Mostrar el resultado
        System.out.println("Has vivido " + diasVividos + " días.");
    }

    
}
