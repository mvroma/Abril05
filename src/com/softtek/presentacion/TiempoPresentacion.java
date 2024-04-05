package com.softtek.presentacion;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.Period;
import java.time.ZonedDateTime;

public class TiempoPresentacion {
    public static void main(String[] args) {
        //Declarar la fecha de inicio del curso y le sumamos 10 días

        LocalDate TiempoPresentacion = LocalDate.of(2024, 4, 2);
        LocalDate diezDias = TiempoPresentacion.plusDays(10);

        System.out.println("El curso empezó el: " + TiempoPresentacion);
        System.out.println("Ya han pasasdo 10 días, por eso es: " + diezDias);

        //Declarar la fecha de hoy con la zona horaria por defecto

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Hoy es: " + now);

        //Declarar la fecha de hoy con la zona horaria de “Australia/Sydney”

        ZonedDateTime nowAustralia = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println("En Australia es: " + nowAustralia);

        //Cual es el día 100 de 2024

        LocalDate TiempoCien = LocalDate.ofYearDay(2024, 100);
        System.out.println("El día 100 del 2024 corresponde al: " + TiempoCien);

        /*Definir una fecha para navidad y otra para noche vieja y compararlas
        con los métodos isBefore isAfter*/

        LocalDate navidad = LocalDate.of(2024, 12, 25);
        LocalDate AñoNuevo = LocalDate.of(2025, 1, 1);

        ZoneId defaultZone = ZoneId.systemDefault();
        ZonedDateTime nowDefaultZone = ZonedDateTime.now(defaultZone);
        ZoneId madridZone = ZoneId.of("Europe/Madrid");
        ZonedDateTime nowMadridZone = ZonedDateTime.now(madridZone);

        boolean navidadesAntesNowDefaultZone = navidad.isBefore(nowDefaultZone.toLocalDate());
        boolean navidadDespuesNowMadridZone = navidad.isAfter(nowMadridZone.toLocalDate());
        boolean AñoNuevoAntesChristmas = AñoNuevo.isBefore(navidad);
        boolean AñoNuevoDespuesNowDefaultZone = AñoNuevo.isAfter(nowDefaultZone.toLocalDate());
        boolean AñoNuevoDespuesAfterNowMadridZone = AñoNuevo.isAfter(nowMadridZone.toLocalDate());

        boolean esNavidadAntes = navidad.isBefore(AñoNuevo);
        boolean esNavidadDespues = navidad.isAfter(AñoNuevo);

        System.out.println("EsNavidad Antes?: " + esNavidadAntes);
        System.out.println("EsNavidad Despues? :" + esNavidadDespues);

        //Calcular la fecha resultante sumando 35 semanas al 15 de marzo de 2024.

        LocalDate diaDeHoy = LocalDate.of(2024, 3, 15);
        int semanas = 35;
        LocalDate diaFinal = diaDeHoy.plusWeeks(semanas);
        System.out.println(diaFinal);

        /*Calcular los años trabajados en una empresa de un empleado que
        inició a trabajar el 6 de Julio de 2012*/

        LocalDate startDate = LocalDate.of(2012, 7, 6);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(startDate, currentDate);
        int añosTrabajado = period.getYears();

        System.out.println("El empleado ha trabajado: " + añosTrabajado + " años.");

        //Calcular la edad de una persona que nació el 7 de agosto de 2007

        LocalDate diaInicio = LocalDate.of(2007,8,7);
        LocalDate diaHoy = LocalDate.now();
        Period periods = Period.between(diaInicio, diaHoy);
        int edad = periods.getYears();

        System.out.println("Esta persona tiene " + edad  + "años");

        /*Calcular la fecha en que se tiene que iniciar un proyecto si su duración
        es 200 días y se tiene que entregar el 2 de octubre de 2024*/

        LocalDate fechaEntrega = LocalDate.of(2024, 10, 2);
        LocalDate fechaInicio = fechaEntrega.minusDays(200);

        System.out.println("El proyecto tiene que empezar el: " + fechaInicio);

        /*Si un proyecto inicia el 15 de marzo y termina el 20 de octubre
        cuál es su periodo.*/

        LocalDate Inicio = LocalDate.of(2024, 3, 15);
        LocalDate Fin = LocalDate.of(2024, 10, 20);

        Period periodo = Period.between(startDate, Fin);

        System.out.println("El tiempo entre el inicio y final del proyecto es de :" + period.getYears() +
                " años, " + period.getMonths() + " meses, y " + period.getDays() + " días.");







    }



}