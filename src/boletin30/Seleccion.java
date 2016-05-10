package boletin30;

/**
 *
 * @author Jano
 */
public abstract class Seleccion implements Interfaz {

    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public Seleccion(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;

    }
}
