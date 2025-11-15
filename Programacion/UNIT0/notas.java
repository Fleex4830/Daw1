package UNIT0;

import java.lang.*;
import java.util.*;

public class notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la nota obtenida del curso:  ");
        Double nota = sc.nextDouble();
        if (nota >= 61 && nota <= 100) {
            System.out.println("Estas aprobado");
            if (nota >= 90 && nota <= 100) {
                System.out.println("Tienes un sobresaliente");
            }
            if (nota >= 80 && nota <= 89) {
                System.out.println("Tienes un notable ");

            }
        } else {
            System.err.println("estas suspendido o la nota ingresada supera la nota maxima (100) ");
        }

    }
}
