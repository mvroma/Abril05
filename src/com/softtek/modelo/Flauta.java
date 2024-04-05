package com.softtek.modelo;

public class Flauta extends Instrumentos{
    private String material;

    public String emitirSonido(String sonido){
        return sonido;
    }
    public Flauta() {
    }

    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }

    public Flauta(String material) {
        this.material = material;
    }
}
