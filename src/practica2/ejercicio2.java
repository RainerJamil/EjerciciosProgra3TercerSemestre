package practica2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        int NUM;
        String R;
        System.out.println("ingrese los numeros ");
        NUM= leer.nextInt();
        if(NUM>=0){
            R="POSITIVO";
            System.out.println("El numero es "+R);
        }else {
            R="NEGATIVO";
            System.out.println("El numero es "+R);
        }
    }
}
