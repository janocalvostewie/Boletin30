
package boletin30;

/**
 *
 * @author Jano
 */
public class Entrenador extends Seleccion {
    
    private int idFederacion;
    
    
    
    public Entrenador(int id, String nombre, String apellidos, int edad,int idFederacion){
 super(id,nombre, apellidos,edad);
 
 this.idFederacion=idFederacion;
 
 }
    
    
      public void planificarEntrenamiento() {
      System.out.println("Planificar un Entrenamiento");
   }
    
       @Override
    public String toString(){
    String ficha="\nId: "+id+"\nNombre: "+nombre+"\napellidos: "+apellidos+"\nEdad: "+edad+"\nidFederacion: "+idFederacion;
    return ficha;
    }
}
