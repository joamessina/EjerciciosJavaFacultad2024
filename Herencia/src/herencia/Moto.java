package herencia;

public class Moto extends VehiculoTerrestre {
    private short cilindrada;

    // Constructor
    public Moto(short cantidadRuedas, short cantidadPuertas, Colores color, short cilindrada) {
        super(cantidadRuedas, cantidadPuertas, color, (short) 0); // Las motos no tienen marchas
        this.cilindrada = cilindrada;
    }

    // Getter y Setter para cilindrada
    public short getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(short cilindrada) {
        this.cilindrada = cilindrada;
    }
}
