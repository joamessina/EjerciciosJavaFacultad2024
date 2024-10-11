package claselunes;

public class Main {

    public static void main(String[] args) {
        // Crear una instancia de ControladorNumeros con los límites del rango
        ControladorNumeros controlador = new ControladorNumeros(-100, 100,10);
        
        // Ejecutar el programa para gestionar los números
        controlador.gestionarNumeros();
    }
}
