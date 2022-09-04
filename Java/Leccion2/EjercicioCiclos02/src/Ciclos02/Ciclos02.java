package Ciclos02;

import java.util.Scanner;

public class Ciclos02 {

    public static void main(String[] args) {

        Integer number;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        number = Integer.parseInt(sc.nextLine());

        while(number != 0){

            if(number > 0) {

                System.out.println(number + " It's a positive number.");
            }else {
                System.out.println(number + " It's a negative number.");
            }

            System.out.print("Enter a number: ");
            number = Integer.parseInt(sc.nextLine());

        }
    }
}
