/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5_calificacionestudiante;

/**
 *
 * @author liliq
 */
import java.util.Scanner;
public class Ejercicio5_calificacionestudiante {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidad = entrada.nextInt();

        double[] calificaciones = new double[cantidad];

        double suma = 0;
        double mayor;
        double menor;

        // Ingresar calificaciones
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la calificacion del estudiante " + (i + 1) + ": ");
            calificaciones[i] = entrada.nextDouble();

            suma += calificaciones[i];
        }

        // Inicializar mayor y menor
        mayor = calificaciones[0];
        menor = calificaciones[0];

        // Buscar mayor y menor
        for (int i = 1; i < cantidad; i++) {

            if (calificaciones[i] > mayor) {
                mayor = calificaciones[i];
            }

            if (calificaciones[i] < menor) {
                menor = calificaciones[i];
            }
        }

        double promedio = suma / cantidad;

        // Mostrar los  resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificacion mas alta: " + mayor);
        System.out.println("Calificacion mas baja: " + menor);
    }
    
    
}
