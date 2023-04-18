import java.util.Scanner;

public class ej1 {

    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        System.out.println("Introduzca los valores en números reales que quiere multiplicar: ");
        System.out.print("Numero 1: ");
        double num1 = lee.nextDouble();
        System.out.print("Numero 2: ");
        double num2 = lee.nextDouble();
        double resultado = multiplica(num1, num2);
        System.out.print("Resultado: ");
        System.out.println(resultado);

        lee.close();
    }
}
