/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app19poo;

/**
 *
 * @author felipehernandez
 */
public class clsGerente implements Persona{

    @Override
    public void getPersona() {
        System.out.println("Francisco Hernandez");
    }

    @Override
    public void getOcupacion() {
        System.out.println("Gerente en "+empresa);
    }
   
   
}
