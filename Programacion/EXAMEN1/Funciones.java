package EXAMEN1;

import java.util.Scanner;

public class Funciones {
    // funcion de menu
    public static void menu() {
        System.out.println("--MENU--");
        System.out.println("PULSA [1] ADD VISITANTE ");
        System.out.println("PULSA [2] ATENDER SIGUIENTE");
        System.out.println("PULSA [3] MOSTRAR COLA");
        System.out.println("PULSA [4] MOSTRAR ESTADISTICAS");
        System.out.println("PULSA [5] SALIR ");
    }

    // --------------------------------------
    // funcion dato para el menu
    public static int dato_menu(Scanner sc) {
        System.out.print("Ingresa una opcion del menu --> ");
        int opcion = sc.nextInt();
        if (opcion >= 1 && opcion <= 5) {

            return opcion;
        } else {
            System.out.println("Ingresa una opcion valida");
            return dato_menu(sc);
        }
    }

    // ----------------------------------------

    // esta funcion es para validar que el numero de acompañantes sea >=0
    public static int leerEnteroPosito(Scanner sc, String mensaje) {
        int numero_positivo;

        do {
            System.out.println(mensaje);
            numero_positivo = sc.nextInt();

        } while (numero_positivo < 0);

        return numero_positivo;
    }

    // esta funcion lee el tipo de pase
    public static String leerTipoPase(Scanner sc) {
        String tipoPase;
        while (true) {
            System.out.print("Ingresa el tipo de pase ->  ");
            tipoPase = sc.next();
            tipoPase.toUpperCase();

            if (tipoPase.equals("VIP") || tipoPase.equals("EXPRESS") || tipoPase.equals("NORMAL")) {
                System.out.println("Tu pase es valido");
                return tipoPase;
            } else {
                System.out.println("Tipo de pase invalido ");
                leerTipoPase(sc);
            }

        }

    }

    // esta funcion calcula la prioridad y le da un valor (int prioridad)
    public static int calcularPrioridad(String tipoPase) {
        int prioridad = 0;

        if (tipoPase.equals("VIP")) {
            prioridad = 1;
            return prioridad;
        } else if (tipoPase.equals("EXPRESS")) {
            prioridad = 2;
            return prioridad;
        } else if (tipoPase.equals("NORMAL")) {
            prioridad = 3;
            return prioridad;
        } else {
            System.out.println("hay un error con el tipo de pase");
            return -1;
        }

    }

    // aqui recogemos el valor del tamano de grupo o numero de grupos
    public static int tamano_grupo(Scanner sc) {
        System.out.print("Ingresa el tamano del grupo --> ");
        int numGrupos = sc.nextInt();
        if (numGrupos > 0) {
            return numGrupos;

        } else {
            return tamano_grupo(sc);
        }

    }

    // la funcion buscarPosicionInserccion
    public static int buscarPosicionInserccion(String tipoPase, String[] tiposPase, int numGrupos, int prioridad) {

        int posicionInsercion;
        String pivote;

        for (int i = 0; i < tiposPase.length; i++) {
            tipoPase = tiposPase[i];

            if (tipoPase.equals("VIP")) {
                prioridad = 1;
                return prioridad;
            } else if (tipoPase.equals("EXPRESS")) {
                prioridad = 2;
                return prioridad;
            } else if (tipoPase.equals("NORMAL")) {
                prioridad = 3;
                return prioridad;
            } else {
                System.out.println("hay un error con el tipo de pase");
                return -1;
            }

        }
        return 0;
    }

    public static String nombre_persona(Scanner sc) {
        System.out.print("Ingresa el numbre del cliente actual -> ");
        String nombre = sc.next();
        return nombre;
    }

    public static void insertarEnCola(String nombe, String tipoPase, int acompaniantes, String[] nombres,
            String[] tiposPase, int acomp, int posicionInsercion, int numGrupos) {

    }

    public static boolean atenderSiguiente(String[] nombres, String[] tiposPase, int[] acomp, int numGrupos) {

        for (int i = 0; i < numGrupos - 2; i++) {
            System.out.println(nombres[i] + "-");
            System.out.println(tiposPase[i] + "-");
            System.out.println(acomp[i] + "-");
        }

        return true;

    }

    public static void mostrarCola(String[] nombres, String[] tiposPase, int[] acomp, int numGrupos,
            String nombre_actual, String tipoPase, int acompaniantes) {

        for (int i = 0; i < numGrupos; i++) {
            nombres[i] = nombre_actual;
            tiposPase[i] = tipoPase;
            acomp[i] = acompaniantes;
            System.out.print(nombres[i] + " ");
            System.out.print(tiposPase[i] + " ");
            System.out.print(acomp[i] + " ");
            System.out.print("El tamano del grupo " + (numGrupos + 1));

        }
    }

    public static void mostrarEstadisticas(String[] tiposPase, int[] acomp, int numGrupos) {
        int[] array_auxiliar = new int[numGrupos];

        for (int party : array_auxiliar) {
            System.out.println();
            System.out.println();

        }

    }

}
