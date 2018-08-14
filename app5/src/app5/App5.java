/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app5;

import java.util.Scanner;

/**
 *
 * @author felipehernandez
 */
public class App5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("Ingrese un dia de la semana que sea del (1 al 7)");
        
        int _dia = scanner.nextInt();
        
        
        String dia;
        
        
        switch(_dia){
            
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            default:
                dia = "Dia incorrecto...";
                
        }
        System.out.println(dia);
        
    }
    
}
