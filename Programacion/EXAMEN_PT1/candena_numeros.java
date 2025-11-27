package EXAMEN_PT1;

import java.util.*;

import UNIT0.areaTriangulo;

public class candena_numeros {

    public static int[] candena(Scanner sc) {
        System.out.println("Ingresa la cantidad de elementos de tu cadena ->");
        int tamano = sc.nextInt();
        int elemento;
        int[] arreglo = new int[tamano];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingresa el elemento NO." + (i + 1) + "-> ");
            elemento = sc.nextInt();
            arreglo[i] = elemento;

        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i] + ",");
        }

        return arreglo;
    }

    public static void cadena_invertida(int[] arreglo) {

        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.println(arreglo[i] + " ");
        }
    }

    public static int opciones_menu(Scanner sc) {
        System.out.println("Escribe una opcion ->");
        return sc.nextInt();
    }

    public static void menu() {
        System.out.println("--MENU--");
        System.out.println("Ingresa [1] para ingresar la cadena -> ");
        System.out.println("Ingresa [2] para invertir la cadena -> ");
        System.out.println("Ingresa [0] para salir del programa -> ");

    }

    public static void main(String[] args) {

        int opcion;
        int[] arreglo = null;
        Scanner sc = new Scanner(System.in);

        do {
            menu();
            opcion = opciones_menu(sc);

            if (opcion >= 1 && opcion <= 2) {
                switch (opcion) {
                    case 1:
                        System.out.println("Abriendo opcion 1 -> ");
                        arreglo = candena(sc);

                        break;
                    case 2:
                        System.out.println("abriendo opcion 2 -> ");
                        cadena_invertida(arreglo);
                        break;

                    default:
                        break;
                }
            }

        } while (opcion != 0);

    }

}
