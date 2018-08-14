/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app4;

import java.util.Scanner;

/**
 *
 * @author felipehernandez
 */
public class App4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        try {
            
            Scanner scanner  =  new Scanner(System.in);
        
            System.out.println("Ingrese un valor");

            int valor =  scanner.nextInt();

            int residuo =  valor%2;

            if (residuo == 0){
                System.out.println("El valor introducido si es par");
            }else {
                System.out.println("El valor introducido si es impar");
            }

        } catch (Exception e) {
            System.out.println("Hubo un error "+e.getMessage());
        }
        
        
    }
    
}
