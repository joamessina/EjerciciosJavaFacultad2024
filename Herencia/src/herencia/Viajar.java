package herencia;

public class Viajar {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de vehículo
        Camion camion = new Camion((short) 6, (short) 2, Colores.ROJO, (short) 12, 5000);
        Automovil automovil = new Automovil((short) 4, (short) 4, Colores.AZUL, (short) 5, 5);
        Moto moto = new Moto((short) 2, (short) 0, Colores.NEGRO, (short) 250);

        // Imprimir datos de los vehículos
        System.out.println("Camión:");
        System.out.println("Color: " + camion.getColor());
        System.out.println("Cantidad de ruedas: " + camion.getCantidadRuedas());
        System.out.println("Peso de carga: " + camion.getPesoCarga());

        System.out.println("\nAutomóvil:");
        System.out.println("Color: " + automovil.getColor());
        System.out.println("Cantidad de pasajeros: " + automovil.getCantidadPasajeros());

        System.out.println("\nMoto:");
        System.out.println("Color: " + moto.getColor());
        System.out.println("Cilindrada: " + moto.getCilindrada());
    }
}
