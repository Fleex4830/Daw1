package UNIT6;

import java.util.*;

public class prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingres una frase --> ");
        String frase = sc.nextLine();
        System.out.println(frase.length());
        String frase_nueva = frase.replace(" ", "");
        System.out.println("la frase es -->" + frase_nueva);
        System.out.println(frase_nueva.length());
    }
}
