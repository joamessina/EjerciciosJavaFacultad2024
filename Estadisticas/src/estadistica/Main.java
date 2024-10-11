package estadistica;

public class Main {
    public static void main(String[] args) {
        // Crear algunos jugadores
        Jugador jugador1 = new Jugador(12345678, "Lionel Messi", 650, 750);
        Jugador jugador2 = new Jugador(87654321, "Cristiano Ronaldo", 700, 800);
        Jugador jugador3 = new Jugador(12345678, "Jugador Duplicado");

        // Crear equipo
        Equipo equipo = new Equipo(2, "Dream Team");

        // Agregar jugadores al equipo
        Equipo.add(equipo, jugador1);
        Equipo.add(equipo, jugador2);
        Equipo.add(equipo, jugador3); // Este no debería añadirse por tener el mismo DNI que jugador1

        // Mostrar el equipo
        System.out.println(equipo.mostrarEquipo());
    }
}
