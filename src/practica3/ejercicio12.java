package practica3;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int A=0,B=0,C=0;
        float N,CN=1,V,T1=0,T2=0,T3=0,TT=0;
        System.out.println("Ingrese el numero de ventas: ");
        N= leer.nextInt();
        while (CN<=N){
            System.out.println("Ingrese el monto");
            V= leer.nextFloat();
            if(V>1000){
                T1=T1+V;
                A++;
            } else if (V>500) {
                T2=T2+V;
                B++;
            } else if (V>0) {
                T3=T3+V;
                C++;
            }
            CN++;
        }
        TT=T1+T2+T3;
        System.out.println("Total de ventas: "+TT);
        System.out.println("Numero de ventas A: "+A+" Toltal de  ventas A :"+T1);
        System.out.println("Numero de ventas A: "+B+" Toltal de  ventas B :"+T2);
        System.out.println("Numero de ventas A: "+C+" Toltal de  ventas C :"+T3);
    }
}
