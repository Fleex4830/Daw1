package Algortimos_de_ordenacion.Ejercicio_algortimos;

import java.util.Scanner;

import EXAMEN_PT1.nombre;

public class puntosNombreFunciones {

    // este el menu que utilizaremos para nuestro programa
    public static void menu_algoritmo() {
        System.out.println("---Tipos de Algoritmos---");
        System.out.println("Opicon[1] -> Indica la dimension");
        System.out.println("Opcion[2] -> Rellena nombre");
        System.out.println("Opcion[3] -> Muestra puntos");
        System.out.println("Opicon[5] -> SALIR ");
    }

    // procesamos la opcion del menu
    public static int opcion_menu(Scanner sc) {
        System.out.println("Ingresa una opcion al menu ->");
        return sc.nextInt();
    }

    // aqui procesaremos el arreglo para poder crear un arreglo con los nombres
    public static int dimension(Scanner sc) {
        System.out.print("Ingresa la cantidad de elementos que ingresaras ->");
        int dimension = sc.nextInt();
        return dimension;
    }

    // esta funcion rellena el array con tamano dimension con todos lo snombres
    public static void relleno(int dimension, Scanner sc) {
        String[] nombres = new String[dimension];
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingresa el nombre No." + (i + 1) + "->");
            String nombre_actual = sc.nextLine().toLowerCase().trim();
            nombres[i] = nombre_actual;
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

    }

    // a partir de estas funciones veremos cosillas que van con descomponer un
    // string osea una cadena
    public static int Valorletra(Scanner sc) {
        System.out.println("Ingresa una letra-> ");

        char[] letra = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
                'ñ', 'z', 'x', 'c', 'v', 'b', 'n', 'm' };
        System.out.println(letra.length);

        return 0;
    }

    public static int palabraValor(Scanner sc, String[] nombres) {
        int suma = 0;
        String nombre_actual;
        for (int i = 0; i < nombres.length; i++) {
            nombre_actual = nombres[i];
            char[] nombre_letras = nombre_actual.toCharArray();

        }
        return 0;
    }

}