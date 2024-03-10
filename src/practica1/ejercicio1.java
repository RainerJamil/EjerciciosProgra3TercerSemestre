package practica1;
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int A,B,S;
        System.out.println("INGRESE EL PRIMER NUMERO");
        A= leer.nextInt();
        System.out.println("INGRESE EL PRIMER NUMERO");
        B= leer.nextInt();
        S=A+B;
        System.out.println("LA SUMA ES: "+S);
    }
}
