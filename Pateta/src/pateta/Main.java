/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pateta;

public class Main {
    public static void main(String[] args) {
        // Crear algunos objetos de tipo Tempera
        Tempera t1 = new Tempera(Color.ROJO, "Marca1");
        Tempera t2 = new Tempera(Color.AZUL, "Marca2");

        // Crear paletas
        Paleta paleta1 = new Paleta();
        Paleta paleta2 = new Paleta();

        // Agregar témperas a las paletas
        Paleta.add(paleta1, t1);
        Paleta.add(paleta2, t2);

        // Combinación de paletas
        Paleta paletaCombinada = Paleta.add(paleta1, paleta2);

        // Mostrar paleta combinada
        System.out.println(paletaCombinada.mostrar());
    }
}
