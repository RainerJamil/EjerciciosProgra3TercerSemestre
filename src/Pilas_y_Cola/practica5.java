package Pilas_y_Cola;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class practica5 {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        for (int i = 2; i <= 20; i += 2) {
            cola.add(i);
        }
        System.out.println("Elementos cola:");
        for (Integer numero : cola) {
            System.out.println(numero);
        }
    }
}
