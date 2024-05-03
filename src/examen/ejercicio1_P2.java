package examen;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class ejercicio1_P2 {
    public void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Queue<String> colaPersona=new LinkedList<>();
        Queue<Integer> colaTicket=new LinkedList<>();

        boolean finalizar=false ;
        while (!finalizar){
            System.out.println("1.- Numero de personas");
            System.out.println("2.- Primera persona");
            System.out.println("3.- Eliminar persona");
            System.out.println("4.- Agregar persona");
            System.out.println("5.- Mostrar cola");
            System.out.println("6.- Salir");
            System.out.println("Ingrese una opcion");
            int opcion= leer.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("El numero de personas: "+colaPersona.size());
                    break;
                case 2:
                    if (!colaPersona.isEmpty()){
                        System.out.println("Primera persona: "+colaPersona.peek());
                    }else{
                        System.out.println("La cola esta vacia");
                    }
                    break;
                case 3:
                    if(!colaPersona.isEmpty()){
                        colaTicket.poll();
                    }else {
                        System.out.println("La cola esta vacia");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el nombre");
                    String nuevoNombre=leer.nextLine();
                    System.out.println("Ticket ");
                    int nuevoTicket= leer.nextInt();
                    colaPersona.add(nuevoNombre);
                    colaTicket.add(nuevoTicket);
                    break;
                case 5:
                    for (String elemento:colaPersona){
                        System.out.println(elemento);
                    }
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
    public class persona {
        String nombre;
        int ticket;
        public persona(String nombre, int ticket) {
            this.nombre = nombre;
            this.ticket = ticket;
        }
        public String pa(){
            return "Nombre: "+nombre+", ticket: "+ticket;
        }
    }
}

