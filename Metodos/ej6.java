import java.util.Scanner;
public class ej6 {
    
    public static double precioConIVA(double precio){
        return precio*0.21;
    }

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        double suma = 0;
        double resultado;
        for(int con = 0; con < 5; con++){
            System.out.println("Introduzca el precio");
            double numero= lee.nextDouble();
            System.out.println("Precio con IVA");
            System.out.println(precioConIVA(numero));
        }
    }

}
