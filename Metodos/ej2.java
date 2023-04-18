import java.util.Scanner;

public class ej2 {

    public static boolean esmayorde18(int a) {
        if (a >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Introduzca la edad: ");
        int edad = lee.nextInt();
        boolean resultado = esmayorde18(edad);
        if (resultado == true) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("No eres mayor de edad");
        }
        lee.close();
    }
}
