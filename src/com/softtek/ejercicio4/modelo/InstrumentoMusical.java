package com.softtek.ejercicio4.modelo;

public class InstrumentoMusical {
    protected String marca;

    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }

    public InstrumentoMusical() {
    }

    public String emitirSonido() {
        return marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
