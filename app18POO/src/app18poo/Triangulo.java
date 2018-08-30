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
public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public void imprimirFigura() {
        System.out.println("Triangulo");
    }
    
}
