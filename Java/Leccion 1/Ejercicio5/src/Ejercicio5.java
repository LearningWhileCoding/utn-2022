
import java.util.Scanner;


public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la 1er nota: ");
        float score1 = Float.parseFloat(sc.nextLine());
        System.out.println("Ingresa la 2da nota: ");
        float score2 = Float.parseFloat(sc.nextLine());
        System.out.println("Ingresa la 3er nota: ");
        float score3 = Float.parseFloat(sc.nextLine());        
        
        float score = score1 + score2 + score3;
        
        System.out.println("La nota final es = " + score);
        
    }
    
}
