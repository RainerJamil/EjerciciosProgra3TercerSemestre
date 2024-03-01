package practica2;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int NP;
        float TOT;
        System.out.println("INGRESE LA CANTIDA DE PLATOS");
        NP= leer.nextInt();

        if(NP>300){
            TOT=NP*75;

        }else {
            if (NP > 200) {
                TOT = NP * 85;
            } else {
                TOT=NP*95;
            }
        }
        System.out.println("El total es: "+TOT);
    }
}
