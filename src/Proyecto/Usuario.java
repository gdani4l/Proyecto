package Proyecto;

public class Usuario {
    private String nombre, email,contrasena,tipoUsuario,usuario;

    public Usuario( String tipoUsuario, String email,String Usuario,String contrasena,String nombre ) {
        if(Usuario == null || Usuario.isEmpty()) throw new IllegalArgumentException("El usuario no puede estar vacío.");
        if (nombre == null || nombre.isEmpty()) throw new IllegalArgumentException("El nombre no puede estar vacío.");
        if (email == null || email.isEmpty()) throw new IllegalArgumentException("El email no puede estar vacío.");
        if (contrasena == null || contrasena.isEmpty()) throw new IllegalArgumentException("La contraseña no puede estar vacía.");
        if (tipoUsuario == null || tipoUsuario.isEmpty()) throw new IllegalArgumentException("El tipo de usuario no puede estar vacío.");
        
        this.tipoUsuario = tipoUsuario;
        this.email = email;
        this.usuario = Usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
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

    public String getContraseña() {
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