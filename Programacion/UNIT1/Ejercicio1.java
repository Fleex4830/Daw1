package UNIT1;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
    int iva , precio , total , totalIva;
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa el iva a aplicar: ");
    iva = sc.nextInt();
    System.out.print("ingresa el precio del producto: ");
    precio = sc.nextInt() ; 
    totalIva = (iva * precio)/100 ; 
    total = precio + totalIva ; 
    System.out.println("el total con iva aplicado es");
    System.out.println("TOTAL -> " + total );
}   
    
}