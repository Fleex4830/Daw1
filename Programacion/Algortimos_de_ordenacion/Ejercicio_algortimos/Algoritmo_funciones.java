package Algortimos_de_ordenacion.Ejercicio_algortimos;

import java.util.*;

public class Algoritmo_funciones {

    /*
     * esta funcion es el menu del algortimo
     * esta mostrando solamente el texto del menu
     */
    public static void menu_algoritmo() {
        System.out.println("---Tipos de Algoritmos---");
        System.out.println("Opicon[1] -> Ingresa array");
        System.out.println("Opcion[2] -> Buble Sort");
        System.out.println("Opcion[3] -> Selection Sort");
        System.out.println("Opicon[4] -> Insertion Sort");
        System.out.println("Opicon[5] -> SALIR ");

    }

    /*
     * Esta funcion maneja las opciones del menu para ser
     * proesadas luego
     */
    public static int opcion_menu(Scanner sc) {
        System.out.println("Ingresa una opcion al menu ->");
        return sc.nextInt();
    }

    /*
     * esta funcion lo que hace es crear y rellenar el array V que lo utilizaremos
     * para utilizarlo en diferentes algoritmos
     */
    public static int[] relleno_array(Scanner sc) {
        System.out.println("Ingresa el tamano de tu array ->");
        int tamano = sc.nextInt();
        int[] v = new int[tamano];

        for (int i = 0; i < v.length; i++) {
            System.out.print("Ingresa el elemento No." + (i + 1) + " -> ");
            v[i] = sc.nextInt();
        }

        System.out.println("tu array es ->");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

        return v;
    }

    public static void intercambiar(int[] v, int i, int j) {
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
        /*
         *
         * @param v array de enteros desordenado
         */
    }

    /* esta es el algoritmo de buble_sort */
    public static void buble_sort(Scanner sc, int[] v) {

    }

    /* este es el algortimo de insertion_sort */
    public static void insertion_sort(Scanner sc, int[] v) {

    }

    /* este es el algoritmo de selection sort */
    public static void selection_sort(Scanner sc, int[] v) {

    }

}
