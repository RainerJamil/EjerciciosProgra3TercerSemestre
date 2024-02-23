package ejercicios;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int L;
        float PG,TG,GA;
        System.out.println("CANTIDAD DE LITROS QUE PRODUCE");
        L= leer.nextInt();
        System.out.println("PRECIO DE GALON");
        PG= leer.nextFloat();
        TG= (float) (L/3.785);
        GA=TG*PG;
        System.out.println("LA GANANCIA ES: "+GA);
    }
}
