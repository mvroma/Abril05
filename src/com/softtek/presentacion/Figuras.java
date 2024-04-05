package com.softtek.presentacion;
import com.softtek.modelo.Figura;
import com.softtek.modelo.Triangulo;
import com.softtek.modelo.Cuadrado;
public class Figuras {
    public static void main(String[] args) {
        Figura cMediano = new Cuadrado(10.0);
        Cuadrado cPeque = new Cuadrado();
        cPeque.setLado(6.0);
        Figura tMediano = new Triangulo(4, 3);
        Triangulo tPeque = new Triangulo();
        tPeque.setAltura(2.0);
        tPeque.setBase(3.0);


        System.out.println("El área del cuadrado es: " + cPeque.calcularArea());
        System.out.println("El área del triángulo es: " + tPeque.calcularArea());

        Figura[] figuras = new Figura[4];
        figuras[0] = cPeque;
        figuras[1] = cMediano;
        figuras[2] = tPeque;
        figuras[3] = tMediano;
        for (Figura figura : figuras) {
            double area = figura.calcularArea();
            if (figura instanceof Cuadrado) {
                System.out.println("El área de la figura " + cPeque + "es:" + area);
            }else if (figura instanceof Cuadrado) {
                System.out.println("El área de la figura " + cMediano + "es:" + area);
            }else if (figura instanceof  Triangulo) {
                System.out.println("El área de la figura " + tPeque + "es:" + area);
            }else if (figura instanceof  Triangulo){
                System.out.println("El área de la figura " + tMediano + "es:" + area);
                }
            }
        }
    }

