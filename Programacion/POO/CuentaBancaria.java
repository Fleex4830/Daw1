package Programacion.POO;

public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;

    // creamos el constructor
    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // metodos

    public double ingresar(double ingreso) {
        saldo = saldo + ingreso;

        return saldo;
    }

    public boolean retirar(double cantidad_retiro) {

        if (cantidad_retiro > saldo) {
            System.out.println("su transaccion es invalida ");
            System.out.println("saldo actual " + saldo);
            return false;
        } else {
            System.out.println("transaccion valida");
            saldo = saldo - cantidad_retiro;
            return true;
        }

    }

    public void mostrarSaldo() {
        System.out.println("su salo actual es -> " + saldo);

    }

}
