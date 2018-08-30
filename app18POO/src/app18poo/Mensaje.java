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
public class Mensaje {
    
    public String titulo;
    public String Mensaje;
    public enum tipoMensaje { Warning,Information,Error }

    public Mensaje(String titulo) {
        this.titulo = titulo;
    }

    public Mensaje(String titulo, String Mensaje) {
        this.titulo = titulo;
        this.Mensaje = Mensaje;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }
    
    
    
    
}
