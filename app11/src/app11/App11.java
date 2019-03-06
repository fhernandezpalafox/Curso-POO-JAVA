/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app11;

import java.util.Scanner;

/**
 *
 * @author felipehernandez
 */
public class App11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr[] = new int[10];
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un valor (0>=fin) ");
        int valor = scanner.nextInt();
        
        int i = 0;
        
        //     valor Introducido es diferente de cero   true Y 0<10
        while (valor!= 0 && i<10) {    //9          
            
            arr[i++] = valor;
            
            System.out.println("Ingrese el siguiente valor (0>=fin) ");
            
            
            valor = scanner.nextInt();
            
        }
        
        //recorremos el array mostrando su contenido
        for (int j = 0; j < i; j++) {
            
            System.out.println("El valor de j es :"+arr[j]);
        }
        
        
    }
    
}
