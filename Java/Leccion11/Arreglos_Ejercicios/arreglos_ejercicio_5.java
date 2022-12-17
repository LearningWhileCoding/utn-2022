import java.util.Scanner;

public class arreglos_ejercicio_5 {

    public static void main(String[] args) {

        int table1[][] = new int[5][2];
        int table2[][] = new int[5][2];
        int table3[][] = new int[10][2];

        takeInput(table1);
        takeInput(table2);

        mixData(table1, table2, table3);

        print(table3);
    }

    private static void takeInput(int[][] array) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter ten numbers below: ");

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.print("["+i+"]["+j+"] = ");
                array[i][j] = sc.nextInt();
            }
        }
    }

    private static void mixData(int[][] a, int[][] b, int[][] c) {
        System.out.println("Table mixed: ");

        boolean flag = true;

        int x = 0;

        for (int i = 0; i < a.length; i++) {

            int z =0;

            for (int j = 0; j < 2; j++) {



                    c[x][z] = a[i][j];

                    c[x][z+1] = b[i][j];

                    x++;


            }


        }
    }

    private static void print(int[][] c) {

        System.out.println("Table mixed: ");

        for (int i = 0; i < c.length; i++) {

            for (int j = 0; j < 2; j++) {


                System.out.println("["+i+"]["+j+"] = " + c[i][j]);

            }
        }
    }
}
