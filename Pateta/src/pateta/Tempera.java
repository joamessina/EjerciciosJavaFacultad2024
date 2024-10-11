package pateta;

public class Tempera {
    private Color color;
    private String marca;

    // Constructor
    public Tempera(Color color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    // Método privado mostrar
    private String mostrar() {
        return "Color: " + color + ", Marca: " + marca;
    }

    // Método de clase mostrar
    public static String mostrar(Tempera t) {
        return t.mostrar();
    }

    // Métodos de clase para comparar
    public static boolean sonIguales(Tempera t1, Tempera t2) {
        return t1.color == t2.color && t1.marca.equals(t2.marca);
    }

    public static boolean sonDistintos(Tempera t1, Tempera t2) {
        return !sonIguales(t1, t2);
    }
}
