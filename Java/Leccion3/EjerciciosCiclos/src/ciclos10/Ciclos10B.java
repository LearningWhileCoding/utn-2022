package ciclos10;

import javax.swing.*;

public class Ciclos10B {

    public static void main(String[] args) {

        int number, sum=0, i=0;

        for(;i< 10; i++){

            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
            sum += number;
        }

        JOptionPane.showMessageDialog(null, "The sum is = " + sum);
    }
}
