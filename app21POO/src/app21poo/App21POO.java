/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app21poo;

import java.util.ArrayList;
import java.util.Scanner;
import modelos.clsAlumno;

/**
 *
 * @author felipehernandez
 */
public class App21POO {

    /**
     * @param args the command line arguments
     */
    
    public static Operaciones objOperaciones;
     
     
    public static void main(String[] args) {
        // TODO code application logic here
   
        //Intenciado
        
        objOperaciones =  new Operaciones();
        
        boolean bandera =  false;
        
        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("Sistema de captura de alumnos");
        System.out.println("Opciones\n1.-Menu\n2.-Salir");
        
        int opcion = scanner.nextInt();
        
        if (opcion == 1) {
            
            while(bandera == false){
            
                System.out.println("Opciones.\n1.-Agregar\n2.-Consultar\n3.-Salir\n4.-Consultar por Alumno");
                
                 int opcion2 = scanner.nextInt();
                 
                 // Valida que el digito capturado por el
                 // usuario sea == 3
                 if (opcion2 == 3) {
                    System.exit(0);
                  }
                 
                 
                 if (opcion2 == 4) {
                  
                     System.out.println("Capturname el nombre:");
                     
                     String nombreCap = scanner.next();
                     
                     ArrayList<clsAlumno> list = objOperaciones.obtenerDatosPorAlumno(nombreCap);
                    
                     for(int i = 0; i < list.size(); i++) {
                    
                        System.out.println("Nombre:"+list.get(i).getNombre()
                                            +",Edad:"+list.get(i).getEdad()
                                            +",Universidad:"+list.get(i).getUniversidad());
                        }
                  }
                 
                 // Entra al metodo de Proceso para agregar
                 // o consultar 
                 Proceso(opcion2);
            }
            
        }else if(opcion == 2){
            
            bandera = true;
            System.exit(0);
        }
        
    }
    
    public static void Proceso(int opcion){
       
        clsAlumno objalumno =  new clsAlumno();
        

        Scanner scanner =  new Scanner(System.in);
        
         
        if (opcion >= 1 && opcion <= 2) {
            // Cumplio con la opcion 
            
            if(opcion == 1){ //Agregar
              
                System.out.println("Captura tu nombre");
                String nombre =  scanner.next();
                
                System.out.println("Captura tu edad");
                int edad =  scanner.nextInt();
                
                
                System.out.println("Captura tu universidad");
                String universidad =  scanner.next();
                
                objalumno.setEdad(edad);
                objalumno.setNombre(nombre);
                objalumno.setUniversidad(universidad);
                
                objOperaciones.AgregarAlumno(objalumno);
                
            }else if(opcion == 2){ //Consultar
                
                ArrayList<clsAlumno> lista =  objOperaciones.obtenerDatosAlumnos();
                
                for(int i = 0; i < lista.size(); i++) {
                    
                   System.out.println("Nombre:"+lista.get(i).getNombre()
                                       +",Edad:"+lista.get(i).getEdad()
                                       +",Universidad:"+lista.get(i).getUniversidad());
                }
            }
        }else {
            System.out.println("Opcion invalida");
        }
    }
    
}
