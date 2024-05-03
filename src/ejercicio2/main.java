package ejercicio2;

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Scanner leer1=new Scanner(System.in);
        Stack<Libro> pila=new Stack<>();
        boolean finalizar=false ;
        while (!finalizar){
            System.out.println("1.- Tamaño de pila");
            System.out.println("2.- Muestra el ultimo elemento");
            System.out.println("3.- Libere pila");
            System.out.println("4.- Mostrar pila");
            System.out.println("5.- Ingresar");
            System.out.println("6.- Salir");
            System.out.println("Ingrese una opcion");
            int opcion= leer.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("tiene "+pila.size());
                    break;
                case 2:
                    System.out.println(pila.peek().Autor);
                    System.out.println(pila.peek().Categoria);
                    System.out.println(pila.peek().NombreLibro);
                    break;
                case 3:
                    if(!pila.isEmpty()){
                        pila.pop();
                    }else {
                        System.out.println("La cola esta vacia");
                    }
                    break;
                case 4:
                    for (Libro elem:pila){
                        System.out.println(elem.toString());
                    }
                    break;
                case 5:
                    System.out.println("Libro");
                    String libroNuevo=leer1.nextLine();
                    System.out.println("Autor");
                    String autorNuevo=leer1.nextLine();
                    System.out.println("Genero");
                    String generoNuevo=leer1.nextLine();
                    pila.add(new Libro(libroNuevo,autorNuevo,generoNuevo));
                    break;
                case 6:
                    finalizar=true;
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}

