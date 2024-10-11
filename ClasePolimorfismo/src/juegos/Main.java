package juegos;

public class Main {
    public static void main(String[] args) {
        // Crear objetos usando polimorfismo
        Juego futbol = new Ajedrez();  // Referencia de tipo Juego, objeto de tipo Ajedrez
        Juego ajedrez = new Futbol();   // Referencia de tipo Juego, objeto de tipo Futbol

        // Iniciar los juegos usando polimorfismo
        futbol.iniciar();  // Llamará al método iniciar() de Ajedrez
        ajedrez.iniciar();  // Llamará al método iniciar() de Futbol
    }
}
