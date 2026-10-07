package Taller8_Herencia_Simple.Ejercicio_02;

public class Estudiante extends Persona{
    protected String matricula;

    public Estudiante(String nombre, int edad, String matricula){
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Matrícula: " + matricula);
    }
}
