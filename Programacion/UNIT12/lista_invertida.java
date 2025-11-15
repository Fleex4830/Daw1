package UNIT12;

import java.util.*;

public class lista_invertida {

    // Crea una lista de nombres y muestra los elementos en orden inverso.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> nombres = new ArrayList<>();

        System.out.print("cuantos nombres ingresaras --> ");
        int cant_nombres = sc.nextInt();
        sc.nextLine();
        // llenamos nuestra lista de nombres

        for (int i = 0; i < cant_nombres; i++) {
            System.out.print("ingresa el nombre No." + (i + 1) + " -->");
            String nombre = sc.nextLine();

            nombres.add(nombre);

        }

        for (int i = nombres.size() - 1; i >= 0; i--) {
            System.out.print(nombres.get(i) + ",");
        }
    }
}
