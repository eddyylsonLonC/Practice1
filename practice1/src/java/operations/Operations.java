/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

/**
 *
 * @author edilson
 */
public class Operations {
    
    public static int  add (String num1, String num2){
       
            return Integer.parseInt(num1) + Integer.parseInt(num2);
      
            
       
        
    }
      public static int  substract (String num1, String num2){
        
            return Integer.parseInt(num1) - Integer.parseInt(num2);
       
            
       
        
    }
        public static int  divide (String num1, String num2){
            if ("0".equals(num2))return 0;
            return Integer.parseInt(num1) / Integer.parseInt(num2);
      
            
       
        
    }
          public static int  multiply (String num1, String num2){
       
            return Integer.parseInt(num1) * Integer.parseInt(num2);
        
         
            
       
        
    }
            public static int  module (String num1, String num2){
                if ("0".equals(num2))return 0;
                return Integer.parseInt(num1) % Integer.parseInt(num2);
       
            
       
        
    }
    
}
