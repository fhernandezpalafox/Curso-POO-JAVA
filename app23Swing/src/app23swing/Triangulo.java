/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app23swing;

/**
 *
 * @author felipehernandez
 */
public class Triangulo {
    
    double A, B, C, Resultado, Operacion;
    
    public void CalcularTriangulo(double a, double b, double c){
    
        this.A = a;
        this.B = b;
        this.C = c;
        
        Operacion  = (this.A+this.B+this.C)/2;
        
        Resultado = Math.sqrt(Operacion*(Operacion-this.A)*(Operacion-this.B)*(Operacion-this.C));
        
    }

    public double getResultado() {
        return Resultado;
    }
    
    
    
}
