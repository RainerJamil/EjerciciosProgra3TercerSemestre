package Pilas_y_Cola;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class practica4 {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        Scanner leer=new Scanner(System.in);
        Scanner leer1=new Scanner(System.in);
        System.out.println("numero de elemenos en la cola");
        int n= leer.nextInt();
        String nombre;
        for (int i=0;i<n;i++){
            System.out.println("Ingrese el nombre");
            cola.add(nombre= leer1.nextLine());
        }
        System.out.println("Elementos cola:");
        for (String elemento : cola) {
            System.out.println(elemento);
    }
    }
}
