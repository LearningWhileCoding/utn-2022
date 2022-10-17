package ciclos06;

import java.util.Scanner;

public class Ciclos06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0, number;

        do{

            System.out.print("Enter a number: ");
            number = Integer.parseInt(sc.nextLine());
            sum += number;
        }while (number != 0);

        System.out.println("The result is = " + sum);
    }

}
