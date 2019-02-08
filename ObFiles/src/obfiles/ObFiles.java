/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obfiles;
import java.util.Scanner;
import Personas.ProcessOb;

/**
 *
 * @author edilson
 */
public class ObFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProcessOb IO  = new ProcessOb();
        int opc=2;
        Scanner sn = new Scanner(System.in); 
        switch (opc)
        {
            case 1:
                String nombre,apellidos;
                char option = 's';
                while (option == 's')
                {
                    System.out.println("Ingrese el nombre ");
                    nombre=sn.next();
                    System.out.println("Ingrese apellidos");
                    apellidos = sn.next();
                    IO.insert(nombre, apellidos);
                    System.out.println("¿Desea ingresar mas nombres? s / otra opción");
                    option = sn.next().charAt(0);
                }
                break;
            case 2:
                IO.read();
                break;
            default:
                System.out.println("error");
        }
      
    }
    
}
