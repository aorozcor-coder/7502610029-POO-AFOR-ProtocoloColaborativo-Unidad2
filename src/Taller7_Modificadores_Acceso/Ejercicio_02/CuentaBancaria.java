package Taller7_Modificadores_Acceso.Ejercicio_02;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Error: El saldo no puede ser negativo.");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Numero de Cuenta: " + numeroCuenta + " | Tipo: " + tipoCuenta + " | Saldo: $" + saldo);
    }
}

