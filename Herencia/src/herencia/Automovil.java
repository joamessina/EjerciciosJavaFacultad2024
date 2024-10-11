package herencia;

public class Automovil extends VehiculoTerrestre {
    private int cantidadPasajeros;

    // Constructor
    public Automovil(short cantidadRuedas, short cantidadPuertas, Colores color, short cantidadMarchas, int cantidadPasajeros) {
        super(cantidadRuedas, cantidadPuertas, color, cantidadMarchas);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    // Getter y Setter para cantidadPasajeros
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }
}
