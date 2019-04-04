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
public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }

    public Fecha(int pdia, int pmes, int panio) {
        this.dia = pdia;
        this.mes = pmes;
        this.anio = panio;
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }

    
    public boolean validarFecha(Fecha fecha){
        
        if (fecha.dia == this.dia) {
            return true;
        }
        
        return false;
    }
    
    
    
}
