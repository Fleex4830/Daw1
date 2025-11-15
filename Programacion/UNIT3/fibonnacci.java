package UNIT3;
import java.util.*;
public class fibonnacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de termninos de Fibonnaci a mostrar [N] -> ");
        int n = sc.nextInt() ;
        int a= 0 , b=1 , c ; 
        
        if (n>=1 ){
            System.out.print(a);
        }
        
        if(n>=2 ){
            System.out.print(", " +b);
        }

        for (int i =3; i <=n; i++){
            c= a+b;
            System.out.print(", "+c);
            a = b ; 
            b = c ; 
            

        }

    }
}
