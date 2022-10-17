package ciclos09;

import javax.swing.*;

public class Ciclos09 {

    public static void main(String[] args) {

        String date;
        boolean flag = false;
        int day, month, year;

        do{

            do {
                date = JOptionPane.showInputDialog("Enter a date: ");
            } while (date.length() != 10);

            day = Integer.parseInt(date.substring(0,2));
            month = Integer.parseInt(date.substring(3,5));
            year = Integer.parseInt(date.substring(6,10));

            if ((day > 0 && day < 31) && (month > 0 && month < 13) && (year > 0)){

                flag = true;
            }else {
                System.out.println("Wrong date!");
            }

        }while (!flag);

        System.out.println("The date: " + day + " " + month + " " + year + " is right.");

    }

}
