package EXAMEN_PT1;

import java.util.*;

public class cadenas_listas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        String[] palabra_actual = null;// creamos un arreglo para introducir por separado cada palabra de la frase
        List<String> frases = new ArrayList<>();// se crea un list para poder mezclarlo con el Map
        Map<String, Double> palabra = new HashMap<>();// se crea un Map para poder ver cuantas veces se repite una
                                                      // palabra

        System.out.print("Ingresa una frase  --> ");// pedimos la frase
        frase = sc.nextLine().toLowerCase();// obligamos a que todo sea minuscula
        palabra_actual = frase.split(" ");// separamos eh introducimos palabras por cada espacio

        // pasamos los datos de un array a un arraylist
        for (int j = 0; j < palabra_actual.length; j++) {
            frases.add(palabra_actual[j]);
        }
        // recorremos el array con un foreach para poder ver que valores se repiten
        for (String palabraActual : frases) {
            double repeticiones = palabra.getOrDefault(palabraActual, 0.0);
            palabra.put(palabraActual, (double) repeticiones + 1);
        }
        // recorre nuestro Map mostrando el string y su valor de repeticion
        for (Map.Entry<String, Double> salida : palabra.entrySet()) {
            System.out.printf("%s -> %.2f%n", salida.getKey(), salida.getValue());
        }
        System.out.println(frases);

    }

}
