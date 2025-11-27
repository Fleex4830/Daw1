package EXAMEN_PT1;

import java.util.*;

public class ArrayList_Nombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        ArrayList<String> lista_nombres = new ArrayList<>();

        while (true) {
            System.out.println("Ingresa un nombre -> ");
            nombre = sc.nextLine();

            if (nombre.equals("fin")) {
                System.out.println("has introducido la palbra fin por tanto");
                System.out.println("SALIENDO .......");
                break;
            }
            lista_nombres.add(nombre);
        }
        System.out.println("Los nombres de la list son ->");
        System.out.print(lista_nombres);

    }

}
