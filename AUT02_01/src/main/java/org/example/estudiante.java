package org.example;

public class estudiante {
    private String Nombre;
    private double Calificaciones;
    private int Edad;
    private boolean matriculado;

    public estudiante(String nombre, double calificaciones, int edad, boolean matriculado) {
        this.Nombre = nombre;
        this.Calificaciones = calificaciones;
        this.Edad = edad;
        this.matriculado = matriculado;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getCalificaciones() {
        return Calificaciones;
    }

    public int getEdad() {
        return Edad;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setNombre(String nombre) {
        if (nombre.length()<24){
            Nombre = nombre;
        }
    }

    public void setCalificaciones(double calificaciones) {
        if(calificaciones > 0) {
            Calificaciones = calificaciones;
        }
    }

    public void setEdad(int edad) {
        if(edad > 0) {
            Edad = edad;
        }
    }
    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    @Override
    public String toString(){
        return "Nombre: " + Nombre + ", Calificacion: " + Calificaciones + ", Edad: " + Edad + ", Matriculado: " + (matriculado ? "Sí" : "No");
    }
}
