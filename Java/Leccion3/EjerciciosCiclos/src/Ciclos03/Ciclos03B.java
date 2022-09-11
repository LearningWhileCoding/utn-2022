package Ciclos03;

import javax.swing.*;

public class Ciclos03B {

    public static void main(String[] args) {

        int even = 0, odd = 0;
        String msg = "SADFSADSAD";
        int number = Integer.parseInt(JOptionPane.showInputDialog(msg));

        while(number != 0) {

            if (number % 2 == 0) {

                even++;

            } else {

                odd++;
            }

            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd number: " + odd);

    }
}
