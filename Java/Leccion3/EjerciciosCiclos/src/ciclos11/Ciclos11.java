package ciclos11;

import javax.swing.*;

public class Ciclos11 {

    public static void main(String[] args) {

        int number, odd = 1, count = 0;

        while(count < 10) {

            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

            if(number % 2 != 0) {

                count++;

                odd *= number;

            }


        }

        System.out.println("Total = " + odd);

    }
}
