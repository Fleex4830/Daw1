package EXAMEN_PT1;

import java.util.*;

public class notas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nota1, nota2, nota3;
        double media;
        System.out.print("Ingresa Nota No.1 --> ");
        nota1 = sc.nextInt();
        System.out.print("Ingresa Nota No.2 --> ");
        nota2 = sc.nextInt();
        System.out.print("Ingresa Nota No.3 --> ");
        nota3 = sc.nextInt();
        System.out.println("Calculado la media ......");
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("La media es  -- > " + media);
    }
}
