/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app18poo;

import java.util.Scanner;

/**
 *
 * @author felipehernandez
 */
public class App18POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Mensaje msg =  new Mensaje("Esto es una prueba");
        System.out.println(msg.getTitulo()+"-"+msg.getMensaje());
        Mensaje msg2  =  new Mensaje("Titulo", "mensaje");
        System.out.println(msg2.getTitulo()+"-"+msg2.getMensaje());
     */
        
        System.out.println("Programa para calcular el area de la Figura geometrica");
        System.out.println("1.-Circulo");
        System.out.println("2.-Rectangulo");
        System.out.println("3.-Triangulo");
        
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            
            int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                 System.out.println("Captura el radio");
                
                 int radio = scanner.nextInt();
                
                 clsCirculo objCirculo  =  new clsCirculo(radio);
                 
                 System.out.println(objCirculo);
                   
                break;
            case 2:
                
                System.out.println("Captura la base");
                
                double base = scanner.nextDouble();
                
                System.out.println("Captura la altura");
                
                double altura = scanner.nextDouble();
                 
                clsRectangulo objRectangulo  =  new clsRectangulo(base, altura);
                 
                System.out.println(objRectangulo);
                   
                break;
            case 3:
                
                System.out.println("Captura la base");
                
                double baseTria = scanner.nextDouble();
                
                System.out.println("Captura la altura");
                
                double alturaTria = scanner.nextDouble();
                
                 Triangulo objTriangulo  = new Triangulo(baseTria, alturaTria);
                 
                 System.out.println(objTriangulo);
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
            
        } catch (Exception e) {
            
            System.out.println("Hubo un error");
        }
        
       
        
       



       
        
    }
    
}
