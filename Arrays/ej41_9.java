import java.util.Scanner;

public class ej41_9 {
    public static void main(String[] args) {
        
        Scanner lee = new Scanner(System.in);
        int[] tab = new int[100];
        for(int con = 0; con < 100; con++){
            int rando = (int)(Math.random() * (10-1+1)+ 1);
            tab[con] =rando;
        }

        System.out.println("Introduzca un número entre 1 y 10 ");
        int numero = lee.nextInt();
        System.out.print("Las posiciones del array donde aparecen son: ");
        for(int con = 0; con < 100; con++){
            if(numero == tab[con]){
                System.out.print(con + " ");
            }
        }
        System.out.println(" ");
    }

}
            