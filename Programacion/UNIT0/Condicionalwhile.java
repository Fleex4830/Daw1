package UNIT0;

import java.util.*;
import java.lang.*;

public class Condicionalwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, maximo = 0, minimo = 999;
        System.out.println("Introduce un numero n");
        numero = sc.nextInt();
        while (numero != -1) {
            if (numero > maximo) {
                maximo = numero;

            }
            if (numero < minimo && numero != -1) {
                minimo = numero;

            }
            if (numero % 2 == 0 && numero > 0)
                System.out.println("Introduce un numero n");
        }

    }
}
