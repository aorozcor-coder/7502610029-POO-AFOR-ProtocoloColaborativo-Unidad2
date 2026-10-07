package Taller7_Modificadores_Acceso.Ejercicio_03;

public class PruebaUtilidades {
    public static void main(String[] args) {
        double num1 = 20.0;
        double num2 = 5.0;

        System.out.println("Suma: " + Utilidades.sumar(num1, num2));
        System.out.println("Resta: " + Utilidades.restar(num1, num2));
        System.out.println("Multiplicacion: " + Utilidades.multiplicar(num1, num2));
        System.out.println("Division: " + Utilidades.dividir(num1, num2));

    }
}