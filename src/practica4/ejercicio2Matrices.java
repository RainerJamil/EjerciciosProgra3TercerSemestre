package practica4;

import java.util.Scanner;

public class ejercicio2Matrices {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int NC=0;
        System.out.println("numero de filas");
        int fila= leer.nextInt();
        System.out.println("numero de columnas");
        int columna= leer.nextInt();
        System.out.println("Ingrese los numeros");
        int [][]V=new int[fila][columna];
        for (int i=0;i<fila;i++){
            for (int j=0;j<columna;j++){
                V[i][j]= leer.nextInt();
            }
        }
        for (int i=0;i<fila;i++){
            for (int j=0;j<columna;j++){
                if(V[i][j]==0){
                    NC++;
                }
                System.out.print(V[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println("La cantidad de ceros que posee la matriz es: "+NC);
    }
}
