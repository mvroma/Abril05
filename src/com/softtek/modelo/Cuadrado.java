package com.softtek.modelo;

public class Cuadrado extends Figura {
    private double lado;

    public  Cuadrado (){
    }
    public  Cuadrado(double lado ) {
        this.lado = lado;
    }

    public double calcularArea() {
        double area = lado * lado;
        return area;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }


}
