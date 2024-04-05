package practica4;

import java.util.Scanner;

public class ejercicio3vector {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n;
        System.out.println("INGRESE LOS NUMERO DE ELEMENTOS");
        n= leer.nextInt();
        System.out.println("INGRESE EL VECTOR A");
        int [] A=new int[n];
        for (int i =0;i<n;i++){
            A[i]= leer.nextInt();
        }
        System.out.println("INGRESE EL VECTOR B");
        int [] B=new int[n];
        for (int i =0;i<n;i++){
            B[i]= leer.nextInt();
        }
        System.out.println("VECTOR C");
        int [] C=new int[n];
        for (int i =0;i<n;i++){
            C[i]= A[i]+B[i];
            System.out.println(C[i]);
        }

    }
}
