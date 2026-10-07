package Taller8_Herencia_Simple.Ejercicio_04;

public class Coche extends Vehiculo {

    public Coche(String marca) {
        super(marca);
    }

    public void mostrarMarca() {
        /*
         * ERROR DE COMPILACIÓN:
         * System.out.println(marca);
         *
         * Explicación: El atributo 'marca' es private en la clase base Vehiculo.
         * La herencia otorga acceso a miembros public y protected, pero NO permite
         * el acceso directo a atributos private de la clase padre.
         */
    }
}
