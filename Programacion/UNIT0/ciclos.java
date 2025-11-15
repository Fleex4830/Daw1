package UNIT0;

import java.util.*;
import java.lang.*;

public class ciclos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, maximo = 0, minimo = 999;

        do {
            System.out.print("Ingresa un numero n: ");
            numero = sc.nextInt();
            if (numero >= maximo && numero != -1) {
                maximo = numero;

            }
            if (numero <= minimo && numero != -1) {
                minimo = numero;

            }
            if (numero % 2 == 0) {
                System.out.println("El numero es par " + numero);
            } else {
                System.out.println("El numero es impar " + numero);
            }
        } while (numero != -1);
        System.out.println("HASTA LUEGO ");
        System.out.println("El maximo actual es " + maximo);
        System.out.println("El minimo actual es " + minimo);
    }

}
