package herencia;

public abstract class VehiculoTerrestre {
    protected short cantidadRuedas;
    protected short cantidadPuertas;
    protected Colores color;
    protected short cantidadMarchas;

    // Constructor
    public VehiculoTerrestre(short cantidadRuedas, short cantidadPuertas, Colores color, short cantidadMarchas) {
        this.cantidadRuedas = cantidadRuedas;
        this.cantidadPuertas = cantidadPuertas;
        this.color = color;
        this.cantidadMarchas = cantidadMarchas;
    }

    // Getters y Setters (opcional, según necesidad)
    public short getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(short cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public short getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(short cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public short getCantidadMarchas() {
        return cantidadMarchas;
    }

    public void setCantidadMarchas(short cantidadMarchas) {
        this.cantidadMarchas = cantidadMarchas;
    }
}
