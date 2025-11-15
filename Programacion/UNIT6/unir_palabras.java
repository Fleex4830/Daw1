package UNIT6;

import java.util.*;

public class unir_palabras {
    public static void main(String[] args) {
        String[] frutas = { "manzana", "pera", "platano" };

        String resultado = String.join(",", frutas);
        System.out.println(resultado);
        String message = String.join("-", "java", "is", "cool");
    }
}
