package parcial2;

import java.util.LinkedList;
import java.util.Queue;

public class ejercicio6 {
    public static void main(String[] args) {
        Queue<Integer>cola= new LinkedList<>();
        for(int i =1;i<20;i=i+2){
            cola.add(i);
        }
        while (!cola.isEmpty()){
            System.out.println(cola.poll());
        }
    }
}
