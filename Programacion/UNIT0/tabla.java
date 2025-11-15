package UNIT0;

import java.util.*;
import java.lang.*;

public class tabla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INGRESA UN NUMERO N: ");
        int num = sc.nextInt();
        int i = 1;

        int resultado;
        for (i = 1; i <= 10; i++) {
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
}
