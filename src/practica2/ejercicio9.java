package practica2;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Scanner leer1=new Scanner(System.in);
        int TI;
        String DI;
        String TU;
        float PAG;
        float IMP;
        float TOT;
        System.out.println("TIEMPO: ");
        TI= leer.nextInt();
        System.out.println("DIA: ");
        DI= leer1.nextLine();
        System.out.println("TURNO: ");
        TU= leer1.nextLine();
        if(TI<5){
            PAG=TI*1;
        } else if (TI<8) {
            PAG=(float) (((TI-5)*0.8)+5);
        } else if (TI<=10) {
            PAG=(float) (((TI-8)*0.7)+7.4);
        }else {
            PAG=(float) (((TI-10)*0.5)+8.8);
        }
        if(DI.equals("DOM")){
            IMP= (float) (PAG*0.05);
        } else if (TU.equals("M")) {
            IMP= (float) (PAG*0.15);
        }else {
            IMP= (float) (PAG*0.10);
        }
        TOT=PAG+IMP;
        System.out.println("PAGA: "+PAG);
        System.out.println("IMPUESTO: "+IMP);
        System.out.println("TOTAL "+TOT);
    }
}
