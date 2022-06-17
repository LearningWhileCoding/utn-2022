
import java.util.Scanner;


public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        int horas = entrada.nextInt();
        
        System.out.println("ahora ingrese la tarifa por hora: ");
        float tarifa = entrada.nextFloat();
        
        float salario =  horas * tarifa;
        
        System.out.println("salario = " + salario);
        
    }
    
}
