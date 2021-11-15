/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Wilfred
 */
public class Publicacion {
   private int idPublicacion;
   private Cuenta cuenta;
   private Producto producto;
   private int estadoPublicacion;

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }



    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getEstadoPublicacion() {
        return estadoPublicacion;
    }

    public void setEstadoPublicacion(int estadoPublicacion) {
        this.estadoPublicacion = estadoPublicacion;
    }
   
   
}
