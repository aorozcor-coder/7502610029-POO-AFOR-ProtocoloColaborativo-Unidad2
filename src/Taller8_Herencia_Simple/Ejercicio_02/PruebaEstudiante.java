package Taller8_Herencia_Simple.Ejercicio_02;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Persona persona = new Persona("Carlos Andres", 23);
        Estudiante estudiante = new Estudiante("María Lopez", 20, "EST-2026-001");

        System.out.println("--- Detalle Persona ---");
        persona.mostrarDetalles();

        System.out.println("\n--- Detalle Estudiante ---");
        estudiante.mostrarDetalles();
    }
}