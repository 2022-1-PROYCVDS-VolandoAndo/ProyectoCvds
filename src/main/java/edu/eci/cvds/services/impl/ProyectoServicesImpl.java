package edu.eci.cvds.services.impl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Disponibilidad;
import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.entities.Reserva;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.DisponibilidadDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.RecursoDAO;
import edu.eci.cvds.persistence.ReservaDAO;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.services.ProyectoServices;
import edu.eci.cvds.services.ServicesException;

public class ProyectoServicesImpl implements ProyectoServices {

    @Inject
    private RecursoDAO recursoDAO;

    @Inject
    private UsuarioDAO usuarioDAO;

    @Inject
    private DisponibilidadDAO disponibilidadDAO;

    @Inject 
    private ReservaDAO reservaDAO;

    @Override
    public void addRecurso(Recurso recurso) throws PersistenceException {
        recursoDAO.addRecurso(recurso);
    }

    @Override
    public List<Recurso> getRecursosActivos() throws PersistenceException {
        return recursoDAO.getRecursosActivos();
    }

    @Override
    public Recurso getRecurso(String nombre) throws PersistenceException {
        return recursoDAO.getRecurso(nombre);
    }

    @Override
    public List<Recurso> getRecursosTipo(String tipo) throws PersistenceException {
        return recursoDAO.getRecursosTipo(tipo);
    }

    @Override
    public List<Recurso> getRecursosCapacidad(String capacidad) throws PersistenceException {
        return recursoDAO.getRecursosCapacidad(capacidad);
    }

    @Override
    public List<Recurso> getRecursosUbicacion(String ubicacion) throws PersistenceException {
        return recursoDAO.getRecursosUbicacion(ubicacion);
    }

    @Override
    public Usuario getUsuario(String mail) throws PersistenceException {
        return usuarioDAO.getUsuario(mail);
    }

    @Override
    public void addDisponibilidad(Disponibilidad disponibilidad) throws PersistenceException {
        disponibilidadDAO.addDisponibilidad(disponibilidad);
    }

    @Override
    public List<Disponibilidad> getDisponibilidad(int idRecurso) throws PersistenceException {
        return disponibilidadDAO.getDisponibilidad(idRecurso);
    }

    @Override
    public List<Reserva> getReserva(int idReserva) throws PersistenceException {
        return reservaDAO.getReserva(idReserva);
    }
    
}
