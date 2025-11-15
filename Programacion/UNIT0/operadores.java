package UNIT0;

import java.util.*;

public class operadores {

    public static void main(String[] args) {
        Scanner sc;

        sc = new Scanner(System.in);
        boolean tarea, permiso;
        System.out.println("para si responde ture y para no responde false");
        System.out.println("has terminado las tareas? ");
        tarea = sc.nextBoolean();
        System.out.println("Tienes permiso de tus padres?");
        permiso = sc.nextBoolean();
        if (tarea || permiso == false) {
            System.out.println("ve a estudiar  ");
            if (tarea && permiso == true) {
                System.out.println("puedes salir ");
            }

        }

        sc.close();

    }
}
