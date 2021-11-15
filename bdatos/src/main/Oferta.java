/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Date;


public class Oferta {
    private int idOferta;
    private Publicacion PublicacionAOfertar;
    private ArrayList<Publicacion> publicacionesOfertadas;
    private String idCuenta;
    private int UCUCoins;  
    private int estado;
    private Date fecha;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

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

    public Publicacion getPublicacionAOfertar() {
        return PublicacionAOfertar;
    }

    public void setPublicacionAOfertar(Publicacion PublicacionAOfertar) {
        this.PublicacionAOfertar = PublicacionAOfertar;
    }

    public ArrayList<Publicacion> getPublicacionesOfertadas() {
        return publicacionesOfertadas;
    }

    public void setPublicacionesOfertadas(ArrayList<Publicacion> publicacionesOfertadas) {
        this.publicacionesOfertadas = publicacionesOfertadas;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public int getUCUCoins() {
        return UCUCoins;
    }

    public void setUCUCoins(int UCUCoins) {
        this.UCUCoins = UCUCoins;
    }
    
    
}
