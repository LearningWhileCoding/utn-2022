package Ciclos02;

import javax.swing.*;

public class Ejercicio02 {
    public static void main(String[] args) {

        Integer number;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

        while(number != 0){

            if(number > 0) {

                System.out.println("It's a positive number.");
            }else {
                System.out.println("It's a negative number.");
            }

            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

        }
    }
}
