package POO.Animales;

public class Animal {
    private Sexo sexo;
    private TipoAnimal tipoAnimal;

    public Animal() {
        tipoAnimal = TipoAnimal.ACUATICO;
    }

    public Animal(Sexo sexo, TipoAnimal tipo) {
        this.sexo = sexo;
        this.tipoAnimal = tipo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    @Override
    public String toString() {

        return "Sexo: " + this.sexo + "\n";
    }

    public void dormir() {
        System.out.println("ZZzzzzzzzzzz");
    }

    public void asearse() {
        System.out.println("Me estoy limpiando ");
    }

    public void sonido() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sonido'");
    }
}
