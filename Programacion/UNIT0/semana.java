package UNIT0;

import java.lang.*;
import java.util.*;

public class semana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("'Ingresa un numero n del 1 al 7:");
        int n = sc.nextInt();
        System.out.println("ingresa otro mumero entre 1 y 7");
        int numero = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido");
        }
        // usando operadores ternarios

        // Uso de operadores ternarios encadenados
        String dia = (numero == 1) ? "Lunes"
                : (numero == 2) ? "Martes"
                        : (numero == 3) ? "Miércoles"
                                : (numero == 4) ? "Jueves"
                                        : (numero == 5) ? "Viernes"
                                                : (numero == 6) ? "Sábado"
                                                        : (numero == 7) ? "Domingo" : "Número inválido";

        System.out.println("El día es: " + dia);

        sc.close();

    }
}
