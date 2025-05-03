/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejm1;

/**
 *
 * @author UCLAB300
 */
public class Ejm1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // System.out.println("Creando objeto Alumno");
        
        Alumno a1 = new Alumno();
        a1.tipo_documento="DNI";
        a1.nro_documento="7052354";
        a1.nombre="Juan Perez";
        a1.edad=27;
       // a1.verDatos();
        
       // System.out.println("Creando objeto Carro");
        
       /* Carro c1 = new Carro();
        c1.setPlaca("CDS-5275");
        c1.setMarca("TOYOTA");
        c1.setColor("ROJO");
       
        Carro c2 = new Carro();
        c2.setPlaca("poq-2755");
        c2.setMarca("BMV");
        c2.setColor("AZUL");*/
       CarroControlador controla = new CarroControlador(); 
      
        
        Carro c = new Carro();
        c.setPlaca("Mk415");
        c.setMarca("Mazda");
        c.setColor("Negro");
        controla.agregarCarros(c);
        controla.listarCarros();
       
        
        
    }
    
}
