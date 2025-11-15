package UNIT0;

import java.util.*;

public class areaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, altura, area;
        System.out.println("Ingresa la base del triangulo ");
        base = sc.nextInt();
        System.out.println("Ingresa la altura del triangulo");
        altura = sc.nextInt();
        area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);

    }
}