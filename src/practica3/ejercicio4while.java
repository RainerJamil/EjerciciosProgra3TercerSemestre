package practica3;

import java.util.Scanner;

public class ejercicio4while {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int C=1,ED,SU=0,NU;
        float PR;
        System.out.println("Ingrese los numeros de alumnos");
        NU= leer.nextInt();
        while(C<=NU){
            System.out.println("Ingrese la edad del alumno "+C+" :");
            ED= leer.nextInt();
            SU=SU+ED;
            C++;
        }
        PR= (float) SU /NU;
        System.out.println("El promedio de edad es: "+PR);
    }
}

