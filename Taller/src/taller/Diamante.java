package taller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edilson
 */
public class Diamante {
    public int n=0;
    
    public void create ()
    {
        int elements=0;
        for (int i = 0;i<= this.n;i++)
        {
            elements=i+2;
            for (int j=0;j<elements;j++)
                System.out.println("*");
        }
    }
}
