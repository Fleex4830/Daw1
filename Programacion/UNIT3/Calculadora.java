package UNIT3;

import java.util.*;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int opcion = -1;

        do {
            menu();
            opcion = leerSeleccion(sc);
            double[] valores = arrelgo(sc);
            double valor1 = valores[0];
            double valor2 = valores[1];
            switch (opcion) {
                case 1:
                    suma(valor1, valor2);
                    break;
                case 2:
                    resta(valor1, valor2);
                    break;
                case 3:
                    multiplicacion(valor1, valor2);
                    break;
                case 4:
                    divison(valor1, valor2);
                    break;
                default:
                    System.out.println("opcion no valida , intenta de nuevo ");

            }

        } while (opcion != 0);

    }

    // funcion leer opcion
    public static int leerSeleccion(Scanner sc) {
        System.out.print("Ingresa una opcion del menu: ");
        return sc.nextInt();
    }

    // funcion MENU
    public static void menu() {
        System.out.println(" ## MENU CALCULADORA ##");
        System.out.println("OPCION 1 --> SUMAR ");
        System.out.println("OPCION 2 --> RESTAR");
        System.out.println("OPCION 3 --> MULTIPLICACION");
        System.out.println("OPCION 4 --> DIVISION");
        System.out.println("OPCION 0 --> SALIR ");
    }

    // funcion sumar
    public static double suma(double valor1, double valor2) {
        double suma = valor1 + valor2;
        System.out.println(suma);
        return suma;
    }

    public static double multiplicacion(double valor1, double valor2) {
        double multiplicacion = valor1 * valor2;
        System.out.println(multiplicacion);
        return multiplicacion;
    }

    public static double resta(double valor1, double valor2) {
        double resta = valor1 - valor2;
        System.out.println(resta);
        return resta;
    }

    public static double divison(double valor1, double valor2) {
        double divide = valor1 / valor2;
        System.out.println(divide);
        return divide;
    }

    public static double[] arrelgo(Scanner sc) {
        sc.nextLine();
        double[] arreglo = new double[2];
        System.out.print("Ingresa el valor de A: ");
        double a = sc.nextDouble();
        arreglo[0] = a;
        System.out.print("Ingresa el valor de B: ");
        double b = sc.nextDouble();
        arreglo[1] = b;
        return arreglo;

    }

}
