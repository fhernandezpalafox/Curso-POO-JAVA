/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app17poo;

/**
 *
 * @author felipehernandez
 */
public class App17POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fecha fecha =  new Fecha();
        Fecha fecha2  =  new Fecha("2/2/1989");
        fecha2.addDias(5);
        System.out.println(fecha2.getDia());
        System.out.println(fecha2.toString());
        fecha.diasToFecha(400);
        System.out.println(fecha.toString());
    }
    
}
