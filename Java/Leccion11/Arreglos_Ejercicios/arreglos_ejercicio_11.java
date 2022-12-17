import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class arreglos_ejercicio_11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        entrada(array, sc);

        int position = 0;

        change(array, position, sc);


    }

    private static void entrada( int[] array, Scanner sc) {

        boolean f = false;

        do {

            System.out.println("Please enter five numbers in increasing order: ");

            for (int i = 0; i < 5; i++) {

                array[i] = sc.nextInt();
            }

            f = verify(array);

        } while (!f);
    }

    private static boolean  verify(int[] array) {

        boolean flag = false;

        for (int i = 0; i < 4; i++) {

            if(array[i] < array[i+1]) {

                flag = true;
            } else if (array[i] > array[i+1]){

                flag = false;
                System.out.println("The numbers are not ordered! :(.");
                break;
            }
        }

        return flag;
    }

    private static void change(int[] array, int position, Scanner sc) {

        System.out.println("Enter a number to insert: ");
        int numero = sc.nextInt();
        int j = 0;

        while (array[j] < numero && j<5) {
            position++;
            j++;
        }

        for (int i = 4; i >= position; i--) {

            array[i+1] = array[i];
        }

        array[position] = numero;

        for (int i = 0; i < 6; i++) {

            System.out.println("["+i+"] = " + array[i]+" ");
        }

    }
}
