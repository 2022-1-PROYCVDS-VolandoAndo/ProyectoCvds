package edu.eci.cvds.persistence.mybatis;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.RecursoDAO;
import edu.eci.cvds.persistence.mybatis.mappers.RecursoMapper;

public class MyBatisRecursoDAO implements RecursoDAO {

    @Inject
    RecursoMapper recursoMapper;

    @Override
    public void addRecurso(Recurso recurso) throws PersistenceException {
        try {
            recursoMapper.addRecurso(recurso);
        } catch (Exception e) {
            throw new PersistenceException("Error al adicionar recurso", e);
        }
    }

    @Override
    public List<Recurso> getRecursosActivos() throws PersistenceException {
        try {
            return recursoMapper.getRecursosActivos();
        } catch (Exception e) {
            throw new PersistenceException("Error al realizar la consulta", e);
        }
    }

    @Override
    public Recurso getRecurso(String nombre) throws PersistenceException {
        try {
            return recursoMapper.getRecurso(nombre);
        } catch (Exception e) {
            throw new PersistenceException("Error al realizar la consulta", e);
        }
    }

    @Override
    public List<Recurso> getRecursosTipo(String tipo) throws PersistenceException {
        try {
            return recursoMapper.getRecursosTipo(tipo);
        } catch (Exception e) {
            throw new PersistenceException("Error al realizar la consulta", e);
        }
    }

    @Override
    public List<Recurso> getRecursosCapacidad(String tipo) throws PersistenceException {
        try {
            return recursoMapper.getRecursosCapacidad(tipo);
        } catch (Exception e) {
            throw new PersistenceException("Error al realizar la consulta", e);
        }
    }

    @Override
    public List<Recurso> getRecursosUbicacion(String ubicacion) throws PersistenceException {
        try {
            return recursoMapper.getRecursosUbicacion(ubicacion);
        } catch (Exception e) {
            throw new PersistenceException("Error al realizar la consulta", e);
        }
    }

    @Override
    public Recurso getRecursoId(int idRecurso) throws PersistenceException {
        try {
            return recursoMapper.getRecursoId(idRecurso);
        } catch (Exception e) {
            throw new PersistenceException("Error al realizar la consulta", e);
        }
    }
    
}
