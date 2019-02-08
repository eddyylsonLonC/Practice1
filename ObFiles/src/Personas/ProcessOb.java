/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author edilson
 */
public class ProcessOb {
      
      String opc = "s";
      Scanner sn = new Scanner(System.in);
      
    
      public void insert (String nombre, String apellido)
      {
          File file = new File ("file.data");
          Persona p = new Persona(nombre,apellido);
          try 
          {
             
              FileOutputStream fos = new FileOutputStream(file);
              ObjectOutputStream oos = new ObjectOutputStream(fos);
              oos.writeObject(p);
              
          }catch (FileNotFoundException e)
          {
              e.printStackTrace();
          }catch (IOException e)
          {
              e.printStackTrace();
          }
      }
      public void read ()
      {
          File file = new File ("file.data");
          try 
          {
              FileInputStream fs = new FileInputStream (file);
              ObjectInputStream ois = new ObjectInputStream(fs);
              Persona p;
              while ((p=(Persona)ois.readObject()) != null)
              {
                  System.out.println(p.get_apellidos() + " " + p.get_apellidos());   
              }
          }catch (FileNotFoundException e)
          {
              e.printStackTrace();
          }catch (IOException e)
          {
              e.printStackTrace();
          } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
          }
      }
     
    
}
