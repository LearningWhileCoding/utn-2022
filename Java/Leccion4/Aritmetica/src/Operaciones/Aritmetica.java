package Operaciones;

public class Aritmetica {

    //Atributos
    int a;
    int b;


    //Sobrecarga de constructores - Overload
    public Aritmetica() { //Constructor 1

        System.out.println("Se està ejecutando el constructor numero 1");
    }

    public  Aritmetica(int a, int b) { //Constructor 2

        this.a = a;
        this.b = b;
        System.out.println("Se está ejecutando el constructor numero 2");
    }

    //Metodo
    public void sumarNumeros(){

        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno(){
        //int resultado = a + b;
        return a + b;
    }
    public int sumarConArgumentos(int a, int b) {
        this.a = a;
        this.b = b;
        //return a + b;
        return this.sumarConRetorno();

    }

}
