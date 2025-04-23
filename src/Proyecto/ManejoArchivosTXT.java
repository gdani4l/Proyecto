package Proyecto;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ManejoArchivosTXT {
    List<Usuario> usuarios = new ArrayList<>();
    String rutaProyecto = System.getProperty("user.dir");
    String dirTXT = rutaProyecto + "\\src\\texto\\registro_usuarios.txt";

    public ManejoArchivosTXT() 
    {
        leerArchivo(usuarios);
        crearVer_Arch();
    }
    public void crearVer_Arch() 
    {
        File arch = new File(dirTXT);
        try {
            if (!arch.exists()) 
            {
                if (arch.getParentFile() != null) 
                {
                    arch.getParentFile().mkdirs();
                }
                arch.createNewFile();
            }
        } catch (IOException e) 
        {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    public void leerArchivo(List<Usuario> lista) 
    {
        try (BufferedReader lector = new BufferedReader(new FileReader(dirTXT))) 
        {
            String linea;
            while ((linea = lector.readLine()) != null) 
            {
                String[] bloques = linea.split(",");

                if (bloques.length == 5) 
                {
                    String tipoUsuario = bloques[0];
                    String email = bloques[1];
                    String usuario = bloques[2];
                    String contrasena = bloques[3];
                    String nombre = bloques[4];
                    
                    lista.add(new Usuario(tipoUsuario, email,usuario,contrasena,nombre));
                }
            }
        } catch (IOException e) 
        {
            System.out.println("esto no deberia pasar xd " + e.getMessage());
        }
    }
}