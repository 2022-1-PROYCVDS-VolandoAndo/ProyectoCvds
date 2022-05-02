package edu.eci.cvds.persistence.mybatis;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.persistence.mybatis.mappers.UsuarioMapper;

public class MyBatisUsuarioDAO implements UsuarioDAO {

    @Inject
    UsuarioMapper usuarioMapper;

    @Override
    public Usuario getTipo(String mail) throws PersistenceException {
        try {
            return usuarioMapper.getTipo(mail);
        } catch (Exception e) {
            throw new PersistenceException("Error al realizar la consulta", e);
        }
    }
    
}
