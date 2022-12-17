import java.util.Scanner;

public class Arreglos_Ejercicio_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        int x = 0;

        int position = input(array, sc);

        delete(array, position);

        print(array);
    }

    private static int input(int[] array, Scanner sc) {

        System.out.println("Please enter ten numbers below: ");

        for (int i = 0; i < 10; i++) {

            array[i] = sc.nextInt();
        }

        int p;

        do{

            System.out.println("Now enter a position to delete: ");
            p = sc.nextInt();
        } while (p < 0 || p > 9);

        return p;
    }

    private static void delete(int[] array, int position) {

        for (int i = position; i < 9; i++) {

            array[i] = array[i+1];
        }
    }

    private static void print(int[] array) {

        System.out.println("Final Array: ");
        for (int i = 0; i < array.length-1; i++) {

            System.out.print(array[i] + ", ");
        }
    }
}
