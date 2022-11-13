package test;

public class TestArreglos {

    public static void main(String[] args) {

        int edades [] = new int [3];
        System.out.println("edades = " + edades);
        
        edades [0] = 20;
        System.out.println("edades[0] = " + edades[0]);
        
        edades [1] = 19;
        System.out.println("edades[1] = " + edades[1]);
        
        edades [2] = 18;
        System.out.println("edades[2] = " + edades[2]);

        //edades [3] = 17; // Index ouf of Bounds, -> Error en tiempo de ejecución

        for (int i = 0; i < edades.length; i++) {

            System.out.println("edades " + i + " = " + edades[i]);
        }
    }
}
