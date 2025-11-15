package UNIT0;

import java.lang.*;
import java.util.*;

public class polinomio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, contenido, cuadrado, raiz, caso1, caso2, unico;
        // usamos doble por quela funcion math solo puede funcionar con double

        System.out.println("Ingresa el valor de a:");
        a = sc.nextDouble();
        System.out.println("Ingresa el valor de b:");
        b = sc.nextDouble();
        System.out.println("Ingresa el valor de c:");
        c = sc.nextDouble();

        if (a != 0) {
            cuadrado = (Math.pow(b, 2));
            contenido = cuadrado - (4 * a * c);
            if (contenido > 0) {
                raiz = Math.sqrt(contenido);
                caso1 = (-b - raiz) / (2 * a);
                System.out.println("x1 = " + caso1);
                caso2 = (-b + raiz) / (2 * a);
                System.out.println("x2 = " + caso2);
            } else if (contenido == 0) {
                unico = -b / (2 * a);
                System.err.println("Solucion unica: " + unico);
            } else {
                System.out.println("No hay soluciones reales");
            }
        } else {
            System.err.println(" a  no puede ser 0");
        }
        sc.close();
    }
}
