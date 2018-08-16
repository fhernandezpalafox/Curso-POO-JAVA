/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app13;

import java.util.Scanner;

/**
 *
 * @author felipehernandez
 */
public class App13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de filas: ");
        int filas = scanner.nextInt();
        
        System.out.println("Ingrese la cantidad de columnas: ");
        int columnas = scanner.nextInt(); 
        
        
        int matriz[][] = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            
            for (int j = 0; j < columnas; j++) {
                
                int numero = (int)(Math.random()*1000);
                
                //asignamos el numero en matriz
                matriz[i][j] = numero;
            }
        }
        
        
        for (int i = 0; i < filas; i++) {
            
            for (int j = 0; j < columnas; j++) {
                
                System.out.println(matriz[i][j]+"\t");
            }
            
            System.out.println("");
        }
        
        
    }
    
}
