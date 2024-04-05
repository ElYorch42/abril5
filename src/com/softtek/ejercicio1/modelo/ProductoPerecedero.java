package com.softtek.ejercicio1.modelo;

import java.time.LocalDate;
import java.time.Period;

public class ProductoPerecedero extends Producto {

    private LocalDate fCaducidad;

    private LocalDate fFabricacion;


    public ProductoPerecedero(String nombre, int cantidad, double pvp, LocalDate fCaducidad, LocalDate fFabricacion) {
        super(nombre, cantidad, pvp);
        this.fCaducidad = fCaducidad;
        this.fFabricacion = fFabricacion;
    }

    public ProductoPerecedero() {
    }

    public double TiempoConsumicion() {
        Period periodo = Period.between(fFabricacion,fCaducidad);
        return periodo.getDays();
    }

    public LocalDate getfCaducidad() {
        return fCaducidad;
    }

    public void setfCaducidad(LocalDate fCaducidad) {
        this.fCaducidad = fCaducidad;
    }

    public LocalDate getfFabricacion() {
        return fFabricacion;
    }

    public void setfFabricacion(LocalDate fFabricacion) {
        this.fFabricacion = fFabricacion;
    }
}
