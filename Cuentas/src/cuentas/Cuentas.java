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
public class Cuentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic heren
        Cuenta c=new Cuenta("hola");
        System.out.println(c.ingresar(20.0));
    }
    
}
