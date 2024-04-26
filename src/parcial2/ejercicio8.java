package parcial2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        animal_ejer8 animal=new animal_ejer8();
        for (int i =0; i<4;i++){
            animal.leerNom();
        }
        for (String elemento: animal.cola){
            System.out.println(elemento);
        }
        System.out.println("eliminar nombre");
        animal.eliminar(leer.nextLine());

        for (String elemento: animal.cola){
            System.out.println(elemento);
        }
    }
}
