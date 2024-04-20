package Metodos_Funciones;

import java.util.Scanner;

public class ejercicio1 {
        public static boolean esPalindromo(String cadena) {
            cadena = cadena.toLowerCase().replaceAll("\\s+", "");
            return cadena.equals(new StringBuilder(cadena).reverse().toString());
        }
        public static void main(String[] args) {
            Scanner leer=new Scanner(System.in);
            System.out.println("Ingrese la palabra");
            String palabra = leer.nextLine();
            if (esPalindromo(palabra)) {
                System.out.println("Sí es palíndromo");
            } else {
                System.out.println("No es palíndromo");
            }
        }

}
