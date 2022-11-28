package ejercicio_5;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {


        int matrix[][] = new int[3][3];

        int filas[] = new int[3];

        int columnas[] = new int[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < filas.length; i++) {

            for (int j = 0; j < columnas.length; j++) {

                System.out.print("["+i+"]["+j+"] = ");

                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < filas.length; i++) {

            for (int j = 0; j < columnas.length; j++) {

                filas[i] += matrix[i][j];
            }
        }

        for (int i = 0; i < columnas.length; i++) {

            for (int j = 0; j < filas.length; j++) {

                columnas[i] += matrix[j][i];
            }
        }


        System.out.println("Filas: ");
        for (int i = 0; i < filas.length; i++) {

            System.out.println(i + 1 + ". [" + filas[i] + "]");
        }

        System.out.println("Columnas: ");
        for (int i = 0; i < columnas.length; i++) {

            System.out.println(i + 1 + ". [" + columnas[i] + "]");
        }




    }
}
