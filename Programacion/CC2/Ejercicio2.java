package CC2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

//ESTA ES LA CLASE NuevoEstudiante
public class Ejercicio2 {

    public static void main(String[] args) throws Exception{// recordar colocar exception
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Lab 01 - Ejercicio #2");
    System.out.println("----------------------");
    System.out.println();

    //pedimos datos 

        System.out.print("Ingrese Primer Nombre: ");
        String primerNombre = br.readLine();

        System.out.print("Ingrese Segundo Nombre: ");
        String segundoNombre = br.readLine();

        System.out.print("Ingrese Primer Apellido: ");
        String primerApellido = br.readLine();

        System.out.print("Ingrese Segundo Apellido: ");
        String segundoApellido = br.readLine();

        System.out.println("Ingresa fecha de nacimiento (dd/mm/aaaa): ");
        String fechaNacimiento = br.readLine();

        //tener al iniciales en mayucula
        String iniciales=""+primerNombre.charAt(0)+segundoNombre.charAt(0)+primerApellido.charAt(0)+segundoApellido.charAt(0);
        iniciales = iniciales.toUpperCase() ;

    // separamos la fecha 
        String[] partesFecha = fechaNacimiento.split("/"); 
        String dia = partesFecha[0];
        String mes = partesFecha[1];
        String anio = partesFecha[2];
    // generar el carnet
    String carnet = "2025-"+ iniciales +mes + anio ;

    //Generar el user name minisculas
    String username = ("" 
                + Character.toLowerCase(primerNombre.charAt(0))
                + Character.toLowerCase(segundoNombre.charAt(0))
                + primerApellido.toLowerCase()
                + Character.toLowerCase(segundoApellido.charAt(0)));

        System.out.println();
        System.out.println("Nombre: " + primerApellido + " " + segundoApellido + ", " + primerNombre + " " + segundoNombre);
        System.out.println("Fecha Nacimiento: " + fechaNacimiento);
        System.out.println("Iniciales: " + iniciales);
        System.out.println("Carnet: " + carnet);
        System.out.println("Email: " + username + "@universidad.edu");

    }

    
}
    

