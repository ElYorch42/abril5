package com.softtek.ejercicio4.modelo;

public class Flauta extends InstrumentoMusical{
    private String material;

    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }

    public Flauta() {
    }

    @Override
    public String emitirSonido() {
        return "Flauta marca:"+marca+" material:"+material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
