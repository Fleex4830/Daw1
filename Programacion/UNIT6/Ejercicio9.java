package UNIT6;

import java.util.*;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in );
        System.out.print("Ingresa una palabra --> ");
        String palabra = sc.nextLine();
        String palabra_invertida = "";
        System.out.println(palabra.length());
        
        for (int i=palabra.length()-1 ;i >=0; i--){

            palabra_invertida += palabra.charAt(i);
            
        }
        System.out.println(palabra_invertida);
    }
}
