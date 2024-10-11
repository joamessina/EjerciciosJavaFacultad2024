package ejerciciosobrecargacosa;

import java.util.Date;

public class Cosa {
    // Atributos privados
    private int entero;
    private String cadena;
    private Date fecha;

    // Sobrecarga del método establecerValor para el atributo entero
    public void establecerValor(int entero) {
        this.entero = entero;
    }

    // Sobrecarga del método establecerValor para el atributo cadena
    public void establecerValor(String cadena) {
        this.cadena = cadena;
    }

    // Sobrecarga del método establecerValor para el atributo fecha
    public void establecerValor(Date fecha) {
        this.fecha = fecha;
    }

    // Método de instancia que muestra los valores de los atributos en formato de cadena
    public String mostrar() {
        return entero + " - " + cadena + " - " + fecha;
    }

    // Método de clase que recibe una instancia de Cosa y devuelve una cadena con los atributos
    public static String mostrar(Cosa cosa) {
        return cosa.entero + " - " + cosa.cadena + " - " + cosa.fecha;
    }

    // Método main para probar todos los miembros de la clase Cosa
    public static void main(String[] args) {
        // Crear una instancia de Cosa
        Cosa miCosa = new Cosa();

        // Establecer valores usando las sobrecargas de establecerValor
        miCosa.establecerValor(42);  // Para entero
        miCosa.establecerValor("Mi cadena");  // Para cadena
        miCosa.establecerValor(new Date());  // Para fecha (establece la fecha actual)

        // Mostrar los valores usando el método de instancia
        System.out.println("Mostrar con metodo de instancia:");
        System.out.println(miCosa.mostrar());

        // Mostrar los valores usando el método de clase
        System.out.println("Mostrar con metodo de clase:");
        System.out.println(Cosa.mostrar(miCosa));
    }
}
