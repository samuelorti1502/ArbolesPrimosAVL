/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author USUARIO
 */
public class NumeroPrimo {
    
    public NumeroPrimo()
    {
    }
    
    public static boolean EsPrimo(int numero)
    {
        try 
        {            
            int divisores = 0;
            int contador = 2;
            
            for(int i = 2; i < numero; i++)
            {
                //ES UN DIVISOR DE LA VARIABLE numero
                if((numero % i) == 0) divisores++;
                if(divisores > 0) return false;
            }
        } catch (Exception e) 
        {
        }        
        return true;
    }    
}
