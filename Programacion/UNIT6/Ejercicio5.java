package UNIT6;

import java.util.*;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingresa la frase --> ");
        String frase = sc.nextLine();

        String sustituto = frase.replace('a', '*').replace('e','*').replace('i', '*').replace('o', '*').replace('u', '*');

        System.out.println("la frase nueva es  --> "+ sustituto);
    }
}
