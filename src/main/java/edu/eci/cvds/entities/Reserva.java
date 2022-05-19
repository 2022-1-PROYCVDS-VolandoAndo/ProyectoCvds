package edu.eci.cvds.entities;

import java.sql.Timestamp;

public class Reserva {
    
    private int idReserva;
    private int idRecurso;
    private int idUsuario;
    private Timestamp tiempoInicio;
    private Timestamp tiempoFinal;
    private boolean recurrencia;
    private String periodicidad;
    private Timestamp finalRecurrencia;
    private Timestamp fechaSolicitud;
    private String etapa;
    private boolean estado;

    public Reserva(){
        super();
    }

    public Reserva(int idReserva, int idRecurso, int idUsuario, Timestamp tiempoInicio, Timestamp tiempoFinal,
            boolean recurrencia, String periodicidad, Timestamp finalRecurrencia, Timestamp fechaSolicitud, String etapa,
            boolean estado) {
        this.idReserva = idReserva;
        this.idRecurso = idRecurso;
        this.idUsuario = idUsuario;
        this.tiempoInicio = tiempoInicio;
        this.tiempoFinal = tiempoFinal;
        this.recurrencia = recurrencia;
        this.periodicidad = periodicidad;
        this.finalRecurrencia = finalRecurrencia;
        this.fechaSolicitud = fechaSolicitud;
        this.etapa = etapa;
        this.estado = estado;
    }

    public Reserva(int idRecurso, int idUsuario, Timestamp tiempoInicio, Timestamp tiempoFinal, boolean recurrencia,
            String periodicidad, Timestamp finalRecurrencia, String etapa, boolean estado) {
        this.idRecurso = idRecurso;
        this.idUsuario = idUsuario;
        this.tiempoInicio = tiempoInicio;
        this.tiempoFinal = tiempoFinal;
        this.recurrencia = recurrencia;
        this.periodicidad = periodicidad;
        this.finalRecurrencia = finalRecurrencia;
        this.etapa = etapa;
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

    public Timestamp getTiempoInicio() {
        return tiempoInicio;
    }

    public void setTiempoInicio(Timestamp tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
    }

    public Timestamp getTiempoFinal() {
        return tiempoFinal;
    }

    public void setTiempoFinal(Timestamp tiempoFinal) {
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

    public Timestamp getFinalRecurrencia() {
        return finalRecurrencia;
    }

    public void setFinalRecurrencia(Timestamp finalRecurrencia) {
        this.finalRecurrencia = finalRecurrencia;
    }

    public Timestamp getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Timestamp fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", idRecurso=" + idRecurso + ", idUsuario=" + idUsuario + ", tiempoInicio=" + tiempoInicio + ", tiempoFinal=" + tiempoFinal + ", recurrencia=" + recurrencia + ", periodicidad=" + periodicidad + ", finalRecurrencia=" + finalRecurrencia + ", fechaSolicitud=" + fechaSolicitud + ", etapa=" + etapa + ", estado=" + estado + "}";
    }

}
