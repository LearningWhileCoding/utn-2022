package ciclos12;

import java.util.Scanner;

public class Ciclos12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(sc.nextLine());

        int i = 1, result = 1;

        for(;i<=number; i++) {


            result *= i;


        }

        System.out.println(number + "! = " + result);
    }
}
