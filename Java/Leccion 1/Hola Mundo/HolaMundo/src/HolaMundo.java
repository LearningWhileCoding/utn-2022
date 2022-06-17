
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
//          
//          OPERADORES
//
//          int num1 = 5, num2 = 4;
//          int solucion = num1 + num2;
//          System.out.println("solucion de la suma= " + solucion);
//          
//          solucion = num1 - num2;
//          System.out.println("solucion de la resta = " + solucion);
//          
//          solucion = num1 * num2;
//          System.out.println("solucion del producto = " + solucion);
//        
//          solucion = num1 /num2;
//          System.out.println("solucion de la division = " + solucion);
//        
//          var solucion2 = 3.4 / num2;
//          System.out.println("solucion2 = " + solucion2);
//        
//          solucion = num1 % num2;
//          System.out.println("solucion del modulo = " + solucion);
//
//          if(solucion % 2 ==0)
//              System.out.println("Es un numero par");
//          else
//              System.out.println("Es un numero impar");
//          
//          int varNum1 = 1, varNum2 = 4;
//          var varNum3 = varNum1 + 6 - varNum2;
//          System.out.println("varNum3 = " + varNum3);
//          
//          varNum1 += 1; // varNum1 = varNum1 + 1;
//          System.out.println("varNum1 = " + varNum1);
//          
//          varNum1 -= 1;
//          System.out.println("varNum1 = " + varNum1);
//        
//          varNum1 *= 10;
//          System.out.println("varNum1 = " + varNum1);
//                
//          varNum1 /= 2;
//          System.out.println("varNum1 = " + varNum1);
//          
//          varNum1 &= 1;
//          System.out.println("varNum1 = " + varNum1);
//
//          OPERADORES UNARIOS
//  
//            var varA = 7;
//            var varB = -varA;
//            System.out.println("varA = " + varA);
//            System.out.println("varB = " + varB);
//            
//          OPERADOR DE NEGACION
//            
//            var varC = true;
//            var varD = ! varC;
//            System.out.println("varC = " + varC);
//            System.out.println("varD = " + varD);
//
//          OPERADOR DE PRE-INCREMENTO
//            
//            var varE = 9;
//            var varF = ++varE;
//            System.out.println("varE = " + varE);
//            System.out.println("varF = " + varF);
////
////          OPERADOR DE POST-INCREMENTO
//
//            var varG = 3;
//            var varH = varG++;
//            System.out.println("varG = " + varG);
//            System.out.println("varH = " + varH);
//            
////          OPERADOR DE PRE-DECREMENTO
//
//            var varI = 4;
//            var varJ = --varI;
//            System.out.println("varI = " + varI);
//            System.out.println("varJ = " + varJ);
//
////          OPERADOR DE POST-DECREMENTO            
//            var varK = 8;
//            var varL = varK--;
//            System.out.println("varK = " + varK);
//            System.out.println("varL = " + varL);
//
//            OPERADORES DE IGUALDAD Y RELACIONALES
//
//              var aNum = 4;
//              var bNum = 5;
//              var cNum = aNum == bNum;
//              System.out.println("cNum = " + cNum);
//              
//              var dNum = aNum != bNum;
//              System.out.println("dNum = " + dNum);
//              
//              var cadenaA = "Hello";
//              var cadenaB = "bye bye";
//              var cVar = cadenaA == cadenaB;
//              System.out.println("cVar = " + cVar);
//              
//              var fVar = cadenaA.equals(cadenaB);
//              System.out.println("fVar = " + fVar);
//              
//              var gVar = aNum > bNum; // <, <=, >=, !=, == ...
//              System.out.println("gVar = " + gVar);
//              
//              if(aNum % 2 == 0)
//                  System.out.println("El numero es par.");
//              else
//                  System.out.println("El numero es impar,");
//              
//              var edad = 17;
//              var adulto = 18;
//              
//              if(edad >= adulto){
//                  System.out.println("Es mayor de edad.");
//              }
//              else{
//                  System.out.println("Es menor de edad.");
//              }
//
//              OPERADOR CONDICIONAL AND
//
//                var valorA = 7;
//                var valorMin = 0;
//                var valorMax = 10;
//                var respuesta = valorA >= valorMin && valorA <= valorMax;
//                System.out.println("respuesta = " + respuesta);
//                
//                if(respuesta){
//                    System.out.println("Esta dentro del rango establecido.");
//                }
//                else{
//                    System.out.println("Esta fuera del rango establecido.");
//                }
//                
//                var vacaciones = false;
//                var diaLibre = true;
//                
//                if(vacaciones || diaLibre){
//                    System.out.println("Papá puede asistir al juego de su hijo.");
//                }
//                else{
//                    System.out.println("Papá tiene que trabajar");
//                }
//
//                OPERADOR TERNARIO
//
//                var resultadoT = (5 > 4) ? "Veradero" : "Falso";
//                System.out.println("resultadoT = " + resultadoT);
//                
//                var numeroT =  7;
//                var resultado = (numeroT % 2 != 0) ? "Es impar" : "Es par";
//                System.out.println("resultado = " + resultado);
//             
//              PRIORIDAD DE OPERADORES
                var x = 5;
                var y = 10;
                var z = ++x + y--;
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("z = " + z);
                    
                var solucionAritmetica = 4 + 5 * 6 / 3; // 4 + ((5 *6) / 3)
                System.out.println("solucionAritmetica = " + solucionAritmetica);
                
                solucionAritmetica = (4 + 5) * 6 / 3;
                System.out.println("solucionAritmetica = " + solucionAritmetica);
              
              
              
              
    
    }
}
