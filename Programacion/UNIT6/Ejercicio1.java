package UNIT6;

import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingresa una frase cualquiera --> ");
        String frase = sc.nextLine() ; 
        int num_Caracteres = frase.length() ;
        System.out.println("El numero de caracteres de la frase ingresada son  --> "+ num_Caracteres);

        char primer =frase.charAt(0);
        char segundo = frase.charAt(frase.length()-1);
        
        System.out.println("primera letra "+ primer);
        System.out.println("segunda letra "+segundo);

    }
}
