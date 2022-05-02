package edu.eci.cvds.persistence.mybatis;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Disponibilidad;
import edu.eci.cvds.persistence.DisponibilidadDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.mybatis.mappers.DisponibilidadMapper;

public class MyBatisDisponibilidadDAO implements DisponibilidadDAO {

    @Inject
    DisponibilidadMapper disponibilidadMapper;

    @Override
    public void addDisponibilidad(Disponibilidad disponibilidad) throws PersistenceException {
        try {
            disponibilidadMapper.addDisponibilidad(disponibilidad);
        } catch (Exception e) {
            throw new PersistenceException("Error al configurar la disponibilidad", e);
        }
    }

    @Override
    public List<Disponibilidad> getDisponibilidad(int idRecurso) throws PersistenceException {
        try {
            return disponibilidadMapper.getDisponibilidad(idRecurso);
        } catch (Exception e) {
            throw new PersistenceException("Error al realizar la consulta", e);
        }
    }
    
}
