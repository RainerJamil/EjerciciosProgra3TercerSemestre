package practica3;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int D=1,SH=0,HT;
        float PH,SU;
        System.out.println("Ingrese el pago por hora");
        PH= leer.nextFloat();
        while (D<=6){
            System.out.println("Horas trabajadas dia "+D);
            HT= leer.nextInt();
            SH=SH+HT;
            D++;
        }
        SU=SH*PH;
        System.out.println("horas trabajadas: "+SH);
        System.out.println("sueldo: "+SU);

    }
}
