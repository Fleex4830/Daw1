package UNIT3;

import java.util.*;

public class edades0to99 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una edad: ");
        int edad = sc.nextInt();
        while ( edad != 99) {
            if (edad <18){
                System.out.println("es menor de edad");
                
            }else{
                System.out.println("es mayor de edad");
            }
            System.out.println("Ingresa una edad: ");    
            edad = sc.nextInt();
            }
            System.out.println("Terminando.....");
        }
    }

