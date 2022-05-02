package edu.eci.cvds.services.impl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Disponibilidad;
import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.persistence.DisponibilidadDAO;
import edu.eci.cvds.persistence.RecursoDAO;
// import edu.eci.cvds.persistence.ReservaDAO;
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

    // @Inject 
    // private ReservaDAO reservaDAO;

    @Override
    public void addRecurso(Recurso recurso) throws ServicesException {
        try {
            recursoDAO.addRecurso(recurso);
        } catch (Exception e) {
            throw new ServicesException("Error al insertar el recurso", e);
        }
        
    }

    @Override
    public List<Recurso> getRecursosActivos() throws ServicesException {
        try {
            return recursoDAO.getRecursosActivos();
        } catch (Exception e) {
            throw new ServicesException("No fue posible consultar los recursos activos", e);
        }
    }

    @Override
    public Recurso getRecurso(String nombre) throws ServicesException {
        try {
            return recursoDAO.getRecurso(nombre);
        } catch (Exception e) {
            throw new ServicesException("No fue posible consultar el recurso", e);
        }
    }

    @Override
    public List<Recurso> getRecursosTipo(String tipo) throws ServicesException {
        try {
            return recursoDAO.getRecursosTipo(tipo);
        } catch (Exception e) {
            throw new ServicesException("No fue posible consultar los recursos", e);
        }
    }

    @Override
    public List<Recurso> getRecursosCapacidad(String capacidad) throws ServicesException {
        try {
            return recursoDAO.getRecursosCapacidad(capacidad);
        } catch (Exception e) {
            throw new ServicesException("No fue posible consultar los recursos", e);
        }
    }

    @Override
    public List<Recurso> getRecursosUbicacion(String ubicacion) throws ServicesException {
        try {
            return recursoDAO.getRecursosUbicacion(ubicacion);
        } catch (Exception e) {
            throw new ServicesException("No fue posible consultar los recursos", e);
        }
    }

    @Override
    public String getTipo(String mail) throws ServicesException {
        try {
            return usuarioDAO.getTipo(mail);
        } catch (Exception e) {
            throw new ServicesException("No fue posible consultar el tipo de este usuario", e);
        }
    }

    @Override
    public void addDisponibilidad(Disponibilidad disponibilidad) throws ServicesException {
        try {
            disponibilidadDAO.addDisponibilidad(disponibilidad);
        } catch (Exception e) {
            throw new ServicesException("No fue posible insertar la disponibilidad", e);
        }
        
    }

    @Override
    public List<Disponibilidad> getDisponibilidad(int idRecurso) throws ServicesException {
        try {
            return disponibilidadDAO.getDisponibilidad(idRecurso);
        } catch (Exception e) {
            throw new ServicesException("No fue posible consultar la disponibilidad de este recurso", e);
        }
    }
    
}
