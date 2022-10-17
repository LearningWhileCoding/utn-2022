package ciclos05;

import java.util.Scanner;

public class Ciclos05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer x, count = 1, number;
        number = (int)(Math.round(Math.random()*100));


        do{

            System.out.print("Digit a number: ");
            x = Integer.parseInt(sc.nextLine());
            count++;

            if(x > number) {

                System.out.println("Away");
            } else if (x < number) {

                System.out.println("Closer");
            }

        }while (x != number);

        System.out.println("You got it right in " + count + " attempts !");

    }
}
