package edu.eci.cvds;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.eci.cvds.services.ProyectoServices;
import edu.eci.cvds.services.ProyectoServicesFactory;

public class LibraryTest {

    ProyectoServices proyectoServices;

    public LibraryTest() {
        proyectoServices = ProyectoServicesFactory.getInstance().getServiciosProyecto();
    }

    @Before
    public void setUp() {
        proyectoServices = ProyectoServicesFactory.getInstance().getServiciosProyecto();
    }

    @Test
    public void consultarRecursosDisponibles() {
        try {
            Assert.assertEquals(false, proyectoServices.getRecursosActivos().isEmpty());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void getRecurso(){
        try {
            Assert.assertEquals(true, proyectoServices.getRecurso("Sala de estudio 1") != null);
        } catch (Exception e){
            fail();
        }
    }

    @Test
    public void getRecursoId() {
        try {
            Assert.assertEquals(true, proyectoServices.getRecursoId(1) != null);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void getRecursosTipo() {
        try {
            Assert.assertEquals(false, proyectoServices.getRecursosTipo("Sala de estudio").isEmpty());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void getRecursosCapacidad() {
        try {
            Assert.assertEquals(false, proyectoServices.getRecursosCapacidad(1).isEmpty());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void getRecursosUbicacion() {
        try {
            Assert.assertEquals(false, proyectoServices.getRecursosUbicacion("Biblioteca Central").isEmpty());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void getUsuario() {
        try {
            Assert.assertEquals(true, proyectoServices.getUsuario("jhon.pineros@mail.escuelaing.edu.co") != null);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void getDisponibilidad() {
        try {
            Assert.assertEquals(false, proyectoServices.getDisponibilidad(1).isEmpty());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void getReservas() {
        try {
            Assert.assertEquals(false, proyectoServices.getReservas().isEmpty());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void getReservasUsuario() {
        try {
            Assert.assertEquals(false, proyectoServices.getReservasUsuario(1).isEmpty());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void getReservasUsuarioFinaliazadas() {
        try {
            Assert.assertEquals(false, proyectoServices.getReservasUsuarioFinaliazadas(1).isEmpty());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void getReservasUsuarioCanceladas() {
        try {
            Assert.assertEquals(false, proyectoServices.getReservasUsuarioCanceladas(1).isEmpty());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void getReserva() {
        try {
            Assert.assertEquals(true, proyectoServices.getReserva(1) != null);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void getReservasRecurso() {
        try {
            Assert.assertEquals(false, proyectoServices.getReservasRecurso(1).isEmpty());
        } catch (Exception e) {
            fail();
        }
    }
    
}
