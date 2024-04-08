package com.softtek.ejercicio4abstracto.modelo;

public abstract class InstrumentoMusical {
    protected String marca;

    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }

    public InstrumentoMusical() {
    }

    public abstract String emitirSonido();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
