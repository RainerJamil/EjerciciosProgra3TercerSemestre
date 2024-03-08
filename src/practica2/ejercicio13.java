package practica2;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int C;
        float MP,MO,GF,CP,PV;
        System.out.println("costo de materia prima: ");
        MP= leer.nextFloat();
        System.out.println("clave del articulo");
        C= leer.nextInt();
        if((C==3) || (C==4)){
            MO=MP*0.75F;
        } else if ((C==1)||(C==5)) {
            MO=MP*0.80F;
        }else {
            MO=MP*0.85F;
        }
        if ((C==2)||(C==5)) {
            GF=MP*0.30F;
        } else if ((C==3)||(C==6)) {
            GF=MP*0.35F;
        }else {
            GF=MP*0.28F;
        }
        CP=MP+MO+GF;
        PV=CP+CP*0.45F;
        System.out.println("el costo de produccion: "+CP);
        System.out.println("el precio de vente: "+PV);
    }
}
