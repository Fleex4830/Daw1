package UNIT6;

import java.util.*;

public class espacios_multiples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un frase  --> ");
        String frase = sc.nextLine();

        // la funcion replaceAll remplaza todos los valres que les pongamos existentes
        // por otro
        String frase_nueva = frase.replaceAll("\\s+", " ");
        System.out.println("La frase con un solo es paso se ve asi --> " + frase_nueva);
    }
}
