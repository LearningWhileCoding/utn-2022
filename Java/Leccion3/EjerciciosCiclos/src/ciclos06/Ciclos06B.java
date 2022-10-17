package ciclos06;

import javax.swing.*;

public class Ciclos06B {

    public static void main(String[] args) {

        int sum = 0, number;

        do{

            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
            sum += number;
        }while (number != 0);

        JOptionPane.showMessageDialog(null,"The result is = " + sum);
    }
}
