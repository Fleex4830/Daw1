package UNIT1;

import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("ingresa un numero n: ");
        numero = sc.nextInt();

        int modulo = numero % 5;
        int respuesta = modulo == 0 ? 0 : (5 - modulo);
        System.out.println("le falta " + respuesta + " para ser multiplo de 5");
    }

}
