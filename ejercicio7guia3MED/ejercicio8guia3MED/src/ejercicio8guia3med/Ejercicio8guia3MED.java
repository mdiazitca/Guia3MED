
package ejercicio8guia3med;
import java.util.Scanner;
public class Ejercicio8guia3MED {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos productos deseas ingresar al inventario? ");
        int cantidadProductos = Integer.parseInt(scanner.nextLine());

        // Filas: Productos | Columnas: 0=Nombre, 1=Precio, 2=Cantidad
        String[][] inventario = new String[cantidadProductos][3];

        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("\n--- Producto " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            inventario[i][0] = scanner.nextLine();

            System.out.print("Precio: $");
            inventario[i][1] = scanner.nextLine();

            System.out.print("Cantidad disponible: ");
            inventario[i][2] = scanner.nextLine();
        }

        double valorTotalInventario = 0;

        System.out.println("\n================ INVENTARIO DE PRODUCTOS ================");
        System.out.printf("%-15s %-12s %-12s %-12s%n", "Nombre", "Precio U.", "Cantidad", "Subtotal");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < cantidadProductos; i++) {
            String nombre = inventario[i][0];
            double precio = Double.parseDouble(inventario[i][1]);
            int cantidad = Integer.parseInt(inventario[i][2]);
            double subtotal = precio * cantidad;

            valorTotalInventario += subtotal;

            System.out.printf("%-15s $%-11.2f %-12d $%-11.2f%n", nombre, precio, cantidad, subtotal);
        }

        System.out.println("---------------------------------------------------------");
        System.out.printf("Valor Total del Inventario: $%.2f%n", valorTotalInventario);

        scanner.close();
        // TODO code application logic here
    }
    
}
