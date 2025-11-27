package EXAMEN_PT1;

import java.util.*;

public class num_sumas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, suma;
        suma = 0;
        do {
            System.out.println("INGRESA UN NUMERO  -> ");
            numero = sc.nextInt();

            suma = suma + numero;

        } while (numero != 0);
        System.out.print("EL resultado es --> " + suma);
    }

}
