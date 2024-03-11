package practica3;

import java.util.Scanner;

public class ejercicio4doWhile {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int C=0,ED,SU=0,NU;
        float PR;
        System.out.println("Ingrese los numeros de alumnos");
        NU= leer.nextInt();
        do {
            C++;
            System.out.println("Ingrese la edad del alumno "+C+" :");
            ED= leer.nextInt();
            SU=SU+ED;
        }while (C<NU);
        PR= (float) SU /NU;
        System.out.println("El promedio de edad es: "+PR);
    }
}
