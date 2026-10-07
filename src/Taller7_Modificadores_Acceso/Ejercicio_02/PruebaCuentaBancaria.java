package Taller7_Modificadores_Acceso.Ejercicio_02;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("1002345678", 1500.0, "Ahorros");

        // Acceso directo permitido a la propiedad publica
        System.out.println("Tipo de cuenta inicial: " + cuenta.tipoCuenta);
        cuenta.tipoCuenta = "Corriente";

        /*
         * INTENTO DE ACCESO INCORRECTO A ATRIBUTO PRIVADO:
         * System.out.println(cuenta.numeroCuenta); // ERROR DE COMPILACIÓN
         *
         * Explicación: numeroCuenta tiene visibilidad private en CuentaBancaria,
         * por lo que no puede ser consultado ni modificado directamente desde fuera.
         */

        // Uso de metodos publicos seguros
        cuenta.mostrarDetalles();
    }
}