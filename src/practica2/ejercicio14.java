package practica2;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int NZ,PE;
        float CO = 0;
        System.out.println("Ingrese la zona: ");
        NZ= leer.nextInt();
        System.out.println("Ingrese el peso: ");
        PE= leer.nextInt();
        if(PE<5000){
            if(NZ==1){
                CO=11*PE;
            } else if (NZ==2) {
                CO=10*PE;
            } else if (NZ==3) {
                CO=12*PE;
            } else if (NZ==4) {
                CO=24*PE;
            } else if (NZ==5) {
                CO=27*PE;
            }
            System.out.println("El precio es: "+CO);
        }else {
            System.out.println("NO SE DA SERVICIO");
        }
    }
}
