package com.softtek.modelo;

public class Vendedor extends Empleado {
    private double ventas;
    private double comision;

    public double calcularNomina() {
        double nomina = ((ventas * comision) + sueldo) * Porcentaje;
        return nomina;
    }
}
