package CC2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args)throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Ingrese la cantidad de articulos a comprar: ");
    double cantidad  = Double.parseDouble(br.readLine());

    System.out.print("Precio: ");
    double precio  = Double.parseDouble(br.readLine());

    double total = cantidad * precio ; 
    System.out.print("Total a pagar: "+ total);


}
}

