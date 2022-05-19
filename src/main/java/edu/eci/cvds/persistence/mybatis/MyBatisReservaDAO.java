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
    public void addReserva(Reserva reserva) throws PersistenceException {
        try {
            reservaMapper.addReserva(reserva);
        } catch (Exception e) {
            throw new PersistenceException("Error al realizar la reserva", e);
        }
    }

    @Override
    public List<Reserva> getReservas() throws PersistenceException {
        try {
            return reservaMapper.getReservas();
        } catch (Exception e) {
            throw new PersistenceException("Error al consultar las reservas", e);
        }
    }

    @Override
    public List<Reserva> getReservasUsuario(int idUsuario) throws PersistenceException {
        try {
            return reservaMapper.getReservasUsuario(idUsuario);
        } catch (Exception e) {
            throw new PersistenceException("Error al consultar las reservas del usuario", e);
        }
    }

    @Override
    public List<Reserva> getReservasUsuarioCanceladas(int idUsuario) throws PersistenceException {
        try {
            return reservaMapper.getReservasUsuarioCanceladas(idUsuario);
        } catch (Exception e) {
            throw new PersistenceException("Error al consultar las reservas del usuario", e);
        }
    }

    @Override
    public List<Reserva> getReservasUsuarioFinalizadas(int idUsuario) throws PersistenceException {
        try {
            return reservaMapper.getReservasUsuarioFinalizadas(idUsuario);
        } catch (Exception e) {
            throw new PersistenceException("Error al consultar las reservas del usuario", e);
        }
    }

    @Override
    public Reserva getReserva(int idReserva) throws PersistenceException {
        try {
            return reservaMapper.getReserva(idReserva);
        } catch (Exception e) {
            throw new PersistenceException("Error al realizar la consulta", e);
        }
    }

    @Override
    public List<Reserva> getReservasRecurso(int idRecurso) throws PersistenceException {
        try {
            return reservaMapper.getReservasRecurso(idRecurso);
        } catch (Exception e) {
            throw new PersistenceException("Error al consultar las reservas del recurso", e);
        }
    }

}
