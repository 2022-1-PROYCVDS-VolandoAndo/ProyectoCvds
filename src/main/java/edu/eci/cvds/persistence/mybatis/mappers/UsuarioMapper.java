package edu.eci.cvds.persistence.mybatis.mappers;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Usuario;

public interface UsuarioMapper {
    
    public Usuario getTipo(@Param("mail") String mail);

}
