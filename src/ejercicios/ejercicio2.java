package ejercicios;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        float C1,C2,C3,C4,S,P;
        System.out.println("INGRESE LA PRIMER NOTA");
        C1= leer.nextInt();
        System.out.println("INGRESE LA PRIMER NOTA");
        C2= leer.nextInt();
        System.out.println("INGRESE LA PRIMER NOTA");
        C3= leer.nextInt();
        System.out.println("INGRESE LA PRIMER NOTA");
        C4= leer.nextInt();
        S=C1+C2+C3+C4;
        System.out.println("LA SUMA TOTAL ES: "+S);
        P=S/4;
        System.out.println("EL PROMEDIO ES: "+P);

    }
}
