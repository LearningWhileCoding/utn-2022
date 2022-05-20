
import java.util.Scanner;

//Hola Mundo en Java

public class HolaMundo {

    public static void main(String[] args) {
        /*System.out.println("Hola Mundo");
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "HEY";
        System.out.println(miVariableCadena);
        miVariableCadena = "Seguimos creciendo en programación";
        System.out.println(miVariableCadena);
         */

        //VAR - Inferencia en tipos en JAVA
        /*var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando!";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2); //soutv + tab
         */
        //Inferencia de tipos
        /*var usuario = "Osvald";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b)); //Paréntesis cambian la PRIORIDAD!

        //Caracteres Especiales en JAVA
        var nombre = "Fulano";
        System.out.println("Nueva linea: \n" + nombre); //Salto de línea \n
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("\t\t.:MENU:.");
        System.out.println("Retroceso: \b\b\b\b\b" + nombre); //Retrocede de a un espacio
        System.out.println("Comillas simples: \'" + nombre + "\'");
        System.out.println("Comillas dobles: \"" + nombre + "\"");
        */
       
        //Clase Scanner
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        var usuario2 = input.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Ingrese su título: ");
        var titulo2 = input.nextLine();
        System.out.println(titulo2 + " " + usuario2);
        
        //Ejercicio
        System.out.println("Ingrese el nombre del libro: ");
        var libro = input.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        var autor = input.nextLine();
        System.out.println("El libro: " + libro + " fue escrito por: " + autor);
        */
        /*
        byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor mínimo del Byte:" + Byte.MIN_VALUE);
        System.out.println("Valor máximo del Byte: = " + Byte.MAX_VALUE);

        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor mínimo del Short:" + Short.MIN_VALUE);
        System.out.println("Valor máximo del Short:" + Short.MAX_VALUE);

        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor mínimo del Int:" + Integer.MIN_VALUE);
        System.out.println("Valor máximo del Int: = " + Integer.MAX_VALUE);

        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor mínimo del Long:" + Long.MIN_VALUE);
        System.out.println("Valor máximo del Long:" + Long.MAX_VALUE);

        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor mínimo del Float:" + Float.MIN_VALUE);
        System.out.println("Valor máximo del Float:" + Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308;
        System.out.println("numDouble = " + numDouble);
        System.out.println("Valor mínimo del Double:" + Double.MIN_VALUE);
        System.out.println("Valor máximo del Double:" + Double.MAX_VALUE);
        */
        /*
        //Inferencia de tipos VAR y tipos primitivos
        var numEntero = 20; //Las literales sin punto  decimal automáticamente son de tipo INT
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F;  //Automáticamente se convierte en tipo Double con el punto decimal (F Para cambiarlo)
        System.out.println("numFloat = " + numFloat);
        var numdouble = 10.0; 
        System.out.println("numdouble = " + numdouble);
        */
        /*
        //Tipos primitivos CHAR
  
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter = '\u0024'; //Indicamos a Java la asignación con el código UNICODE
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; //Valor decimal del codigo UNICODE
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$';
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        char varCaracter1 = '\u0024'; //Indicamos a Java la asignación con el código UNICODE
        System.out.println("varCaracter1 = " + varCaracter1);
        char varCaracterDecimal1 = (char)36; //Valor entero y le asigna un tipo INT ((char) para conversión)
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1); 
        char varCaracterSimbolo1 = '$';
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar); //INFERENCIA DE TIPO
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);
        */
        /*
        //OPERADOR LOGICO IF
        //Tipos Primitivos tipo Boolean
        
        boolean varBool = true;
        System.out.println("varBool = " + varBool);
        
        if(varBool){
            System.out.println("La bandera es verdadera.");
        }
        else{
            System.out.println("La bandera es falsa.");
        }
        
        //Algoritmo calculo de edad
        
        var edad = 15; //Inferencia de tipos.
        //var adulto = edad >= 18; //Expresión Booleana.
        //if(adulto){
        
        if(edad >= 18){
            System.out.println("Es mayor de 18 años.");
        }
        else{
            System.out.println("No es mayor de 18 años.");
        }
        */
        
//        //Conversion de tipos Primitivos
//        
//        var edad = Integer.parseInt("20");
//        System.out.println("edad = " + (edad + 1));
//        
//        var ValorPI = Double.parseDouble("3.141");
//        System.out.println("ValorPI = " + ValorPI);
//        
//        //Entrada de datos
//        var entrada = new Scanner(System.in);
//        System.out.println("Ingrese su edad: ");
//        edad = Integer.parseInt(entrada.nextLine());
//        System.out.println("edad = " + edad);
        
        
//        var edadTexto = String.valueOf(10);
//        System.out.println("edadTexto = " + edadTexto);
//        
//        var fraseChar = "Programadores".charAt(8); //Extracción de caracter
//        System.out.println("fraseChar = " + fraseChar);
//        
//        var entrada = new Scanner(System.in);
//        System.out.println("Ingrese una frase");
//        fraseChar = entrada.nextLine().charAt(0);
//        System.out.println("fraseChar = " + fraseChar);


        
        
        
        
        
                
    }
}
