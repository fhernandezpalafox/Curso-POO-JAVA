/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app14;

import java.util.Scanner;

/**
 *
 * @author felipehernandez
 */
public class App14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("------------------------------");
        String cadena = "Esta es mi cadena";
        
        System.out.println(cadena.charAt(0));
        System.out.println(cadena.charAt(5));
        System.out.println(cadena.charAt(cadena.length()-1));
        
        System.out.println("------------------------------");
        
        String nombreAlumno = "Juan Pablo";
        
        if (nombreAlumno.charAt(0) == 'J') {
            System.out.println("La primer letra si es mayuscula");
        } else {
            System.out.println("La primer letra no es mayuscula");
        }
        
        String saludo = "Buenas tardes!!";
        
        System.out.println(saludo.charAt(saludo.length()-3));
        
        
        for (int i = 0; i < saludo.length(); i++) {
            
            char caracter  =  saludo.charAt(i);
            
            System.out.println(i+"->"+caracter);
        }
        
        System.out.println("------------------------------");
        
        char caracteres[] = {'H','o','l','a'};
        System.out.println(caracteres.length);
        
        String saludo2  = "";
        
        for (int i = 0; i < caracteres.length; i++) {
            saludo2 += caracteres[i];
        }
        
        System.out.println(saludo2);
        
        
        
        System.out.println("------------------------------");
        
        String cadena2  =  "Esto es una cadena dE CaracTEres";
        String mayusc  = cadena2.toUpperCase();
        String minusc = cadena2.toLowerCase();
        
        System.out.println("Original:"+cadena2);
        System.out.println("Mayusculas:"+mayusc);
        System.out.println("Minusculas:"+minusc);
        
        
        System.out.println("------------------------------");
        
        String Cadena3 = "Los jovenes de ITSN esten en clase";
        
        int  posic1  = Cadena3.indexOf("ITSN");
        int posic2  = Cadena3.lastIndexOf("Jo");
        int posic3  = Cadena3.indexOf("ISSC");
        
        System.out.println(posic1);
        System.out.println(posic2);
        System.out.println(posic3);
        
        Scanner scanner  =  new Scanner(System.in);
        
        System.out.println("Capturame el caracter o string a buscar");
        
        String captura  = scanner.next();
        
        int posic4  =  Cadena3.indexOf(captura);
        
        if (posic4 != -1) {
            System.out.println("Si se encuentra: "+posic4);
        }else {
            System.out.println("No se encontro");
        }
        
        
        System.out.println("------------------------------------");
        System.out.println("Subcadenas");
        
        
        String cadenaATrabajar = "Esto es una cadena de caracteres";
        
        String cade1 = cadenaATrabajar.substring(0,15);
        String cade2  = cadenaATrabajar.substring(1,7);
        
        //Tomamos desde el caracter 7 hasta el final
        String cade3  = cadenaATrabajar.substring(7);
        
        System.out.println(cade1);
        System.out.println(cade2);
        System.out.println(cade3);
        
        
        System.out.println("------------------------------------");
        System.out.println("Prefijos y Sufijos");
        
        
        String cadenaPrefijo = "Un buen libro de algoritmos en JAVA";
        
        boolean b1  = cadenaPrefijo.startsWith("Un buen");
        System.out.println(b1);
        
        boolean b2  = cadenaPrefijo.startsWith("En");
        System.out.println(b2);
        
        boolean b3  = cadenaPrefijo.endsWith("JAVA");
        System.out.println(b3);
         
        boolean b4  = cadenaPrefijo.endsWith("C#");
        System.out.println(b4);
             
        
    }
    
}
