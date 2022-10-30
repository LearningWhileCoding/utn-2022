package test;

import domain.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {

        Persona persona = new Persona("Bart");
        System.out.println("persona = " + persona);
        
        Persona persona2 = new Persona("Homer");
        System.out.println("persona2 = " + persona2);

        imprimir(persona);
        imprimir(persona2);

        // this.contador = 10; --> NO se puede referenciar desde un contexto estático.

        PersonaPrueba p1 = new PersonaPrueba();
        System.out.println(p1.getContador());
    }

    public static void imprimir(Persona persona) {

        System.out.println("persona = " + persona);
    }

    public int getContador() {

        return this.contador;
    }

    private int contador;
}
