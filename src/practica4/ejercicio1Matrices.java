package practica4;

import java.util.Scanner;

public class ejercicio1Matrices {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el numero de alumnos");
        int N= leer.nextInt();
        System.out.println("Ingrese el numero de materias");
        int M= leer.nextInt();
        int[][] CAL =new int[N][M];
        for (int i=0;i<N;i++){
            System.out.println("Alumno: "+(i+1));
            for (int j=0;j<M;j++){
                System.out.println("Nota Materia: "+(j+1));
                CAL[i][j]= leer.nextInt();

            }
        }
        for (int i=0;i<N;i++){
            for (int j=0;j<M;j++){
                System.out.print(CAL[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}
