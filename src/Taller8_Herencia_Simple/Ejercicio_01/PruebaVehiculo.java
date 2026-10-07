package Taller8_Herencia_Simple.Ejercicio_01;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo("Generico", 120.0);
        Coche miCoche = new Coche("Toyota", 200.0, 4);

        System.out.println("--- Información del Vehículo ---");
        miVehiculo.mostrarInformacion();

        System.out.println("\n--- Información del Coche ---");
        miCoche.mostrarInformacion();
    }
}