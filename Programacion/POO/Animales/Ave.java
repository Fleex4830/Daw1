package POO.Animales;

public class Ave extends Animal {

    public Ave(Sexo sexo, TipoAnimal tipo) {
        super(sexo, tipo);
    }

    public Ave() {
        this.setSexo(Sexo.MACHO);
        this.setTipoAnimal(TipoAnimal.AERREO);
    }

    private void setTipoAnimal(TipoAnimal aerreo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTipoAnimal'");
    }

    private void setSexo(Sexo macho) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSexo'");
    }

    public void volar() {
        System.out.println("Estoy volando ");
    }

    @Override
    public void asearse() {
        super.asearse();
        System.out.println("Me estoy limpiando las plumas");
    }
}