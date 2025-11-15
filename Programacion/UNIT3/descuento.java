package UNIT3;
import java.util.*;
public class descuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double monto ,descuento ;
        do{

            System.out.print("Ingres el monto de la compra: ");
            monto =sc.nextDouble();

            if(monto <100 ){

            System.out.println("el monto no es valiod -> ingrese de nuevo el monto ");

            }
        }while (monto <100);
        

        if (monto <=500){
            System.out.println("aplicaremos el 10%");
            descuento = 0.10;
        }else{
        
            System.out.println("aplicaremos el 20%");
            descuento = 0.20;
        }

        double precioFinal = monto -(monto *descuento);

        System.out.println(" ---resumen de la compra--- ");
        System.out.println("monto original -> "+ monto);
        System.out.println("descuento aplicado -> "+ (descuento*100));
        System.out.println("precio final -> "+precioFinal);

    }
}
