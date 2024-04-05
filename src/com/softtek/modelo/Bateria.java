package com.softtek.modelo;

public class Bateria extends Instrumentos{
    private int noPlatillos;

    public String emitirSonido(String sonido){
        return sonido;
    }
    public Bateria() {
    }

    public Bateria(String marca, int noPlatillos) {
        super(marca);
        this.noPlatillos = noPlatillos;
    }

    public Bateria(int noPlatillos) {
        this.noPlatillos = noPlatillos;
    }

}
