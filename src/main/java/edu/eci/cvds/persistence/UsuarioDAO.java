package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.Usuario;

public interface UsuarioDAO {
    
    public Usuario getTipo(String mail) throws PersistenceException;

}
