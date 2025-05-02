package Proyecto;

public class Usuario {
    private String nombre, email,contrasena,tipoUsuario,usuario;

    public Usuario( String tipoUsuario, String email,String Usuario,String contrasena,String nombre ) {
        
        this.tipoUsuario = tipoUsuario;
        this.email = email;
        this.usuario = Usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
    }
    public Usuario(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContraseña(String contraseña) {
        this.contrasena = contraseña;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}