
package boletin30;

/**
 *
 * @author Jano
 */
public class Futbolista extends Seleccion {
    
    private int dorsal;
	private String demarcacion;
        
 public Futbolista(int id, String nombre, String apellidos, int edad,int dorsal,String demarcacion){
 super(id,nombre, apellidos,edad);
 this.demarcacion=demarcacion;
 this.dorsal=dorsal;
 
 }
   public void entrevista() {
      System.out.println("Da una Entrevista");
   }
    
    @Override
    public void concentrarse(){System.out.println("Se concentra el futbolista");
}
    
    
    @Override
    public String toString(){
    String ficha="\nId: "+id+"\nNombre: "+nombre+"\napellidos: "+apellidos+"\nEdad: "+edad+"\nDorsal: "+dorsal+"\nDemarcacion: "+demarcacion;
    return ficha;
    }
}