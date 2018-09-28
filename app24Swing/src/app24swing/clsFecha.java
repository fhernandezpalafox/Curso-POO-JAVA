/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app24swing;

/**
 *
 * @author felipehernandez
 */
public class clsFecha {
    
    private String dia, mes, anio, fecha;

    public clsFecha() {
    }
    
    public void concatenar(){
       fecha  = this.dia+"/"+this.mes+"/"+this.anio;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
    
    
    
}
