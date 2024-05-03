package Pilas_y_Cola;

import java.util.Stack;

public class practica14 {
    public static void main(String[] args) {
        Stack <Integer> pila=new Stack<>();
        pila.add(1);
        pila.add(2);
        pila.add(3);
        pila.add(4);
        for(Integer elemento:pila){
            System.out.println(elemento);
        }
        System.out.println("PILA INVERSA");
        while (!pila.isEmpty() ){
            System.out.println(pila.pop());
        }
    }
}
