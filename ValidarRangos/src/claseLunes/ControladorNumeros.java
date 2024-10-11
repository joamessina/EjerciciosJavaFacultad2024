package claselunes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControladorNumeros {
    private int minValor;
    private int maxValor;
    private int suma;
    private int cantidadNumeros;
    private int[] numeros;
    private Validadora validadora;

    // Constructor que inicializa los atributos
    public ControladorNumeros(int minValor, int maxValor, int cantidadNumeros) {
        this.minValor = minValor;
        this.maxValor = maxValor;
        this.suma = 0;
        this.cantidadNumeros = cantidadNumeros;
        this.numeros = new int[cantidadNumeros];
        this.validadora = new Validadora();
    }

    // Método para gestionar el ingreso de números
    public void gestionarNumeros() {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Solicitar al usuario que ingrese los números
        for (int i = 0; i < cantidadNumeros; i++) {
            int numero = 0;
            boolean entradaValida = false;

            while (!entradaValida) {
                try {
                    System.out.print("Ingresa el número " + (i + 1) + ": ");
                    numero = scanner.nextInt();

                    // Validar si el número está en el rango usando la clase Validadora
                    if (Validadora.validar(numero, minValor, maxValor)) {
                        entradaValida = true;
                    } else {
                        System.out.println("El número debe estar entre " + minValor + " y " + maxValor);
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingresa un número entero válido.");
                    scanner.next(); // Limpiar el buffer de entrada
                }
            }

            // Almacenar el número
            numeros[i] = numero;

            // Actualizar la suma, el mínimo y el máximo
            suma += numero;
            if (numero < min) {
                min = numero;
            }
            if (numero > max) {
                max = numero;
            }
        }

        // Mostrar el valor mínimo, máximo y el promedio usando los métodos separados
        System.out.println("\nValor mínimo ingresado: " + calcularMin());
        System.out.println("Valor máximo ingresado: " + calcularMax());
        System.out.println("Promedio: " + calcularPromedio());
    }

    // Método para calcular el promedio
    public double calcularPromedio() {
        return (double) suma / cantidadNumeros;
    }

    // Método para calcular el valor mínimo
    public int calcularMin() {
        int min = Integer.MAX_VALUE;
        for (int numero : numeros) {
            if (numero < min) {
                min = numero;
            }
        }
        return min;
    }

    // Método para calcular el valor máximo
    public int calcularMax() {
        int max = Integer.MIN_VALUE;
        for (int numero : numeros) {
            if (numero > max) {
                max = numero;
            }
        }
        return max;
    }
}
