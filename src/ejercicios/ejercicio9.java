package ejercicios;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        float HT,PH,SS;
        System.out.println("HORAS TRABAJADAS");
        HT=leer.nextFloat();
        System.out.println("PAGO POR HORA");
        PH=leer.nextFloat();
        SS=HT*PH;
        System.out.println("EL SUELDO ES: "+SS);
    }
}
