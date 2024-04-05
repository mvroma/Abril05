package com.softtek.modelo;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public double calcularArea(){
        double area = (base*altura)/2;
        return area;
    }

    public  Triangulo (){
    }

    public Triangulo(int x, int y, double base, double altura){
        super(x, y);
        this.base = base;
        this.altura = altura;
    }
    public  Triangulo(double base, double altura ) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public double getBase() {
        return base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }

}
