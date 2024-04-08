package com.softtek.ejercicio3abstracto.modelo;

public abstract class Figura {
    protected int x;
    protected int y;

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Figura() {
    }

    public abstract double calcularArea();

    public String mostrarPosicion() {
        String posicion = "X:"+x+" Y:"+y;
        return posicion;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
