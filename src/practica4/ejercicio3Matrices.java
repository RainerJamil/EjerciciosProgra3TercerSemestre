package practica4;

import java.util.Scanner;

public class ejercicio3Matrices {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Scanner leer1=new Scanner(System.in);
        System.out.println("Numero de choferes");
        int N= leer.nextInt();

        int [][] K=new int[N][6];
        String [] NC=new String[N];
        int [] TK=new int[N];

        System.out.println("Kilometros recorridos por dia");
        for (int i =0;i<N;i++){
            System.out.println("nombre chofer "+(i+1));
            NC[i]=leer1.nextLine();
            for (int j=0;j<6;j++){
                System.out.println("dia "+(j+1));
                K[i][j]= leer.nextInt();
            }
        }
        for (int i =0;i<N;i++){
            int totalK=0;
            for (int j=0;j<6;j++){
                totalK=K[i][j]+totalK;
            }
            TK[i]=totalK;
        }
        for (int i=0;i<N;i++){
            System.out.print(NC[i]+" ");
            for (int j=0;j<6;j++){
                System.out.print("Dia "+(j+1)+": "+K[i][j]+"km \t");
            }
            System.out.print("total Km: "+TK[i]);
            System.out.println(" ");
        }
    }
}
