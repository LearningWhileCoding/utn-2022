package test;

import domain.Persona;

public class TestMatrices{

    public static void main(String[] args) {

        int edades[][] = new int[2][2];
        System.out.println("edades = " + edades);
        edades[0][0] = 0;
        edades[0][1] = 1;
        edades[1][0] = 2;
        edades[1][1] = 3;

        System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades 0-1 = " + edades[0][1]);
        System.out.println("edades 1-0 = " + edades[1][0]);
        System.out.println("edades 1-1 = " + edades[1][1]);

        System.out.println("Recorremos la matriz en un ciclo for");
        for (int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades[fila].length; col++) {
                System.out.println("edades "+fila+"-"+col+": "+edades[fila][col]);
            }
        }


        //String frutas[][] = new String[3][2];

        //Sintaxis simplificada
        String frutas[][] = {{"Limon", "Pomelo"},{"Ciruela", "Kiwi"},{"Banana", "Manzana"}};
        imprimir(frutas);
//        for (int i = 0; i < frutas.length; i++) {
//            for (int j = 0; j < frutas[i].length; j++) {
//                System.out.println("frutas "+i+"-"+j+": "+frutas[i][j]);
//            }
//        }

        //Matriz de objetos
        Persona personas[][] = new Persona[2][3];

        personas[0][0] = new Persona("Bart");
        personas[0][1] = new Persona("Lisa");
        personas[0][2] = new Persona("Homero");
        personas[1][0] = new Persona("Marge");
        personas[1][1] = new Persona("Milhouse");
        personas[1][2] = new Persona("Nelson");
        System.out.println("Matriz de Personas: ");
        imprimir(personas);
    }

    public static void imprimir(Object matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz "+i+"-"+j+": "+matriz[i][j]);
            }
        }
    }
}
