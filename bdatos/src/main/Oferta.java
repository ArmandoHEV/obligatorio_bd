/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Wilfred
 */
public class Oferta {
    private int idOferta;
    private Publicacion idPublicacionAOfertar;
    private ArrayList<Publicacion> publicacionesOfertadas;
    private int idCuenta;
    private int UCUCoins;  
    private int estado;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public Publicacion getIdPublicacionAOfertar() {
        return idPublicacionAOfertar;
    }

    public void setIdPublicacionAOfertar(Publicacion idPublicacionAOfertar) {
        this.idPublicacionAOfertar = idPublicacionAOfertar;
    }

    public ArrayList<Publicacion> getPublicacionesOfertadas() {
        return publicacionesOfertadas;
    }

    public void setPublicacionesOfertadas(ArrayList<Publicacion> publicacionesOfertadas) {
        this.publicacionesOfertadas = publicacionesOfertadas;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public int getUCUCoins() {
        return UCUCoins;
    }

    public void setUCUCoins(int UCUCoins) {
        this.UCUCoins = UCUCoins;
    }
    
    
}
