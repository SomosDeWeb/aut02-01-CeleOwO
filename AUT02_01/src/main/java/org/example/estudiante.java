package org.example;

public class estudiante {
    private String Nombre;
    private double Calificaciones;

    public estudiante(String nombre, double calificaciones){
        this.Nombre = nombre;
        this.Calificaciones = calificaciones;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getCalificaciones() {
        return Calificaciones;
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

    @Override
    public String toString(){
        return "Nombre: " + Nombre + ", Calificacion: " + Calificaciones;
    }
}
