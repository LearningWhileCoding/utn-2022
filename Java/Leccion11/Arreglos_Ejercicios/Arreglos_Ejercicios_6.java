import java.util.Scanner;

public class Arreglos_Ejercicios_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix1 = new int[5][9];

        int[][] matrix2 = new int[9][5];

        input(matrix1, sc);
        change(matrix1 ,matrix2);

        System.out.println("Original matrix: ");
        print(matrix1);

        System.out.println("Modified matrix: ");
        print(matrix2);
    }

    private static void input(int[][] matrix, Scanner sc) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print("[" + i + "][" + j + "] = ");

                matrix[i][j] = sc.nextInt();
            }
        }
    }
    private static void print(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    private static void change(int[][] matrixA, int[][] matrixB) {

        for (int i = 0; i < matrixA.length; i++) {

            for (int j = 0; j < matrixA[0].length; j++) {

                matrixB[j][i] = matrixA[i][j];
            }
            System.out.println();
        }
    }
}
