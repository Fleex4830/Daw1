package UNIT3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int opcion = -1;  // inicializo opción
        String nombre = "";  // variable para guardar nombre


        do {
            mostrarMenu();
            opcion = leerOpcion(sc);
            // ejecuto la opcion elegida
            switch (opcion) {
                case 1:
                    leerNombre(sc);
                    break;
                case 2:
                    sumaNumeros(sc);
                    
                    break;
                case 3:
                    conversion(sc);
                    break;
                case 4:
                    adivina(sc);   
                    break;
                case 5:     
                    areaTriangulo(sc);
                    break;
                case 6:
                    circulo(sc);
                    break;
                case 7:
                factorial(sc);
                break;
                case 8: 
                palindromo(sc);
                break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida, intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }

    // función para leer opción del menú
    public static int leerOpcion(Scanner sc) {
        System.out.print("Elige una opcion: ");
        return sc.nextInt();
    }

    // función para mostrar menú
    public static void mostrarMenu() {
        System.out.println("### MENU EJERCICIOS FUNCIONES ###");
        System.out.println("OPCION 1 --> NOMBRE EN PANTALLA");
        System.out.println("OPCION 2 --> SUMA DE DOS NUMEROS");
        System.out.println("OPCION 3 --> CONVERSION TEMPERATURA");
        System.err.println("OPCION 4 --> IDENTIFICADOR DE PAR O IMPAR ");
        System.out.println("OPCION 5 --> AREA DE UN TRIANGULO");
        System.out.println("OPCION 6 --> LONGITUD Y AREA CIRCUNFERENCIA ");
        System.out.println("OPCION 7 --> FACOTRIAL ");
        System.out.println("OPCION 8 --> PALINDROMO ");
        System.out.println("OPCION 0 --> SALIR");
        System.out.println();
    }

    // función para leer nombre
    public static String leerNombre(Scanner sc) {
        sc.nextLine();  // limpiar buffer del scanner
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Nombre ingresado: " + nombre);
        return nombre;
    }

    // funcion que devuelve la suma de dos numeros 
    public static int sumaNumeros(Scanner sc){
        sc.nextLine();
        System.out.print("Ingresa numero a: ");
        int a = sc.nextInt();
        System.out.print("Ingresa numero b: ");
        int b = sc.nextInt();
        int suma = a + b ;
        System.out.println("Resultado de la suma es: "+ suma );
        return suma ;
    }

    //función que convierta grados Celsius a Fahrenheit
    public static double conversion (Scanner sc){
        sc.nextLine();
        System.out.print("Ingresa el valor del Celsius: ");
        double celsiusTemp = sc.nextDouble();
        double fahrenheitTemp = (celsiusTemp * 1.8 ) + 32 ;
        System.out.println(" EL resultado es: F = "+ fahrenheitTemp);
        return fahrenheitTemp;

    }

    //funcion que ingresa un numero eh indica si es par o impar devolviendo false o true 
    public static boolean adivina(Scanner sc ){
        sc.nextLine();
        System.out.print("Ingresa un numero n: ");
        int num  = sc.nextInt();
        boolean parOimpar = true ;

        if(num %2 ==0 ){
            
            System.out.println("numero par: "+ num + " --> " + parOimpar );
            return true ; 

        }else {
            parOimpar = false ;
            System.out.println("numero impar: "+ num + " --> " + parOimpar);
            return false ;
        }
        
    }

    //funcion que calcule el area de un triangulo 
    public static double areaTriangulo(Scanner sc ){
        sc.nextLine() ;
        System.out.print(" Ingresa la base: ");
        double base = sc.nextDouble();
        System.out.print("Ingresa la altura: ");
        double altura = sc.nextDouble();
        double area = (base * altura )/ 2 ;
        System.out.println("El area del Triangulo es: "+ area);
        return area ;
    }

    //pide el radio y con ello dame la longitud y area.
    public static  double circulo (Scanner sc){
        sc.nextLine();
        System.out.print("Ingresa el radio de la circunferencia: ");
        double radio = sc.nextDouble(); 
        double cirCLongitud = 2*Math.PI*radio;
        System.out.println("La longitud del circulo es: " + cirCLongitud);
        double circArea = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: "+ circArea);

        return radio ;
    }

    //funcion recursiva que haga los facotriales de un numero 
    public static  int factorial(Scanner sc){
        System.out.print("Ingresa un nunmero n: ");
        int num = sc.nextInt();
        int factorial =1 ;
        
        for(int i=1; i<=num ; i++){
            factorial = factorial * i;
    
        }
        System.out.println("El Factorial de "+ num +"!"+ " = "+ factorial );
        return factorial ;
    }

    //funcion palindromo 
    public static String palindromo (Scanner sc){
        sc.nextLine();
        System.out.print("Ingresa una palabra cualquiera:  ");
        String palabra = sc.nextLine().toLowerCase();
        String invertido = new StringBuilder(palabra).reverse().toString();
    

        if (palabra.equals(invertido)){
            System.out.println("Es palindormo ");
        
        }else{
            System.out.println("No es palindromo ");
        }
        return palabra;
    
    }

}
