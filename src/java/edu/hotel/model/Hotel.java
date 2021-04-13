/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hotel.model;

/**
 *
 * @author HP
 */
public class Hotel {
    
    private String nombre = "";
    private String direccion = "";
    private String ciudad = "";
    private String barrio = "";
    private int telefono = 0;
    private String tipoHabitacion = "";
    private String fechaInicio = "";
    private String fechaSalida = "";
    
    private int numeroHabitacion ;
    private String banoPrivado = "";
    private String telefonoHabitacion = "";
    private String calefaccion = "";

    public Hotel() {
    }
    
    public Hotel(String nombre, String direccion, String ciudad, String barrio, int telefono, String tipoHabitacion, String fechaInicio, String fechaSalida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.telefono = telefono;
        this.tipoHabitacion = tipoHabitacion;
        this.fechaInicio = fechaInicio;
        this.fechaSalida = fechaSalida;
    }

    public void registrarHotel() {
        if (this.tipoHabitacion.equals("Simple")){
            this.numeroHabitacion = (int) ((Math.random() * 15) + 200);
            this.banoPrivado = "Baño sencillo";
            this.telefonoHabitacion = "Sin telefono";
            this.calefaccion = "Sin calefacción";
        } else {
            if(this.tipoHabitacion.equals("Doble")) {
                this.numeroHabitacion = (int) ((Math.random() * 15) + 400);
                this.banoPrivado = "Baño con sauna";
                this.telefonoHabitacion = "Llamadas local y nacional";
                this.calefaccion = "Con calefacción";
            } else {
                if(this.tipoHabitacion.equals("Suite")){
                    this.numeroHabitacion = (int) ((Math.random() * 10) + 600);
                    this.banoPrivado = "Baño, Sauna y Turco";
                    this.telefonoHabitacion = "Llamadas Local, Nacional e Internacional";
                    this.calefaccion = "Con calefacción y Aire acondicionado";
                }
            }
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getBanoPrivado() {
        return banoPrivado;
    }

    public void setBanoPrivado(String banoPrivado) {
        this.banoPrivado = banoPrivado;
    }

    public String getTelefonoHabitacion() {
        return telefonoHabitacion;
    }

    public void setTelefonoHabitacion(String telefonoHabitacion) {
        this.telefonoHabitacion = telefonoHabitacion;
    }

    public String getCalefaccion() {
        return calefaccion;
    }

    public void setCalefaccion(String calefaccion) {
        this.calefaccion = calefaccion;
    }
    
}
