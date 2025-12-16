package POO.Animales;

public class Ladrar extends perro {

    public Ladrar(String tipoMamifero) {
        super(tipoMamifero);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void sonido() {
        System.out.println("Estoy ladrando");
    }

}
