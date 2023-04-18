import java.util.Scanner;

public class ej4 {

    public static int dimesigno(int a){
        if(a == 0){
            return 0;
        } else if(a < 0){
            return -1;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Introduca un número");
        int numero = lee.nextInt();
        int resultado = dimesigno(numero);
        if(resultado == 0){
            System.out.println("Es un cero");
        } else if(resultado == -1){
            System.out.println("Es un número negativo");
        } else if(resultado == 1){
        System.out.println("Es un número positivo");
        }
        

    }

}
