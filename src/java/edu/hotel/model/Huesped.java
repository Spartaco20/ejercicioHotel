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
public class Huesped {
    
    private String nombreApellido = "";
    private String direccion = "";
    private String profesion = "";
    private String estadoCivil = "";
    private String horaDespertador = "";

    public Huesped() {
    }

    public Huesped(String nombreApellido, String direccion, String profesion, String estadoCivil, String horaDespertador) {
        this.nombreApellido = nombreApellido;
        this.direccion = direccion;
        this.profesion = profesion;
        this.estadoCivil = estadoCivil;
        this.horaDespertador = horaDespertador;
    }
    
    public void registroHuesped() {
        
    }
    
    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getHoraDespertador() {
        return horaDespertador;
    }

    public void setHoraDespertador(String horaDespertador) {
        this.horaDespertador = horaDespertador;
    }
    
}
