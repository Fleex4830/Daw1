package UNIT1;

import java.util.Scanner;

public class Ejercicio5 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas hormigas hay? ");
        int hormigas = sc.nextInt();

        System.out.print("¿Cuántas arañas hay? ");
        int aranas = sc.nextInt();

        System.out.print("¿Cuántos lagartos hay? ");
        int lagartos = sc.nextInt();

        // Cada tipo de animal tiene cierto número de patas
        int patasTotales = (hormigas * 6) + (aranas * 8) + (lagartos * 4);

        System.out.println("\nEn total hay " + patasTotales + " patas en el terrario.");

        sc.close();
    }
}
