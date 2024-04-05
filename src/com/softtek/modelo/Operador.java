package com.softtek.modelo;

public class Operador extends Empleado {
    private int piezas;
    private double incentivo;

    public double calcularNomina(){
        double nomina = ((piezas*incentivo)+sueldo)*Porcentaje;
        return nomina;
    }
}
