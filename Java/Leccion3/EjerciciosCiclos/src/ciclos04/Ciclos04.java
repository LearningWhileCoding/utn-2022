package ciclos04;

import java.util.Scanner;

public class Ciclos04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        System.out.println("Write a number");
        int number = Integer.parseInt(sc.nextLine());

        while(number >= 0) {

            total++;

            System.out.println("Write a number");
            number = Integer.parseInt(sc.nextLine());

        }

        System.out.println("Total numbers: " + total);

    }
}
