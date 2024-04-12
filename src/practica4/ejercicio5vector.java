package practica4;

import java.util.Scanner;

public class ejercicio5vector {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese numero de productos");
        int n= leer.nextInt();
        int A[]=new int[n];
        int B[]=new int[n];
        int C[]=new int[n];
        System.out.println("PRODUCTOS");
        for (int i=0;i<n;i++){
            A[i]= leer.nextInt();
        }
        System.out.println("PEDIDOS");
        for (int i=0;i<n;i++){
            B[i]= leer.nextInt();
        }
        for (int i=0;i<n;i++){
           if(A[i]==B[i]){
               C[i]=A[i];
           }
            if(B[i]>A[i]){
                C[i]=2*(B[i]-A[i]);
            }
            if(A[i]>B[i]){
                C[i]=B[i];
            }
        }
        System.out.println("A: ");
        for (int i=0;i<n;i++){
            System.out.print(" "+A[i]);
        }
        System.out.println();
        System.out.println("B: ");
        for (int i=0;i<n;i++){
            System.out.print(" "+B[i]);
        }
        System.out.println();
        System.out.println("C: ");
        for (int i=0;i<n;i++){
            System.out.print(" "+C[i]);
        }
    }
}
