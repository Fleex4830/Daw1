package EXAMEN_PT1;

import java.util.Scanner;

public class TresEnRaya {

    public static void main(String[] args) {

        char[][] tablero = new char[3][3];

        char turno = 'X';

        boolean fin = false;

        inicializar(tablero);

        Scanner sc = new Scanner(System.in);

        while (!fin) {

            mostrarTablero(tablero);

            System.out.println("Turno de " + "--[" + turno + "]--");

            // TODO: pedir la jugada al usuario y colocar la ficha

            pedirJugada(tablero, turno, sc);

            // TODO: comprobar si hay ganador

            if (hayGanador(tablero, turno)) {

                mostrarTablero(tablero);

                System.out.println("Ha ganado " + "[" + turno + "]");

                fin = true;

            } else if (tableroLleno(tablero)) {

                // TODO: comprobar si hay empate

                mostrarTablero(tablero);

                System.out.println("Empate");

                fin = true;

            } else {

                // TODO: cambiar de turno

                turno = cambiarTurno(turno);

            }

        }

        sc.close();

    }

    // Inicializa el tablero con espacios

    static void inicializar(char[][] t) {
        System.out.println(t.length);

        // de esta manera recorremos el arreglo y reemplzamos en la posicion [i][j] por
        // un espacio
        // utilizamos comillas simples por que en char es como se utiliza
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                t[i][j] = '/';
            }
        }
        // TODO: rellenar el tablero con ' '

    }

    // Muestra el tablero por pantalla

    static void mostrarTablero(char[][] t) {

        // TODO: imprimir el tablero en formato 3x3

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + t[i][j] + "]");
            }
            System.out.println();
        }
    }

    // Pide una jugada válida (fila, columna) y coloca la ficha

    static void pedirJugada(char[][] t, char jugador, Scanner sc) {
        boolean prueba;
        System.out.print("Ingresa la fila --> ");
        int fila = sc.nextInt();
        System.out.println();
        System.out.print("Ingresa la columna --> ");
        int columna = sc.nextInt();

        if (t[fila][columna] == '/') {
            System.out.println("casilla vacia ");
            t[fila][columna] = jugador;
        } else {
            System.out.println("casilla llena");
            pedirJugada(t, jugador, sc);

        }

        // TODO: pedir fila y columna y validar que la casilla está vacía

    }

    // Devuelve true si el jugador tiene 3 en raya

    static boolean hayGanador(char[][] t, char jugador) {

        for (int i = 0; i < 3; i++) {
            if (t[i][0] == jugador && t[i][1] == jugador && t[i][2] == jugador) {
                return true;

            }
            for (int j = 0; j < 3; j++) {
                if (t[0][j] == jugador && t[1][j] == jugador && t[2][j] == jugador) {
                    return true;

                }
            }
        }

        if (t[0][0] == jugador && t[1][1] == jugador && t[2][2] == jugador) {
            return true;
        }

        if (t[2][0] == jugador && t[0][2] == jugador && t[1][1] == jugador) {
            return true;
        }
        // TODO: comprobar filas, columnas y diagonales

        return false;

    }

    // Devuelve true si el tablero no tiene casillas libres

    static boolean tableroLleno(char[][] t) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t[i][j] == '/') {

                    return false;
                }
            }
        }
        // TODO: devolver true si no hay espacios ' '
        System.out.println("---TABLERO LLENO --- ");
        return true;

    }

    // Devuelve el siguiente jugador

    static char cambiarTurno(char turnoActual) {

        return (turnoActual == 'X') ? 'O' : 'X';
        // TODO: devolver 'O' si es 'X' y 'X' si es 'O'

    }

}
