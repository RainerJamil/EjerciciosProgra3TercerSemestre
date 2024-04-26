package parcial2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Queue<String> cola= new LinkedList<>();
        System.out.println("Ingrese los elementos de la cola");
        cola.add("A");
        cola.add("B");
        cola.add("C");
        cola.add("D");
        cola.add("E");
        for (String elemento :cola){
            System.out.println(elemento);
        }
        for (int i=0;i<5;i++){
            cola.remove(i);
        }
        cola.add("F");
        cola.add("G");
        cola.add("H");
        cola.add("I");
        cola.add("J");
        for (String elemento :cola){
            System.out.println(elemento);
        }
    }
}
