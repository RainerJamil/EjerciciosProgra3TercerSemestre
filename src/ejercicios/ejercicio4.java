package ejercicios;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        float R,Area;
        float PI = 3.1416F;
        System.out.println("INGRESE EL RADIO");
        R= leer.nextInt();
        Area=PI*R*R;
        System.out.println("EL AREA ES: "+Area);
    }
}
