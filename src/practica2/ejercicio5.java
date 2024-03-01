package practica2;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A,B,C,M;
        System.out.println("numero 1");
        A= leer.nextInt();
        System.out.println("numero 2");
        B= leer.nextInt();
        System.out.println("numero 3");
        C= leer.nextInt();
        if((A>B)){
            if(A>C){
                M=A;
                System.out.println("El numero mayor es "+M);
            }else{
                M=C;
                System.out.println("El numero mayor es "+M);
            }
        }else{
            if(B>C){
                M=B;
                System.out.println("El numero mayor es "+M);
            }else {
                M=C;
                System.out.println("El numero mayor es "+M);
            }
        }
    }
}
