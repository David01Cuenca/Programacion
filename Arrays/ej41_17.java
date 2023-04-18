import java.util.Arrays;
import java.util.Scanner;
public class ej41_17 {
    public static void main(String[] args){
        Scanner lee = new Scanner(System.in);
        int[] tab = new int[10];
        int[] tab2 = new int[10];
        int con, con2;
        System.out.println("Introduzca 10 numeros en esta");
        for(con=0; con<10;con++){
            tab[con]= lee.nextInt();
        }
        System.out.println("Introduzca otros 10 numeros en esta");
        for(con=0; con<10;con++){
            tab2[con] = lee.nextInt();
        }
        if (Arrays.equals(tab, tab2)){
            System.out.println("   SON IGUALES");
        }else{
            System.out.println("NO SON  IGUALES");
        }
    }
}
