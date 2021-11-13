/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Wilfred
 */
public class Categoria {
    private int idCat;
    private String dcategoria; //Descripcion Categoria

    public Categoria(){
        
    }
    
    public Categoria(int idCat, String dcategoria) {
        this.idCat = idCat;
        this.dcategoria = dcategoria;
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public String getDcategoria() {
        return dcategoria;
    }

    public void setDcategoria(String dcategoria) {
        this.dcategoria = dcategoria;
    }
    
    
    
}
