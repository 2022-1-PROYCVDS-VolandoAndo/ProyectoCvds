package edu.eci.cvds.services;

import java.util.Optional;

import com.google.inject.Injector;
import static com.google.inject.Guice.createInjector;

import org.mybatis.guice.XMLMyBatisModule;

import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.persistence.DisponibilidadDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.RecursoDAO;
import edu.eci.cvds.persistence.ReservaDAO;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.persistence.mybatis.MyBatisDisponibilidadDAO;
import edu.eci.cvds.persistence.mybatis.MyBatisRecursoDAO;
import edu.eci.cvds.persistence.mybatis.MyBatisReservaDAO;
import edu.eci.cvds.persistence.mybatis.MyBatisUsuarioDAO;
import edu.eci.cvds.services.impl.ProyectoServicesImpl;

public class ProyectoServicesFactory {
    
    private static final ProyectoServicesFactory instance = new ProyectoServicesFactory();

    private static Optional<Injector> optInjector;

    private Injector myBatisInjector(String env, String pathResource) {
        return createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                setEnvironmentId(env);
                setClassPathResource(pathResource);
                bind(RecursoDAO.class).to(MyBatisRecursoDAO.class);
                bind(UsuarioDAO.class).to(MyBatisUsuarioDAO.class);
                bind(DisponibilidadDAO.class).to(MyBatisDisponibilidadDAO.class);
                bind(ReservaDAO.class).to(MyBatisReservaDAO.class);
                bind(ProyectoServices.class).to(ProyectoServicesImpl.class);
            }
        });
    }

    private ProyectoServicesFactory(){
        optInjector = Optional.empty();
    }

    public ProyectoServices getServiciosProyecto(){
        if (!optInjector.isPresent()) {
            optInjector = Optional.of(myBatisInjector("development","mybatis-config.xml"));
        }
        return optInjector.get().getInstance(ProyectoServices.class);
    }

    public static ProyectoServicesFactory getInstance(){
        return instance;
    }

    public static void main(String a[]) throws PersistenceException {
        ProyectoServices biblioteca = ProyectoServicesFactory.getInstance().getServiciosProyecto();
        System.out.println(biblioteca.getRecursoId(1));
    }

}
