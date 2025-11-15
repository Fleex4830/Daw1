package UNIT0;

import java.util.*;
import java.lang.*;

public class calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Double a, b, resultado;
        String caracter;
        System.out.print("Ingresa un numero a: ");
        a = sc.nextDouble();
        System.out.print("Ingresa un numero b: ");
        b = sc.nextDouble();
        System.out.print("ingresa un caracter como ( + , - , * , /)  ");
        caracter = sc.next();
        switch (caracter) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("operador no deseado");

        }
    }

}