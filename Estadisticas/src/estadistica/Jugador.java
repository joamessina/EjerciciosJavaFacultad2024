/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estadistica;

/**
 *
 * @author joaxx
 */
public class Jugador {
    private int dni;
    private String nombre;
    private int partidosJugados;
    private float promedioGoles;
    private int totalGoles;

    // Constructor privado
    private Jugador() {
    }

    // Constructor público con dos parámetros
    public Jugador(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.partidosJugados = 0;
        this.totalGoles = 0;
        this.promedioGoles = 0;
    }

    // Constructor público con cuatro parámetros
    public Jugador(int dni, String nombre, int totalGoles, int partidosJugados) {
        this.dni = dni;
        this.nombre = nombre;
        this.partidosJugados = partidosJugados;
        this.totalGoles = totalGoles;
        this.promedioGoles = (partidosJugados > 0) ? (float) totalGoles / partidosJugados : 0;
    }

    // Getter y Setter para dni
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para partidosJugados
    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
        calcularPromedioGoles();
    }

    // Getter y Setter para totalGoles
    public int getTotalGoles() {
        return totalGoles;
    }

    public void setTotalGoles(int totalGoles) {
        this.totalGoles = totalGoles;
        calcularPromedioGoles();
    }

    // Método privado para calcular el promedio de goles
    private void calcularPromedioGoles() {
        if (this.partidosJugados > 0) {
            this.promedioGoles = (float) this.totalGoles / this.partidosJugados;
        } else {
            this.promedioGoles = 0;
        }
    }

    // Getter para promedioGoles (no necesitamos un setter, ya que se calcula)
    public float getPromedioGoles() {
        return promedioGoles;
    }

    // Método para mostrar los datos del jugador
    public String mostrarDatos() {
        return "DNI: " + dni + ", Nombre: " + nombre + ", Partidos Jugados: " + partidosJugados +
               ", Total de Goles: " + totalGoles + ", Promedio de Goles: " + promedioGoles;
    }

    // Método estático para comparar si dos jugadores son iguales (por DNI)
    public static boolean sonIguales(Jugador j1, Jugador j2) {
        return j1.dni == j2.dni;
    }

    // Método estático para comparar si dos jugadores son distintos (por DNI)
    public static boolean sonDistintos(Jugador j1, Jugador j2) {
        return !sonIguales(j1, j2);
    }
}
