package org.example;
import org.example.estudiante;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EstudianteManager estudianteManager = new EstudianteManager();
        while (true){
            showMenu();
        }
    }

    private static void showMenu(){
        System.out.println("\n=== Gestor de Estudiantes ===");
        System.out.println("1. Añadir estudiante");
        System.out.println("2. Listar estudiantes");
        System.out.println("3. Buscar estudiante por nombre");
        System.out.println("4. Calcular nota media general");
        System.out.println("5. Mostrar mejor estudiante");
        System.out.println("6. Salir");
    }

    private static void addEstudiante(Scanner scanner, EstudianteManager estudianteManager){
        System.out.println("Nombre de estudiante: ");
        String nombre = scanner.nextLine().trim();
        double calificacion = getDoubleValido(scanner, "Calificación del estudiante: ");
        if (calificacion < 0 || calificacion > 10){
            System.out.println("La calificación debe estar entre 0 y 10");
            return;
        }
        estudianteManager.addEstudiante(nombre,calificacion);
        System.out.println("Estudiante añadido.");
    }

    private static void listAllEstudiantes(EstudianteManager estudianteManager){
        if (estudianteManager.getAllEstudiantes().isEmpty()){
            System.out.println("No hay estudiantes aún.");
        } else {
            System.out.println("\n=== Estudiantes ===");
            for (estudiante estudiante : estudianteManager.getAllEstudiantes()){
                System.out.println(estudiante);
            }
        }
    }

    private static void searchEstudiante(Scanner scanner, EstudianteManager estudianteManager){
        System.out.println("Nombre del estudiante a buscar: ");
        String nombre = scanner.nextLine().trim();
        estudiante estudiante = estudianteManager.searchByName(nombre);
        if (estudiante != null){
            System.out.println("Estudiante: " + estudiante);
        } else {
            System.out.println("Estudiante no encontrado");
        }
    }

    private static void showMedia(EstudianteManager estudianteManager){
        double media = estudianteManager.calculateAverage();
        if ( media == 0){
            System.out.println("No hay estudiantes para hacer media");
        } else {
            System.out.println("Media: " + media);
        }
    }

    private static void showMejorEstudiante(EstudianteManager estudianteManager){
        estudiante mejor = estudianteManager.getBestEstudiante();
        if (mejor == null){
            System.out.println("No hay estudiantes");
        } else {
            System.out.println("Mejor estudiante: " + mejor);
        }
    }

    private static double getDoubleValido(Scanner scanner, String msg){
        while (true){
            try {
                System.out.println(msg);
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e){
                System.out.println("Calificacion invalida, intentelo de nuevo1111");
            }
        }
    }
}
