/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacenable;

/**
 *
 * @author joaxx
 */
public class Archivo implements Almacenable {
    @Override
    public void guardar() {
        System.out.println("Guardando datos en un archivo...");
    }
}