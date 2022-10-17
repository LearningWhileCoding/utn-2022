package src.pasoporreferencia;

import Clases.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.nombre = "Mery";
        System.out.println("persona1 nombre = " + persona1.nombre);

        cambiarValor(persona1);
        System.out.println("El cambio en persona1 es: " + persona1.nombre);

        persona1 = cambiarElValor(persona1);

        Persona persona2 = new Persona();
        persona2 = cambiarElValor(persona2);
        System.out.println("El nuevo valor de persona2 = " + persona2.nombre);
    }

    public  static void cambiarValor(Persona persona){ //Parámetros por referencia

        persona.nombre = "Ariadna";
    }

    public static Persona cambiarElValor(Persona persona){

        if (persona == null) {

            System.out.println("El valor de persona es null.");
            return null;
        }
        else {

            persona.nombre = "Alice";
            return persona;
        }

    }
}
