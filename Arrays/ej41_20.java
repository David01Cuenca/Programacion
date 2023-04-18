import java.util.Scanner;

public class ej41_20 {
    public static void main(String[] args) {
        int[] tab = new int[1000];
        int veces =0;
        Scanner lee = new Scanner(System.in);
        for(int con=0; con < 1000; con++){
            int random = (int) (Math.random() * (99 - 1 + 1) +1 );
            tab[con] = random;
        }
        System.out.println("Introduzca un valor del 1 al 99");
        int numero = lee.nextInt();
        for(int con = 0; con <1000;con++){
            if(numero == tab[con]){
                veces++;
            }
        }
        if(veces == 0){
            System.out.println("No existen el número en el array");
        } else {
            System.out.println("Han habido: " + veces + " veces que coinciden");
        }
    }    
}
