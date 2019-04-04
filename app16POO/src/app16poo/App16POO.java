/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app16poo;

import java.util.Scanner;

/**
 *
 * @author felipehernandez
 */
public class App16POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fecha fecha =  new Fecha();
        
        fecha.setAnio(1989);
        fecha.setDia(2);
        fecha.setMes(2);
        
        
        System.out.println(fecha.getAnio());
        System.out.println(fecha.getMes());
        System.out.println(fecha.getDia());
        
        System.out.println(fecha.toString());
        
        
        Fecha fecha2  =  new Fecha();
        
        fecha2.setAnio(1988);
        fecha2.setDia(3);
        fecha2.setMes(3);
        
       boolean diaCorrecto = fecha.validarFecha(fecha2);
       
        System.out.println(diaCorrecto);
        
        
        Fecha fecha3  =  new Fecha(2, 2, 1988);
        System.out.println(fecha3.toString());
        
        System.out.println("------------------------------");
        System.out.println("Captura los datos correspondientes");
        
        Scanner scanner  =  new Scanner(System.in);
        System.out.println("Capturame de forma ordenada anio-mes-dia");
        int anio  = scanner.nextInt();
        int mes  = scanner.nextInt();
        int dia  = scanner.nextInt();
        
        Fecha f  = new Fecha(dia, mes, anio);
        System.out.println(f.toString());
        
        
       
        FechaDetalle fechadetalle  = new FechaDetalle();
        fechadetalle.setAnio(1988);
        fechadetalle.setDia(3);
        fechadetalle.setMes(3);
        System.out.println(fechadetalle.toString());
        fechadetalle.getFechaCustom();
    
        
    }
    
}
