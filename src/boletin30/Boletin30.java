package boletin30;

import java.util.ArrayList;

/**
 *
 * @author Jano
 */
public class Boletin30 {

    public static void main(String[] args) {

        ArrayList<Seleccion> personas = new ArrayList<Seleccion>();

        Seleccion per1 = new Entrenador(1, "pepe", "pepe", 40, 123455);
        Seleccion per2 = new Futbolista(2, "juan", "juan", 25, 8, "Lado");
        Seleccion per3 = new Masajista(3, "lola", "lola", 29, "cosa", 9);
        Seleccion per4 = new Seleccionador(3, "jose", "jose", 30);
        personas.add(per1);
        personas.add(per2);
        personas.add(per3);
        personas.add(per4);

        
        for (Seleccion persona:personas){
        System.out.println(persona.toString());
        
        }
        
        
    }

}
