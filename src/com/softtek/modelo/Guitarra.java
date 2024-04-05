package com.softtek.modelo;

public class Guitarra extends Instrumentos {
    private String tipoCuerdas;

    public String emitirSonido(String sonido) {
        return sonido;
    }

    public Guitarra(String marca, String tipoCuerdas) {
        super(marca);
        this.tipoCuerdas = tipoCuerdas;
    }

    public String getTipoCuerdas() {
        return tipoCuerdas;
    }

    public void setTipoCuerdas(String tipoCuerdas) {
        this.tipoCuerdas = tipoCuerdas;
    }
}

