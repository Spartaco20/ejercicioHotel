/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hotel.controller;

import edu.hotel.model.Confiteria;
import edu.hotel.model.Hotel;
import edu.hotel.model.Huesped;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author HP
 */
@ManagedBean
@SessionScoped
public class ProcesoHotel implements Serializable{

    private Hotel hotel = new Hotel();
    private Huesped huesped = new Huesped();
    private Confiteria confiteria = new Confiteria();
    
    public ProcesoHotel() {
    }

    public void reservaHotel() {
        hotel.registrarHotel();
    }
    
    public void registrarHuesped() {
        huesped.registroHuesped();
    }
    
    public void registroConfiteria() {
        confiteria.registrarConfiteria();
    }
    
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Confiteria getConfiteria() {
        return confiteria;
    }

    public void setConfiteria(Confiteria confiteria) {
        this.confiteria = confiteria;
    }
    
}
