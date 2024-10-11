public class MainTintaPluma {
    public static void main(String[] args) {
        // Crear algunas instancias de Tinta
        Tinta tinta1 = new Tinta();
        Tinta tinta2 = new Tinta(Color.ROJO, Tipo.CON_BRILLITO);

        // Mostrar las tintas
        System.out.println("Tinta 1: " + Tinta.mostrar(tinta1));
        System.out.println("Tinta 2: " + Tinta.mostrar(tinta2));

        // Comparar si son iguales
        System.out.println("¿Son iguales tinta1 y tinta2?: " + Tinta.sonIguales(tinta1, tinta2));

        // Crear algunas instancias de Pluma
        Pluma pluma1 = new Pluma("Bic", tinta1, 3);
        Pluma pluma2 = new Pluma("Parker", tinta2, 2);

        // Mostrar las plumas
        System.out.println("Pluma 1: " + pluma1.mostrar());
        System.out.println("Pluma 2: " + pluma2.mostrar());

        // Comparar si la pluma tiene la misma tinta
        System.out.println("¿La pluma1 tiene la misma tinta que tinta1?: " + Pluma.sonIguales(pluma1, tinta1));

        // Incrementar la cantidad de tinta en pluma1
        Pluma.add(pluma1, tinta1);
        System.out.println("Pluma 1 despues de añadir tinta: " + pluma1.mostrar());

        // Disminuir la cantidad de tinta en pluma2
        Pluma.remove(pluma2, tinta2);
        System.out.println("Pluma 2 despues de remover tinta: " + pluma2.mostrar());
    }
}
