
import java.util.Scanner;


public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros enteros: ");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();       
        
        String resultado = (numero1 > numero2) ? "El numero 1 es mayor" : "El numero 2 es mayor";
        System.out.println("resultado = " + resultado);
    }
}
