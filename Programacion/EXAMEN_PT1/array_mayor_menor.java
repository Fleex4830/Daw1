package EXAMEN_PT1;

import java.util.*;

import UNIT3.arrayinvertido;

public class array_mayor_menor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array_numeros = new int[10];
        int mayor = 0, menor = 0;

        for (int i = 0; i < array_numeros.length; i++) {
            System.out.print("Ingresa el elmento No." + (i + 1) + "-> ");
            array_numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < array_numeros.length; i++) {
            System.out.print(array_numeros[i] + " ");
        }

        for (int i = 1; i < array_numeros.length; i++) {
            mayor = array_numeros[0];
            if (mayor < array_numeros[i]) {
                mayor = array_numeros[i];
            }

        }
        System.out.println();
        System.out.println("El elemento mas grade es -> " + mayor);

        for (int i = 1; i < array_numeros.length; i++) {
            menor = array_numeros[0];
            if (menor > array_numeros[i]) {
                mayor = array_numeros[i];
            }
        }
        System.out.println();
        System.out.println("El elemento menor es -> " + menor);
    }

}
