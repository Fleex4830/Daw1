package UNIT5;

import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[] = new int[10];
        int i = 0;
        int cont = 0;

        // este for llenara nuestro array
        for (i = 0; i < arreglo.length; i++) {
            System.out.print("Ingresa el valor No." + (i + 1) + "--> ");
            int valor = sc.nextInt();
            arreglo[i] = valor;
        }
        // mostramos el arreglo relleno
        for (i = 0; i < arreglo.length; i++) {
            System.out.print(" [" + arreglo[i] + "] ");
        }

        // este for lo usamos para recorrer y verificar pares

        for (i = 0; i < arreglo.length; i++) {
            int valor_actual = arreglo[i];
            if (valor_actual % 2 == 0) {
                cont++;
                System.out.println("Nuevo numero par encontrado");
                
            } else {
                System.out.println("Nada nuevo ");
            }

        }

        System.out.println("Total de numeros pares encontrados --> [" + cont + "] ");
    }
}
