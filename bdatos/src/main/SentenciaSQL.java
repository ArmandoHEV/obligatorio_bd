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

    public ArrayList<ProdPublicacion> mostrarOfertasRecibidas(String idCuenta, int idPublicacion) {
        ArrayList<ProdPublicacion> resultado =new ArrayList<>();
        PreparedStatement ps = null;
        establecerConexion();
        Connection con = getConexion();
        String sql = "select p.titulo,p.idcategoria,p.costo,p.idproducto,p.idproducto from publicacion publ "
                + " inner join producto p on p.idproducto=publ.idproducto"
                + " inner join oferta o on o.idpublicacionaofertar = publ.idpublicacion"
                + " where publ.idcuenta=? and publ.idpublicacion=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1,idCuenta);
            ps.setInt(2,idPublicacion);
            ResultSet rs = ps.executeQuery();
                 
            while (rs.next()){
                ProdPublicacion prod = new ProdPublicacion();
                prod.setTitulo(rs.getString(7));
                prod.setDcategoria(rs.getString(13));
                prod.setCosto(rs.getInt(11));
                prod.setImagen(rs.getString(12));
                prod.setDproducto(rs.getString(8));
                
                resultado.add(prod);
            }
            
            return resultado;
            
        } catch (SQLException ex) {
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    //ES POSIBLE QUE SE GENEREN TODAS LAS QUERYS ACA Y SE LLAME DIRECTO AL METODO
    public boolean registroCuenta (Cuenta cuenta){
        PreparedStatement ps = null;
        establecerConexion();
        Connection con = getConexion();
        
        String sql = "INSERT INTO Cuenta VALUES(?,?,?,?,0,true)"; //('48453889','Gonzalo','Grossi','ggrossi',10000,true);"
        
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
    
    public ArrayList<Publicacion> buscarPublicacion(String idCuenta){
        PreparedStatement ps = null;
        establecerConexion();
        Connection con = getConexion();
        ArrayList<Publicacion> result = new ArrayList<>(); //CAMBIAR A LIST
        
        /*
        String sql = "SELECT * FROM publicacion p INNER JOIN producto pro ON pro.idproducto = p.idpublicacion INNER JOIN categoria cat ON pro.idcategoria = cat.idcategoria"
                + " WHERE p.idcuenta NOT IN (?) and p.estadoPublicacion not in (5)";
*/
         String sql = "SELECT * FROM publicacion p INNER JOIN producto pro ON pro.idproducto = p.idpublicacion INNER JOIN categoria cat ON pro.idcategoria = cat.idcategoria"
                + " WHERE p.idcuenta NOT IN (?)";
        
        try{
            ps= con.prepareStatement(sql);
            ps.setString(1,idCuenta);
            //LEER USUARIO LOGEADO E INSERTARLO EN QUERY
            //GUARDAR TODOS LOS DATOS EN UNA LISTA DE PRODUCTOS Y DEVOLVERLO
            //PARA USARSE EN EL BOTON (INSERTAR EN TABLA)
            ResultSet rs = ps.executeQuery();
            
                 
            while (rs.next()){
                Producto prod = new Producto();
                Publicacion pub = new Publicacion();
                Categoria cat = new Categoria();
                
                pub.setIdPublicacion(rs.getInt(1));
                pub.setIdCuenta(rs.getString(2));
                pub.setEstadoPublicacion(rs.getInt(4));
                
                cat.setIdCat(rs.getInt(12));
                cat.setDcategoria(rs.getString(13));
                
                prod.setIdProducto(rs.getInt(3));
                prod.setTitulo(rs.getString(7));
                prod.setDescripcion(rs.getString(8));
                prod.setCantidad(rs.getInt(9));
                prod.setImagen(rs.getString(10));
                prod.setCosto(rs.getInt(11));
                prod.setCategoria(cat);
                
                pub.setProducto(prod);
                
                result.add(pub);
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
        PreparedStatement ps3 = null;
        establecerConexion();
        Connection con = getConexion();
        int idprod=0;
        String sql = "insert into producto (idCategoria,titulo,descripcionProducto,cantidadproducto,imagen,costo) VALUES (?,?,?,?,?,?) RETURNING idproducto";
        try{
            //INSERT INTO persons (lastname,firstname) VALUES ('Smith', 'John') RETURNING id;
            ps= con.prepareStatement(sql);
            ps.setInt(1,producto.getCategoria().getIdCat());
            ps.setString(2,producto.getTitulo());
            ps.setString(3,producto.getDescripcion());
            ps.setDouble(4,producto.getCantidad());
            ps.setString(5,producto.getImagen());
            ps.setDouble(6,producto.getCosto());
            
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            if (rs.next()){
                idprod = rs.getInt(1);
            }
            
            String sql2 = "insert into publicacion (idCuenta,idProducto) VALUES (?,?)"; 
            ps2= con.prepareStatement(sql2);
            ps2.setInt(1,Integer.parseInt(idCuenta));
            ps2.setInt(2,idprod);
            ps2.execute();
            return true;  
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }   
    }

    public ArrayList<Publicacion> filtrarPublicaciones(String texto, String categoria) {
        ArrayList<Publicacion> resultado = new ArrayList<>();
        PreparedStatement ps = null;
        establecerConexion();
        Connection con = getConexion();
        
         
        String sql = "select * from publicacion publ" +
            " inner join producto prod on publ.idproducto = prod.idproducto" +
            " inner join categoria cat on cat.idCategoria = prod.idCategoria" +    
            " where publ.estadoPublicacion not in(1) ";
        
       
        if (texto != null && !categoria.isBlank()){
            sql+=" and prod.titulo like '%"+texto+"%'";
        }
        
        if (!categoria.isBlank() && categoria != null && !categoria.equals("Seleccione Categoría")){
            sql+=" and cat.descripcionCategoria like '%"+categoria+"%'";
        }
        
        
        try{
            ps= con.prepareStatement(sql);
          //  ps.setString(1,texto);
          //  ps.setString(2,categoria);
            ResultSet rs = ps.executeQuery();
             while (rs.next()){
                Producto prod = new Producto();
                Publicacion pub = new Publicacion();
                Categoria cat = new Categoria();
                
                pub.setIdPublicacion(rs.getInt(1));
                pub.setIdCuenta(rs.getString(2));
                pub.setEstadoPublicacion(rs.getInt(4));
                
                cat.setIdCat(rs.getInt(12));
                cat.setDcategoria(rs.getString(13));
                
                prod.setIdProducto(rs.getInt(3));
                prod.setTitulo(rs.getString(7));
                prod.setDescripcion(rs.getString(8));
                prod.setCantidad(rs.getInt(9));
                prod.setImagen(rs.getString(10));
                prod.setCosto(rs.getInt(11));
                prod.setCategoria(cat);
                
                pub.setProducto(prod);
                
                resultado.add(pub);
            }          
         return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
    public ArrayList<ProdPublicacion> filtrarPublicacionesPorCategoria(int idCategoria) {
         ArrayList<ProdPublicacion> resultado = new ArrayList<>();
        PreparedStatement ps = null;
        establecerConexion();
        Connection con = getConexion();
        
        String sql = "select * from publicacion publ" +
            " inner join producto prod on publ.idproducto = prod.idproducto" +
            " where prod.idCategoria=? and publ.estadoPublicacion not in (1);";
        
        try{
            ps= con.prepareStatement(sql);
            ps.setInt(1,idCategoria);
            ResultSet rs = ps.executeQuery();
             while (rs.next()){
                ProdPublicacion prod = new ProdPublicacion();
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

    public int obtenerUCUCoins(String idCuenta) {
        int resultado = 0;
        PreparedStatement ps = null;
        establecerConexion();
        Connection con = getConexion();
        String sql = "select ucucoins from cuenta where idCuenta= ?";
        try{
            ps= con.prepareStatement(sql);
            ps.setString(1,idCuenta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                resultado = rs.getInt(1);
            }
         } catch (SQLException ex) {
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);           
        } 
        
        return resultado; 
    }
    
    public Boolean cargarUCUCoins(String idCuenta, String coin) {
        PreparedStatement ps = null;
        establecerConexion();
        Connection con = getConexion();
        String sql = "UPDATE cuenta c set ucucoins = ucucoins + ? where idCuenta=?";
        try{
            ps= con.prepareStatement(sql);
            ps.setString(1,coin);
            ps.setString(2,idCuenta);
            ps.executeQuery();
            return true;
         } catch (SQLException ex) {
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);           
        } 
        return false; 
    }

    public void cancelarOferta(int idoferta){
        PreparedStatement ps = null;
        establecerConexion();
        Connection con = getConexion();
        
        String cambioEstadoOferta ="update Oferta set estadoOferta=2, fechaOferta=now() where idOferta=?";
        try{
            ps= con.prepareStatement(cambioEstadoOferta);
            ps.setInt(1,idoferta);
            ps.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public void aceptarTrueque(String idCuenta, int idOferta) {
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;
        PreparedStatement ps3 = null;
        PreparedStatement ps4 = null;
        
        establecerConexion();
        Connection con = getConexion();
        
        String sumoUCUCOins ="update Cuenta c set UCUCoins = UCUCoins +(select UCUCoins from oferta o where o.idOferta=?)"
                + " where c.idCuenta=?";
        
        String restoUCUCOins ="update Cuenta c set UCUCoins = UCUCoins -(select UCUCoins from oferta o where o.idOferta=?)"
                + " where c.idCuenta=(select idCuenta from Oferta oo where oo.idOferta=?)";
        
        
        String cambioEstadoOferta ="update Oferta set estadoOferta=1, fechaOferta=now() where idOferta=?";
        
        String cambioEstadoPublicacion ="update Publicacion set estadoPublicacion=2"
                + " where p.idPublicacion=(select idPublicacionAOfertar from Oferta o where o.idOferta=?)";
         try{
            ps= con.prepareStatement(sumoUCUCOins);
            ps.setInt(1,idOferta);
            ps.setString(2,idCuenta);
            ps.executeUpdate();
            
            ps2= con.prepareStatement(restoUCUCOins);
            ps2.setInt(1,idOferta);
            ps2.setString(2,idCuenta);
            ps2.executeUpdate();
            
            ps3= con.prepareStatement(cambioEstadoOferta);
            ps3.setInt(1,idOferta);
            ps3.executeUpdate();
            
            ps4= con.prepareStatement(cambioEstadoPublicacion);
            ps4.setInt(1,idOferta);
            ps4.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
        }  
        //cambiar estados      
        //poner y sacar ucucoins
        //
    }

    public void rechazarOferta(int idOferta) {
        PreparedStatement ps = null;
        establecerConexion();
        Connection con = getConexion();
        
        String sql="update Oferta set estadoOferta=2,fechaOferta=now() where idOferta=?";
        try{
        ps= con.prepareStatement(sql);
            ps.setInt(1,idOferta);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    public void realizarOferta(ArrayList<Integer> listaOfertas, String idCuenta, int idPublicacion, int ucucoins) {
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;
        establecerConexion();
        Connection con = getConexion();
        int idpublic = 0;
        
        String altaOferta="insert into oferta (idCuenta,idPublicacionAOfertar,UCUCoins,fechaOferta) "
                + " VALUES(?,?,?,now()) RETURNING idoferta";
               
        try{
            ps= con.prepareStatement(altaOferta);
            ps.setString(1,idCuenta);
            ps.setInt(2,idPublicacion);
            ps.setInt(3,ucucoins);
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            if (rs.next()){
                idpublic = rs.getInt(1);
            }
            
            for (Integer i : listaOfertas){
                String altaLineasOferta="insert into LineasOfertadas (idOferta,idPublicacion)"
                        + " VALUES (?,?)";
                ps2= con.prepareStatement(altaLineasOferta);
                ps2.setInt(1,idpublic);
                ps2.setInt(2,i);
                ps2.execute();
            }
        } catch (SQLException ex) {
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
          } 
            
    }
    
    public int obtenerIdCategoria(String categoria) {
        PreparedStatement ps = null;
        int resultado = 0;
        establecerConexion();
        Connection con = getConexion();
        
        String sql="select idCategoria from Categoria where descripcionCategoria=?";
        try{
            ps= con.prepareStatement(sql);
            ps.setString(1, categoria);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                resultado = rs.getInt(1);
            }
            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } 
    }
    
    public ArrayList<Oferta> ofertasRealizadas(String idCuenta){
            ArrayList<Oferta> resultado = new ArrayList<>();
            PreparedStatement ps = null;
            establecerConexion();
            Connection con = getConexion();
            /*
            String sql ="select prod.titulo,cat.descripcionCategoria,prod.costo,prod.imagen,prod.descripcionProducto from publicacion p"
                    + " inner join oferta o on o.idPublicacionAOfertar=p.idPublicacion"
                    + " inner join producto prod on prod.idProducto = p.idProducto"
                    + " inner join categoria cat on cat.idCategoria = producto.idCategoria"
                    + " where p.idCuenta=? and o.estadoOferta=0";
            */
            String sql = "select idpublicacionaofertar,estadooferta, fechaoferta,idoferta,p.titulo,p.costo from oferta o"
                    + " inner join publicacion pro on o.idpublicacionaofertar = pro.idpublicacion"
                    + " inner join producto p on pro.idproducto = p.idproducto where o.idcuenta = ?";
            try{
               ps = con.prepareStatement(sql);
               ps.setString(1, idCuenta);
               ResultSet rs = ps.executeQuery();
                while (rs.next()){
                    Oferta ofer = new Oferta();
                    Publicacion pub = new Publicacion();
                    Producto pro = new Producto();
                    
                    pro.setTitulo(rs.getString(5));
                    pro.setCosto(rs.getInt(6));
                    
                    pub.setIdPublicacion(1);
                    pub.setProducto(pro);
                    
                    ofer.setIdOferta(rs.getInt(4));
                    ofer.setEstado(rs.getInt(2));
                    ofer.setFecha(rs.getDate(3));
                    
                    ofer.setPublicacionAOfertar(pub);

                    resultado.add(ofer);
 
                 }

            }catch (SQLException ex){
                Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            }
            return resultado;
        }
   //Estados Publicacion 0=publicada 1=trueque
//Estados Oferta 0=pendiente , 1=aceptada  2=rechazada

    public ArrayList<Publicacion> obtenerPublicacionesDeCuenta(String idCuenta) {
         PreparedStatement ps = null;
        establecerConexion();
        Connection con = getConexion();
        ArrayList<Publicacion> result = new ArrayList<>(); //CAMBIAR A LIST
        
        /*
        String sql = "SELECT * FROM publicacion p INNER JOIN producto pro ON pro.idproducto = p.idpublicacion INNER JOIN categoria cat ON pro.idcategoria = cat.idcategoria"
                + " WHERE p.idcuenta NOT IN (?) and p.estadoPublicacion not in (5)";
*/
         String sql = "SELECT * FROM publicacion p INNER JOIN producto pro ON p.idproducto = pro.idproducto INNER JOIN categoria cat ON pro.idcategoria = cat.idcategoria"
                + " WHERE p.idcuenta IN (?)";
        
        try{
            ps= con.prepareStatement(sql);
            ps.setString(1,idCuenta);
            //LEER USUARIO LOGEADO E INSERTARLO EN QUERY
            //GUARDAR TODOS LOS DATOS EN UNA LISTA DE PRODUCTOS Y DEVOLVERLO
            //PARA USARSE EN EL BOTON (INSERTAR EN TABLA)
            ResultSet rs = ps.executeQuery();
                 
            while (rs.next()){
                Categoria cat = new Categoria();
                cat.setDcategoria(rs.getString(13));
                Producto prod = new Producto();
                prod.setTitulo(rs.getString(7));
                prod.setCosto(rs.getInt(11));
                prod.setImagen(rs.getString(12));
                prod.setDescripcion(rs.getString(8));
                prod.setCategoria(cat);
                Publicacion publ = new Publicacion();
                publ.setProducto(prod);
                publ.setIdCuenta(idCuenta);
                publ.setIdPublicacion(rs.getInt(1));
                publ.setEstadoPublicacion(rs.getInt(4));
                result.add(publ);
            }
            return result;
            
        } catch (SQLException ex) {
            Logger.getLogger(SentenciaSQL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
