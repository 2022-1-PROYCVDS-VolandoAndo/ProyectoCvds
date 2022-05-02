package edu.eci.cvds.persistence.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Reserva;

public interface ReservaMapper {
    
    public List<Reserva> getReserva(@Param("idReserva") int idReserva);

}
