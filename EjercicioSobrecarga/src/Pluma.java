public class Pluma {
    private String marca;
    private Tinta tinta;
    private int cantidad;

    // Constructor sin parámetros, valores predeterminados: "sin marca", null, 1
    public Pluma() {
        this.marca = "sin marca";
        this.tinta = null;
        this.cantidad = 1;
    }

    // Constructor con un parámetro (marca)
    public Pluma(String marca) {
        this.marca = marca;
        this.tinta = null;
        this.cantidad = 1;
    }

    // Constructor con dos parámetros (marca y tinta)
    public Pluma(String marca, Tinta tinta) {
        this.marca = marca;
        this.tinta = tinta;
        this.cantidad = 1;
    }

    // Constructor con tres parámetros (marca, tinta, cantidad)
    public Pluma(String marca, Tinta tinta, int cantidad) {
        this.marca = marca;
        this.tinta = tinta;
        this.cantidad = cantidad;
    }

    // Método de instancia para mostrar los atributos de la pluma
    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(this.marca);
        sb.append(", Tinta: ").append(tinta != null ? Tinta.mostrar(tinta) : "Sin tinta");
        sb.append(", Cantidad: ").append(this.cantidad);
        return sb.toString();
    }

    // Método de clase para verificar si la tinta de la pluma es igual a una tinta dada
    public static boolean sonIguales(Pluma pluma, Tinta tinta) {
        return pluma.tinta != null && Tinta.sonIguales(pluma.tinta, tinta);
    }

    // Método de clase para verificar si la tinta de la pluma es distinta a una tinta dada
    public static boolean sonDistintos(Pluma pluma, Tinta tinta) {
        return !sonIguales(pluma, tinta);
    }

    // Método de clase para agregar tinta a la pluma (incrementar cantidad)
    public static Pluma add(Pluma pluma, Tinta tinta) {
        if (sonIguales(pluma, tinta)) {
            pluma.cantidad++;
        }
        return pluma;
    }

    // Método de clase para remover tinta de la pluma (decrementar cantidad)
    public static Pluma remove(Pluma pluma, Tinta tinta) {
        if (sonIguales(pluma, tinta) && pluma.cantidad > 0) {
            pluma.cantidad--;
        }
        return pluma;
    }
}
