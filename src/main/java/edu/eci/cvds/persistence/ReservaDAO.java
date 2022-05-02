package edu.eci.cvds.persistence;

import java.util.List;

import edu.eci.cvds.entities.Reserva;

public interface ReservaDAO {

    public List<Reserva> getReserva(int idReserva) throws PersistenceException;
    
}
