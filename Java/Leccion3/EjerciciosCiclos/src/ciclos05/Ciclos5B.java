package ciclos05;

import javax.swing.*;

public class Ciclos5B {

    public static void main(String[] args) {

        Integer x, count = 0, number;
        number = (int)(Math.round(Math.random()*100));

        do{

            x = Integer.parseInt(JOptionPane.showInputDialog("Digit a number: "));

            count++;

            if(x > number) {

                System.out.println("Away");

            } else if (x < number) {

                System.out.print("Closer");
            }

        } while (x != number);

        System.out.println("You got it right in " + count + " attempts !");

    }
}
