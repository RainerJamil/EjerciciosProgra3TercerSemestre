package examen;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ejercicio2_P2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Stack<String> pila=new Stack<>();
        boolean finalizar=false ;
        while (!finalizar){
            System.out.println("1.- Tamaño de pila");
            System.out.println("2.- Muestra el ultimo elemento");
            System.out.println("3.- Libere pila");
            System.out.println("4.- Mostrar cola");
            System.out.println("5.- Ingresar");
            System.out.println("6.- Salir");
            System.out.println("Ingrese una opcion");
            int opcion= leer.nextInt();
            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

    }

}
