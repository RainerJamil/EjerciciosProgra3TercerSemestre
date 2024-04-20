package Pilas_y_Cola;
import java.util.LinkedList;
import java.util.Queue;
public class practica2 {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            cola.add(i);
        }
        System.out.println("Elementos cola:");
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}
