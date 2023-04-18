import java.util.Scanner;
public class ej9 {

    public static int mayor(int n1, int n2){
        if (n1 < n2){
            return n2;
        }else{
            return n1;
        }
    }

   public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Escriba 3 números");
        int numero1= lee.nextInt();
        int numero2= lee.nextInt();
        int numero3= lee.nextInt();
        int mayor2 = mayor(numero1, numero2);
        if (mayor2 > numero3){
            System.out.println("El mayor es " + mayor2);
        }else{
            System.out.println("El mayor es " + numero3);
        }
   } 
}
