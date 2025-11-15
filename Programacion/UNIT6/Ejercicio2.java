package UNIT6;

import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la palabra [a] --> ");
        String palabara_a = sc.nextLine();
        System.out.print("Ingresa la palabra [b] --> ");
        String palabra_b = sc.nextLine();

        if (palabara_a.equals(palabra_b)) {
            System.out.println("Estas palabras son exactamente iguales ");
        }else if  (palabara_a.equalsIgnoreCase(palabra_b)) {
            System.out.println("Estas palabras son casi iguales ");
        } else {
            System.out.println("Estas palabras no tienen nada que ve");
        }
    }
}
