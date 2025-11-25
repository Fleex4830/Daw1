package EXAMEN_PT1;

import java.util.*;

public class semana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero_semana;
        System.out.print("Ingresa un numero del 1 al 7 --> ");
        numero_semana = sc.nextInt();

        if (numero_semana <= 7 && numero_semana >= 1) {
            switch (numero_semana) {
                case 1:
                    System.out.println("Lunes");
                case 2:
                    System.out.println("Martes");
                case 3:
                    System.out.println("Miercoles");
                case 4:
                    System.out.println("Jueves");
                case 5:
                    System.out.println("Viernes");
                case 6:
                    System.out.println("Sabado");
                case 7:
                    System.out.println("Domingo");
            }
        } else {
            System.out.println("El numero ingresado esta fuera del rango de la semana ");
        }
    }
}
