package UNIT5;

import java.util.*;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma=0;
        int i =0;

        System.out.print("Ingresa el numero de notas a ingresar: ");
        int n= sc.nextInt();
        int arreglo []=new int[n];
        
        //este for llena el arreglo con todos los valores que queremos sumar 
        for(i =0 ; i<n; i++){
            System.out.print("Ingresa la nota No."+ (i+1)+"-->");
            int numero = sc.nextInt();
            arreglo[i]= numero ;
        }

        //este for mostrar el array con las notas ingresadas
        for(i =0; i<n ;i++){
            System.out.print(" ["+arreglo[i]+"] ");
        }
        //este es un for que sumara los valores de array
        for (i=0 ; i<n ;i++){
            int numero_Actual = arreglo[i];
            suma +=numero_Actual;
            
        }

        System.out.println("El promedio es -->" + " ["+ (suma/n)+"]");
        

        sc.close();
    }
}
