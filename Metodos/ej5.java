import java.util.Scanner;

public class ej5 {

    public static double millas_a_kilometros(int millas) {
        return millas * 1.60934;
    }

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Introduzca un valor en millas");
        int millas = lee.nextInt();
        double resultado = millas_a_kilometros(millas);
        System.out.println("El resulado es: " + resultado);
    }

}
