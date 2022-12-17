import java.util.Scanner;

public class Arreglos_Ejercicio_13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        int evenCount = input(array, sc);

        int[] evenArray = new int[evenCount];

        int[] oddArray = new  int[array.length-evenCount];

        save(array, evenArray, oddArray);

        System.out.print("Initial array: ");
        print(array);

        System.out.print("\nEven array: ");
        print(evenArray);

        System.out.print("\nOdd array: ");
        print(oddArray);
    }

    private static int input(int[] array, Scanner sc) {

        int evenCount = 0;

        System.out.println("Please enter 10 numbers below: ");

        for (int i = 0; i < 10; i++) {

            array[i] = sc.nextInt();

            if (array[i] % 2 == 0) {

                evenCount++;
            }

        }
        return evenCount;

    }

    public static void save(int[] array, int[] evenArray, int[] oddArray) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < array.length; i++) {

            if( array[i] % 2 == 0 ) {

                evenArray[x] = array[i];
                x++;
            } else {

                oddArray[y] = array[i];
                y++;
            }
        }
    }

    private static void print(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + ", ");
        }
    }

}
