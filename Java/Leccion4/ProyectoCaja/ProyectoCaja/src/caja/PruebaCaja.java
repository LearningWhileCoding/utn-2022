package caja;

public class PruebaCaja {

    public static void main(String[] args) {


        float ancho = 2.5F;
        float alto = 1.7F;
        float largo = 3.5F;

        Caja miCaja = new Caja();

        miCaja.largo = largo;
        miCaja.alto = alto;
        miCaja.ancho = ancho;

        float resultado = miCaja.getVolumen();

        System.out.println("Volumen miCaja = " + resultado);


        Caja miCaja2 = new Caja(5, 7, 8.5F);

        System.out.println("miCaja2.getVolumen() = " + miCaja2.getVolumen());

    }
}
