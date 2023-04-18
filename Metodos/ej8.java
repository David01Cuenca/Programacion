import java.util.Scanner;
public class ej8 {

    public static int suma1aN(int n) {
        int suma = 0;
        for(int con = 1; con <= n; con++){
            suma = suma+con;
        }
        return suma;
    }

    public static int producto1aN(int n) {
        int producto = 1;
        for(int con = 1; con <= n; con++){
            producto = producto*con;
        }
        return producto;
    }

    public static double intermedio1aN(int n) {
        return n/2;
    }


    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = lee.nextInt();
        System.out.println("Suma del 1 al " + numero);
        System.out.println(suma1aN(numero));
        System.out.println("Multiplicacion del 1 al " + numero);
        System.out.println(producto1aN(numero));
        System.out.println("Intermedio del 1 al " + numero);
        System.out.println(intermedio1aN(numero));
    }
}
