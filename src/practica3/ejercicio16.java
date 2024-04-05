package practica3;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        float TT=0,ST,SE,VE;
        int CI,TI,EM,I,J,K;
        System.out.println("ciudad donde tiene tiendas:");
        CI= leer.nextInt();
        for(I=0;I<CI;I++){
            System.out.println("numero de tiendas  en la ciudad "+(I+1));
            TI= leer.nextInt();
            ST=0;
            for (J=0;J<TI;J++){
                System.out.println("numero de empleados en la tienda "+(J+1));
                EM= leer.nextInt();
                SE=0;
                for (K=0;K<EM;K++){
                    System.out.println("venta realizada por el empleado "+(K+1));
                    VE= leer.nextFloat();
                    SE=SE+VE;
                }
                System.out.println("venta total de la tienda es : "+SE);
                ST=ST+SE;
            }
            System.out.println("venta total en la ciudad es : "+ST);
            TT=TT+ST;
        }
        System.out.println("venta total es : "+TT);
    }
}
