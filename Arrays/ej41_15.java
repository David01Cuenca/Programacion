import java.util.Arrays;
import java.util.Scanner;
public class ej41_15 {
    public static void main(String[] args) {
        System.out.println("Introduzca el tamaño del array");
        Scanner lee = new Scanner(System.in);
        int numero = lee.nextInt();
        System.out.println("Introduzca que dato se va a rellenar el array");
        int contenido = lee.nextInt();
        int tab[] = new int[numero];
        Arrays.fill(tab, contenido);
        for(int con=0; con<numero;con++){
            System.out.println(tab[con]);
        }        
    }
}
