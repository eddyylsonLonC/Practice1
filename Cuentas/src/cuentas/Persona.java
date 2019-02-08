/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author edilson
 */
public class Persona {
    private final char H='H';
    private final char M='M';
    private String Nombre;
    private int edad; 
    private char genero;
    private  static long ID;
    private double peso,altura; // 
    
    public Persona ()
    {
        this.Nombre="";
        this.edad=0;
        this.genero=H;
        this.altura=0;
        this.peso=0;
    }
    public Persona (String Nombre,int edad,char genero)
    {
        this.Nombre=Nombre;
        this.edad=edad;
        this.genero=genero;
        this.altura=0;
        this.peso=0;
    }
    public Persona (String Nombre,int edad,char genero,double peso,double altura)
    {
        this.Nombre=Nombre;
        this.edad=edad;
        this.genero=genero;
        this.altura=altura;
        this.peso=peso;
    }
    public double calcularIMC ()
    {
        double IMC = this.peso/(this.altura * this.altura);
        return IMC;
               
    }
    public boolean esMayorDeEdad ()
    {
        return this.edad >= 18;
    }
    
    public boolean verificarGenero ( char genero)
    {
        if (genero == 'H' || genero == 'M')
            return true;
        else 
            return false;
                 
    }
    
    public void toString ()
    {
        System.out.println(this.Nombre+" "+this.peso +"" + this.altura + " " + this.edad);
    }
    private void generarIdentificion ()
    {
        this.ID+=1;
    }
    
}
