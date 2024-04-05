package com.softtek.modelo;

public class Figura {
    protected int x;
    protected int y;

    public double calcularArea() {
        double area =x*y;
        return area;
    }

    public String mostarPosicion(String posicion) {
        return posicion;
    }

   public Figura(int x, int y){
    this.x = x;
    this.y = y;
    }

    public Figura(){

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

