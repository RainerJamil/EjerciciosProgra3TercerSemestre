package Metodos_Funciones;

import java.util.Scanner;

public class ejercicio2 {

        public static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {
            int fila = matriz1.length;
            int columna = matriz1[0].length;
            int[][] resultado = new int[fila][columna];
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    resultado[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            }
            return resultado;
        }

        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el tamaño de la matriz");
            System.out.println("Filas:");
            int fila = leer.nextInt();
            System.out.println("Columnas:");
            int columna = leer.nextInt();
            int[][] matriz1 = new int[fila][columna];
            int[][] matriz2 = new int[fila][columna];
            System.out.println("Ingrese los elementos de la primera matriz:");
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    matriz1[i][j] = leer.nextInt();
                }
            }
            System.out.println("Ingrese los elementos de la segunda matriz:");
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    matriz2[i][j] = leer.nextInt();
                }
            }
            int[][] resultado = sumaMatrices(matriz1, matriz2);
            System.out.println("Matriz resultante:");
            for (int i = 0; i < resultado.length; i++) {
                for (int j = 0; j < resultado[0].length; j++) {
                    System.out.print(resultado[i][j] + " ");
                }
                System.out.println();
            }
        }

}
