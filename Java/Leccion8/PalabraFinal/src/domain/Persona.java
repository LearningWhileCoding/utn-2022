package domain;

public class Persona {

    public static final int CONSTANTE_AQUI = 15;
    private String nombre;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombne(String nombre) {
        this.nombre = nombre;
    }

    public void imprimir() {
        System.out.println("Metodo para imprimir!");
    }
}
