package caja;

public class Caja {

    float ancho, alto, largo;

    public  Caja(){} // Metodo constructor por default es necesario para crear el segundo constructor

    public Caja(float ancho, float alto, float largo){

        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;

    }



    public float getVolumen(){

        return ancho * alto * largo;
    }
}
