package edu.eci.cvds.persistence;

import java.util.List;

import edu.eci.cvds.entities.Reserva;

public interface ReservaDAO {

    public void addReserva(Reserva reserva) throws PersistenceException;

    public List<Reserva> getReservas() throws PersistenceException;

    public List<Reserva> getReservasUsuario(int idUsuario) throws PersistenceException;

    public List<Reserva> getReservasUsuarioCanceladas(int idUsuario) throws PersistenceException;

    public List<Reserva> getReservasUsuarioFinalizadas(int idUsuario) throws PersistenceException;

    public Reserva getReserva(int idReserva) throws PersistenceException;

    public List<Reserva> getReservasRecurso(int idRecurso) throws PersistenceException;
    
}
