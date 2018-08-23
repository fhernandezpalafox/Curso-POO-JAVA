/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app15;

import java.util.Scanner;

/**
 *
 * @author felipehernandez
 */
public class App15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("Capturame tu usuario:");
        String usuario  =  scanner.next();
        
        System.out.println("Capturame tu contraseña:");
        String password  =  scanner.next();
        
        String USUARIO_VALIDO = "felipe";
        String PASSWORD_VALIDO = "fe";
        
        if (usuario.equals(USUARIO_VALIDO)== true 
                && password.equals(PASSWORD_VALIDO) ==  true) {
            
            System.out.println("Bienvenido al sistema: "+USUARIO_VALIDO);
        }else {
            System.out.println("Error de usuario y/o contraseña.");
        }
        
        
        
    }
    
}
