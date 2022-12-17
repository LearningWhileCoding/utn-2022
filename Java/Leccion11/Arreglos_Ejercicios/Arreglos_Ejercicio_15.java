import java.util.Scanner;

public class Arreglos_Ejercicio_15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] array = new int[10];

        input(array, sc);

    }

    private static void input(int[] array, Scanner sc) {

        do {

            System.out.println("Please enter ten numbers in increasing order: ");

            for (int i = 0; i < array.length; i++) {

                array[i] = sc.nextInt();
            }
        } while (!verify(array));

        System.out.println("Enter a number to search: ");
        int number = sc.nextInt();

        for (int i = 0; i < array.length; i++) {

            if(array[i] == number) {

                System.out.println("Number founded in the position:  " + i);
            } else if (i == 9 && array[i] != number) {
                    System.out.println("Number doesn't exist on the array.");
            }

        }
    }

    private static boolean verify(int[] array) {

        boolean result = false;

        for (int i = 0; i < array.length - 1; i++) {

            if(array[i] > array[i+1]) {
                result = false;
                System.out.println("Numbers unordered, try again!\n");
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}
