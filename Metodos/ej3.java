import java.util.Scanner;
public class ej3 {
    
    public static int minimo (int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Introduzca dos números: ");
        int num1 = lee.nextInt();
        int num2 = lee.nextInt();
        System.out.print("El mayor de los dos números es: ");
        System.out.println(minimo(num1, num2));

    }

}
