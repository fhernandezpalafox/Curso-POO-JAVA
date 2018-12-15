/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bdjava;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Sams Club
 */
public class BDJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instancia de la clase coneccion y conectarme
        clsconexion  objconecion  =  new clsconexion();
        objconecion.conectar();
        //insert a la tabla 
        boolean consulta=false;
        String sql  = "INSERT INTO tblprueba(nombre)VALUES('Felipe Hernandez');";
        consulta  = objconecion.ejecutar(sql);
        if(consulta==false)
        {
            System.out.println("Se inserto XD");
        }
        ResultSet rs=null;
        
        System.out.println("----------------------------------------");
        String sqlConsulta  = "SELECT * FROM tblprueba";
        rs  = objconecion.ejecutarSetencia(sqlConsulta);
        try {
            while (rs.next()) 
            {            
                System.out.println("Id:"+String.valueOf(rs.getInt("id"))+"--Nombre"+rs.getString("nombre"));  
            }
        } catch (SQLException ex) {
            Logger.getLogger(BDJava.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
