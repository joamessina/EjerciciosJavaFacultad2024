package umlpersona;

public class UMLPersona {

    // Método main para probar la clase Persona
    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona("Juan", 24, 1.75);

        // Verificar si es mayor de edad
        System.out.println("¿Es mayor de edad?: " + persona.esMayorDeEdad());

        // Calcular y mostrar el IMC
        double peso = 95.0; // peso en kilogramos
        System.out.println("IMC: " + persona.calcularIMC(peso));
    }
}
