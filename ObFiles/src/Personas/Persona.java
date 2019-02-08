/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;
import java.io.Serializable;
/**
 *
 * @author edilson
 */
public class Persona implements Serializable {

public String nombre ="",apellidos = "";
    public Persona (String nombre,String apellidos)
    {
        this.nombre=nombre;
        this.apellidos=apellidos;
        
    }
    public String get_nombre (){return this.nombre;}
    public String get_apellidos (){return this.apellidos;}
   
    
}

