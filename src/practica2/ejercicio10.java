package practica2;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String TI;
        int KM,NPR,NP;
        float CK = 0,CP,TO;
        System.out.println("TIPO DE AUTOBUS: ");
        TI= leer.nextLine();
        System.out.println("KILOMETROS POR RECORRER: ");
        KM= leer.nextInt();
        System.out.println("NUMERO DE PERSONAS REAL: ");
        NPR= leer.nextInt();
        if(TI.equals("A")){
            CK=2.0F;
        } else if (TI.equals("B")) {
            CK=2.5F;
        } else if (TI.equals("C")) {
            CK=3.0F;
        }
        if(NPR<20){
            NP=20;
        }else {
            NP=NPR;
        }
        TO=NP*CK*KM;
        CP=TO/NPR;
        System.out.println("la persona pagara : "+CP);
        System.out.println("costo de viaje: "+TO);
    }
}
