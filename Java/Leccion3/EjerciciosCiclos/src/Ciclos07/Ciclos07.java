package Ciclos07;

import java.util.Scanner;

public class Ciclos07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0, number, count = 0;
        float avg;

        System.out.print("Enter a number: ");
        number = Integer.parseInt(sc.nextLine());
        while (number >= 0) {

        sum += number;
        count++;
        System.out.print("Enter a number: ");
        number = Integer.parseInt(sc.nextLine());
        }

        if( count == 0) {
            System.out.println("The operation could not be resolved");
        } else {
            avg = (sum / count);
            System.out.println(" The average is = " + avg + "%");
        }

    }
}
