package POO.Animales;

public class Mamiferos extends Animal {

    public Mamiferos(String tipoMamifero, Sexo sexo, TipoAnimal tipo) {
        super(sexo, tipo);
        this.tipoMamifero = tipoMamifero;

    }

    public Mamiferos(String tipoMamifero) {
        this.tipoMamifero = tipoMamifero;
        this.setSexo(sexo.MACHO);
        this.setTipoAnimal(TipoAnimal.TERRESTRE);
    }
}
