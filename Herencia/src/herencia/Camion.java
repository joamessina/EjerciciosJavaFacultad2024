package herencia;

public class Camion extends VehiculoTerrestre {
    private int pesoCarga;

    // Constructor
    public Camion(short cantidadRuedas, short cantidadPuertas, Colores color, short cantidadMarchas, int pesoCarga) {
        super(cantidadRuedas, cantidadPuertas, color, cantidadMarchas);
        this.pesoCarga = pesoCarga;
    }

    // Getter y Setter para pesoCarga
    public int getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(int pesoCarga) {
        this.pesoCarga = pesoCarga;
    }
}
