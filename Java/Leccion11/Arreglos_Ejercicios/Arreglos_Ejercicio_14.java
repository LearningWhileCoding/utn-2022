import java.util.Scanner;


public class Arreglos_Ejercicio_14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] serieUno = new int[10];

        int[] serieDos = new  int[10];

        int[] serieTres = new  int[20];

        input(serieUno, sc);

        input(serieDos, sc);

        mix(serieUno, serieDos, serieTres);

        System.out.println("Mixed Serie: ");
        print(serieTres);
    }


    private static void input(int[] array, Scanner sc) {

        do {

            System.out.println("Please enter ten numbers in increasing order: ");

            for (int i = 0; i < array.length; i++) {

                array[i] = sc.nextInt();
            }
        } while (!verify(array));
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

    private static void mix (int[] serieUno, int[] serieDos, int[] serieTres) {

        int i = 0, j = 0, k= 0, z = 0;

        while (k < 20) {

            if ( k < 10) {

                serieTres[k] = serieUno[k];
            } else {

                serieTres[k] = serieDos[z];
                z++;
            }

            k++;
        }

        sort(serieTres);
    }

    private static void sort(int[] serieTres) {

        for (int i = 0; i < serieTres.length - 1; i++) {

            for (int j = 0; j < serieTres.length - 1; j++) {

                if( serieTres[j] >  serieTres[j+1] ) {

                    int temp = serieTres[j];
                    serieTres[j] = serieTres[j+1];
                    serieTres[j+1] = temp;

                }
            }
        }
    }

    private static void print(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + ", ");
        }
    }

}
