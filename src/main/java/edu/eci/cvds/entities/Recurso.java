package edu.eci.cvds.entities;

public class Recurso {
    
    private int idRecurso;
    private String nombre;
    private String tipo;
    private int capacidad;
    private String ubicacion;
    private boolean estado;

    public Recurso(){
        super();
    }

    public Recurso(int idRecurso, String nombre, String tipo, int capacidad, String ubicacion, boolean estado) {
        this.idRecurso = idRecurso;
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    public Recurso(String nombre, String tipo, int capacidad, String ubicacion, boolean estado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    public int getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(int idRecurso) {
        this.idRecurso = idRecurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "Recurso{" + "idRecurso=" + idRecurso + ", nombre=" + nombre + ", tipo=" + tipo + ", capacidad=" + capacidad + ", ubicacion=" + ubicacion + ", estado=" + estado + "}";
    }
}
