package practica2;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int NA;
        float PA;
        float TOT;
        System.out.println("numero de estudiates ");
        NA= leer.nextInt();
        if(NA>=100){
           PA=65;
        }else if (NA>=50){
            PA=70;
        } else if (NA>=30) {
            PA=95;
        }else {
            PA=4000/NA;
        }
        TOT=PA*NA;
        System.out.println("El pago individual es: "+PA);
        System.out.println("El pago total es: "+TOT);
    }
}
