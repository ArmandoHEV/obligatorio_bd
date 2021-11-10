/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import interfaz.*;
import java.util.*;
/**
 *
 * @author mlisonct
 */
public class truequeUCU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conexionBD bd = new conexionBD();
        bd.establecerConexion();
        
        login init = new login();
        init.setVisible(true);
        
        sentenciaSQL test = new sentenciaSQL();
        ArrayList<ProductoPublicacion> hola = test.buscarPublicacion();
        
        for (ProductoPublicacion i : hola){
            System.out.println(i.getTitulo());
        }
       
       
    }
    
}
