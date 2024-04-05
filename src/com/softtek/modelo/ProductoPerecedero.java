package com.softtek.modelo;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto {
        private LocalDate fCaducidad;
        private LocalDate fFabricacion;

        public int tiempoCosumision(int dia) {
            return dia;
        }
    }
