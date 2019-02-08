/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FIles;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException; 
import java.util.Scanner;
        
/**
 *
 * @author edilson
 */
public class Numbers {
    public Scanner sn = new Scanner(System.in);
    public String elemento;
    public boolean insert (File f)
    {
         try{
             FileWriter  fw = new FileWriter(f);
             BufferedWriter bf = new BufferedWriter(fw);
             for (int i=0;i<10;i++)
             {
                System.out.println("insert  element ... ");
                this.elemento=this.sn.next();
                bf.write(this.elemento);
                bf.newLine();
             }
             bf.close();
             return true;
             
         }catch (FileNotFoundException e){
             e.printStackTrace();
             return false;
         } catch (IOException e)
         {
             e.printStackTrace();
             return false;
         }
    }
    
}
