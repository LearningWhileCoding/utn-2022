package Ciclos01;

import javax.swing.JOptionPane;

public class Ejercicio01 {

    public static void main(String[] args) {

        int number, square;

        number = Integer.parseInt(JOptionPane.showInputDialog("Digit a number: "));

        while (number >= 0){

            square = (int)Math.pow(number, 2);
            System.out.println("The number " + number + " squared is = " + square);
            number = Integer.parseInt(JOptionPane.showInputDialog("Digit another number: "));
        }
        System.out.println("The program has finished due to a negative number");

    }
}
