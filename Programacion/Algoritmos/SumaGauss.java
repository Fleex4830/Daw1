package Algoritmos;

import java.util.Scanner;

public class SumaGauss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario el valor de n
        System.out.print("Introduce un número entero n: ");
        int n = sc.nextInt();

        // Aplicar la fórmula de Gauss: n*(n+1)/2
        int suma = n * (n + 1) / 2;

        // Mostrar el resultado
        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);

        sc.close();
    }
}
