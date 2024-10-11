// Enumerado para los colores de la tinta
enum Color {
    ROJO,BLANCO, AZUL, VERDE, NEGRO
}

// Enumerado para los tipos de tinta
enum Tipo {
    COMUN, CHINA, CON_BRILLITO
}

public class Tinta {
    private Color color;
    private Tipo tipo;

    // Constructor sin parámetros, valores predeterminados: Verde y China
    public Tinta() {
        this.color = Color.VERDE;
        this.tipo = Tipo.CHINA;
    }

    // Constructor con un parámetro (se establece solo el color, el tipo es predeterminado)
    public Tinta(Color color) {
        this.color = color;
        this.tipo = Tipo.CHINA;
    }

    // Constructor con dos parámetros (se establece el color y el tipo)
    public Tinta(Color color, Tipo tipo) {
        this.color = color;
        this.tipo = tipo;
    }

    // Método privado para mostrar los atributos en formato de cadena
    private String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Color: ").append(this.color);
        sb.append(", Tipo: ").append(this.tipo);
        return sb.toString();
    }

    // Método de clase para mostrar los atributos de una instancia de Tinta
    public static String mostrar(Tinta tinta) {
        return tinta.mostrar();
    }

    // Método de clase para comparar si dos instancias de Tinta son iguales
    public static boolean sonIguales(Tinta tinta1, Tinta tinta2) {
        return tinta1.color == tinta2.color && tinta1.tipo == tinta2.tipo;
    }

    // Método de clase para comparar si dos instancias de Tinta son distintas
    public static boolean sonDistintos(Tinta tinta1, Tinta tinta2) {
        return !sonIguales(tinta1, tinta2);
    }
}
