import java.util.Scanner;

public class calculadora {

    public static int menu() {
        Scanner lee = new Scanner(System.in);
        System.out.println(
        "---------------------------------------------\n" +
        "Introduzca el número de la operación que quiere realizar\n" +
        "---------------------------------------------\n" +
        "1. Suma\n" +
        "2. Resta\n" +
        "3. Multiplicación\n" +
        "4. División\n" +
        "5. Área de un rectángulo\n" +
        "6. Área de un tríangulo equilátero\n" +
        "7. Área de un círculo\n" +
        "8. Seno, Coseno y Tangente\n" +
        "9. Salir\n" +
        "---------------------------------------------");

        int opcion = lee.nextInt();
        return opcion;
    }

    public static int operaciones(int n) {

        int resultado = 0;
        switch (n) {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                Multipli();
                break;
            case 4:
                Division();
                break;
            case 5:
                arearecta();
                break;
            case 6:
                areatriangu();
                break;
            case 7:
                areacirculo();
                break;
            case 8:
                seno();
                break;
            default:
                System.out.println("!Introduzca un valor valido¡");
                break;
        }

        return resultado;
    }

    public static void suma() {
        Scanner lee = new Scanner(System.in);
        double numero1, numero2;
        System.out.println();
        System.out.println("Introduzca los dos valores que quiere sumar");
        System.out.println("---------------------------------------------");
        numero1 = lee.nextDouble();
        numero2 = lee.nextDouble();
        double resultado = numero1 + numero2;
        System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + resultado);
    }

    public static void resta() {

        Scanner lee = new Scanner(System.in);
        double numero1, numero2;
        System.out.println();
        System.out.println("Introduzca los dos valores que quiere resta");
        System.out.println("---------------------------------------------");
        numero1 = lee.nextDouble();
        numero2 = lee.nextDouble();
        double resultado = numero1 - numero2;
        System.out.println("Resultado: " + numero1 + " - " + numero2 + " = " + resultado);

    }

    public static void Multipli() {

        Scanner lee = new Scanner(System.in);
        double numero1, numero2;
        System.out.println();
        System.out.println("Introduzca los dos valores que quiere Multiplicar");
        System.out.println("---------------------------------------------");
        numero1 = lee.nextDouble();
        numero2 = lee.nextDouble();
        double resultado = numero1 * numero2;
        System.out.println("Resultado: " + numero1 + " * " + numero2 + " = " + resultado);

    }

    public static void Division() {

        Scanner lee = new Scanner(System.in);
        double numero1, numero2;
        System.out.println();
        System.out.println("Introduzca los dos valores que quiere dividir");
        System.out.println("---------------------------------------------");
        numero1 = lee.nextDouble();
        numero2 = lee.nextDouble();
        double resultado = numero1 / numero2;
        System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + resultado);

    }

    public static void arearecta() {

        Scanner lee = new Scanner(System.in);
        double base, altura;
        System.out.println();
        System.out.println("Introduzca la base y la altura entre 0 y 1.000.000");
        System.out.println("---------------------------------------------");
        int valido;
        do {
            base = lee.nextDouble();
            altura = lee.nextDouble();
            
            if ((base >= 0.0 && base <= 1000000.0) && (altura >= 0.0 && altura <= 1000000.0)) {
                valido = 1;
            } else {
                System.out.println("Introduzca valores validos");
                valido = 0;
            }

        } while (valido != 1);

        double resultado = base * altura;
        System.out.println("Resultado: " + base + " * " + altura + " = " + resultado + "m2");

    }

    public static void areatriangu() {
        
        Scanner lee = new Scanner(System.in);
        double base, altura;
        System.out.println();
        System.out.println("Introduzca la base y la altura entre 0 y 1.000.000");
        System.out.println("---------------------------------------------");
        int valido;
        do {
            base = lee.nextDouble();
            altura = lee.nextDouble();
            
            if ((base >= 0.0 && base <= 1000000.0) && (altura >= 0.0 && altura <= 1000000.0)) {
                valido = 1;
            } else {
                System.out.println("Introduzca valores validos");
                valido = 0;
            }

        } while (valido != 1);

        double resultado = (base * altura) / 2 ;
        System.out.println("Resultado: " + base + " * " + altura + " / 2 = " + resultado + "m2");

    }

    public static void areacirculo() {

        Scanner lee = new Scanner(System.in);
        double base, altura;
        System.out.println();
        System.out.println("Introduzca la base y la altura entre 0 y 1.000.000");
        System.out.println("---------------------------------------------");
        int valido;
        do {
            base = lee.nextDouble();
             = lee.nextDouble();
            
            if ((base >= 0.0 && base <= 1000000.0) && (altura >= 0.0 && altura <= 1000000.0)) {
                valido = 1;
            } else {
                System.out.println("Introduzca valores validos");
                valido = 0;
            }

        } while (valido != 1);

        double resultado = Math.PI * radio;
        System.out.println("Resultado: " + base + " * " + altura + " = " + resultado + "m2");

    }

    public static void seno() {

    }

    public static void main(String[] args) {
        int accion;
        int selector;
        do {
            accion = menu();
            selector = operaciones(accion);
        } while (accion != 9);
    }
}
