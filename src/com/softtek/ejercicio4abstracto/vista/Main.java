package com.softtek.ejercicio4abstracto.vista;

import com.softtek.ejercicio4abstracto.modelo.Bateria;
import com.softtek.ejercicio4abstracto.modelo.Flauta;
import com.softtek.ejercicio4abstracto.modelo.Guitarra;
import com.softtek.ejercicio4abstracto.modelo.InstrumentoMusical;

public class Main {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra("Guido","clasica");
        Bateria bateria = new Bateria("Bataca",3);
        Flauta flauta = new Flauta("Ham","madera");
        InstrumentoMusical[] instrumentoMusicales = {guitarra,bateria,flauta};

        for (InstrumentoMusical instrumento:instrumentoMusicales) {
            System.out.println(instrumento.emitirSonido());
        }
    }
}
