package arreglos_ejercicio_1;

import java.util.Scanner;

public class Arreglos_Ejercicio_1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }

        for (int n : numeros) {

            System.out.println("Numero = " + n);
        }


    }
}
