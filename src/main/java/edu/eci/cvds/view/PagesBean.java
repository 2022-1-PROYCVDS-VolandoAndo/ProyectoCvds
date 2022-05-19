package edu.eci.cvds.view;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean; 
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;


@ManagedBean(name = "pagesBean", eager = true)
@RequestScoped

public class PagesBean implements Serializable{

    public void indexPage() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/index.xhtml");
    }

    public void homePage() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/home.xhtml");
    }

    public void loginPage() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/login.xhtml");
    }

    public void adicionarRecursoPage() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/adicionarRecurso.xhtml");
    }

    public void consultarRecursosPage() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/consultarRecursos.xhtml");
    }

    public void visualizarReservasPage() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/visualizarReservas.xhtml");
    }

    public void reservasCanceladasPage() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/reservasCanceladas.xhtml");
    }

    public void reservasTerminadasPage() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/reservasTerminadas.xhtml");
    }
}
