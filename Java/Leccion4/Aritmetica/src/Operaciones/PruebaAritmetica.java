package Operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {

        Aritmetica aritmetica = new Aritmetica();

        aritmetica.a = 10;
        aritmetica.b = 90;

        aritmetica.sumarNumeros();

        int resultado = aritmetica.sumarConRetorno();
        System.out.println("resultado = " + resultado);

        resultado = aritmetica.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos = " + resultado);

    }
}
