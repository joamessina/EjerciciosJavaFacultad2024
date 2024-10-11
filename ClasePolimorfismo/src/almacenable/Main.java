/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacenable;

/**
 *
 * @author joaxx
 */
public class Main {
    public static void main(String[] args) {
        // Crear objetos usando polimorfismo
        Almacenable archivo = new Archivo();  // Referencia de tipo Almacenable, objeto de tipo Archivo
        Almacenable baseDeDatos = new BaseDeDatos();  // Referencia de tipo Almacenable, objeto de tipo BaseDeDatos

        // Guardar información usando polimorfismo
        archivo.guardar();  // Llamará al método guardar() de Archivo
        baseDeDatos.guardar();  // Llamará al método guardar() de BaseDeDatos
    }
}