package practica2;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        int A,B;
        System.out.println("ingrese los numeros a comparar");
        A= leer.nextInt();
        B= leer.nextInt();
        if(A>B){
            System.out.println("El numero mayor es: "+A);
        }else {
            System.out.println("El numero mayor es: "+B);
        }
    }
}
