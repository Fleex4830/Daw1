package CC2;

import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese primer color: ");
        String primer = br.readLine();
        primer.toLowerCase();
        System.out.print("Ingrese segundo color: ");
        String segundo = br.readLine();
        segundo.toLowerCase();

        if (primer.equals(segundo) && segundo.equals(segundo)) {
            System.out.println("RESULTADO: " + primer.toUpperCase());

        } else if (primer.equals("rojo") && segundo.equals("azul") ) {
            System.out.println("RESULTADO: MORADO ");

        } else if (primer.equals("azul") && segundo.equals("amarillo")) {
            System.out.println("RESULTADO: VERDE");

        } else if (primer.equals("rojo") && segundo.equals("amarillo")) {
            System.err.println("RESULTADO: NARANJA ");
        } else {
            System.out.println("COLOR INVALIDO ");
        }

    }

}
