/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app12;

import java.util.Scanner;

/**
 *
 * @author felipehernandez
 */
public class App12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String dias[] = {"Lunes","Martes","Miercoles",
                         "Jueves","Viernes","Sabado","Domingo"};
        
        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("Ingrese el dia de la semana (numero): ");
        
        int dia = scanner.nextInt();
        
        if (dia <= dias.length) {
            
            System.out.println("El dia ingresado fue "+dias[dia-1]);
        }else {
            System.out.println("Dia incorrecto...");
        }
        
    }
    
}
