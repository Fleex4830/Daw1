package UNIT6;

import java.util.*;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una frase cualquiera --> ");
        String frase = sc.nextLine();
        String frase_final = frase.replace("malo", "***")
                .replace("feo", "***")
                .replace("tonto", "***");

        System.out.println("Nuestra frase es --> " + frase_final);

    }
}
