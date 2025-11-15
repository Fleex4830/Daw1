package UNIT3;

import java.util.*;

public class Promedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arregloNotas = null;
        int numeroNotas = 0;
        int opcion;

        do {
            menu();
            opcion = leeropcion(sc);

            switch (opcion) {
                case 1:
                    arregloNotas = leerNotas(sc); // ahora devuelve el arreglo
                    numeroNotas = arregloNotas.length;
                    break;

                case 2:
                    if (arregloNotas != null) {
                        promedio(arregloNotas, numeroNotas);
                    } else {
                        System.out.println("Primero ingresa las notas (opción 1).");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida, intenta otra vez.");
            }

        } while (opcion != 0);
    }

    public static int leeropcion(Scanner sc) {
        System.out.print("Ingresa una opción del menú: ");
        return sc.nextInt();
    }

    public static void menu() {
        System.out.println("\n## MENU NOTAS ##");
        System.out.println("1 --> Ingresar notas");
        System.out.println("2 --> Calcular promedio");
        System.out.println("0 --> Salir");
    }

    //  devuelve el arreglo completo
    public static int[] leerNotas(Scanner sc) {
        System.out.print("Ingresa el número de notas: ");
        int numeroNotas = sc.nextInt();
        int[] arregloNotas = new int[numeroNotas];

        for (int i = 0; i < numeroNotas; i++) {
            System.out.print("Ingresa la nota #" + (i + 1) + ": ");
            arregloNotas[i] = sc.nextInt();
        }

        return arregloNotas;
    }

    public static double promedio(int[] arregloNotas, int numeroNotas) {
        int sumaNotas = 0;
        for (int i = 0; i < numeroNotas; i++) {
            sumaNotas += arregloNotas[i];
        }

        double promedio =  sumaNotas / numeroNotas;
        System.out.println("El promedio de las notas es: " + promedio);
        return promedio;
    }
}
