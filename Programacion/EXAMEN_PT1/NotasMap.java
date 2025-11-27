package EXAMEN_PT1;

import java.util.*;

public class NotasMap {

    public static void main(String[] args) {
        HashMap<String, Integer> notas = new HashMap<>();

        // Agregar 3 alumnos
        notas.put("Ana", 8);
        notas.put("Luis", 7);
        notas.put("Maria", 9);

        int suma = 0;

        // Recorrer el HashMap y sumar las notas
        for (Integer nota : notas.values()) {
            suma += nota;
        }

        // Calcular el promedio
        double promedio = (double) suma / notas.size();

        // Mostrar resultado
        System.out.println("Notas de los alumnos: " + notas);
        System.out.println("Promedio: " + promedio);
    }
}
