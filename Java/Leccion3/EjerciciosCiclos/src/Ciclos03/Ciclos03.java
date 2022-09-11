package Ciclos03;

import java.util.Scanner;

public class Ciclos03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int even = 0, odd = 0;
        System.out.println("Write a number");
        int number = Integer.parseInt(sc.nextLine());

        while(number != 0) {

            if (number % 2 == 0) {

                even++;

            } else {

                odd++;
            }
            System.out.println("Write a number");
            number = Integer.parseInt(sc.nextLine());

        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd number: " + odd);



    }
}
