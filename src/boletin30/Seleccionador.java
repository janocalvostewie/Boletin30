
package boletin30;

/**
 *
 * @author Jano
 */
public class Seleccionador extends Seleccion{
    
    
    
     public Seleccionador(int id, String nombre, String apellidos,int edad){
 super(id,nombre, apellidos,edad);
     }
    
    public void seleccionarJugador(){};
    
       @Override
    public String toString(){
    String ficha="\nId: "+id+"\nNombre: "+nombre+"\napellidos: "+apellidos+"\nEdad: "+edad;
    return ficha;
    }
    
    
}
