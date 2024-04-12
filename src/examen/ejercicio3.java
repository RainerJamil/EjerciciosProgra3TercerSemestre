package examen;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Scanner leer1=new Scanner(System.in);
        System.out.println("cantidad de choferes");
        int n= leer.nextInt();

        int chofSuel[]=new int[n];
        String chofNom[]=new String[n];
        int horasTra[]=new int[n];
        int horasTrabT[]=new int[n];
        int sueldoT[]=new int[n];
        int totalEmpresa=0;

        for (int i=0;i<n;i++){
            System.out.println("Nombre: ");
            chofNom[i]=leer1.nextLine();
            System.out.println("Sueldo por hora");
            chofSuel[i]= leer.nextInt();
            System.out.println("Horas trabajadas por dia");
            horasTra[i]=leer.nextInt();
        }
        for (int i=0;i<n;i++){
            horasTrabT[i]=6*horasTra[i];
        }
        for (int i=0;i<n;i++){
            sueldoT[i]= horasTrabT[i]*chofSuel[i];
        }
        for (int i=0;i<n;i++){
            totalEmpresa=sueldoT[i]+totalEmpresa;
        }
        int aux= horasTra[0];
        int m=0;
        for (int i=1;i<n;i++){
            if(horasTra[i]>=aux){
                aux=horasTra[i];
                m=i;
            }
        }


        for (int i=0;i<n;i++){
            System.out.println("nomrbre: "+chofNom[i]+" "+"sueldo por hora: "+chofSuel[i]+" "+"horas trabajas por dia: "+horasTra[i]);
            System.out.println("horas trabajadas semanal: "+horasTrabT[i]);
            System.out.println("el sueldo semanal "+sueldoT[i]);
            System.out.println(" ");
        }
        System.out.println("empresa pagar: "+totalEmpresa);
        System.out.println("chofer que trabajo mas el viernes es: "+chofNom[m]);







    }
}
