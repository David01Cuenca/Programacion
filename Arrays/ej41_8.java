import java.util.Scanner;
public class ej41_8 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        double[] tab = new double[100];
        int suma = 0;
        for(int con = 0; con < 100; con++){
            double rand = Math.random();
            tab[con] = rand;
        }
        System.out.println("Introduzca un número entre 1.0 y 0.0");
        double numero = lee.nextDouble();
        for(int con = 0; con < 100; con++){
            if (numero >= tab[con]){
                suma++;
            }
        }
        System.out.println("La cantidad de número mayores o iguales son " + suma);
    }
}
