/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app8;

import java.util.Scanner;

/**
 *
 * @author felipehernandez
 */
public class App8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("Introduce un valor: ");
        
        int valor  = scanner.nextInt();
        
        int j = 1;
        
        do{
        
            System.out.println("El valor de j es:"+j);
            //Incrementar el valor
            j++;
        }while(j < valor); // 1 < 4
        
    }
    
}
