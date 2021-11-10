/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.awt.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
/**
 *
 * @author Wilfred
 */
public class sentenciaSQL extends conexionBD{
    
    //ES POSIBLE QUE SE GENEREN TODAS LAS QUERYS ACA Y SE LLAME DIRECTO AL METODO
    public boolean registroCuenta (cuenta cuenta){
        PreparedStatement ps = null;
        establecerConexion();
        Connection con = getConexion();
        
        String sql = "INSERT INTO cuenta VALUES(?,?,?,?,0,true)"; //('48453889','Gonzalo','Grossi','ggrossi',10000,true);"
        
        try{
            ps= con.prepareStatement(sql);
            ps.setString(1,cuenta.getCi());
            ps.setString(2,cuenta.getNombre());
            ps.setString(3,cuenta.getApellido());
            ps.setString(4,cuenta.getPassword());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(sentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean inicioSesion(String ci, String password){
        PreparedStatement ps = null;
        establecerConexion();
        Connection con = getConexion();
        
        String sql = "SELECT idCuenta,passwd FROM cuenta WHERE idCuenta = ? and passwd = ?"; //('48453889','Gonzalo','Grossi','ggrossi',10000,true);"
        
        try{
            ps= con.prepareStatement(sql);
            ps.setString(1,ci);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                String aux = rs.getString(1);
                String aux2 = rs.getString(2);
                if(aux.equals(ci) && aux2.equals(password)){
                     return true;
                }
               else{
                    return false;
                } 
            }
            return false;
            
        } catch (SQLException ex) {
            Logger.getLogger(sentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }   
    }
    
    /**
     *
     * @return
     */
    public ArrayList<ProductoPublicacion> buscarPublicacion(){
        PreparedStatement ps = null;
        establecerConexion();
        Connection con = getConexion();
        ArrayList<ProductoPublicacion> result = new ArrayList<>(); //CAMBIAR A LIST
        
        
        String sql = "SELECT * FROM publicacion p INNER JOIN producto pro ON pro.idproducto = p.idpublicacion INNER JOIN categoria cat ON pro.idcategoria = cat.idcategoria WHERE p.idcuenta NOT IN ('45862435')";
        
        try{
            ps= con.prepareStatement(sql);
            //LEER USUARIO LOGEADO E INSERTARLO EN QUERY
            //GUARDAR TODOS LOS DATOS EN UNA LISTA DE PRODUCTOS Y DEVOLVERLO
            //PARA USARSE EN EL BOTON (INSERTAR EN TABLA)
            ResultSet rs = ps.executeQuery();
                 
            while (rs.next()){
                ProductoPublicacion prod = new ProductoPublicacion();
                prod.setTitulo(rs.getString(7));
                prod.setDcategoria(rs.getString(13));
                prod.setCosto(rs.getInt(11));
                prod.setImagen(rs.getString(12));
                prod.setDproducto(rs.getString(8));
                
                result.add(prod);
            }
            
            return result;
            
        } catch (SQLException ex) {
            Logger.getLogger(sentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    
    
}
