package parcial2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class animal_ejer8 {
    LinkedList<String> cola= new LinkedList<>();
    public animal_ejer8(){
    }
    public void leerNom(){
        Scanner leer =new Scanner(System.in);
        System.out.println("Ingrese el nombre del animal");
        cola.add(leer.nextLine());
    }
    public void eliminar(String nombre){
        cola.remove(nombre);
    }

}
