/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

/**
 *
 * @author felipehernandez
 */
public class Operacion {
    
        public  double CalcularOperacion(String operacion, int num1, int num2){
        
        if(operacion.equals("Suma")==true){
           return num1 + num2;
        }else if(operacion.equals("Resta")== true){
           return num1 - num2;
        }else if(operacion.equals("Multiplicacion")==true){
           return num1 * num2;
        }
        
        return 0;
        
    }
}
