/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio A7: ¿Cuántos días viviste?
 * 
 * Objetivo: Solicitar al usuario su fecha de nacimiento y calcular el número de días vividos
 * hasta la fecha actual.
 * 
 * Estructuras aplicadas: manejo de fechas con LocalDate, manejo de excepciones con try-catch.
 * 
 * @author joaxx
 */
public class EjercicioA7 {

    /**
     * Método principal donde se ejecuta el programa.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia = 0, mes = 0, año = 0;
        boolean entradaValida = false;

        // Estructura try-catch para validar la entrada de la fecha de nacimiento
        do {
            try {
                // Pedir la fecha de nacimiento del usuario
                System.out.print("Ingresa el día de nacimiento: ");
                dia = scanner.nextInt();

                System.out.print("Ingresa el mes de nacimiento: ");
                mes = scanner.nextInt();

                System.out.print("Ingresa el año de nacimiento: ");
                año = scanner.nextInt();

                // Validar que la fecha ingresada sea razonable (por ejemplo, no en el futuro)
                LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
                if (fechaNacimiento.isAfter(LocalDate.now())) {
                    throw new IllegalArgumentException("La fecha de nacimiento no puede ser en el futuro.");
                }

                entradaValida = true; // Entrada válida si no se lanza ninguna excepción

            } catch (InputMismatchException e) {
                // Manejar error de formato en la entrada
                System.out.println("Error: Ingresa un número válido.");
                scanner.next(); // Limpiar el buffer de entrada en caso de error
            } catch (Exception e) {
                // Manejar cualquier otra excepción, como fechas no válidas
                System.out.println("Error: " + e.getMessage());
            }
        } while (!entradaValida);

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
