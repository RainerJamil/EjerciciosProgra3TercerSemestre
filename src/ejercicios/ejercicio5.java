package ejercicios;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        float B,A,C,AT,AR,Area;
        System.out.println("INGRESE LA BASE DEL TRIANGULO");
        B= leer.nextFloat();
        System.out.println("INGRESE LA ALTURA DEL TRIANGULO Y RECTANGULO UNIDOS");
        A= leer.nextFloat();
        System.out.println("INGRESE LA ALTURA RECTANGULO");
        C= leer.nextFloat();
        AT=(B*(A-C))/2;
        AR=C*B;
        Area=AT+AR;
        System.out.println("EL AREA TOTAL ES: "+Area);

    }
}
