/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioa4;

/**
 *
 * @author joaxx
 */
public class EjercicioA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contadorNumerosPerfectos = 0;
        int numero = 1;

        while (contadorNumerosPerfectos < 4) {
            if (esNumeroPerfecto(numero)) {
                System.out.println(numero + " es un número perfecto.");
                contadorNumerosPerfectos++;
            }
            numero++;
        }
    }

    // Método para verificar si un número es perfecto
    public static boolean esNumeroPerfecto(int n) {
        int sumaDivisores = 0;

        // Encontrar divisores y sumar
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumaDivisores += i;
            }
        }

        // Verificar si la suma de los divisores es igual al número
        return sumaDivisores == n;
    }
    
}
