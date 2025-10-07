package org.example;
import java.util.List;
import java.util.ArrayList;

public class EstudianteManager{
    private List<estudiante> estudiantes;

    public EstudianteManager() {
        this.estudiantes = new ArrayList<>();
    }

    public void addEstudiante(String nombre, double calificacion, int edad, boolean matriculado){
        estudiantes.add(new estudiante(nombre,calificacion,edad, matriculado));
    }

    public List<estudiante> getAllEstudiantes(){
        return estudiantes;
    }

    public estudiante searchByName(String nombre){
        for (estudiante estudiante : estudiantes){
            if(estudiante.getNombre().toLowerCase().contains(nombre.toLowerCase())){
                return estudiante;
            }
        }
        return null;
    }

    public double calculateAverage(){
        if(estudiantes.isEmpty()){
            return 0;
        }
        double total = 0;
        for (estudiante estudiante : estudiantes){
            total += estudiante.getCalificaciones();
        }
        return total/estudiantes.size();
    }



    public estudiante getBestEstudiante(){
        if(estudiantes.isEmpty()){
            return null;
        }
        estudiante mejor = estudiantes.getFirst();
        for (estudiante estudiante : estudiantes){
            if (estudiante.getCalificaciones()> mejor.getCalificaciones()){
                mejor = estudiante;
            }
        }
        return mejor;
    }

    public boolean existsEstudiante(String nombre) {
        for (estudiante e : estudiantes) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
}
