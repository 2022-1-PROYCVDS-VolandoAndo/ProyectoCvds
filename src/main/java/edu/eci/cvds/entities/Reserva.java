package edu.eci.cvds.entities;

import java.sql.Time;

public class Reserva {
    
    private int idReserva;
    private int idRecurso;
    private int idUsuario;
    private Time tiempoInicio;
    private Time tiempoFinal;
    private boolean recurrencia;
    private String periodicidad;
    private Time finalRecurrencia;
    private Time fechaSolicitud;
    private boolean estado;

    public Reserva(){
        super();
    }

    public Reserva(int idReserva, int idRecurso, int idUsuario, Time tiempoInicio, Time tiempoFinal,
            boolean recurrencia, String periodicidad, Time finalRecurrencia, Time fechaSolicitud, boolean estado) {
        this.idReserva = idReserva;
        this.idRecurso = idRecurso;
        this.idUsuario = idUsuario;
        this.tiempoInicio = tiempoInicio;
        this.tiempoFinal = tiempoFinal;
        this.recurrencia = recurrencia;
        this.periodicidad = periodicidad;
        this.finalRecurrencia = finalRecurrencia;
        this.fechaSolicitud = fechaSolicitud;
        this.estado = estado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(int idRecurso) {
        this.idRecurso = idRecurso;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public boolean isRecurrencia() {
        return recurrencia;
    }

    public void setRecurrencia(boolean recurrencia) {
        this.recurrencia = recurrencia;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public Time getFinalRecurrencia() {
        return finalRecurrencia;
    }

    public void setFinalRecurrencia(Time finalRecurrencia) {
        this.finalRecurrencia = finalRecurrencia;
    }

    public Time getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Time fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", idRecurso=" + idRecurso + ", idUsuario=" + idUsuario + ", tiempoInicio=" + tiempoInicio + ", tiempoFinal=" + tiempoFinal + ", recurrencia=" + recurrencia + ", periodicidad=" + periodicidad + ", finalRecurrencia=" + finalRecurrencia + ", fechaSolicitud=" + fechaSolicitud + ", estado=" + estado + "}";
    }

}
