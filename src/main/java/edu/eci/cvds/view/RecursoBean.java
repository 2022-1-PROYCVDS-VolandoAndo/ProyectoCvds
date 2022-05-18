package edu.eci.cvds.view;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Disponibilidad;
import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.services.ProyectoServices;

@ManagedBean(name = "RecursoBean")
@SessionScoped
public class RecursoBean extends BasePageBean {
    
    @Inject
    private ProyectoServices proyectoServices;

    private List<Recurso> recursos;
    private ArrayList<Recurso> filter;
    private int idRecurso;
    private String nombre;
    private String tipo;
    private String capacidad;
    private String ubicacion;
    private boolean estado = true;
    private String tiempoInicio;
    private String tiempoFinal;
    private String[] dias;

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

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
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

    public String getTiempoInicio() {
        return tiempoInicio;
    }

    public void setTiempoInicio(String tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
    }

    public String getTiempoFinal() {
        return tiempoFinal;
    }

    public void setTiempoFinal(String tiempoFinal) {
        this.tiempoFinal = tiempoFinal;
    }

    public String[] getDias() {
        return dias;
    }

    public void setDias(String[] dias) {
        this.dias = dias;
    }

    public void insertarRecurso() throws PersistenceException{
        try {
            if(nombre.isEmpty() || tipo.isEmpty() || capacidad.isEmpty() || ubicacion.isEmpty() || tiempoInicio.isEmpty() || tiempoFinal.isEmpty() || dias.length < 1){
                messageError("Todos los campos deben ser completados");
            }else if(!nombre.matches("[a-zA-Z].*")){
                messageError("El nombre debe iniciar con una letra"); 
            }else if(Integer.parseInt(tiempoInicio) > Integer.parseInt(tiempoFinal)){
                messageError("La hora de finalizacion debe ser mayor a la hora de inicio");       
            }else if(!(capacidad.matches("[1-9][0-9]*"))){
                messageError("La capacidad debe ser un numero entero positivo");  
            }else if(Integer.parseInt(capacidad) >= 10000){
                messageError("La capacidad debe ser un numero menor a 10000");               
            }else if((proyectoServices.getRecurso(nombre) != null)){
                messageError("El recurso ya existe");
            }else{
                int inicio = Integer.parseInt(tiempoInicio);
                int fin = Integer.parseInt(tiempoFinal);
                int capacid = Integer.parseInt(capacidad);
                proyectoServices.addRecurso(new Recurso(nombre,tipo,capacid,ubicacion,estado));
                int idRecurso = proyectoServices.getRecurso(nombre).getIdRecurso();
                for(String i : dias){
                    proyectoServices.addDisponibilidad(new Disponibilidad(i, idRecurso, new Time(inicio, 0, 0), new Time(fin, 0, 0)));
                }
                messageError("Recurso agregado");
            }        
        }catch(PersistenceException e){
            messageError("Verifique los datos ingresados");
        }
        clear();      
    }

    public void recursosActivos(){
        try{
            recursos = proyectoServices.getRecursosActivos();
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public List<Recurso> getRecursos() {
        recursosActivos();
        return recursos;
    }

    public void setRecursos(List<Recurso> recursos) {
        this.recursos = recursos;
    }

    public ArrayList<Recurso> getFilter() {
        return filter;
    }

    public void setFilter(ArrayList<Recurso> filter) {
        this.filter = filter;
    }

    public void clear() {
        dias = new String[5];
        nombre = "";
        tipo = "";
        capacidad = "";
        ubicacion = "";
        tiempoInicio = "";
        tiempoFinal = "";
    }

    private void messageError(String message) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, message,""));
    }
    
}
