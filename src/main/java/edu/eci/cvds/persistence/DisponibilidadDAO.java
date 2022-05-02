package edu.eci.cvds.persistence;

import java.util.List;

import edu.eci.cvds.entities.Disponibilidad;

public interface DisponibilidadDAO {

    public void addDisponibilidad(Disponibilidad disponibilidad) throws PersistenceException;
    
    public List<Disponibilidad> getDisponibilidad() throws PersistenceException;

}
