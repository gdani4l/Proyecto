package Proyecto;

import java.util.ArrayList;

public class MantenimientoUsuario {
    private ArrayList<Usuario> ListaUsuarios;
    
    public MantenimientoUsuario(){
        ListaUsuarios=new ArrayList<>();
    }
    
    public void AgregarUsuario(Usuario usuario){
        ListaUsuarios.add(usuario);
    }
    public ArrayList<Usuario> getListaUsuarios(){
        return ListaUsuarios;
    }
}
