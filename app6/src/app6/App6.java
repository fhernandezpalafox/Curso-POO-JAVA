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
        
        int residuo = valor % 2;
        
        //if in-line u Operador Ternario.
        String msg  = (residuo == 0)? " Es par": " Es impar";
        
        System.out.println("El valor ingreasado es "+msg);
    }
    
}
