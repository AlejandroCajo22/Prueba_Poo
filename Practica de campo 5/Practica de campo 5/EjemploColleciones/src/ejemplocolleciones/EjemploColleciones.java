/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplocolleciones;

import java.util.ArrayList;

/**
 *
 * @author UCLAB333
 */
public class EjemploColleciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ArrayList<Persona> lista_personas=new ArrayList();
        Persona p=new Persona();
        p.setNrodoc("83724837");
        p.setNombre("Juan");
        System.out.println("El objeto tiene por nombre "+p.getNombre());
        lista_personas.add(p);
        Persona p1=new Persona();
        p1.setNrodoc("6213285");
        p1.setNombre("Rosa");
        lista_personas.add(p1);
        System.out.println("La coleccion contiene: ");
        for(Persona aux : lista_personas)
        {
            aux.verPersona();
            System.out.println(aux);
        }
        /*System.out.println("La lista completa es: ");
        System.out.println(lista_personas);*/
        System.out.println("Imprimiendo lista");
        for(int i=0; i<lista_personas.size();i++)
        {
            System.out.println(lista_personas.get(i));
        }
    }
    
}
