package pateta;

import java.util.HashMap;

public class Paleta {
    private HashMap<Tempera, Double> colores;

    // Constructor
    public Paleta() {
        this.colores = new HashMap<>();
    }

    // Método mostrar
    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paleta: \n");
        for (Tempera t : colores.keySet()) {
            sb.append(Tempera.mostrar(t)).append(", Cantidad: ").append(colores.get(t)).append("\n");
        }
        return sb.toString();
    }

    // Método estático para agregar témperas a la paleta
    public static Paleta add(Paleta p, Tempera t) {
        p.colores.put(t, p.colores.getOrDefault(t, 0.0) + 1);
        return p;
    }

    public static Paleta add(Paleta p1, Paleta p2) {
        for (Tempera t : p2.colores.keySet()) {
            double cantidad = p2.colores.get(t);
            p1.colores.put(t, p1.colores.getOrDefault(t, 0.0) + cantidad);
        }
        return p1;
    }
}
