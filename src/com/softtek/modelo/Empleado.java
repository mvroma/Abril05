package com.softtek.modelo;

public class Empleado {
        protected String nombre;
        protected double sueldo;
        protected double Porcentaje = 0.75;

        public double calcularNomina(){
            double nomina = sueldo * Porcentaje;
            return nomina;
        }
    }
