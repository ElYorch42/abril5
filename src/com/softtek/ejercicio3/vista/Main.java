package com.softtek.ejercicio3.vista;

import com.softtek.ejercicio3.modelo.Cuadrado;
import com.softtek.ejercicio3.modelo.Figura;
import com.softtek.ejercicio3.modelo.Triangulo;

public class Main {
    public static void main(String[] args) {
        Cuadrado cPeque = new Cuadrado();
        cPeque.setLado(3);
        cPeque.setX(1);
        cPeque.setY(1);
        Cuadrado cMediano = new Cuadrado(2,1,5);
        Triangulo tPeque = new Triangulo();
        tPeque.setBase(3);
        tPeque.setAltura(3);
        tPeque.setX(1);
        tPeque.setY(2);
        Triangulo tMediano = new Triangulo(2,2,5,6);
        Figura[] matriz = {cPeque,cMediano,tPeque,tMediano};

        for (Figura figura:matriz) {
            System.out.println("figura posicion "+figura.mostrarPosicion()+" area:"+ figura.calcularArea());
        }
    }
}
