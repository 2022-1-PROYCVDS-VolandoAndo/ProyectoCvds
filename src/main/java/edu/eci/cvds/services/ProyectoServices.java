package edu.eci.cvds.services;

import java.util.List;

import edu.eci.cvds.entities.Disponibilidad;
import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.entities.Reserva;
import edu.eci.cvds.entities.Usuario;

public interface ProyectoServices {
    
    /**
     * Adicionar un recurso a la biblioteca.
     * @param recurso
     * @throws ServicesException
     */
    public void addRecurso(Recurso recurso) throws ServicesException;
    
    /**
     * Consultar los recursos activos.
     * @return lista de recursos
     * @throws ServicesException
     */
    public List<Recurso> getRecursosActivos() throws ServicesException;

    /**
     * Buscar un recurso por nombre.
     * @param nombre
     * @return recurso
     * @throws ServicesException
     */
    public Recurso getRecurso(String nombre) throws ServicesException;

    /**
     * Consultar recursos segun su tipo.
     * @param tipo
     * @return lista de recursos
     * @throws ServicesException
     */
    public List<Recurso> getRecursosTipo(String tipo) throws ServicesException;
    
    /**
     * Consultar recursos segun su capacidad.
     * @param capacidad
     * @return lista de recursos
     * @throws ServicesException
     */
    public List<Recurso> getRecursosCapacidad(String capacidad) throws ServicesException;

    /**
     * Consultar recursos de acuerdo a su ubicacion.
     * @param ubicacion
     * @return lista de recursos
     * @throws ServicesException
     */
    public List<Recurso> getRecursosUbicacion(String ubicacion) throws ServicesException;

    /**
     * Consultar el rol de un usuario de acuerdo a su mail.
     * @param mail
     * @return rol del usuario
     * @throws ServicesException
     */
    public Usuario getTipo(String mail) throws ServicesException;

    /**
     * Inserta el horario de un recurso en la base.
     * @param disponibilidad
     * @throws ServicesException
     */
    public void addDisponibilidad(Disponibilidad disponibilidad) throws ServicesException;
    
    /**
     * Consulta la disponibilidad de un recurso.
     * @param idRecurso
     * @return disponibilidad de un recurso
     * @throws ServicesException
     */
    public List<Disponibilidad> getDisponibilidad(int idRecurso) throws ServicesException;

    /**
     * Consultar una reserva.
     * @param idReserva
     * @return
     * @throws ServicesException
     */
    public List<Reserva> getReserva(int idReserva) throws ServicesException;
    
}
