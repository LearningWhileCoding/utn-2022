package test;

import dominio.Persona;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona("Carl", 7777, false);
        System.out.println(persona);
        System.out.println("Persona su sueldo es = " + persona.getSueldo());

        persona.setSueldo(12500);

        System.out.println("Persona modificada su sueldo es = " + persona.getSueldo());
        System.out.println("Person nombre: " + persona.getNombre());
        System.out.println("Person boolean: " + persona.isEliminado());

        Persona persona2 = new Persona("Leny", 8700, false);
        System.out.println("Nombre: " + persona2.getNombre() + " Sueldo: " + persona2.getSueldo() + " Estado: " + persona2.isEliminado());
        persona2.setNombre("Barney");
        persona2.setSueldo(9000);
        System.out.println("Nombre: " + persona2.getNombre() + " Sueldo: " + persona2.getSueldo() + " Estado: " + persona2.isEliminado());

        System.out.println(persona);
    }
}
