package ejercicios;

import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        float R,H,C,AT,AC,Area;
        float PI= 3.1416F;
        System.out.println("INGRESE LA BASE DEL RECTANGULO Y RADIO");
        R= leer.nextFloat();
        System.out.println("INGRESE LA HIPOTENUSA DEL TRIANGULO");
        H= leer.nextFloat();

        C= (float) Math.sqrt(Math.pow(H,2)-Math.pow(R,2));
        AT=(2*R*C)/2;
        AC=(PI*R*R)/2;
        Area=AT+AC;
        System.out.println("EL AREA TOTAL ES: "+Area);

    }
}
