/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app21poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import modelos.clsAlumno;


/**
 *
 * @author felipehernandez
 */
public class Operaciones {
    
   private  ArrayList<clsAlumno> listaAlumnos = new ArrayList<>();
    
    
   public void AgregarAlumno(clsAlumno objAlumno){
       listaAlumnos.add(objAlumno);
   }
   
   public ArrayList<clsAlumno> obtenerDatosAlumnos(){
      return listaAlumnos;
   }
   
   public ArrayList<clsAlumno> obtenerDatosPorAlumno(String nombre){
       
       ArrayList<clsAlumno> listaAEnviar =  new ArrayList<>();
       
       ArrayList<clsAlumno> lista = obtenerDatosAlumnos();
       
       
        for(int i = 0; i < lista.size(); i++) {
                    
                  if(nombre.equals(lista.get(i).getNombre())){
                      
                      listaAEnviar.add(lista.get(i));
                      
                  }
                   
          }
        
       return listaAEnviar;
   }
   
}
