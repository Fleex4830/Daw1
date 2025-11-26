package EXAMEN_PT1;

import java.util.*;

public class tablas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero_tabla, resultado;
        System.out.print("Ingresa de que nuemero deseas la tabla de multiplicar -> ");
        numero_tabla = sc.nextInt();

        for (int i = 0; i <= numero_tabla; i++) {
            resultado = i * numero_tabla;
            System.out.println(i + "x" + numero_tabla + "=" + resultado);

        }

    }

}
