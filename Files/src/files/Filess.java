/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;
import FIles.Numbers;
import FIles.Prom;
import java.io.File;
import java.io.IOException;
import java.util.Date;
/**
 *
 * @author edilson
 */
public class Filess {

    
    public static void main(String[] args) {
        
    File file = new File ("Datos.data");
    Numbers n = new Numbers();
    Prom pro= new Prom();
    // if the file  doesn't exist,create  a file new
    try 
    {
     if (file.createNewFile()){System.out.println("file created");}
        else { System.out.println("file wasn't created");}
       } catch (IOException e){e.printStackTrace();}
    
    n.insert(file);
    System.out.println(pro.prom(file));
    
     
    }
    
    
}
