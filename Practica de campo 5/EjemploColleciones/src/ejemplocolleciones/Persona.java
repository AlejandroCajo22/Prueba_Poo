/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplocolleciones;

/**
 *
 * @author UCLAB333
 */
public class Persona
{
    private String nrodoc;
    private String nombre;

    @Override
    public String toString() {
        return nrodoc+" - "+nombre;
    }
    
    public String getNrodoc()
    {
        return nrodoc;
    }
    public void setNrodoc(String nrodoc)
    {
        this.nrodoc=nrodoc;
    }
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    
    public void verPersona()
    {
        System.out.println("Persona: DNI: "+this.nrodoc+ " NOMBRE: "+this.nombre); 
    }
}
