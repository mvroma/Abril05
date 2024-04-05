package com.softtek.modelo;
import com.softtek.modelo.Empleado;
public class Gerente extends Empleado {
    private double bono;

    public double calcularNomina(){
        double nomina = (sueldo + bono)* Porcentaje;
        return nomina;
    }
}

