package Algortimos_de_ordenacion.Ejercicio_algortimos;

import java.util.*;

public class Algortimo_principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            Algoritmo_funciones.menu_algoritmo();
            opcion = Algoritmo_funciones.opcion_menu(sc);

            switch (opcion) {

                case 1:
                    System.out.println("Ingresa un array");
                    Algoritmo_funciones.relleno_array(sc);

                    break;
                case 2:
                    System.out.println("Accediento a Buble Sort");
                    Algoritmo_funciones.buble_sort(sc, null);
                    break;

                case 3:
                    System.out.println("Accediento a Selection Sort");
                    Algoritmo_funciones.selection_sort(sc, null);
                    break;
                case 4:
                    System.out.println("Accediento a Insertion");
                    Algoritmo_funciones.insertion_sort(sc, null);
                    break;

                default:
                    break;
            }

        } while (opcion != 5);
        System.out.println("saliendo..........");

    }
}
