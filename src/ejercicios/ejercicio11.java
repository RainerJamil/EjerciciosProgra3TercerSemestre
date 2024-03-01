package ejercicios;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        int A,L,N,CM,V,PAG;
        System.out.println("INGRESE LA ALTURA DE LA ALBERCA");
        A=leer.nextInt();
        System.out.println("INGRESE LA LARGO DE LA ALBERCA");
        L=leer.nextInt();
        System.out.println("INGRESE LA ANCHO DE LA ALBERCA");
        N=leer.nextInt();
        V=(L*A*N);
        System.out.println("PRECIO POR METRO CUBICO");
        CM=leer.nextInt();
        PAG=V*CM;
        System.out.println("EL PAGO POR EL CONSUMO ES: "+PAG);
    }
}
