package arreglos_ejercicio_3;

import java.util.Scanner;

public class Arreglos_Ejercicio_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double numeros [] = new double [5];
        double positivos = 0, negativos = 0, promedioPositivos = 0, promedioNegativos = 0;
        int ceros = 0;

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Ingrese un numero: ");
            numeros[i] = sc.nextDouble();

            if(numeros[i] > 0) {
                positivos ++;
                promedioPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                negativos ++;
                promedioNegativos += numeros[i];
            } else {
                ceros++;
            }

        }

        
        if (promedioPositivos < 1) {
            System.out.println("No se ingreso ningun numero positivo.");
        } else {

            promedioPositivos /= positivos;
            System.out.println("Promedio Positivos = " + promedioPositivos);
        }
        if (promedioNegativos > 0) {
            System.out.println("No se ingreso ningun numero negativo.");
        } else {

            promedioNegativos /= negativos;
            System.out.println("Promedio Negativos = " + promedioNegativos);
        }

        System.out.println("ceros = " + ceros);
    }
}
