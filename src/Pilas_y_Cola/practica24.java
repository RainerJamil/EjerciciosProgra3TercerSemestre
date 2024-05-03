package Pilas_y_Cola;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class practica24 {
    public static void main(String[] args) {
        ArrayList<String> Lista=new ArrayList<>();
        Lista.add("Z");
        Lista.add("C");
        Lista.add("A");
        Lista.add("B");
        Lista.add("E");
        System.out.println("Lista: "+Lista);
        Collections.sort(Lista);
        System.out.println("Lista ordenada: "+Lista);
    }
}
