package ciclos12;

import javax.swing.*;
import java.util.Scanner;

public class Ciclos12B {

    public static void main(String[] args) {


        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

        int i = 1, result = 1;

        for(;i<=number; i++) {


            result *= i;


        }

        JOptionPane.showMessageDialog(null, number + "! = " + result);
    }
}
