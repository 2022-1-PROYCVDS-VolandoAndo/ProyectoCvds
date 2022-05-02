package edu.eci.cvds.persistence.mybatis;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Reserva;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.ReservaDAO;
import edu.eci.cvds.persistence.mybatis.mappers.ReservaMapper;

public class MyBatisReservaDAO implements ReservaDAO {

    @Inject
    ReservaMapper reservaMapper;

    @Override
    public List<Reserva> getReserva(int idReserva) throws PersistenceException {
        try {
            return reservaMapper.getReserva(idReserva);
        } catch (Exception e) {
            throw new PersistenceException("Error al realizar la consulta", e);
        }
    }
    
}
