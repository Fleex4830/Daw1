package UNIT0;

import java.util.Scanner;
import java.util.Locale;

public class Algortimo2 {
  public static void main(String args[]) {
    int edad;
    int edadFinal;
    int edadNacimiento;
    int actual;
    int edadNuevo;
    Scanner sc;
    sc = new Scanner(System.in);
    System.out.println("Ejercicio 1");
    System.out.print("Escribe tu edad actual: ");
    edad = sc.nextInt();
    System.out.println("Tu edad es: " + edad);
    edadFinal = edad + 1;
    System.out.println("Tu proxima edad seria :" + edadFinal);
    System.out.println("Ejercicio 2");
    System.out.println("Escribe tu año actual:");
    actual = sc.nextInt();
    System.out.println("Escribe tu año de nacimiento: ");
    edadNacimiento = sc.nextInt();
    edadNuevo = (actual - edadNacimiento);
    System.out.println("adivino tu edad y es :" + edadNuevo);
    System.out.println("Ejercicio3");

    sc.close();

  }
}