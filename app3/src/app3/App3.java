/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app3;

import java.util.Scanner;


/**
 *
 * @author felipehernandez
 */
public class App3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();
        
        if(edad >= 22){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Usted no tiene la edad para programar");
        }
    }
    
}
