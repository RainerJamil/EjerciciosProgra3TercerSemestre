package practica1;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        int CM,PG;
        System.out.println("CANTIDA DE METROS QUE REQUIERE");
        CM=leer.nextInt();
        PG= (int) (CM/0.0254);
        System.out.println("CANTIDA DE PULGADAS QUE REQUIERE ES: "+PG);
    }
}
