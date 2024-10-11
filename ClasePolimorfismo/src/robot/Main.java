/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robot;

/**
 *
 * @author joaxx
 */
public class Main {
    public static void main(String[] args) {
        // Crear robots usando polimorfismo
        Robot robotLimpiador = new RobotLimpiador();  // Referencia de tipo Robot, objeto de tipo RobotLimpiador
        Robot robotCocinero = new RobotCocinero();    // Referencia de tipo Robot, objeto de tipo RobotCocinero

        // Hacer que los robots trabajen usando polimorfismo
        robotLimpiador.trabajar();  // Llamará al método trabajar() de RobotLimpiador
        robotCocinero.trabajar();   // Llamará al método trabajar() de RobotCocinero
    }
}