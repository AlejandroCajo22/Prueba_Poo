/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejm1;

import java.util.ArrayList;

/**
 *
 * @author UCLAB300
 */
public class CarroControlador {
    ArrayList<Carro> lista_carros = new ArrayList();
    void agregarCarros(Carro c){
        lista_carros.add(c);
    }
    void listarCarros(){
        System.out.println("La lista de carros son:");
        for(Carro carro : lista_carros){
            carro.verDatos();
        }
    }
}
