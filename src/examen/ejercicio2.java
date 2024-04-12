package examen;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int contMayor=0;
        int contMenor=0;
        int contCero=0;
        System.out.println("ingrese las cantidad");
        int N= leer.nextInt();
        System.out.println("ingrese los numeros");
        for (int i=0;i<N;i++){
            int numero= leer.nextInt();
            if(numero>0){
                contMayor++;
            }else if(numero<0) {
                contMenor++;
            } else if (numero==0) {
                contCero++;
            }
        }
        System.out.println("numeros mayores a cero: "+contMayor);
        System.out.println("numeros menores a cero: "+contMenor);
        System.out.println("numeros iguales a cero: "+contCero);
    }
}
