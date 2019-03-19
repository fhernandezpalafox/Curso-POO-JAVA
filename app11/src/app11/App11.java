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
       
      /*  
        int arr[] = new int[10];
        
        System.out.println("Ingrese un valor (0>=fin) ");
        int valor = scanner.nextInt();
        
        int i = 0;
        
        //     valor Introducido es diferente de cero   true Y 0<10
        while (valor!= 0 && i<10) {    //9          
            
 
            System.out.println("Ingrese el siguiente valor (0>=fin) ");
            
            
            valor = scanner.nextInt();
            
        }
        
        //recorremos el array mostrando su contenido
        for (int j = 0; j < i; j++) {
            if (valor!= 0) {
                break;
            }
            System.out.println("El valor de j es :"+arr[j]);
        }
        
        
        // Boletos de cine
        int j = 20;
        while (j >= 0)  {            
            
            System.out.println("Cuantos boletos quieres?");
            int boletos  = scanner.nextInt();
            
            j = j - boletos;
            
           // j= j - 1;
            
        }*/
        
        
        // Repartir becas a partir de???
        // Que sea un alumno foraneo 
        // Que no este en 7mo
        // Que su promedio no este abajo de 8.5
        Scanner scanner = new Scanner(System.in);
          
        int becas = 20;
        String tipoUsuario = "";
        int semestreCursando = 0;
        double promedio = 0.0;
        
        System.out.println("Que tipo de usuario eres.");
        System.out.println("1.- Alumno");
        System.out.println("2.- Administrativo");
        
        int valorIntroducido  =  scanner.nextInt();
        
        if (valorIntroducido == 1) {
            tipoUsuario = "Alumno";
        }else if (valorIntroducido == 2) {
            tipoUsuario = "Administrativo";
        }else {
            tipoUsuario = "Desconocido";
        }
        
        if (valorIntroducido == 1) { //Significa que es alumno

            System.out.println("Eres alumno foraneo?");
            System.out.println("Captura  la palabra - Si o No");
            
            String valorIntroducido3 = scanner.next();
            
            if (valorIntroducido3.equals("Si")) {
                
                System.out.println("Captura el semestre que estas cursando?");
                int valorIntroducido2  = scanner.nextInt();

                if (valorIntroducido2 <= 6) {
                    semestreCursando = valorIntroducido2;
                }
                
                System.out.println("Cuantas materias llevas al semestre?");
                int materias =  scanner.nextInt();
                
                int i = 1;
                double sumMateria = 0.0;
                while (i <= materias) {  //1 <= 7                   
                    
                    System.out.println("Captura la calificacion de la materia:"+i);
                    double calMateria  = scanner.nextDouble();
                    
                    sumMateria = sumMateria + calMateria;
                    i++;
                }
                
                promedio  = sumMateria / materias;
                
                System.out.println("El promedio es:"+promedio);
                
                if (promedio >= 8.5) {
                    System.out.println("Felicidades tienes ya una beca");
                }
  
            }else if (valorIntroducido3.equals("No")) {
                System.out.println("Fin del programa.");
            }
            
        }else {
            System.out.println("Fin del programa.");
        }
    }    
}
