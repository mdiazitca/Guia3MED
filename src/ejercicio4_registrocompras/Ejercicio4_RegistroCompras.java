/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4_registrocompras;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4_RegistroCompras {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> productos = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {

            System.out.print("Producto: ");
            productos.add(scanner.next());

            System.out.print("Precio: ");
            precios.add(scanner.nextDouble());

            System.out.print("¿Desea agregar otro producto? (s/n): ");
            continuar = scanner.next();
        }

        double total = 0;

        System.out.println("\nProductos comprados:");

        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i) + " - $" + precios.get(i));
            total += precios.get(i);
        }

        System.out.println("Total: $" + total);

        scanner.close();
    }
}
