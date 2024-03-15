import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int op;
        int aux=0;
        persona lista[]=new persona[100];
        Scanner leer=new Scanner(System.in);
        Scanner leer1=new Scanner(System.in);
        do {
            menu();
            op= leer.nextInt();
            switch (op){
                case 1:
                    persona p =new persona();
                    System.out.println(" id: ");
                    p.setId(leer.nextInt());
                    System.out.println(" Nombres: ");
                    p.setNombres(leer1.nextLine());
                    System.out.println(" Apellidos: ");
                    p.setApellidos(leer1.nextLine());
                    System.out.println(" Edad: ");
                    p.setEdad(leer.nextInt());
                    lista[aux]=p;
                    aux++;
                    break;
                case 2:
                    int idBus;
                    System.out.println("Id: ");
                    idBus= leer.nextInt();
                    int n=0;
                    for (int j=0;j<aux;j++){
                        if (lista[j].getId()==idBus){
                            System.out.println(lista[j].toString());
                            n++;
                        }
                    }
                    if (n==0){
                        System.out.println("no existe");
                    }
                    break;
                case 3:
                    int idElim;
                    System.out.println("Id: ");
                    idElim= leer.nextInt();

                    for(int k=0 ;k<aux;k++) {
                        if (lista[k].getId() == idElim) {
                            lista[k] = lista[k + 1];
                        }
                    }
                    break;
                case 4:
                    for(int i=0;i<aux;i++){
                        System.out.println(lista[i].toString());
                    }
                    break;
                default:

                    break;
            }
        }while (op!=0);
    }
    static void menu() {
        System.out.println(" 1.- Registrar Persona ");
        System.out.println(" 2.- Buscar Persona ");
        System.out.println(" 3.- Eliminar Persona ");
        System.out.println(" 4.- Listar Persona ");
        System.out.println(" 0.- Salir ");
    }
}