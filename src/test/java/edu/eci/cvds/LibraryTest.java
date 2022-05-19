package edu.eci.cvds;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.eci.cvds.entities.Recurso;
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
    public void adicionarRecurso(){
        try {
            Assert.assertEquals("Sala de estudio 1", proyectoServices.getRecurso("Sala de estudio 1").getNombre());
        } catch (Exception e){
            fail();
        }
    }
    
}
