package Algoritmos;

import java.util.*;

public class Algoritmos_de_ordenacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INgresa la cantidad de eleemntos del array -> ");
        int tamano = sc.nextInt();
        int elemento, aux;
        int v[] = new int[tamano];

        for (int i = 0; i < v.length; i++) {
            System.out.println("Ingresale un valor nuevo al array ");
            elemento = sc.nextInt();
            elemento = v[i];
        }

        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1; j++) {

                if (v[j] > v[j + 1]) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;

                }

            }
        }

        for (int i = 0; i < v.length; i++) {
            System.err.println(v[i] + " ");
        }
    }
}