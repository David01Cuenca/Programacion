import java.util.Scanner;

public class ej41_10 {
    public static void main(String[] args) {

        Scanner lee = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de personas para medir");
        
        int per = lee.nextInt();
        double suma=0, media=0;
        double[] tab = new double[per];
        
        System.out.println("Introduzca las medidas");
        
        for(int con = 0; con < per; con++){
            double medida =lee.nextDouble();
            tab[con] = medida;
        }
        
        //Bucle para altura media
        for(int con = 0; con < per; con++){
            suma += tab[con];
            media = suma/per;
        }
        //Bucle para altura máxima
        double max = tab[0];
        for( ){
            if( ){
            
            }
        }
        //Bucle para altura mínima
        double min = tab[0];
        for( ){
            if( ){


                
            }
        }
        //Bucle para personas que miden por encima de la media
        for( ){
            
        }
        System.out.println("Altura Maxima: " + max);
        System.out.println("Altura Minima: " + min);
        System.out.println("Altura Media: " + media);
    }
}
