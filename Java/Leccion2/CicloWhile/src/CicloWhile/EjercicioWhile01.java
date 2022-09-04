package CicloWhile;

public class EjercicioWhile01 {

    public static void main(String args[]){

        var counter = 0;

        while (counter <= 7) {

            System.out.println("Counter = " + counter);
            counter++;
        }

        counter = 0;

        do {

            System.out.println("Counter = " + counter);
            counter++;

        }while (counter <= 7);

        for (counter = 0; counter < 7; counter++){

            if(counter % 2 == 0){

                System.out.println("Counting = " + counter);
                break;
            }

        }

        inicio: //Label Go To-->
        for (counter = 0; counter < 7; counter++){

            if(counter % 2 != 0){

                continue inicio; //Siguiente Iteracion
            }

            System.out.println("Counting = " + counter);

        }


    }
}
