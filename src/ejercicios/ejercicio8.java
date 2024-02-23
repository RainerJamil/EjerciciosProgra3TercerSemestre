package ejercicios;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        float X1,X2,Y1,Y2,X,Y,D;
        System.out.println("INGRESE LAS COORDENADAS DEL PRIMER PUNTO (X1,Y1)");
        X1= leer.nextFloat();
        Y1= leer.nextFloat();
        System.out.println("INGRESE LAS COORDENADAS DEL SEGUNDO PUNTO (X2,Y2)");
        X2= leer.nextFloat();
        Y2= leer.nextFloat();
        X=X2-X1;
        Y=Y2-Y1;
        D=(float)Math.sqrt((X*X)+(Y*Y));
        System.out.println("LA DISTANCIA ES: "+D);
    }
}
