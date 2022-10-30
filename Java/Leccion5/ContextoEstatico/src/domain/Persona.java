package domain;

public class Persona {
    // Atributos
    private int idPersona;
    private static int contadorPersonas;
    private String nombre;

    // constructor
    public Persona(String nombre) {

        this.nombre = nombre;
        // Incrementar el contador por cada objeto nuevo.
        Persona.contadorPersonas++; // No se usa this.
        this.idPersona = Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
