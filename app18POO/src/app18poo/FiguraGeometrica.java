/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app18poo;

/**
 *
 * @author felipehernandez
 */
public abstract class FiguraGeometrica {
    
    //Metodo abstracto
    public abstract double area();
    
    public abstract void imprimirFigura();
    
    public void imprimirFigura(String figura){
        System.out.println(figura);
    }
    
    @Override
    public String toString(){
        return  "area = "+ area();
    }
    
}
