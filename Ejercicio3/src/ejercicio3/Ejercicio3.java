/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author liliq
 */
import java.util.Scanner;

class Empleado {
    String nombre;
    String cargo;
    double sueldo;

    public Empleado(String nombre, String cargo, double sueldo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Empleado[] empleados = new Empleado[5];

        // Registrar empleados
        for (int i = 0; i < 5; i++) {

            System.out.println("\nEmpleado " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = entrada.nextLine();

            System.out.print("Cargo: ");
            String cargo = entrada.nextLine();

            System.out.print("Sueldo: ");
            double sueldo = entrada.nextDouble();

            entrada.nextLine(); // Limpiar el Enter

            empleados[i] = new Empleado(nombre, cargo, sueldo);
        }

        // Mostrar empleados
        System.out.println("\n===== LISTA DE EMPLEADOS =====");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEmpleado " + (i + 1));
            System.out.println("Nombre: " + empleados[i].nombre);
            System.out.println("Cargo: " + empleados[i].cargo);
            System.out.println("Sueldo: $" + empleados[i].sueldo);
        }

        entrada.close();
        
        
    }
}