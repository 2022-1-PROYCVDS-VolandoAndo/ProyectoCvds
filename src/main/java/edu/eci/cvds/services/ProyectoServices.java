package edu.eci.cvds.services;

import java.util.List;

import edu.eci.cvds.entities.Disponibilidad;
import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.entities.Reserva;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.PersistenceException;

public interface ProyectoServices {
    
    /**
     * Adicionar un recurso a la biblioteca.
     * @param recurso
     * @throws PersistenceException
     */
    public void addRecurso(Recurso recurso) throws PersistenceException;
    
    /**
     * Consultar los recursos activos.
     * @return lista de recursos
     * @throws PersistenceException
     */
    public List<Recurso> getRecursosActivos() throws PersistenceException;

    /**
     * Buscar un recurso por nombre.
     * @param nombre
     * @return recurso
     * @throws PersistenceException
     */
    public Recurso getRecurso(String nombre) throws PersistenceException;

    /**
     * Busca un recurso por su id.
     * @param idRecurso
     * @return
     * @throws PersistenceException
     */
    public Recurso getRecursoId(int idRecurso) throws PersistenceException;

    /**
     * Consultar recursos segun su tipo.
     * @param tipo
     * @return lista de recursos
     * @throws PersistenceException
     */
    public List<Recurso> getRecursosTipo(String tipo) throws PersistenceException;
    
    /**
     * Consultar recursos segun su capacidad.
     * @param capacidad
     * @return lista de recursos
     * @throws PersistenceException
     */
    public List<Recurso> getRecursosCapacidad(String capacidad) throws PersistenceException;

    /**
     * Consultar recursos de acuerdo a su ubicacion.
     * @param ubicacion
     * @return lista de recursos
     * @throws PersistenceException
     */
    public List<Recurso> getRecursosUbicacion(String ubicacion) throws PersistenceException;

    /**
     * Consultar un usuario de acuerdo a su mail.
     * @param mail
     * @return rol del usuario
     * @throws PersistenceException
     */
    public Usuario getUsuario(String mail) throws PersistenceException;

    /**
     * Inserta el horario de un recurso en la base.
     * @param disponibilidad
     * @throws PersistenceException
     */
    public void addDisponibilidad(Disponibilidad disponibilidad) throws PersistenceException;
    
    /**
     * Consulta la disponibilidad de un recurso.
     * @param idRecurso
     * @return disponibilidad de un recurso
     * @throws PersistenceException
     */
    public List<Disponibilidad> getDisponibilidad(int idRecurso) throws PersistenceException;

    /**
     * Adicionar una reserva.
     * @param reserva
     * @throws PersistenceException
     */
    public void addReserva(Reserva reserva) throws PersistenceException;

    /**
     * Consultar las reservas existentes.
     * @return
     * @throws PersistenceException
     */
    public List<Reserva> getReservas() throws PersistenceException;

    /**
     * Consultar las reservas activas de un usuario.
     * @param idUsuario
     * @return
     * @throws PersistenceException
     */
    public List<Reserva> getReservasUsuario(int idUsuario) throws PersistenceException;

    /**
     * Consultar las finalizadas reservas de un usuario.
     * @param idUsuario
     * @return
     * @throws PersistenceException
     */
    public List<Reserva> getReservasUsuarioFinaliazadas(int idUsuario) throws PersistenceException;

    /**
     * Consultar las reservas canceladas de un usuario.
     * @param idUsuario
     * @return
     * @throws PersistenceException
     */
    public List<Reserva> getReservasUsuarioCanceladas(int idUsuario) throws PersistenceException;

    /**
     * Consultar una reserva por id.
     * @param idReserva
     * @return
     * @throws PersistenceException
     */
    public Reserva getReserva(int idReserva) throws PersistenceException;

    /**
     * Consultar las reservas segun el recurso.
     * @param idRecurso
     * @return
     * @throws PersistenceException
     */
    public List<Reserva> getReservasRecurso(int idRecurso) throws PersistenceException;
    
}
