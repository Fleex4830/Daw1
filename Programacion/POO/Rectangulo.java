package Programacion.POO;

public class Rectangulo {
    // creamos los datos privados que utilizaremos dentro de esta clase
    private int base, altura;

    // constructor
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // metodos
    public int area() {
        int resultado = base * altura;
        return resultado;
    }

    // creams los getters
    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    // creamos los setters
    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}