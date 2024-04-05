package com.softtek.ejercicio4.modelo;

public class Guitarra extends InstrumentoMusical{
    private String tipoCuerdas;

    public Guitarra(String marca, String tipoCuerdas) {
        super(marca);
        this.tipoCuerdas = tipoCuerdas;
    }

    public Guitarra() {
    }

    @Override
    public String emitirSonido() {
        return "Guitarra marca:"+marca+" tipo:"+tipoCuerdas;
    }

    public String getTipoCuerdas() {
        return tipoCuerdas;
    }

    public void setTipoCuerdas(String tipoCuerdas) {
        this.tipoCuerdas = tipoCuerdas;
    }
}
