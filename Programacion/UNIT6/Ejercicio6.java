package UNIT6;

import java.util.*;

public class Ejercicio6 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);    
    System.out.print("Ingresa la frase --> ");
    String palabra = sc.nextLine() ;
    
    String[] cadena_palabra = palabra.split(" ");
    System.out.println("La palabra era --> "+ palabra );
    System.out.println("El numero de palabras son  --> "+ cadena_palabra.length);

    
    }
}
