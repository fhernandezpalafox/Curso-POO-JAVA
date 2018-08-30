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
public class clsCirculo extends FiguraGeometrica {

    private int radio;

    public clsCirculo(int radio) {
        this.radio = radio;
    }
    
    
    @Override
    public double area() {
        return Math.PI*Math.pow(radio, 2);
    }

    @Override
    public void imprimirFigura() {
        System.out.println("Circulo");
    }
    
}
