package edu.eci.cvds.entities;

public class Usuario {

    private int idUsuario;
    private String mail;
	private String nombre;
	private String contrasena;
    private String programa;
    private String tipo;

    public Usuario(){
        super();
    }

    public Usuario(int idUsuario, String mail, String nombre, String contrasena, String programa, String tipo) {
        this.idUsuario = idUsuario;
        this.mail = mail;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.programa = programa;
        this.tipo = tipo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
