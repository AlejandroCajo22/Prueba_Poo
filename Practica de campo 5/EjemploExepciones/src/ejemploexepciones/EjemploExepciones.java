
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author UCLAB333
 */
public class EjemploExepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        BufferedReader bf;
        try
        {
            bf = new BufferedReader (new FileReader("d://archivo.txt"));
            String linea;
            while ((linea=bf.readLine()) !=null)
            {
                System.out.println(linea);
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Error no encontró el archivo");
        }
        catch (IOException ex)
        {
            System.out.println("Error no lo pudo leer");
        }
    }
}