/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejm1;

/**
 *
 * @author UCLAB300
 */
public class Alumno {
    String tipo_documento;
    String nro_documento;
    String nombre;
    int edad;
    
    void verDatos(){
        System.out.println("Los datos del objeto credo son:");
        System.out.println("TIPO DOCUMENTO: " +this.tipo_documento);
        System.out.println("NÚMERO DOCUMENTO: " +this.nro_documento);
        System.out.println("NOMBRE: " +this.nombre);
        System.out.println("EDAD: " +this.edad);
    }
}
