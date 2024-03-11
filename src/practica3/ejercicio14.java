package practica3;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int N;
        float HT,PH,SS;
        float TT=0;
        System.out.println("Ingrese el numero de trabajadores: ");
        N= leer.nextInt();
        for (int I=1;I<=N;I++){
            System.out.println("Ingrese las horas trabajadas del trabajador "+I);
            HT= leer.nextFloat();
            System.out.println("Ingrese el pago por hora del trabajador "+I);
            PH= leer.nextFloat();
            SS=HT*PH;
            TT=TT+SS;
        }
        System.out.println("EL total de pago de todos los trabajadores es: "+TT);
    }
}
