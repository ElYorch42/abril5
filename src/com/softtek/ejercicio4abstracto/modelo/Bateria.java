package com.softtek.ejercicio4abstracto.modelo;

public class Bateria extends InstrumentoMusical {
    private int noPlatillos;

    public Bateria(String marca, int noPlatillos) {
        super(marca);
        this.noPlatillos = noPlatillos;
    }

    public Bateria() {
    }

    @Override
    public String emitirSonido() {
        return "Bateria marca:"+marca+" nº platillos:"+noPlatillos;
    }

    public int getNoPlatillos() {
        return noPlatillos;
    }

    public void setNoPlatillos(int noPlatillos) {
        this.noPlatillos = noPlatillos;
    }
}
