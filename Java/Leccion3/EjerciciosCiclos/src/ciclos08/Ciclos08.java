package ciclos08;

import javax.swing.*;

public class Ciclos08 {

    public static void main(String[] args) {

        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

        for(int i = 1;i<=number;i++){

            System.out.print(i + " ");
        }

    }

}
