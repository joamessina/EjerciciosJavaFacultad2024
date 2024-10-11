/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroslocos;

/**
 *
 * @author joaxx
 */
import java.util.Arrays;
import java.util.Random;

public class NumerosLocos {

    public static void main(String[] args) {
        // Crear un array para almacenar 20 números enteros
        int[] numeros = new int[20];
        Random random = new Random();

        // Cargar el array con números aleatorios distintos de cero (positivos y negativos)
        for (int i = 0; i < numeros.length; i++) {
            int numAleatorio;
            do {
                numAleatorio = random.nextInt(201) - 100;  // Rango [-100, 100]
            } while (numAleatorio == 0);  // Asegurarse de que no sea cero
            numeros[i] = numAleatorio;
        }

        // 1. Mostrar el array tal como fue ingresado
        System.out.println("Array original:");
        System.out.println(Arrays.toString(numeros));

        // Filtrar los positivos y negativos en dos arrays separados
        int[] positivos = Arrays.stream(numeros).filter(n -> n > 0).toArray();
        int[] negativos = Arrays.stream(numeros).filter(n -> n < 0).toArray();

        // 2. Mostrar los positivos en forma decreciente
        Arrays.sort(positivos);  // Ordenar de forma creciente
        System.out.println("Positivos ordenados en forma decreciente:");
        for (int i = positivos.length - 1; i >= 0; i--) {
            System.out.print(positivos[i] + " ");
        }
        System.out.println();

        // 3. Mostrar los negativos en forma creciente
        Arrays.sort(negativos);  // Ordenar de forma creciente
        System.out.println("Negativos ordenados en forma creciente:");
        for (int negativo : negativos) {
            System.out.print(negativo + " ");
        }
        System.out.println();
    }
}
