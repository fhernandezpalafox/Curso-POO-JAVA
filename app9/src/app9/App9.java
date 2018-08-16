/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app9;

import java.util.Scanner;
/**
 *
 * @author felipehernandez
 */
public class App9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Capturame un dato: ");
        int valor = scanner.nextInt();
        
        for (int i = 1; i <= valor; i++) {
            System.out.println("El valor de i es :"+i);
        }
        
    }
    
}
