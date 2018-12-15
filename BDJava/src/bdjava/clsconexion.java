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
public class clsconexion {
  static String bd="prueba";
  static String login="root";
  static String password="";
  static String url="jdbc:mysql://localhost:80/"+bd;
  
  
  Connection con = null;
  Statement stm;
  ResultSet rs;
  //contructor
  public clsconexion(){}
  
  
  // Conecta a la base de datos en este caso MYSQL 
  public void  conectar()
  {
      try 
      {
        Class.forName("com.mysql.jdbc.Driver");
        con   =  DriverManager.getConnection(url,login,password);
        if(con!=null)
        {
            System.out.println("coneccion a la base de datos "+bd+" lista");
        }
      }catch (SQLException e) {
          System.out.println("Error en la coneccion 1 "+e.getMessage().toString());   
      }catch (ClassNotFoundException e)
      {
          System.out.println("Eror en la conecion 2 "+e.getMessage().toString());
      }
  }
  
  //Ejecuta una Query de tipo SELECT
  public ResultSet ejecutarSetencia(String sql)
  {
        try {
            stm = getConnection().createStatement();
            rs  = stm.executeQuery(sql); 
        } catch (SQLException ex) {
            Logger.getLogger(clsconexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  rs;
  }
  
  //Ejecuta una query de tipo INSERT, UPDATE, DELETE 
  public Boolean ejecutar(String sql)
  {
      boolean consulta = false;
      try {
          stm  = getConnection().createStatement();
          consulta  = stm.execute(sql);
      } catch (SQLException e) {
          System.out.println("Sucedio un error "+e.getMessage().toString());
          consulta = true;
      }
      return consulta;
  }
  
  //Obtener conexion 
  public Connection getConnection()
  {
     return con;
  }
  
  //Desconecta de la base de datos
  public  void desconectar() throws SQLException
  {
      con  = null;
      con.close();
  }
    
}
