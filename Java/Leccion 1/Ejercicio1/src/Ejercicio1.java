    //Tienda de libros
import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("-----Tienda de Libros-----");
        System.out.println("");
        System.out.println("Ingrese los siguentes datos del libro: ");
        
        System.out.print("Titulo: ");
        var titulo = entrada.nextLine();
        
        System.out.print("ID: ");
        var Id = entrada.nextLine();
        
        System.out.print("Precio: ");
        var precio = entrada.nextLine();
        
        System.out.print("¿ Envio gratis ? Y/N ");
        String envio = entrada.nextLine();
        
        System.out.println("");
        System.out.println("Titulo = " + titulo);
        System.out.println("ID = " + Id);
        System.out.println("Precio = " + precio);
        
        if("Y".equals(envio) || "y".equals(envio)){
            System.out.println("Envio: gratis.");
        }
        else{
            System.out.println("Envio: pago.");
        }

    }
}

