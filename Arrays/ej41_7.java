import java.util.Scanner;
public class ej41_7 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("De que número a que numero desea contar");
        int inicio = lee.nextInt();
        int fin = lee.nextInt();
        int sum = inicio;
        int[] tab = new int[];
        for (int con = inicio; con < fin ; con++){
            tab[con] = sum;
            sum++;
        }
    }
}