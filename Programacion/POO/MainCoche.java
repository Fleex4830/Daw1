package Programacion.POO;

public class MainCoche {
    public static void main(String[] args) {

        Coche coche = new Coche("Toyota", 50);

        coche.mostrarEstado();
        coche.acelerar(20);
        coche.mostrarEstado();
        coche.frenar(30);
        coche.mostrarEstado();
        coche.frenar(100); // No aceptada
    }
}
