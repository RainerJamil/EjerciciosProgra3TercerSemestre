package practica2;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String TP,TI;
        int N;
        float PA=0,CA=0,TO,TOT;
        System.out.println("Ingrese el tipo de hamburguesa: ");
        TI= leer.nextLine();
        System.out.println("Tipo de pago");
        TP= leer.nextLine();
        System.out.println("numero de hamburguesas");
        N= leer.nextInt();

        if(TI.equals("sencilla")){
            PA=20;
        } else if (TI.equals("doble")) {
            PA=25;
        } else if (TI.equals("triple")) {
            PA=28;
        }
        TO=PA*N;
        if(TP.equals("tarjeta")){
            CA=TO*0.05f;
        } else if (TP.equals("efectivo")) {
            CA=0;
        }
        TOT=TO+CA;
        System.out.println("precio de hamburguesa: "+PA);
        System.out.println("total sin cargo: "+TO);
        System.out.println("total con cargo: "+CA);
        System.out.println("total: "+TOT);

    }
}
