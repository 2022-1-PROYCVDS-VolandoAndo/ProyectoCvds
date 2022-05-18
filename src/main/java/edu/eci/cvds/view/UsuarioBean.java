package edu.eci.cvds.view;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.google.inject.Inject;

import org.slf4j.LoggerFactory;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.services.ProyectoServices;
import edu.eci.cvds.services.ServicesException;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import java.util.logging.Level;

import java.io.IOException;

@ManagedBean(name = "UsuarioBean")
@SessionScoped
public class UsuarioBean extends BasePageBean{

    @Inject
    private ProyectoServices usuarioServices;

    private String password;
    public int userId;
    private String mail;
    private String tipo;
    Subject subject;

    public ProyectoServices getUsuarioServices() {
        return usuarioServices;
    }

    public void setUsuarioServices(ProyectoServices usuarioServices) {
        this.usuarioServices = usuarioServices;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void iniciarSesion() {
        Logger log = LoggerFactory.getLogger(ProyectoServices.class);
        UsernamePasswordToken token = new UsernamePasswordToken(mail, password);
        subject = SecurityUtils.getSubject();
        try {
            Usuario usuario = usuarioServices.getUsuario(mail);
            if (usuario != null) {
                userId = usuario.getIdUsuario();
                tipo = usuario.getTipo();
                subject.login(token);
                FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/home.xhtml");
            } else {
                messageError("El usuario o la contraseña son incorrectos");
            }
        } catch (UnknownAccountException ex) {
            messageError("El usuario no existe");
            log.error(ex.getMessage(), ex);
        } catch (IncorrectCredentialsException ex) {
            messageError("Contraseña incorrecta");
            log.error(ex.getMessage(), ex);
        } catch (LockedAccountException ex) {
            messageError("Cuenta Bloqueada");
            log.error(ex.getMessage(), ex);
        } catch (AuthenticationException ex) {
            messageError("Verifique sus credenciales");
            log.error(ex.getMessage(), ex);
        } catch (Exception ex) {
            messageError("Verifique sus credenciales");
            log.error(ex.getMessage(), ex);
        } finally {
            token.clear();
        }
    }

    public void cerrarSesion() {
        SecurityUtils.getSubject().logout();
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/home.xhtml");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(UsuarioBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String adminType() {
        String res = "";
        try {
            res = (usuarioServices.getUsuario(mail).getTipo().equals("Administrador")) ? "True" : "None";
        } catch (PersistenceException e) {
            res = "None";
        }
        return res;
    }

    public String studentType() {
        String res = "";
        try {
            res = (usuarioServices.getUsuario(mail).getTipo().equals("Comunidad")) ? "True" : "None";
        } catch (PersistenceException e) {
            res = "None";
        }
        return res;
    }

    private void messageError(String message) {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Error", message));
    }

}
