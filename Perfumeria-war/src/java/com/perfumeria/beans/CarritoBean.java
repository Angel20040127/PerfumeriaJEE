package com.perfumeria.beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("carritoBean")
@SessionScoped
public class CarritoBean implements Serializable {

    private List<Producto> listaCarrito;

    public CarritoBean() {
        listaCarrito = new ArrayList<>();
        // Productos de prueba iniciales
        listaCarrito.add(new Producto("Chanel No. 5", 2500.00, 1));
        listaCarrito.add(new Producto("Dior Sauvage", 2200.00, 2));
    }

   public List<Producto> getListaCarrito() {
    return listaCarrito;
}

    public void setListaCarrito(List<Producto> listaCarrito) {
        this.listaCarrito = listaCarrito;
    }

    // Clase interna para los elementos de la tabla
    public static class Producto implements Serializable {
        private String nombre;
        private double precio;
        private int cantidad;

        public Producto(String nombre, double precio, int cantidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }
    }
}