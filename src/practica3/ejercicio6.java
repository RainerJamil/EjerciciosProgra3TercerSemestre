package practica3;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        float AH=0;
        int M=1;
        int CA;
        while (M<=12){
            System.out.println("Ingrese la cantidad que se ahorra");
            CA= leer.nextInt();
            AH=AH+CA;
            M++;
        }
        System.out.println("ahorro logrado: "+AH);
    }
}
