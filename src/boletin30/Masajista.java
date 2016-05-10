package boletin30;

/**
 *
 * @author Jano
 */
public class Masajista extends Seleccion {

    private String titulacion;
    private int aniosExperiencia;

    
        public Masajista(int id, String nombre, String apellidos,int edad, String titulacion,int aniosExperiencia){
 super(id,nombre, apellidos,edad);
 
 this.titulacion=titulacion;
 this.aniosExperiencia=aniosExperiencia;
 
 }
    
    
    
    
      public void darMasaje() {
      System.out.println("Da un Masaje");
   }
      
      
         @Override
    public String toString(){
    String ficha="\nId: "+id+"\nNombre: "+nombre+"\napellidos: "+apellidos+"\nEdad: "+edad+"\nTitulación: "+titulacion+"\nAños exp: "+aniosExperiencia;
    return ficha;
    }
      
}
