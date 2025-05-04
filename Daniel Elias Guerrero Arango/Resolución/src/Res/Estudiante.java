package Res;

public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;
    private double calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.calificacion = -1;
    }

    public Estudiante(String nombre, int edad, String curso, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.calificacion = calificacion;
    }
}
