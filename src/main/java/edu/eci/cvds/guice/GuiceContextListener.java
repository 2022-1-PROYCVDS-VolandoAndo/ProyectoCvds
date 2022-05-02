package edu.eci.cvds.guice;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.google.inject.Guice;
import com.google.inject.Injector;

import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import edu.eci.cvds.persistence.DisponibilidadDAO;
import edu.eci.cvds.persistence.RecursoDAO;
import edu.eci.cvds.persistence.ReservaDAO;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.persistence.mybatis.MyBatisDisponibilidadDAO;
import edu.eci.cvds.persistence.mybatis.MyBatisRecursoDAO;
import edu.eci.cvds.persistence.mybatis.MyBatisReservaDAO;
import edu.eci.cvds.persistence.mybatis.MyBatisUsuarioDAO;
import edu.eci.cvds.services.ProyectoServices;
import edu.eci.cvds.services.impl.ProyectoServicesImpl;

public class GuiceContextListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.removeAttribute(Injector.class.getName());
	}
    
    public void contextInitialized(ServletContextEvent servletContextEvent) {
		Injector injector = Guice.createInjector(new XMLMyBatisModule() {
			@Override
			protected void initialize() {
				install(JdbcHelper.PostgreSQL);
				setEnvironmentId("development");
				setClassPathResource("mybatis-config.xml");
				bind(RecursoDAO.class).to(MyBatisRecursoDAO.class);
				bind(UsuarioDAO.class).to(MyBatisUsuarioDAO.class);
				bind(DisponibilidadDAO.class).to(MyBatisDisponibilidadDAO.class);
				bind(ReservaDAO.class).to(MyBatisReservaDAO.class);
				bind(ProyectoServices.class).to(ProyectoServicesImpl.class);
			}
		});
		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.setAttribute(Injector.class.getName(), injector);
	}

}
