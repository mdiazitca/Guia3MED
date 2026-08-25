
package ejercicio7guia3med;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio7guia3MED {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> descripciones = new ArrayList<>();
        ArrayList<Double> montos = new ArrayList<>();

        System.out.println("=== REGISTRO DE GASTOS MENSUALES ===");
        
        while (true) {
            System.out.print("Ingrese la descripción del gasto (o 'fin' para terminar): ");
            String descripcion = scanner.nextLine();

            if (descripcion.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Ingrese el monto de '" + descripcion + "': $");
            double monto = Double.parseDouble(scanner.nextLine());

            descripciones.add(descripcion);
            montos.add(monto);
        }

        double total = 0;
        System.out.println("\n--- Resumen de Gastos ---");
        for (int i = 0; i < descripciones.size(); i++) {
            System.out.println("- " + descripciones.get(i) + ": $" + montos.get(i));
            total += montos.get(i);
        }

        System.out.println("-------------------------");
        System.out.printf("Total gastado: $%.2f%n", total);
        
        scanner.close();
        // TODO code application logic here
    }
    
}
