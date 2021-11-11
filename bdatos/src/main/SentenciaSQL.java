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
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author Wilfred
 */
public class SentenciaSQL extends ConexionBD{
    
    //ES POSIBLE QUE SE GENEREN TODAS LAS QUERYS ACA Y SE LLAME DIRECTO AL METODO
    public boolean registroCuenta (Cuenta cuenta){
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
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean inicioSesion(String ci, String password){
        PreparedStatement ps = null;
        establecerConexion();
        Connection con = getConexion();
        
        String sql = "SELECT idCuenta,passwd FROM cuenta WHERE idCuenta = ? and passwd = ? and habilitado=true"; //('48453889','Gonzalo','Grossi','ggrossi',10000,true);"
        
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
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }   
    }
    
    public Cuenta obtenerCuenta(String cedula){
        PreparedStatement ps = null;
        establecerConexion();
        Connection con = getConexion();
        
        String sql = "SELECT * FROM cuenta WHERE idCuenta = ?";
        
        try{
            ps= con.prepareStatement(sql);
            ps.setString(1,cedula);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                
                Cuenta cuenta = new Cuenta();
                cuenta.setCi(id);
                cuenta.setNombre(nombre);
                cuenta.setApellido(apellido);

                return cuenta;
            }
            return null;
            
        } catch (SQLException ex) {
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }   
    }
    
    public DefaultComboBoxModel obtenerCategorias(){
        PreparedStatement ps = null;
        establecerConexion();
        Connection con = getConexion();
        
        DefaultComboBoxModel listaCat = new DefaultComboBoxModel();
        listaCat.addElement("Seleccione Categoría");
        //ArrayList<Categoria> cat = new ArrayList<>();
        String sql = "SELECT * FROM categoria ORDER BY descripcioncategoria";
     
        try{
            ps= con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();    
            while (rs.next()){
                listaCat.addElement(rs.getString(2));
            }
            return listaCat;
            
        } catch (SQLException ex) {
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }   
    }
    
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
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public Boolean actualizarCuenta(Cuenta cuenta){
        PreparedStatement ps = null;
        establecerConexion();
        Connection con = getConexion();
        
        String sql = "UPDATE cuenta SET nombre = ?, apellido = ?, passwd = ? WHERE idCuenta = ?";
        
        try{
            ps= con.prepareStatement(sql);
            ps.setString(1,cuenta.getNombre());
            ps.setString(2,cuenta.getApellido());
            ps.setString(3,cuenta.getPassword());
            ps.setString(4,cuenta.getCi());
            ps.executeUpdate();
            return true;  
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }   
    }
    
    
    public Boolean insertPublicacion(Producto producto, String idCuenta){
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;
        establecerConexion();
        Connection con = getConexion();
        
        String sql = "insert into producto idCategoria,titulo,descripcionProducto,imagen,costo VALUES (?,?,?,?,?)";
        /*try{
            
            ps= con.prepareStatement(sql);
            ps.setInt(1,producto.getIdProducto());
            ps.setString(2,producto.getTitulo());
            ps.setString(3,producto.getDescripcion());
            ps.setString(4,producto.getImagen());
            ps.setInt(4,producto.getCosto());
            ps.execute();
 
            
        String sql2 = "insert into publicacion idCuenta,idProducto VALUES (?,?)"; 
            ps2= con.prepareStatement(sql2);
            ps2.setInt(1,idCuenta);
            ps2.setInt(2,producto.getIdProducto());
            ps2.execute();
            return true;  
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }   */
        return false;
    }

    public ArrayList<ProductoPublicacion> filtrarPublicacionesPorTexto(String texto) {
        ArrayList<ProductoPublicacion> resultado = new ArrayList<>();
        PreparedStatement ps = null;
        establecerConexion();
        Connection con = getConexion();
        
        String sql = "select * from publicacion publ" +
            " inner join producto prod on publ.idproducto = prod.idproducto" +
            " where prod.titulo like '%?%';";
        
        try{
            ps= con.prepareStatement(sql);
            ps.setString(1,texto);
            ResultSet rs = ps.executeQuery();
             while (rs.next()){
                ProductoPublicacion prod = new ProductoPublicacion();
                prod.setTitulo(rs.getString(7));
                prod.setDcategoria(rs.getString(6));
                prod.setCosto(rs.getInt(11));
                prod.setImagen(rs.getString(10));
                prod.setDproducto(rs.getString(3));         
                resultado.add(prod);
            }          
         return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
    public ArrayList<ProductoPublicacion> filtrarPublicacionesPorCategoria(int idCategoria) {
         ArrayList<ProductoPublicacion> resultado = new ArrayList<>();
        PreparedStatement ps = null;
        establecerConexion();
        Connection con = getConexion();
        
        String sql = "select * from publicacion publ" +
            " inner join producto prod on publ.idproducto = prod.idproducto" +
            " where prod.idCategoria=?;";
        
        try{
            ps= con.prepareStatement(sql);
            ps.setInt(1,idCategoria);
            ResultSet rs = ps.executeQuery();
             while (rs.next()){
                ProductoPublicacion prod = new ProductoPublicacion();
                prod.setTitulo(rs.getString(7));
                prod.setDcategoria(rs.getString(6));
                prod.setCosto(rs.getInt(11));
                prod.setImagen(rs.getString(10));
                prod.setDproducto(rs.getString(3));         
                resultado.add(prod);
            }          
         return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    
}
