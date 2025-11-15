package UNIT1;

import java.util.*;
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        double base , altura , area ;
        Scanner sc = new Scanner (System.in);
        System.out.print("ingresa la base del triangulo: ");
        base = sc.nextDouble();
        System.out.print("ingresa la altura del triangulo: ");
        altura = sc.nextDouble();

        area = (base * altura ) / 2 ;
        System.out.println(" el area del triangulo es: "+ area);
    }
}
