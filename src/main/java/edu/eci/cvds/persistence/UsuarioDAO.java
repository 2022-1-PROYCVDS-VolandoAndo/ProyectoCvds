package edu.eci.cvds.persistence;

public interface UsuarioDAO {
    
    public String getTipo(String mail) throws PersistenceException;

}
