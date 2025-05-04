package Res;

import java.util.ArrayList;

public class GestionEstudiantes {
    private ArrayList<Estudiante> estudiantes;

    public GestionEstudiantes() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public String mostrarEstudiantes() {
        StringBuilder info = new StringBuilder();
        for (Estudiante e : estudiantes) {
            info.append("Nombre: ").append(e.getNombre()).append("\n");
            info.append("Edad: ").append(e.getEdad()).append("\n");
            info.append("Curso: ").append(e.getCurso()).append("\n");
            info.append("Calificación: ").append(e.getCalificacion() == -1 ? "No asignada" : e.getCalificacion()).append("\n");
            info.append("--------------------------\n");
        }
        return info.toString();
    }

}
