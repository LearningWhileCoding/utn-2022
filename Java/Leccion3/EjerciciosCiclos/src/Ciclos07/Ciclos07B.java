package Ciclos07;

import javax.swing.*;

public class Ciclos07B {

    public static void main(String[] args) {

        int sum = 0, number, count = 0;
        float avg;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        while (number >= 0) {

            sum += number;
            count++;
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        }

        if( count == 0) {

            JOptionPane.showMessageDialog(null, "The operation could not be resolved");

        } else {

            avg = (sum / count);
            JOptionPane.showMessageDialog(null, "The average is = " + avg + "%");
        }
    }
}
