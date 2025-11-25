package EXAMEN_PT1;

import java.util.*;

public class numeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Ingresa un numero cualquiera --> ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Este numero es negativo !!");
        } else if (numero > 0) {
            System.out.println("Este numero es positivo !! ");
        } else {
            System.out.println("Esto es un 0");
        }

    }

}
