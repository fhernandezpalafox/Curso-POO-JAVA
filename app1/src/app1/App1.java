/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

/**
 *
 * @author felipehernandez
 */
public class App1 {

   // Comentarios
    
    /*
       varios comentarios
    */
    
    static String  nombre="";
    
    
    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nombre  = "Karenina";
        
        System.out.println("Hola mundo ITSN");
        System.out.println("El nombre de la alumna es: " +nombre);
        System.out.println("Esta en la materia de POO"); 
        
        System.out.println("--------------------");
        
        String alumno = traerAlumnoCarrera("ITSN");
        System.out.println("El alumno es "+alumno);
        System.out.println("La materia que esta tomando es: ");
        imprimirMateria();
        
        System.out.println("--------------------");
        int edad = traerEdad(1989, 2018);
        System.out.println("Tu edad es: "+edad);
        
        imprimirDatosPersonales("Felipe Hernandez", 29, "Betania  519, Col. San Felipe de jesus");
       
        
        System.out.println("--------------------");
        double resultado =  CalcularOperacion("Resta", 30, 12);
        System.out.println("El resultado es: "+resultado);
        
        System.out.println("--------------------");
        
        Operacion objOperacion  =  new Operacion();
        double res = objOperacion.CalcularOperacion("Resta", 30, 12);
        System.out.println("El resultado es: "+res);
    }
    
    // Tipo de Dato 34.89
    public static double CalcularOperacion(String operacion, int num1, int num2){
        
        if(operacion.equals("Suma")==true){
           return num1 + num2;
        }else if(operacion.equals("Resta")== true){
           return num1 - num2;
        }else if(operacion.equals("Multiplicacion")==true){
           return num1 * num2;
        }
        
        return 0;
        
    }
    
    public static void imprimirDatosPersonales(String nombre,
                                                int edad,
                                                String domicilio){
        
        System.out.println("---------------------------- ");
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Tu edad es: "+edad);
        System.out.println("Tu domicilio es: "+domicilio);
    }
    
    public static int traerEdad(int aniodeNaci, int anioActual){
        
        return anioActual - aniodeNaci;
    }
    
    //void  o Retornar cualquier tipo de dato //String, Int, Double, Float
    public static String traerAlumnoCarrera(String Carrera){ //Parametros
    
       if(Carrera.equals("ITSN")){
           return "Melany Alexa";
       }else if(Carrera.equals("ISSC")){
           return "Ivan Esqueda";
       }
       
       return "N/A";
       
    }
    
    //No retorna nada el Void
    public static void imprimirMateria(){
        System.out.println("POO");
    }
    
}
