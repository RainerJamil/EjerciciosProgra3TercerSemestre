package practica1;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int A,B,Area;
        System.out.println("INGRESE LA ALTURA");
        A= leer.nextInt();
        System.out.println("INGRESE LAS BASE");
        B= leer.nextInt();
        Area=B*A;
        System.out.println("EL AREA ES: "+Area);
    }
}
