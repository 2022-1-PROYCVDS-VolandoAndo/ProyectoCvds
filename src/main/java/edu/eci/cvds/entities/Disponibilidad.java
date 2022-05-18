package edu.eci.cvds.entities;

import java.sql.Time;

public class Disponibilidad {

    private String dia;
    private int idRecurso;
    private Time tiempoInicio;
    private Time tiempoFinal;

    public Disponibilidad(){
        super();
    }

    public Disponibilidad(String dia, int idRecurso, Time tiempoInicio, Time tiempoFinal) {
        this.dia = dia;
        this.idRecurso = idRecurso;
        this.tiempoInicio = tiempoInicio;
        this.tiempoFinal = tiempoFinal;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(int idRecurso) {
        this.idRecurso = idRecurso;
    }

    public Time getTiempoInicio() {
        return tiempoInicio;
    }

    public void setTiempoInicio(Time tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
    }

    public Time getTiempoFinal() {
        return tiempoFinal;
    }

    public void setTiempoFinal(Time tiempoFinal) {
        this.tiempoFinal = tiempoFinal;
    }
    
    @Override
    public String toString() {
        return "Disponibilidad{" + "dia=" + dia + ", idRecurso=" + idRecurso+ ", tiempoInicio=" + tiempoInicio + ", tiempoFinal=" + tiempoFinal + "}";
    }

}
