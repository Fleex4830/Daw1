package EXAMEN1;

import java.util.Scanner;

public class FunWorld {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion_menu, numGrupos, prioridad, acompaniantes = 0;
        String nombre_actual = null;
        String tipoPase = null;

        numGrupos = Funciones.tamano_grupo(sc);
        String[] tiposPase = new String[numGrupos];
        String[] nombres = new String[numGrupos];
        int[] acomp = new int[numGrupos];

        do {

            Funciones.menu();
            opcion_menu = Funciones.dato_menu(sc);

            switch (opcion_menu) {
                case 1:

                    System.out.println("ABRIENDO OPICON 1");
                    nombre_actual = Funciones.nombre_persona(sc);
                    System.out.println();
                    acompaniantes = Funciones.leerEnteroPosito(sc, "Ingresa el numero de acompañantes->");
                    tipoPase = Funciones.leerTipoPase(sc);
                    Funciones.calcularPrioridad(tipoPase);

                    break;
                case 2:
                    System.out.println("ABRIENDO OPCION 2");
                    System.out.println("Se esta atendiendo al grupo de -> " + nombre_actual);

                    break;

                case 3:
                    System.out.println("ESTAMOS ATENDIENDO A  ->" + nombre_actual);

                    Funciones.mostrarCola(nombres, tiposPase, acomp, numGrupos, nombre_actual, tipoPase, acompaniantes);

                    break;

                case 4:

                    break;

                default:
                    break;
            }

        } while (opcion_menu != 5);
    }

}
