import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        double SM=0;
        double SA=0;
        System.out.println("ingrese años de antiguedad");
        int AA= leer.nextInt();
        System.out.println("ingrese el sueldo");
        double S= leer.nextDouble();
        if((AA>2)&&(AA<5)){
            SA=(S*0.2);
        }
        if((AA>=5)){
            SA=(S*0.3);
        }
        if(S<1000){
            SM=(S*0.25);
        }
        if((S>1000)&(S<=3500)){
            SM=(S*0.15);
        }
        if(S>3500){
            SM=(S*0.1);
        }
        System.out.println("bono por antigueda: "+SA);
        System.out.println("bono por sueldo: "+SM);
        if (SA>SM){
            System.out.println(" el bono a seleccionar es el de antiguedad: "+SA);
        }else {
            System.out.println(" el bono a seleccionar es el de antiguedad: " + SA);
        }

    }
}
