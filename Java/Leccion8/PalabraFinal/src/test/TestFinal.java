package test;

import domain.Persona;

/*
* Esta palabra puede tener 2 significados dependiendo donde se aplique:
* Variables: Evita el cambio de sus valores.
* Metodos: Evita su modificacion en su definicion o comportamiento desde una sublcase.
* Clases: Restringe la creacion de clases hijas.
* Otra caracteristica es combinar una variable con el modificador de acceso static para convertir una variable en constante
* es decir, inmutabilidad. Ejemplos: clase Math, variable PI = CONSTANTE
* */
public class TestFinal {

    public static void main(String[] args) {

        final int dni = 5453212;
        System.out.println("dni = " + dni);
        // dni = 7852424;  Inmutable

        // Persona.CONSTANTE_AQUI = 10; Inmutable
        System.out.println("Mi atributo constante es: " + Persona.CONSTANTE_AQUI);

        final Persona persona1 = new Persona();
        // persona1 = new Persona(); No se puede asignar una nueva referencia al objeto, pero si modificar los valores de sus atributos.
        persona1.setNombne("Olivia");
        System.out.println("persona1.getNombre() = " + persona1.getNombre());
        
        persona1.setNombne("Katherine");
        System.out.println("persona1.getNombre() = " + persona1.getNombre());
        
    }   
}
