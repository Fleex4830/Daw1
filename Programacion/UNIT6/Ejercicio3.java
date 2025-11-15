package UNIT6;

import java.util.*;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        System.out.print("Ingresa una frase cualquiera --> ");
        String frase = sc.nextLine() ; 
        System.out.print("Ingresa una palabra cualquiera --> ");
        String palabra = sc.nextLine() ; 

        int indice = frase.indexOf(palabra);
        System.out.println("La posicion de la palabra en el frase es de --> "+ indice );


        sc.close(); 
    }

    
}
