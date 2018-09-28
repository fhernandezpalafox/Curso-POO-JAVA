/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app25swing;

/**
 *
 * @author felipehernandez
 */
public class clsOperaciones {
    double Ce, Fa;

    public double getCe() {
        return Ce;
    }

    public double getFa() {
        return Fa;
    }
    
   public void calcCentigrados(double valor){
     Ce = valor * (9/5) + 32;
   }
   
   public void calcFarenheit(double valor){
     Fa  =  (valor-32)*5/9; 
             
   }
}
