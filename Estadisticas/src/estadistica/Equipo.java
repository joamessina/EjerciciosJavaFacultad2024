/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estadistica;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private int cantidadDeJugadores;
    private String nombre;
    private List<Jugador> jugadores;

    // Constructor privado
    private Equipo() {
        this.jugadores = new ArrayList<>();
    }

    // Constructor público
    public Equipo(int cantidadDeJugadores, String nombre) {
        this();
        this.cantidadDeJugadores = cantidadDeJugadores;
        this.nombre = nombre;
    }

    // Getter para cantidadDeJugadores
    public int getCantidadDeJugadores() {
        return cantidadDeJugadores;
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Método para mostrar los jugadores del equipo
    public String mostrarEquipo() {
        StringBuilder sb = new StringBuilder("Equipo: " + nombre + "\n");
        for (Jugador j : jugadores) {
            sb.append(j.mostrarDatos()).append("\n");
        }
        return sb.toString();
    }

    // Método estático para agregar un jugador al equipo
    public static Equipo add(Equipo equipo, Jugador jugador) {
        if (equipo.jugadores.size() < equipo.cantidadDeJugadores) {
            // Verificar que el jugador no esté ya en el equipo
            boolean existe = equipo.jugadores.stream()
                               .anyMatch(j -> Jugador.sonIguales(j, jugador));
            if (!existe) {
                equipo.jugadores.add(jugador);
            } else {
                System.out.println("El jugador ya está en el equipo.");
            }
        } else {
            System.out.println("El equipo ha alcanzado el límite de jugadores.");
        }
        return equipo;
    }
}
