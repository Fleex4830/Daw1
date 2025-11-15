package UNIT0;

import java.util.*;

public class contrasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contra, aceptada = "1234";

        do {
            System.out.println("Ingresa tu contra: ");
            contra = sc.next();
            if (!contra.equals(aceptada))
                System.out.println("contra NO aceptada ");
        } while (!contra.equals(aceptada));
        {
            System.out.println("contra aceptada ");
            System.out.println("tu contra es " + contra);

        }

        sc.close();
    }

}
