package Taller7_Modificadores_Acceso.Ejercicio_01;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Juan Perez", 2500.0);

        // Acceso y modificacion directa a la propiedad publica nombre
        System.out.println("Nombre del empleado: " + emp.nombre);
        emp.nombre = "Juan Carlos Perez";
        System.out.println("Nombre actualizado: " + emp.nombre);

        // Acceso controlado al atributo privado salario mediante metodos publicos
        System.out.println("Salario actual: $" + emp.getsalario());
        emp.setsalario(3200.0);
        System.out.println("Nuevo salario: $" + emp.getsalario());

        // Prueba de validacion con un salario negativo
        emp.setsalario(-500.0);
    }
}
