package claselunes;

public class Validadora {

    // Método estático para validar si el valor está en el rango dado
    public static boolean validar(int valor, int min, int max) {
        return valor >= min && valor <= max;
    }
}
