package EXAMEN_PT1;

import java.util.*;

public class funcion1 {

    // menu del programa
    public static void menu() {
        System.out.println("---MENU---");
        System.out.println("INGRESA UN NUMERO [1]");
        System.out.println("VER SI ES PAR O IMPAR [2]");
        System.out.println("--SALIR-- [0]");

    }

    // dato de seleccion menu
    public static int dato_menu(Scanner sc) {
        System.out.print("Ingresa opcion menu -> ");
        return sc.nextInt();
    }

    // procesamos el numero
    public static int proceso(Scanner sc) {
        System.out.print("Ingresa un numero cualquiera -> ");
        return sc.nextInt();

    }

    public static void paroimpar(int numero) {

        if (numero % 2 == 0) {
            System.out.println("Este numero es par -> " + numero);

        } else {
            System.out.println("Este numero es impar -> " + numero);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion_menu, numero = 0;

        do {
            menu();
            opcion_menu = dato_menu(sc);

            if (opcion_menu >= 1 && opcion_menu <= 2) {
                switch (opcion_menu) {
                    case 1:
                        System.out.println("abriendo opcion 1");

                        numero = proceso(sc);
                        break;
                    case 2:
                        System.out.println("abriendo opcion 2");
                        paroimpar(numero);
                        break;
                }

            }

        } while (opcion_menu != 0);
        sc.close();
    }

}
