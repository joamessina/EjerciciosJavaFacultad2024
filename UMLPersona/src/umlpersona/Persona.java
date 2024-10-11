package umlpersona;

public class Persona {

    // Atributos privados
    private String nombre;
    private int edad;
    private double altura;

    // Constructor
    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Método para verificar si la persona es mayor de edad
    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    // Método para calcular el Índice de Masa Corporal (IMC)
    public double calcularIMC(double peso) {
        return peso / (this.altura * this.altura);
    }


}
