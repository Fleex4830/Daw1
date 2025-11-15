package UNIT6;

import java.util.*;

public class vocales_consonantes {

    public static void main(String[] args) {
        int vocales = 0;
        int consonantes = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una frase --> ");
        String frase_original = sc.nextLine();

        String frase = frase_original.replace(" ", "");

        for (int i = 0; i < frase.length(); i++) {
            char frase_nueva = frase.charAt(i);
            char frase_sinexcp = Character.toLowerCase(frase_nueva);

            if (frase_sinexcp == 'a' || frase_sinexcp == 'e' || frase_sinexcp == 'i' || frase_sinexcp == 'o'
                    || frase_sinexcp == 'u') {

                vocales++;
            } else {
                consonantes++;
            }

        }
        System.out.println("la cantidad de vocales son --> " + vocales);
        System.out.println("la cantidad de consonantes son --> " + consonantes);
    }
}