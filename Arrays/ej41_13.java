import java.util.Scanner;
public class ej41_13 {
    public static void main(String[] args) {
        Scanner lee= new Scanner(System.in);
        System.out.println("Introduzca un valor inicial:");
        int inicial = lee.nextInt();
        System.out.println("Introduzca el valor del incremento:");
        int incremento = lee.nextInt();
        System.out.println("Introduzca la cantidad de valores a crear");
        int cantidad = lee.nextInt();
        int[] tab = new int[cantidad];

        tab[0] = inicial;

        for(int con = 1; con<cantidad; con++){
            
            tab[con] = tab[con-1] + incremento;
        }
        for(int con=0; con<cantidad; con++){
            System.out.print(tab[con] + " ");
        }
        System.out.println();
    }
}
