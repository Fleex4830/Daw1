package POO;

public class mainCuenta {

    public static void main(String[] args) {

        // Crear una cuenta bancaria
        CuentaBancaria cuenta1 = new CuentaBancaria("ES123456", 100);

        // Probar los métodos
        cuenta1.mostrarSaldo(); // muestra 100
        cuenta1.ingresar(50); // suma 50
        cuenta1.mostrarSaldo(); // muestra 150
        cuenta1.retirar(120); // Transacción válida
        cuenta1.retirar(200); // Transacción inválida
        cuenta1.mostrarSaldo(); // muestra 30
    }

}
