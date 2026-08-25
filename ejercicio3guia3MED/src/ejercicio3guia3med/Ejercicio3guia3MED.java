
package ejercicio3guia3med;
import java.util.Scanner;
public class Ejercicio3guia3MED {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalEmpleados = 5;
        String[] nombres = new String[totalEmpleados];
        String[] cargos = new String[totalEmpleados];
        double[] sueldos = new double[totalEmpleados];

        System.out.println("=== REGISTRO DE EMPLEADOS ===");

        for (int i = 0; i < totalEmpleados; i++) {
            System.out.println("\n--- Empleado " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            nombres[i] = scanner.nextLine();

            System.out.print("Cargo: ");
            cargos[i] = scanner.nextLine();

            System.out.print("Sueldo: $");
            sueldos[i] = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("\n================ LISTADO DE EMPLEADOS ================");
        System.out.printf("%-20s %-20s %-12s%n", "Nombre", "Cargo", "Sueldo");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < totalEmpleados; i++) {
            System.out.printf("%-20s %-20s $%-11.2f%n", nombres[i], cargos[i], sueldos[i]);
        }

        scanner.close();
        // TODO code application logic here
    }
    
}
