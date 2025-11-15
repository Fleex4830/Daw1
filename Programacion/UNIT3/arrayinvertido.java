package UNIT3;
import java.util.*;
public class arrayinvertido {
    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el la longitud del array: ");
        int longitud = sc.nextInt(); 
        int [] array1 = new int[longitud];
        int u =0 ;
        //llenamos el array con los valores del usuario 
        for (int i=0 ; i < longitud; i++){
            System.out.print("Ingresa dato"+ "["+(i+1)+"] -> " );
            int dato =sc.nextInt() ;
            array1 [i] = dato ;
        }
        System.out.print("El array original es ->");
        for (int j=0; j < longitud; j++ ){
            System.out.print("["+array1[j]+ "]");
        }
    //creamos el array invertido a partir del ya creado 
        int [] array2 = new int[longitud];
        //creamos un for que llene este array de forma invertida
        for (int h = longitud-1 ; h >= 0; h--) {
            array2[u] = array1[h];
            u++;
        }
        System.out.print("El array invertido es ->");
    // imprimimos el array completo actual 
        for (int i = 0; i < array1.length; i++) {
                System.out.print("["+array2[i]+ "]");
        }
    sc.close();   
    }
    
}
