package com.softtek.modelo;

public class Instrumentos {
    protected String marca;

    public String emitirSonido(String sonido){
        return sonido;
    }
    public Instrumentos(String marca) {
        this.marca = marca;
    }
    public Instrumentos() {
    }

    // Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
