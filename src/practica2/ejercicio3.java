package practica2;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int X;
        float PAG;
        System.out.print("Ingrese la cantidad de lapices :");
        X= leer.nextInt();
        if(X>=1000){
            PAG=(float)(X*0.85);
            System.out.println("el precio para "+X+" es de "+PAG);
        }else{
            PAG=(float)(X*0.90);
            System.out.println("el precio para "+X+" es de "+PAG);
        }
    }
}
