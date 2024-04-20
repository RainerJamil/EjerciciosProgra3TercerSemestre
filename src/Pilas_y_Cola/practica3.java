package Pilas_y_Cola;
import java.util.LinkedList;
import java.util.Queue;
public class practica3 {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        cola.add("manzana");
        cola.add("pera");
        cola.add("naranja");
        cola.add("plátano");

        System.out.println("Elementos cola:");
        for (String elemento : cola) {
            System.out.println(elemento);
        }
    }
}
