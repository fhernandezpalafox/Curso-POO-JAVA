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
public class Fecha {
    
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // 02/02/1989
    public Fecha(String f){
    
       //Buscamos la primera ocurrencia de  '/'
       int pos1  =  f.indexOf("/");
       
       //Buscamos la ultima ocurrencia de '/'
       int pos2  = f.lastIndexOf("/");
       
       //Procesamos el dia
       String sDia = f.substring(0,pos1);
       dia  = Integer.parseInt(sDia);
       
       //Procesamos el mes
       String sMes = f.substring(pos1 + 1,pos2);
       mes  = Integer.parseInt(sMes);
       
       //Procesamos el año
       String sAnio = f.substring(pos2 + 1);
       anio  = Integer.parseInt(sAnio);
       
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
    
    //retorna la fecha expresada en dias
    private int fechaToDias(){
       
        return anio*360+mes*30+dia;
    } 
    
    //Asigna la fecha expresada en dias a los atributos
    public void diasToFecha(int i){ //private
    
       //dividimos por 360  y obtenemos el año
       anio  = (int)i/360;
       
       //Del resto del  resiuduo de la divicion anterior
       //podremos obtener  el mes y el dia
       int resto  = i%360;
       
       //El mes es el resto dividido entre 30
       mes = (int) resto/30;
       
       //El resto de la divison anterior son los dias
       dia = resto%30;
       
       //Ajuste por si el dia quedo en cero
       if(dia == 0){
          dia = 30;
          mes--;
       }
       
       //Ajuste por si el mes quedo en cero
       if(mes == 0){
          mes = 12;
          anio--;
       } 
    }
    
    
    public void addDias(int d){
       //Convertimos la fecha en dias  y le sumamos d
       
       int sum =  fechaToDias()+d;
       
       //la fecha resultante (sum) se separa en dia, mes, anio
        diasToFecha(sum);
    }
    
    
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }

}
