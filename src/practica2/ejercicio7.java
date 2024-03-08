package practica2;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String TI;
        int TA;
        float P;
        int K;
        float GA;
        System.out.println("Ingrese el tipo de uva: ");
        TI= leer.nextLine();
        System.out.println("Ingrese el tamaño de uva: ");
        TA= leer.nextInt();
        System.out.println("Ingrese el precio de la uva: ");
        P= leer.nextFloat();
        System.out.println("Ingrese el kilo de produccion: ");
        K= leer.nextInt();
        if(TI.equals("A")){
            if(TA==1){
                P=(float) (P+0.20);
            } else if (TA==2) {
                P= (float) (P+0.30);
            }
        } else if (TI.equals("B")) {
            if(TA==1){
                P= (float) (P-0.30);
            } else if (TA==2) {
                P= (float) (P-0.50);
            }
        }
        GA= (K * P);
        System.out.println("La ganacia es: "+GA);
    }
}
