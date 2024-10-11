/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroslocos2;

/**
 *
 * @author joaxx
 */
import java.util.*;

public class NumerosLocos2 {
    public static void main(String[] args) {
        // Crear las colecciones: ArrayList, Stack y Queue
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        // Cargar 20 números enteros aleatorios (positivos y negativos)
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int numAleatorio;
            do {
                numAleatorio = random.nextInt(201) - 100;  // Rango [-100, 100]
            } while (numAleatorio == 0);  // Asegurarse de que no sea cero

            // Agregar el número a todas las colecciones
            arrayList.add(numAleatorio);
            stack.push(numAleatorio);
            queue.add(numAleatorio);
        }

        // 1. Mostrar las colecciones tal como fueron cargadas
        System.out.println("ArrayList cargado: " + arrayList);
        System.out.println("Stack cargado: " + stack);
        System.out.println("Queue cargada: " + queue);

        // Filtrar los positivos y negativos de cada colección
        List<Integer> positivos = new ArrayList<>();
        List<Integer> negativos = new ArrayList<>();

        for (int num : arrayList) {
            if (num > 0) {
                positivos.add(num);
            } else {
                negativos.add(num);
            }
        }

        // 2. Mostrar los positivos ordenados en forma decreciente
        Collections.sort(positivos, Collections.reverseOrder());
        System.out.println("Positivos ordenados en forma decreciente: " + positivos);

        // 3. Mostrar los negativos ordenados en forma creciente
        Collections.sort(negativos);
        System.out.println("Negativos ordenados en forma creciente: " + negativos);
    }
}
