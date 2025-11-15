package UNIT0;

import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un nunmero n: ");
        int num = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;

        }
        System.out.println("El Factorial de " + num + "!" + " = " + factorial);
    }
}
