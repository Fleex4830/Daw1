package UNIT0;

import java.util.*;
import java.lang.*;

public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("para salir pulsa [ 0 ] ");
        System.out.println("Ingresa un numero n cualquiera : ");
        numero = sc.nextInt();

        while (numero != 0) {

            if (numero % 2 == 0 && numero > 0) {
                System.out.println("este es un numero par y positivo " + numero);
            } else if (numero % 2 == 0 && numero < 0) {
                System.out.println("este es un numero par y negativo " + numero);
            } else if (numero % 2 != 0 && numero > 0) {
                System.out.println("este es un numero impar positivo " + numero);

            } else if (numero % 2 != 0 && numero < 0) {
                System.out.println("este es un numero impar negativo " + numero);
            }
            System.out.println("Ingresa un numero n cualquiera : ");
            numero = sc.nextInt();
            System.out.println("para salir pulsa [ 0 ] ");
        }
        System.out.println("Saliendo ");
    }
}
