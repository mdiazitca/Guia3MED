
package ejercicio1guia3med;
import java.util.Scanner;
public class Ejercicio1guia3MED {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("=== INGRESO DE 5 NÚMEROS ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int maximo = numeros[0];
        int minimo = numeros[0];
        int posMaximo = 0;
        int posMinimo = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
                posMaximo = i;
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
                posMinimo = i;
            }
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Máximo valor: " + maximo + " (Posición/Índice: " + posMaximo + ")");
        System.out.println("Mínimo valor: " + minimo + " (Posición/Índice: " + posMinimo + ")");

        scanner.close();
        // TODO code application logic here
    }
    
}
