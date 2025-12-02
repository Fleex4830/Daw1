package Algortimos_de_ordenacion.Ejercicio_algortimos;

import java.util.*;

public class Algortimo_principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int[] v = null;

        do {
            Algoritmo_funciones.menu_algoritmo();
            opcion = Algoritmo_funciones.opcion_menu(sc);

            switch (opcion) {

                case 1:
                    System.out.println("Ingresa un array");
                    v = Algoritmo_funciones.relleno_array(sc);

                    break;
                case 2:
                    System.out.println("Accediento a Buble Sort");
                    Algoritmo_funciones.buble_sort(sc, v);
                    System.out.println("Resultado: " + Arrays.toString(v));
                    break;

                case 3:
                    System.out.println("Accediento a Selection Sort");
                    Algoritmo_funciones.selection_sort(sc, v);
                    System.out.println("Resultado: " + Arrays.toString(v));
                    break;
                case 4:
                    System.out.println("Accediento a Insertion");
                    Algoritmo_funciones.insertion_sort(sc, v);
                    System.out.println("Resultado: " + Arrays.toString(v));
                    break;

                default:
                    break;
            }

        } while (opcion != 5);
        System.out.println("saliendo..........");

    }
}
