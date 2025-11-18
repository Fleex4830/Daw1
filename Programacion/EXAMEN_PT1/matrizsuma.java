package EXAMEN_PT1;

import java.util.*;

public class matrizsuma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la dimension de la matriz ");
        System.out.print("Ingresa en numero de filas -> ");
        int filas = sc.nextInt();
        System.out.println();
        System.out.print("Ingresa el numero de columnas -> ");
        int columnas = sc.nextInt();
        int suma = 0;
        int sumaTotal = 0;

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                sumaTotal = sumaTotal + matriz[i][j];
                System.out.print("[" + matriz[i][j] + "]");
            }

            System.out.println();
        }
        System.out.println("suma total -> " + sumaTotal);
        System.out.println("<---suma en filas--->");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma = suma + matriz[i][j];

            }
            System.out.println("suma en fila N." + i + "->" + suma);
            suma = 0;
        }
        System.out.println("<---suma en columnas--->");
        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                suma = suma + matriz[i][j];

            }
            System.out.println("suma en la columna " + j + "->" + suma);
            suma = 0;
        }

    }
}