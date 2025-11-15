package UNIT0;

import java.util.*;

public class TablasdeMultiplicar {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {// filas
            System.out.print("|");
            for (int j = 1; j <= 10; j++) { // columnas

                System.out.print(" " + i * j + " ");

            }
            System.out.println("|");
        }
    }
}
