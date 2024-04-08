package com.softtek.ejercicio3abstracto.modelo;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    public Cuadrado() {
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado,2);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
