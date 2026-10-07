package Taller7_Modificadores_Acceso.Ejercicio_01;

public class Empleado {
    public String nombre;
    private double salario;

    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public double getsalario(){
        return salario;
    }
    public void setsalario(double salario){
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Error: El salario no puede ser negativo.");
        }
    }
}
