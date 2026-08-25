
package ejercicio2guia3med;
import java.util.Arrays;
public class Ejercicio2guia3MED {

    public static void main(String[] args) {
        int[] datos = {1, 5, 8, 9, 2, 3, 1};

        System.out.println("Array original: " + Arrays.toString(datos));

     
        Arrays.sort(datos);
        System.out.println("De menor a mayor: " + Arrays.toString(datos));

        
        System.out.print("De mayor a menor: [");
        for (int i = datos.length - 1; i >= 0; i--) {
            System.out.print(datos[i] + (i > 0 ? ", " : ""));
        }
        System.out.println("]");
        
    }
    
}
