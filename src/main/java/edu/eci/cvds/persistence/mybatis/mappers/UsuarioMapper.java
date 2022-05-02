package edu.eci.cvds.persistence.mybatis.mappers;

import org.apache.ibatis.annotations.Param;

public interface UsuarioMapper {
    
    public String getTipo(@Param("mail") String mail);

}
