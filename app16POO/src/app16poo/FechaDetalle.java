/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app16poo;

/**
 *
 * @author felipehernandez
 */
public class FechaDetalle extends Fecha{
    
    
    public void getFechaCustom(){
        System.out.println(getAnio()+"/"+getMes()+"/"+getDia());
    }
}
