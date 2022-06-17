package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float salario;
        
        final float base = 1000;

        System.out.println("Ingrese la cantidad de autos vendidos: ");
        float carros = Float.parseFloat(sc.nextLine());
        System.out.println("Ingrese el valor total de los autos vendidos: ");
        float valor = Float.parseFloat(sc.nextLine());

        salario = (float) (base + ((150 * carros) + (valor * 0.95)));
        
        System.out.println("Su salario final es : " + salario);

    }

}
