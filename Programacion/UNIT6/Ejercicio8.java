package UNIT6;

import java.util.*;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre completo --> ");
        String nombre = sc.nextLine();

        String[] arreglo_nombre = nombre.split(" ");
        System.out.println(arreglo_nombre.length);

        for (int i = 0; i < arreglo_nombre.length; i++) {
            char iniciales = arreglo_nombre[i].charAt(0);

            System.out.print(iniciales + ".");
        }
    }
}
