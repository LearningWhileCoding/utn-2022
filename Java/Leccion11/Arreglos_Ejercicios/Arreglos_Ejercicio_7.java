import java.util.Scanner;

public class Arreglos_Ejercicio_7 {

    public static void main(String[] args) {

        int[][] matrix = new int[5][5];

        load(matrix);

        System.out.println("FRAME MATRIX: ");

        print(matrix);

    }

    private static void load(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if( i == 0 || i == matrix.length - 1) {

                    matrix[i][j] = 1;
                } else if (j == 0 || j == matrix.length - 1) {

                    matrix[i][j] = 1;
                } else {

                    matrix[i][j] = 0;
                }

            }
        }
    }

    private static void print(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
