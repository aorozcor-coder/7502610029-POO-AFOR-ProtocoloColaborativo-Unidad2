package Taller8_Herencia_Simple.Ejercicio_03;

public class PruebaEmpleadoGerente {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Ana Gomez", 2800.0);
        Gerente ger = new Gerente("Carlos Mendoza", 5500.0, "Tecnología de la Información");

        System.out.println("--- Detalles del Empleado ---");
        emp.mostrarDetalles();

        System.out.println("\n--- Detalles del Gerente ---");
        ger.mostrarDetalles();
    }
}
