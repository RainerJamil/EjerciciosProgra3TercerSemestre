package practica2;
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double CT,DE,PF;
        System.out.println("Ingrese el costo del traje");
        CT= leer.nextDouble();
        if(CT>2500){
            DE=CT*0.15;
        }else{
            DE=CT*0.08;
        }
        PF=CT-DE;
        System.out.println("El precio final es: "+PF);
        System.out.println("El descuento es: "+DE);
    }
}
