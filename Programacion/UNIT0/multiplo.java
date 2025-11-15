package UNIT0;

import java.util.*;

public class multiplo {
    public static void main(String[] args) {
        int entero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero entero: ");
        entero = sc.nextInt();
        if (entero % 5 == 0) {
            System.out.println("Es multipo de 5 ");
        } else {
            System.out.println("no es multiplo de 5");

        }
    }
}
