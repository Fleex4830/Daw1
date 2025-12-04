package Algortimos_de_ordenacion.Ejercicio_algortimos;

import java.util.*;

public class puntosNombre {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        int dimension = 0;

        do {
            puntosNombreFunciones.menu_algoritmo();
            opcion = puntosNombreFunciones.opcion_menu(sc);
            switch (opcion) {

                case 1:
                    System.out.println("abriendo la opcion 1");
                    dimension = puntosNombreFunciones.dimension(sc);
                    break;
                case 2:
                    System.out.println("abriendo la opcion 2");
                    puntosNombreFunciones.relleno(dimension, sc);
                    break;

                case 3:
                    puntosNombreFunciones.Valorletra(sc);
                    puntosNombreFunciones.palabraValor(sc);
                    break;
                default:
                    break;
            }

        } while (opcion != 5);
        System.out.println("saliendo..........");

    }

}