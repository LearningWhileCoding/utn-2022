import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int [3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("matrix = ["+i+"]["+j+"] = " );
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Matriz transpuesta...");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
