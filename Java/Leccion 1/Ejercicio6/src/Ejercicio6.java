
import java.util.Scanner;


public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de $: ");
        float dato = Float.parseFloat(sc.nextLine());
        
        float total = (dato +(dato / 2));
        
        total = total + (total / 2);
        
        
        System.out.println("total = " + total);
    }
    
}
