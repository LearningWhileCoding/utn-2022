package Ciclos04;

import javax.swing.*;

public class Ciclos04B {

    public static void main(String[] args) {

        int total = 0, number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

        while(number >= 0) {

            total++;

            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

        }

        System.out.println("Total numbers: " + total);
    }
}
