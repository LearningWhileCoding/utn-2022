package test;


import domain.Cliente;
import domain.Empleado;
import domain.Persona;

import java.util.Date;

public class testHerencia {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Homero", 9000.0);
        System.out.println("empleado1 = " + empleado1);

        /*Date fecha1 = new Date();

        Cliente cliente1 = new Cliente(fecha1, true, "Bart", 'M', 17, "Av. Evergeen 742");
        System.out.println("cliente1 = " + cliente1);

        Persona persona1 = new Persona();*/
    }
}
