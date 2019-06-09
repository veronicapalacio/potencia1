/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author vpala
 */
public class Potencia {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
    
    int base = 0;
    int potencia = 0;
    int resultado = 1;
    Scanner potenciacion = new Scanner (System.in);
        System.out.println(" escriba un numero base ");
        base = potenciacion.nextInt();
        System.out.println(" escriba un numero que va ser su potencia");
        potencia= potenciacion.nextInt();
        
        
        if (potencia == 0 )
            System.out.println(" el resultado es 1");
        for ( int i= 0; i < potencia  ; i++)
        {
           resultado= resultado * base;
            
                    
        
        }
            System.out.println(resultado);
    }
}

      

    
    
    
            
         
    

    

