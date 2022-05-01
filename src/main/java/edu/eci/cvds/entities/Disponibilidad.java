package edu.eci.cvds.entities;

import java.sql.Time;

public class Disponibilidad {

    private int id;
    private int idRecurso;
    private Time tiempoInicio;
    private Time tiempoFinal;

    public Disponibilidad(){
        super();
    }

    public Disponibilidad(int id, int idRecurso, Time tiempoInicio, Time tiempoFinal) {
        this.id = id;
        this.idRecurso = idRecurso;
        this.tiempoInicio = tiempoInicio;
        this.tiempoFinal = tiempoFinal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
}
