package edu.eci.cvds.persistence;

import java.util.List;

import edu.eci.cvds.entities.Recurso;

public interface RecursoDAO {

    public void addRecurso(Recurso recurso) throws PersistenceException;
    
    public List<Recurso> getRecursosActivos() throws PersistenceException;

    public Recurso getRecurso(String nombre) throws PersistenceException;

    public Recurso getRecursoId(int idRecurso) throws PersistenceException;

    public List<Recurso> getRecursosTipo(String tipo) throws PersistenceException;
    
    public List<Recurso> getRecursosCapacidad(int capacidad) throws PersistenceException;

    public List<Recurso> getRecursosUbicacion(String ubicacion) throws PersistenceException;

}
