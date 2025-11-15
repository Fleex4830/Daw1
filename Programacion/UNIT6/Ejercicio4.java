package UNIT6;

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in );
        System.out.print("Ingresa un Correo Electronico --> ");
        String correo_electronico = sc.nextLine(); 
        String clave = "@";
        
        int posicion = correo_electronico.indexOf(clave);
        String resultado = correo_electronico.substring(posicion+1 );
        System.out.println("la extencion del correo es --> "+ resultado);




    }
    
}
