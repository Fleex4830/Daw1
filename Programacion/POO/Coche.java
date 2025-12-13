package POO;

public class Coche {
    private String marca;
    private int velocidad;

    // creamos el constructor
    public Coche(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    // metodos
    public void acelerar(int velocidad_nueva) {
        velocidad = velocidad + velocidad_nueva;
    }

    public void frenar(int velocidad_reducida) {

        if (velocidad_reducida > velocidad) {
            System.out.println("reduccion no aceptada ");
        } else {
            System.out.println("reduccion aceptada");
            velocidad = velocidad - velocidad_reducida;
        }

    }

    public void mostrarEstado() {
        System.out.println("marca del vehiculo -> " + marca);
        System.out.println("La velocidad es de -> " + velocidad);

    }
}
