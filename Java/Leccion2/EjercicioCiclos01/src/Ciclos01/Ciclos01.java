package Ciclos01;

import java.util.Scanner;

public class Ciclos01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number, square;
        System.out.println("Write a number: ");
        number = Integer.parseInt(sc.nextLine());

        while (number >= 0){

            square = (int)Math.pow(number, 2);
            System.out.println("The number " + number + " squared is = " + square);
            System.out.println("Digit another number: ");
            number = Integer.parseInt(sc.nextLine());
        }
        System.out.println("The program has finished due to a negative number");
    }
}
