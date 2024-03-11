package practica3;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        int C=1;
        float SU=0;
        float VA;
        do {
            System.out.println("Ingrese el valor a sumar");
            VA= leer.nextFloat(); ;
            SU=SU+VA;
            C=C+1;
        } while (C<=10);{
            System.out.println(SU);
        }
    }
}
