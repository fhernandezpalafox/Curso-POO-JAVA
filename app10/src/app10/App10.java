/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app10;

import java.util.Scanner;

/**
 *
 * @author felipehernandez
 */
public class App10 {

    //Constantes
    
    public static final int LUNES = 1;
    public static final int MARTES = 2;
    public static final int MIERCOLES = 3;
    public static final int JUEVES = 4;
    public static final int VIERNES = 5;
    public static final int SABADO = 6;
    public static final int DOMINGO = 7;

    public static int DIA = 1;
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Ingrese el dia de la semana: (Numero): ");
       
        int valor  = scanner.nextInt();
        
        String dia = "";
        
        switch(valor){
        
            case LUNES:
                dia = "LUNES";
                break;
            case MARTES:
                dia = "MARTES";
                break;
            case MIERCOLES:
                dia = "MIERCOLES";
                break;
             default:
                dia  = "día incorrecto";
        }
        
        System.out.println("El dia de la semana ingresada es: "+dia);
        
    }
    
}
