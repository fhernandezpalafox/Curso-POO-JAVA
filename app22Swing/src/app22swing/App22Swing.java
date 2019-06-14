/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app22swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author felipehernandez
 */
public class App22Swing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame f = new JFrame("Titulo de ventana");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container cp =  f.getContentPane();
        cp.setLayout(new FlowLayout());
        /*JLabel etiqueta = new JLabel("Nombre: ");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Saludar");
        cp.add(etiqueta);
        cp.add(texto);
        cp.add(boton);*/
        
        GridLayout gl = new GridLayout(4,3);
        gl.setHgap(5); gl.setVgap(5);
        cp.setLayout(gl);
        for(int i = 1; i <= 9; i++) {
          cp.add(new JButton(String.valueOf(i)));
        }
        cp.add(new JButton("*"));
        cp.add(new JButton("0"));
        cp.add(new JButton("#"));
        
        f.setVisible(true);
    }
    
}
