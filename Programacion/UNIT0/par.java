package UNIT0;

import java.util.*;

public class par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("ingresa un numero : ");
        i = sc.nextInt();
        j = 0;

        while (i > j) {
            if (j % 2 == 0) {
                System.out.print(" " + j);
                j++;
            }
        }
        //
        // for(int i=0 ; i<20;i++){
        // if(i%2 ==0){
        // System.out.println(" "+i);
        // }
        // }
    }
}
