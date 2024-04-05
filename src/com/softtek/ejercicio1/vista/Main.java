package com.softtek.ejercicio1.vista;

import com.softtek.ejercicio1.modelo.Producto;
import com.softtek.ejercicio1.modelo.ProductoPerecedero;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ProductoPerecedero productoPerecedero = new ProductoPerecedero("manzana",5,2.3,
                LocalDate.parse("2024-12-27"),LocalDate.parse("2024-06-12"));

        System.out.println("cantidad a pagar:"+productoPerecedero.cantidadAPagar());
        System.out.println("tiempo de consumicion en dias:"+productoPerecedero.TiempoConsumicion());
    }
}
