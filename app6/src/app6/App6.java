/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app6;


import java.util.Scanner;

/**
 *
 * @author felipehernandez
 */
public class App6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("Ingrese un valor: ");
        
        int valor  = scanner.nextInt();
        
          if (valor == 0) {
                System.out.println("Captura un dato diferente de cero");
                return;
            }
           
          
        int residuo = valor % 2;
        
        /*
          if (residuo == 0){
                System.out.println("El valor introducido si es par");
            }else {
                System.out.println("El valor introducido si es impar");
            }
        */
        
        //if in-line u Operador Ternario.
        String msg  = (residuo == 0)? " Es par": " Es impar";
        
        System.out.println("El valor ingreasado es "+msg);
    }
    
}
