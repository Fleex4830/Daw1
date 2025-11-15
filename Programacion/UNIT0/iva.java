package UNIT0;

import java.util.*;

public class iva {
    public static void main(String[] args) {
        // declaracion de variables
        Scanner sc = new Scanner(System.in);
        int iva;
        double base, total, totalIva;
        // instrucciones del programa
        System.out.println(" ingresa la base imponible:  ");
        sc.useLocale(Locale.US);
        base = sc.nextDouble();
        System.out.println("Ingresa el Iva a aplicar: ");
        iva = sc.nextInt();
        totalIva = (base * iva) / 100;
        total = base + totalIva;
        System.out.println("El importe totalIva es:" + totalIva);
        System.err.println("El importe total es:" + total);

        sc.close();

    }
}
