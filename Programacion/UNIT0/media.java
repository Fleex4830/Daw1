package UNIT0;

import java.util.*;
import java.lang.*;

public class media {
    public static void main(String[] args) {
        int nAlumnos = 0, sumaEddad = 0, media = 0, edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("para salir pulsa [ 0 ]");
        System.out.print("Ingresa la edad de un Alumno: ");
        edad = sc.nextInt();
        while (edad != 0) {
            nAlumnos = nAlumnos + 1;
            sumaEddad = sumaEddad + edad;
            media = sumaEddad / nAlumnos;

            System.out.print("Ingresa la edad de un Alumno: ");
            edad = sc.nextInt();
        }
        System.out.println("Saliendo ");
        System.out.println("la cantidad de alumnos es: " + nAlumnos);
        System.out.println("la media es " + media);
    }
}
