/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FIles;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author edilson
 */
public class Prom {
    double sum=0;
    public double prom (File f)
    {
        try{
             FileReader fr = new FileReader (f);
             BufferedReader br = new BufferedReader(fr);
             String elemento;
             double n=0;
             double elementos=0;
             while((elemento=br.readLine()) != null)
             {
                 n = Integer.parseInt(elemento);
                 this.sum  =this.sum +  n;
                 elementos ++;
             }
             System.out.println(elementos);
             return this.sum/elementos;
                    
                     
        }catch (FileNotFoundException e){e.printStackTrace(); return 0;
        }catch (IOException e){e.printStackTrace(); return 0;}
        
        
    }
    
}
