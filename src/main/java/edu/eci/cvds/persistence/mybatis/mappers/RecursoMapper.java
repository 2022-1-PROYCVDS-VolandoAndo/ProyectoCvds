package edu.eci.cvds.persistence.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Recurso;

public interface RecursoMapper {
    
    public void addRecurso(@Param("recurso") Recurso recurso);
    
    public List<Recurso> getRecursosActivos();

    public Recurso getRecurso(@Param("nombre") String nombre);

    public Recurso getRecursoId(@Param("idRecurso") int idRecurso);

    public List<Recurso> getRecursosTipo(@Param("tipo") String tipo);
    
    public List<Recurso> getRecursosCapacidad(@Param("capacidad") int capacidad);

    public List<Recurso> getRecursosUbicacion(@Param("ubicacion") String ubicacion);

}
