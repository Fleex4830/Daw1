package UNIT3;
import java.util.*;
public class numerosdeNaM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el valor de N: ");
        int n= sc.nextInt();
        System.out.print("Ingresa el valor de M: ");
        int m = sc.nextInt();

    while (true ){
        if( n>0 && m >0 && m>=n){
            System.out.println("cumple ");
            break;

        }else{
            System.out.println("Error ingresa de nuevo los valores");
        }
    }

    for (int i = n; i<= m; i++){
        System.out.println(i);

    }
        
    }
}