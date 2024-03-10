package practica2;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        float LA,AC,NC;
        int TT;
        System.out.println("Ingrese el tipo de tarjeta");
        TT= leer.nextInt();
        System.out.println("Ingrese el limite de credito");
        LA= leer.nextFloat();
        if(TT==1){
            AC=LA*0.25F;
        } else if (TT==2) {
            AC=LA*0.35F;
        } else if (TT==3) {
            AC=LA*0.40F;
        }else {
            AC=LA*0.50F;
        }
        NC=LA+AC;
        System.out.println("El aumento de credito es: "+AC);
        System.out.println("Nuevo limite de credito es: "+NC);
    }
}
