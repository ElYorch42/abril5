package com.softtek.ejercicio4.vista;

import com.softtek.ejercicio4.modelo.Bateria;
import com.softtek.ejercicio4.modelo.Flauta;
import com.softtek.ejercicio4.modelo.Guitarra;
import com.softtek.ejercicio4.modelo.InstrumentoMusical;

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
