package com.softtek.ejercicio2.modelo;

public class Operador extends Empleado{

    private int piezas;

    private double incentivo;

    public Operador(String nombre, double sueldo, int piezas, double incentivo) {
        super(nombre, sueldo);
        this.piezas = piezas;
        this.incentivo = incentivo;
    }

    public Operador() {
    }

    @Override
    public double calcularNomina() {
        return (((double)piezas*incentivo)+sueldo)*PORCENTAJE;
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
}
