package edu.eci.cvds.view;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Reserva;
import edu.eci.cvds.services.ProyectoServices;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "ReservaBean")
@SessionScoped
public class ReservaBean extends BasePageBean{

    @Inject
    private ProyectoServices proyectoServices;

    private ArrayList<Reserva> filter = new ArrayList<>();
    private List<Reserva> reservas;

    public void reservasUsuario(int idUsuario) {
        try {
           reservas = proyectoServices.getReservasUsuario(idUsuario);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void reservasUsuarioCanceladas(int idUsuario) {
        try {
           reservas = proyectoServices.getReservasUsuarioCanceladas(idUsuario);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void reservasUsuarioFinalizadas(int idUsuario) {
        try {
           reservas = proyectoServices.getReservasUsuarioFinaliazadas(idUsuario);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Reserva> getFilter() {
        return filter;
    }

    public void setFilter(ArrayList<Reserva> filter) {
        this.filter = filter;
    }

    public List<Reserva> getReservas(int idUsuario) {
        reservasUsuario(idUsuario);
        return reservas;
    }

    public List<Reserva> getReservasCanceladas(int idUsuario) {
        reservasUsuarioCanceladas(idUsuario);
        return reservas;
    }

    public List<Reserva> getReservasFinalizadas(int idUsuario) {
        reservasUsuarioFinalizadas(idUsuario);
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
