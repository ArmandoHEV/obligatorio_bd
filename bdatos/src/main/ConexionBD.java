/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Wilfred
 */
public class ConexionBD {
    
    private Connection conectar = null;
    //String bd = "jdbc:postgresql://localhost:5432/prueba"; LOCALHOST
    String bd = "jdbc:postgresql://192.168.56.8:5432/obligatorio_bd";
    //String bd = "jdbc:postgresql://192.168.56.101:5432/pruebas";
    String user = "postgres";
    //String pass = "1234567";
    String pass = "1234";
    //String pass = "hola123";
    
    
public Connection getConexion()
    {
       return conectar;
    }    
        
public Boolean establecerConexion(){
    
    try{
        conectar = DriverManager.getConnection(bd,user,pass);
        //JOptionPane.showMessageDialog(null,"Base de datos conectada");
        if(conectar!=null){
              return true;
          }
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Error de conexión"+ e);
    }
    return false;
}

//Instrucciones INSERT, DELETE y UPDATE
public boolean ejecutarSQL(String sql)
    {
       try {
          PreparedStatement sentencia = conectar.prepareStatement(sql);
          sentencia.execute(sql);
          return true;
       } catch (SQLException ex) {
            return false;
       }
    }

/**
    *
    *Método para realizar SELECT
    *@return resultado regresa los registros generados por la consulta
    *
    */
    public ResultSet ejecutarSQLSelect(String sql)
    {
       ResultSet resultado;
       try {
          PreparedStatement sentencia = conectar.prepareStatement(sql);
          resultado = sentencia.executeQuery();
          return resultado;
       } catch (SQLException ex) {
          System.err.println("Error "+ex);
          return null;
       }
    }
            
}

