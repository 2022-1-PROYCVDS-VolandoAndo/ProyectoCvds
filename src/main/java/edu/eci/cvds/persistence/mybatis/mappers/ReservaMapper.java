package edu.eci.cvds.persistence.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Reserva;

public interface ReservaMapper {
    
    public void addReserva(@Param("reserva") Reserva reserva);

    public List<Reserva> getReservas();

    public List<Reserva> getReservasUsuario(@Param("idUsuario") int idUsuario);

    public List<Reserva> getReservasUsuarioCanceladas(@Param("idUsuario") int idUsuario);

    public List<Reserva> getReservasUsuarioFinalizadas(@Param("idUsuario") int idUsuario);

    public Reserva getReserva(@Param("idReserva") int idReserva);

    public List<Reserva> getReservasRecurso(@Param("idRecurso") int idRecurso);

}
