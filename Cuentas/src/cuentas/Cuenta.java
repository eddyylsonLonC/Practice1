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
public class Cuenta {
    private String Titular;
    private double Cantidad;
    
    
    public Cuenta (String Titular)
    {
        this.Titular=Titular;
    }
    public void set_saldo (double Cantidad)
    {
        this.Cantidad=Cantidad;
    }
    public double retirar (double Cantidad)
    {
        if (Cantidad >= (this.Cantidad - Cantidad) )
            this.Cantidad-=Cantidad;
        return this.Cantidad;
    }
    public double ingresar (double Cantidad)
    {
        if (Cantidad > 0)
        {
            this.Cantidad+=Cantidad;
        }
        return this.Cantidad;
    }
    
    
    }
