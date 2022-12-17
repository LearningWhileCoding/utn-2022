import java.util.Scanner;

public class Arreglos_ejercicio_4 {

    public static void main(String[] args) {

        int[] myArray = new int[10];

        input(myArray);

        print(myArray);

    }

    private static void input( int[] array) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ten numbers below: ");

        for (int i = 0; i < 10; i++) {

            array[i] = sc.nextInt();
        }
    }

    private static void print(int[] array) {

        int j = 10;

        for (int i = 0; i < array.length / 2; i++) {

            System.out.println("Array [" + (i + 1) + "] = " + array[i]);

            j--;

            System.out.println("Array [" + (j + 1) + "] = " + array[j]);

        }
    }
}
