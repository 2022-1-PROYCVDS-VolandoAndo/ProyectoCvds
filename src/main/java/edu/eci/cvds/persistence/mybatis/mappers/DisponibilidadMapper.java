package edu.eci.cvds.persistence.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Disponibilidad;

public interface DisponibilidadMapper {
    
    public void addDisponibilidad(@Param("disponibilidad") Disponibilidad disponibilidad);
    
    public List<Disponibilidad> getDisponibilidad();
    
}
