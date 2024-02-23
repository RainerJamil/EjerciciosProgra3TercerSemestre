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
        System.out.println("INGRESE EL CATETO FALTANTE");
        C= leer.nextFloat();

        AT=(B*(A-C))/2;
        AR=C*B;
        Area=AT+AR;
        System.out.println("EL AREA TOTAL ES: "+Area);

    }
}
