/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app26swing;

/**
 *
 * @author Lizeth
 */
public class clsOperCalendario {
    int n;
    int a, d=1,m,dm;
    String mesn;
    
    public void DeterminarMes(int mes, int anio){
        m=mes;
        a=anio;
        switch(m){
            case 1: dm=31; mesn="Enero";
            break;
            case 2: dm=28; mesn="Febrero";
            break;
            case 3: dm=31; mesn="Marzo";
            break;
            case 4: dm=30; mesn="Abril";
            break;
            case 5: dm=31; mesn="Mayo";
            break;
            case 6: dm=30; mesn="Junio";
            break;
            case 7: dm=31; mesn="Julio";
            break;
            case 8: dm=31; mesn="Agosto";
            break;
            case 9: dm=30; mesn="Septiembre";
            break;
            case 10: dm=31; mesn="Octubre";
            break;
            case 11: dm=30; mesn="Nomviembre";
            break;
            case 12: dm=31; mesn="Diciembre";
            break;
            default :
                System.out.println("Error, mes incorrecto");
            
                
        }
    }
    
    public void Calcular(){
         //if(m==1||m==8||m==7||m==5||m==3||m==10||m==12){
        if(m<3){
            n= a+31*(m-1)+d*(a-1)/8-3*((a+99)/100)/4;
        }
        else if(m==3||m==5||m==7||m==8||m==10||m==12){
            n= a+31*(m-1)+d-4*(m-33)/10+a/4-(3*(a/100+1))/4-2;
        }
        else
        {
            n= a+31*(m-1)+d-4*(m-33)/10+a/4-(3*(a/100+1))/4-1;
        }
        n=n%7;
        
    }

    public int getN() {
        return n;
    }

    public int getDm() {
        return dm;
    }

    public String getMesn() {
        return mesn;
    }
    
}

