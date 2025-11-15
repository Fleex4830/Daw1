package UNIT3;
import java.util.*;
public class promediofor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingresa la cantidad de notas que ingresaras: ");
        int notas = sc.nextInt();
        int suma =0 ; 
        for (int i =1 ; i <= notas ;  i ++){
            System.out.println(" Ingresa la nota actual "+ "No. "+ i + " "  );
            int notaActual = sc.nextInt(); 
            suma += notaActual ; 

        }

        int promedio   = suma / notas ;
        System.out.println("El promedio del estudiante es -> "+ promedio );
        if (promedio  >= 5 ){
            System.out.println("Estas aprobado");
        }else {
            System.err.println("Estas suspenso");
        }


    }
}
