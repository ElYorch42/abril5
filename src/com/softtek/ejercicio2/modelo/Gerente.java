package com.softtek.ejercicio2.modelo;

public class Gerente extends Empleado{

    private double bono;

    public Gerente(String nombre, double sueldo, double bono) {
        super(nombre, sueldo);
        this.bono = bono;
    }

    public Gerente() {
    }

    @Override
    public double calcularNomina() {
        return (sueldo+bono)*PORCENTAJE;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
}
