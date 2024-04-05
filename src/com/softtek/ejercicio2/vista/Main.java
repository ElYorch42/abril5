package com.softtek.ejercicio2.vista;

import com.softtek.ejercicio2.modelo.Gerente;
import com.softtek.ejercicio2.modelo.Operador;
import com.softtek.ejercicio2.modelo.Vendedor;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Manuel",10,5);
        Vendedor vendedor = new Vendedor("Paco",4,10,0.20);
        Operador operador = new Operador("Jose",2,30,0.10);

        System.out.println("Gerente "+gerente.getNombre()+" cobra:"+gerente.calcularNomina());
        System.out.println("Vendedor "+vendedor.getNombre()+" cobra:"+vendedor.calcularNomina());
        System.out.println("Operador "+operador.getNombre()+" cobra:"+operador.calcularNomina());
    }
}
