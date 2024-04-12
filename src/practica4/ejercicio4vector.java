package practica4;

import java.util.Scanner;

public class ejercicio4vector {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Scanner leer1=new Scanner(System.in);
        System.out.println("NUMERO DE ESTUDIANTES");
        int A= leer.nextInt();
        double []P=new double[A];
        String[]N=new String[A];
        for (int I=0; I<A;I++){
            System.out.println("ALUMNO "+(I+1)+": INGRESE EL NOMBRE");
            N[I]= leer1.nextLine();
            System.out.println("INGRESE EL PROMEDIO");
            P[I]= leer.nextDouble();
        }
        for (int i = 0; i < A; i++) {
            for (int j = i + 1; j < A; j++) {
                if (P[j] > P[i]) {

                    String NA = N[i];
                    N[i] = N[j];
                    N[j] = NA;

                    double PA = P[i];
                    P[i] = P[j];
                    P[j] = PA;
                }

            }
        }
        for (int i=0;i<A;i++){
            System.out.println("NOMBRE: "+N[i]);
            System.out.println("PROMEDIO: "+P[i]);
        }
    }
}
