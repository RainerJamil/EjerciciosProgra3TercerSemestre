package Metodos_Funciones;

import java.util.Scanner;

public class ejercicio3 {
        public static int calcularFactorial(int num) {

            int fac= 1;
            for (int i = 1; i <= num; i++) {
                fac =fac* i;
            }
            return fac;
        }
        public static void main(String[] args) {
            Scanner leer=new Scanner(System.in);
            System.out.println("ingrese el numero");
            int num = leer.nextInt();
            int fac= calcularFactorial(num);
            System.out.println("El factorial de" +num+" es: "+fac);
        }
    }


