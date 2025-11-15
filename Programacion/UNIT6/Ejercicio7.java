package UNIT6;

import java.util.*;
public class Ejercicio7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("ingresa el numero de palabras que ingresaras --> ");
        int cant_palabras =sc.nextInt() ; 
        sc.nextLine();
        int i =0;
        String [] arreglo_palabras = new String[cant_palabras];
        

        //for para meter las palabras al arreglo 
        for (i=0; i < cant_palabras ;i++){
            System.out.print("Ingresa la palabra No."+(i+1)+"--> ");
            String palabra = sc.nextLine();
            arreglo_palabras [i] = palabra ; 
        }
        
        //for para sacar las palabras juntas 
        System.out.print("Salida --> ");
        for (i=0 ; i< cant_palabras;i ++){
        System.out.print( arreglo_palabras[i]+",");
        }
        
        

    }
}
