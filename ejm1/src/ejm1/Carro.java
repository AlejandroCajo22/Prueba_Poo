/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejm1;

/**
 *
 * @author UCLAB300
 */
public class Carro {
    private String placa;
    private String marca;
    private String color;

    public Carro(String placa, String marca, String color) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
    }
    public Carro() {
        
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

   
    
    
    
    
    void cambiarColor(String nuevocolor)
    {
       this.color=nuevocolor;
    }
    void verDatos(){
        System.out.println("CARRO: PLACA: "+this.placa+ " MARCA: "
                +this.marca+" COLOR: "+this.color);
    } 
}
