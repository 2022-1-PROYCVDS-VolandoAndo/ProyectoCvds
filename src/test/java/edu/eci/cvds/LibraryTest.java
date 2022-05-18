package edu.eci.cvds;

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
    
}
