package Programacion.Algortimos_de_ordenacion;

public class Algoritmo {

    public static void main(String[] args) {

        int[] v = new int[5];

        for (int i = 0; i < v.length; i++) {
            int posMin = i;
            for (int j = i + 1; i < v.length; j++) {
                if (v[j] < v[posMin]) {
                    posMin = j;
                }
            }

        }
    }
}