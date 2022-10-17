package Operaciones;

import org.w3c.dom.ls.LSOutput;

public class PruebaAritmetica {

    public static void main(String[] args) {

        var a = 10; //variables locales
        int b = 7; //Memoria stack

        miMetodo(); //Llamamos al método

        Aritmetica aritmetica1 = new Aritmetica();

        aritmetica1.a = 10;
        aritmetica1.b = 90;

        aritmetica1.sumarNumeros();

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos = " + resultado);

        System.out.println("aritmetica1 a: "+aritmetica1.a);
        System.out.println("aritmetica1 b: "+aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);

        //aritmetica1 = null; NUNCA utilizar esto, no de debe hacer !!!
        //System.gc(); método para limpiar residuos, es pesado, NO utilizar !!!



        Persona persona = new Persona("Augusto", "Britos");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: " + persona.nombre);
        System.out.println("Persona apellido: " + persona.apellido);
    }
    //Modularidad, nuevo metodo
    public static void miMetodo(){
        //a = 10; ---> Fuera del Scope
        System.out.println("Aquí hay oto método");
    }



}

class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {

        super(); // llamada al constructor de la clase Padre Object

        // Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);

        this.nombre = nombre;
        this.apellido = apellido;

        System.out.println("Objeto persona usando this " + this);

        System.out.println("nombre = " + this.nombre);
        System.out.println("apellido = " + this.apellido);
    }
}

class Imprimir {

    public Imprimir() {

        super(); // El constructor de la clase padre, para reservar memoria.
    }

    public  void  imprimir(Persona persona){

        System.out.println("Persona desde la clase imprimir: " + persona);
        System.out.println("Impresion del objeto actual (this) : " + this);
    }
}