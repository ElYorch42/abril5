package com.softtek.ejercicio5.vista;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {

        //a
        LocalDate fechaInicioCurso = LocalDate.parse("2024-04-02");
        System.out.println("Inicio:"+fechaInicioCurso+" +10 Dias:"+fechaInicioCurso.plusDays(10));
        //b
        ZonedDateTime fechaHoyDefault = ZonedDateTime.now();
        System.out.println("Fecha hoy por defecto:"+fechaHoyDefault.toString());
        //c
        ZonedDateTime fechaHoyAustralia = ZonedDateTime.now(ZoneId.of("AET", ZoneId.SHORT_IDS));
        System.out.println("Fecha hoy australia:"+fechaHoyAustralia.toString());
        //d
        LocalDate fecha1 = LocalDate.parse("2024-01-01");
        System.out.println("Dia 100:"+fecha1.plusDays(100));
        //e
        LocalDate fechaNavidad = LocalDate.parse("2024-12-25");
        LocalDate fechaNochevieja = LocalDate.parse("2024-12-31");
        if (fechaNavidad.isBefore(fechaNochevieja)) {
            System.out.println("Navidad es antes que Nochevieja");
        }
        if (fechaNochevieja.isAfter(fechaNavidad)) {
            System.out.println("Nochevieja es despues de Navidad");
        }
        //f
        LocalDate fecha35Semanas = LocalDate.parse("2024-03-15");
        System.out.println("Inicio:"+fecha35Semanas+" +35 semanas:"+fecha35Semanas.plusWeeks(35));
        //g
        LocalDate fechaInicioTrabajo = LocalDate.parse("2012-06-06");
        System.out.println("años trabajados:"+ Period.between(fechaInicioTrabajo,LocalDate.now()).getYears());
        //h
        LocalDate fechaNacimiento = LocalDate.parse("2007-07-07");
        System.out.println("años cumplidos:"+ Period.between(fechaNacimiento,LocalDate.now()).getYears());
        //i
        LocalDate fechaEntrega = LocalDate.parse("2024-10-02");
        System.out.println("Dia de inicio:"+ fechaEntrega.minusDays(200));
        //j
        LocalDate fechaInicioProyecto = LocalDate.parse("2024-03-15");
        LocalDate fechaFinPoryecto = LocalDate.parse("2024-10-02");
        Period periodo = Period.between(fechaInicioProyecto,fechaFinPoryecto);
        int anios = periodo.getYears();
        periodo = periodo.minusYears(anios);
        int meses = periodo.getMonths();
        periodo = periodo.minusMonths(meses);
        int dias = periodo.getDays();
        System.out.println("Periodo:"+anios+" años "+meses+" meses "+dias+" dias");
    }
}
