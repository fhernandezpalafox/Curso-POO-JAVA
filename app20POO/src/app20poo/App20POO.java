/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app20poo;

import modelo.clsAlumno;

/**
 *
 * @author felipehernandez
 */
public class App20POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clsAlumno objAlumno = new clsAlumno();
        
        objAlumno.setNombre("Felipe");
        objAlumno.setEdad(29);
        objAlumno.setUniversidad("La salle bajio");
        
        
        System.out.println("Tu nombre es"
                     +objAlumno.getNombre()
                +", tu edad="+objAlumno.getEdad()
                +", tu universidad es "
                +objAlumno.getUniversidad());
        
    }
    
}
