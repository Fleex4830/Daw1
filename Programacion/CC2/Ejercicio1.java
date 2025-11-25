package CC2;

import java.io.*;
import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("  Lab01 - Ejercicio1  \n----------------------\n");
        System.out.println("Ingrese cualquier tecla y ENTER para continuar");
        int x = reader.read();
        System.out.println("Haremos algunos calculos ... ");
        Random rand = new Random();
        int original = rand.nextInt(20);
        int variable = rand.nextInt(4) + 1 + +rand.nextInt(3);
        System.out.println("Numero original:" + original);
        int op = original * variable;
        System.out.println("Multiplicacion: " + op);
        op = original + variable;
        System.out.println("Suma: " + op);
        op = original - variable;
        System.out.println("Resta: " + op);
        double opp = original / variable;
        System.out.println("Division: " + opp);
        System.out.println("\nSi su programa llega hasta aqui, fue arreglado con exito");

    }
}
